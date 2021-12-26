package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.BinaryExpression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.ListType;
import main.ast.types.NoType;
import main.ast.types.StructType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

import java.util.ArrayList;

public class TypeChecker extends Visitor<Void> {
    ExpressionTypeChecker expressionTypeChecker;
    ArrayList<FunctionSymbolTableItem> functionSymbolTableItems;
    FunctionSymbolTableItem currentFunctionSymbolTableItem;
    private boolean firstVisit = true;
    private boolean canHaveReturn = true;
    private boolean inSetterGetter = false;

    public TypeChecker() {
        this.expressionTypeChecker = new ExpressionTypeChecker();
        functionSymbolTableItems = new ArrayList<>();
        currentFunctionSymbolTableItem = null;
    }

    private SymbolTableItem getCorrespondSymbolTableItem(SymbolTable symbolTable, String key) {
        try {
            return symbolTable.getItem(key);
        } catch (ItemNotFoundException e) {
            //do nothing
        }
        return null;
    }

    @Override
    public Void visit(Program program) {
        SymbolTable root = new SymbolTable();
        SymbolTable.root = root;
        SymbolTable.push(root);
        for (StructDeclaration structDeclaration : program.getStructs()) {
            StructSymbolTableItem structSymbolTableItem = new StructSymbolTableItem(structDeclaration);
            structSymbolTableItem.setStructSymbolTable(new SymbolTable(SymbolTable.root));
            try {
                SymbolTable.root.put(structSymbolTableItem);
            } catch (ItemAlreadyExistsException e) {
                //nothing
            }
        }
        for (FunctionDeclaration functionDeclaration : program.getFunctions()) {
            FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(functionDeclaration);
            functionSymbolTableItem.setFunctionSymbolTable(new SymbolTable(SymbolTable.root));
            try {
                SymbolTable.root.put(functionSymbolTableItem);
                functionSymbolTableItems.add(functionSymbolTableItem);
            } catch (ItemAlreadyExistsException e) {
                //nothing
            }
        }
        for (StructDeclaration structDeclaration : program.getStructs())
            structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration : program.getFunctions()) {
            currentFunctionSymbolTableItem = functionSymbolTableItems.get(
                    program.getFunctions().indexOf(functionDeclaration)
            );
            functionDeclaration.accept(this);
        }
        canHaveReturn = false;
        program.getMain().accept(this);
        canHaveReturn = true;
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)
                getCorrespondSymbolTableItem(SymbolTable.root,
                        FunctionSymbolTableItem.START_KEY + functionDec.getFunctionName().getName());
        SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        SymbolTable.push(new SymbolTable(SymbolTable.root));
        for (VariableDeclaration variableDeclaration : functionDec.getArgs())
            variableDeclaration.accept(this);
        functionDec.getBody().accept(this);
        if (functionDec.getReturnType() instanceof StructType) {
            try {
                functionSymbolTableItem.getFunctionSymbolTable()
                        .getItem(
                                StructSymbolTableItem.START_KEY + ((StructType) functionDec.getReturnType()).getStructName());
            } catch (ItemNotFoundException e) {
                functionDec.addError(new StructNotDeclared(functionDec.getLine(),
                        ((StructType) functionDec.getReturnType()).getStructName().getName()));
                functionDec.setReturnType(new NoType());
            }
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        SymbolTable.push(new SymbolTable(SymbolTable.root));
        mainDec.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        if (inSetterGetter)
            variableDec.addError(new CannotUseDefineVar(variableDec.getLine()));
        Type varType = variableDec.getVarType();
        if (varType instanceof StructType) {
            SymbolTableItem symbolTableItem = getCorrespondSymbolTableItem(SymbolTable.top,
                    StructSymbolTableItem.START_KEY +
                            ((StructType) varType).getStructName().getName());
            if (symbolTableItem == null) {
                variableDec.addError(new StructNotDeclared(variableDec.getLine(),
                        ((StructType) varType).getStructName().getName()));
                varType = new NoType();
            }
        } else if (varType instanceof ListType && ((ListType) varType).getType() instanceof StructType) {
            SymbolTableItem symbolTableItem = getCorrespondSymbolTableItem(SymbolTable.top,
                    StructSymbolTableItem.START_KEY +
                            ((StructType) ((ListType) varType).getType()).getStructName().getName());
            if (symbolTableItem == null) {
                variableDec.addError(new StructNotDeclared(variableDec.getLine(),
                        ((StructType) ((ListType) varType).getType()).getStructName().getName()));
                varType = new NoType();
            }
        }
        VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
        variableSymbolTableItem.setType(varType);
        try {
            SymbolTable.top.put(variableSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            //nothing
        }
        if (variableDec.getDefaultValue() != null) {
            AssignmentStmt assignmentStmt = new AssignmentStmt(variableDec.getVarName(), variableDec.getDefaultValue());
            assignmentStmt.setLine(variableDec.getLine());
            assignmentStmt.accept(this);
            assignmentStmt.flushErrors().forEach(variableDec::addError);
        }
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem)
                getCorrespondSymbolTableItem(SymbolTable.root,
                        StructSymbolTableItem.START_KEY + structDec.getStructName().getName());
        SymbolTable.push(structSymbolTableItem.getStructSymbolTable());
        structDec.getBody().accept(this);
        firstVisit = false;
        structDec.getBody().accept(this);
        firstVisit = true;
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        String name = setGetVarDec.getVarName().getName();
        if (firstVisit) {
            setGetVarDec.getVarDec().accept(this);
            SymbolTable newSym = new SymbolTable();
            FunctionDeclaration funcDec = new FunctionDeclaration();

            funcDec.setFunctionName(new Identifier(name));
            funcDec.setReturnType(setGetVarDec.getVarType());
            funcDec.setArgs(setGetVarDec.getArgs());
            FunctionSymbolTableItem newItem = new FunctionSymbolTableItem(funcDec);
            newItem.setFunctionSymbolTable(newSym);
            try {
                SymbolTable.top.put(newItem);
            } catch (ItemAlreadyExistsException e) {
                //nothing
            }
        } else {
            try {
                String key = FunctionSymbolTableItem.START_KEY + name;
                FunctionSymbolTableItem fItem = (FunctionSymbolTableItem) SymbolTable.top.getItem(key);
                SymbolTable sym = fItem.getFunctionSymbolTable();
                sym.pre = SymbolTable.top;
                currentFunctionSymbolTableItem = fItem;
                SymbolTable.push(sym);
                for (VariableDeclaration arg : setGetVarDec.getArgs())
                    arg.accept(this);
                canHaveReturn = false;
                inSetterGetter = true;
                setGetVarDec.getSetterBody().accept(this);
                canHaveReturn = true;
                SymbolTable.pop();
                setGetVarDec.getGetterBody().accept(this);
                inSetterGetter = false;
            } catch (ItemNotFoundException e) {//unreachable
            }
        }
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        expressionTypeChecker.setCurrentStatement(assignmentStmt);
        BinaryExpression binaryExpression = new BinaryExpression(
                assignmentStmt.getLValue(),
                assignmentStmt.getRValue(), BinaryOperator.assign);
        binaryExpression.setLine(assignmentStmt.getLine());
        binaryExpression.accept(expressionTypeChecker);
        binaryExpression.flushErrors().forEach(
                assignmentStmt::addError
        );
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement stmt : blockStmt.getStatements()) {
            if (firstVisit || inSetterGetter)
                stmt.accept(this);
            if (!firstVisit && stmt instanceof SetGetVarDeclaration)
                stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        expressionTypeChecker.setCurrentStatement(conditionalStmt);
        Type conditionalType = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if (!(conditionalType instanceof BoolType) && !(conditionalType instanceof NoType)) {
            conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine()));
        }
        conditionalStmt.getThenBody().accept(this);
        SymbolTable.pop();
        if (conditionalStmt.getElseBody() != null) {
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            conditionalStmt.getElseBody().accept(this);
            SymbolTable.pop();
        }
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        expressionTypeChecker.setCurrentStatement(functionCallStmt);
        functionCallStmt.getFunctionCall().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        expressionTypeChecker.setCurrentStatement(displayStmt);
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        if (!(argType instanceof IntType) &&
                !(argType instanceof BoolType) &&
                !(argType instanceof ListType) &&
                !(argType instanceof NoType)) {
            displayStmt.addError(new UnsupportedTypeForDisplay(displayStmt.getLine()));
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        if (canHaveReturn) {
            if (returnStmt.getReturnedExpr() != null) {
                expressionTypeChecker.setCurrentStatement(returnStmt);
                Type returnType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
                if (!(returnType instanceof NoType))
                    if (returnType.getClass() != currentFunctionSymbolTableItem.getFunctionDeclaration().getReturnType().getClass()) {
                        returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
                    }
            }
        } else
            returnStmt.addError(new CannotUseReturn(returnStmt.getLine()));
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        expressionTypeChecker.setCurrentStatement(loopStmt);
        Type conditionType = loopStmt.getCondition().accept(expressionTypeChecker);
        if (!(conditionType instanceof BoolType)) {
            loopStmt.addError(new ConditionNotBool(loopStmt.getLine()));
        }
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        loopStmt.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        expressionTypeChecker.setCurrentStatement(varDecStmt);
        for (VariableDeclaration var : varDecStmt.getVars())
            if (firstVisit || inSetterGetter)
                var.accept(this);
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        expressionTypeChecker.setCurrentStatement(listAppendStmt);
        listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        expressionTypeChecker.setCurrentStatement(listSizeStmt);
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        return null;
    }
}
