package main.visitor.name;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

import java.util.ArrayList;

public class NamingAnalysisVisitor extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);
        program.getStructs().forEach(structDeclaration -> putStructSymbolTableItem(SymbolTable.root, structDeclaration));
        program.getFunctions().forEach(functionDeclaration -> putFunctionSymbolTableItem(SymbolTable.root, functionDeclaration));
        program.getStructs().forEach(structDeclaration -> {
            structDeclaration.accept(this);
            program.addErrors(structDeclaration.flushErrors());
        });
        program.getFunctions().forEach(functionDeclaration -> {
            functionDeclaration.accept(this);
            program.addErrors(functionDeclaration.flushErrors());
        });
        program.getMain().accept(this);
        program.addErrors(program.getMain().flushErrors());
        SymbolTable.pop();
        setErrors(program.flushErrors());
        printErrors();
        return null;
    }


    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        functionDeclaration.getArgs().forEach(variableDeclaration -> {
            variableDeclaration.accept(this);
            functionDeclaration.addErrors(variableDeclaration.flushErrors());
        });
        functionDeclaration.getBody().accept(this);
        functionDeclaration.addErrors(functionDeclaration.getBody().flushErrors());
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        mainDeclaration.getBody().accept(this);
        mainDeclaration.addErrors(mainDeclaration.getBody().flushErrors());
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDeclaration) {
        VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDeclaration.getVarName());
        SymbolTable pre = SymbolTable.top;
        boolean canInsert = true;
        try {
            pre.getItem(variableSymbolTableItem.getKey());
            variableDeclaration.addError(new DuplicateVar(variableDeclaration.getLine(), variableSymbolTableItem.getName()));
            canInsert = false;
        } catch (ItemNotFoundException e) {
            //do nothing
        }
        try {
            pre.getItem(variableSymbolTableItem.getAsStructKey());
            variableDeclaration.addError(new VarStructConflict(variableDeclaration.getLine(), variableSymbolTableItem.getName()));
            canInsert = false;
        } catch (ItemNotFoundException ex) {
            //do nothing
        }
        try {
            pre.getItem(variableSymbolTableItem.getAsFunctionKey());
            variableDeclaration.addError(new VarFunctionConflict(variableDeclaration.getLine(), variableSymbolTableItem.getName()));
            canInsert = false;
        } catch (ItemNotFoundException e) {
            //do nothing
        }
        if (canInsert) try {
            pre.put(variableSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            variableDeclaration.addError(new DuplicateVar(variableDeclaration.getLine(), variableSymbolTableItem.getName()));
        }
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDeclaration) {
        SymbolTable currentScope = new SymbolTable(SymbolTable.top);
        currentScope.setCreatorItem(new StructSymbolTableItem(structDeclaration));
        SymbolTable.push(currentScope);
        structDeclaration.getBody().accept(this);
        structDeclaration.addErrors(structDeclaration.getBody().flushErrors());
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDeclaration) {
        VariableDeclaration variableDeclaration = new VariableDeclaration(setGetVarDeclaration.getVarName(), setGetVarDeclaration.getVarType());
        variableDeclaration.accept(this);
        setGetVarDeclaration.addErrors(variableDeclaration.flushErrors());
        setGetVarDeclaration.getArgs().forEach(arg -> {
            arg.accept(this);
            setGetVarDeclaration.addErrors(arg.flushErrors());
        });
        setGetVarDeclaration.getSetterBody().accept(this);
        setGetVarDeclaration.addErrors(setGetVarDeclaration.getSetterBody().flushErrors());
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        assignmentStmt.getLValue().accept(this);
        assignmentStmt.addErrors(assignmentStmt.getLValue().flushErrors());
        assignmentStmt.getRValue().accept(this);
        assignmentStmt.addErrors(assignmentStmt.getRValue().flushErrors());
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        blockStmt.getStatements().forEach(statement -> {
            statement.accept(this);
            blockStmt.addErrors(statement.flushErrors());
        });
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        conditionalStmt.getCondition().accept(this);
        conditionalStmt.addErrors(conditionalStmt.getCondition().flushErrors());
        conditionalStmt.getThenBody().accept(this);
        conditionalStmt.addErrors(conditionalStmt.getThenBody().flushErrors());
        SymbolTable.pop();
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        conditionalStmt.getElseBody().accept(this);
        conditionalStmt.addErrors(conditionalStmt.getElseBody().flushErrors());
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        functionCallStmt.getFunctionCall().accept(this);
        functionCallStmt.addErrors(functionCallStmt.getFunctionCall().flushErrors());
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        displayStmt.getArg().accept(this);
        displayStmt.addErrors(displayStmt.getArg().flushErrors());
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        returnStmt.getReturnedExpr().accept(this);
        returnStmt.addErrors(returnStmt.getReturnedExpr().flushErrors());
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        loopStmt.getCondition().accept(this);
        loopStmt.addErrors(loopStmt.getCondition().flushErrors());
        loopStmt.getBody().accept(this);
        loopStmt.addErrors(loopStmt.getBody().flushErrors());
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        varDecStmt.getVars().forEach(var -> {
            var.accept(this);
            varDecStmt.addErrors(var.flushErrors());
        });
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        listAppendStmt.getListAppendExpr().accept(this);
        listAppendStmt.addErrors(listAppendStmt.getListAppendExpr().flushErrors());
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        listSizeStmt.getListSizeExpr().accept(this);
        listSizeStmt.addErrors(listSizeStmt.getListSizeExpr().flushErrors());
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.addErrors(binaryExpression.getFirstOperand().flushErrors());
        binaryExpression.getSecondOperand().accept(this);
        binaryExpression.addErrors(binaryExpression.getSecondOperand().flushErrors());
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        unaryExpression.getOperand().accept(this);
        unaryExpression.addErrors(unaryExpression.getOperand().flushErrors());
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        listAccessByIndex.getInstance().accept(this);
        listAccessByIndex.addErrors(listAccessByIndex.getInstance().flushErrors());
        listAccessByIndex.getIndex().accept(this);
        listAccessByIndex.addErrors(listAccessByIndex.getIndex().flushErrors());
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess) {
        structAccess.getInstance().accept(this);
        structAccess.addErrors(structAccess.getInstance().flushErrors());
        structAccess.getElement().accept(this);
        structAccess.addErrors(structAccess.getElement().flushErrors());
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        functionCall.getInstance().accept(this);
        functionCall.addErrors(functionCall.getInstance().flushErrors());
        functionCall.getArgs().forEach(arg -> {
            arg.accept(this);
            functionCall.addErrors(arg.flushErrors());
        });
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public Void visit(ListSize listSize) {
        listSize.getArg().accept(this);
        listSize.addErrors(listSize.getArg().flushErrors());
        return null;
    }

    @Override
    public Void visit(ListAppend listAppend) {
        listAppend.getListArg().accept(this);
        listAppend.addErrors(listAppend.getListArg().flushErrors());
        listAppend.getElementArg().accept(this);
        listAppend.addErrors(listAppend.getElementArg().flushErrors());
        return null;
    }

    @Override
    public Void visit(ExprInPar exprInPar) {
        exprInPar.getInputs().forEach(input -> {
            input.accept(this);
            exprInPar.addErrors(input.flushErrors());
        });
        return null;
    }

    private static ArrayList<CompileError> errors = new ArrayList<>();

    public static void setErrors(ArrayList<CompileError> _errors) {
        errors = _errors;
    }

    public static boolean hasError() {
        return !errors.isEmpty();
    }

    public static void printErrors() {
        for (CompileError error : errors) {
            System.out.println(error.getMessage());
        }
    }


    private void putStructSymbolTableItem(SymbolTable root, StructDeclaration structDeclaration) {
        StructSymbolTableItem structSymbolTableItem = new StructSymbolTableItem(structDeclaration);
        structSymbolTableItem.setStructSymbolTable(new SymbolTable(root));
        boolean newNameNeeded = false;
        try {
            root.put(structSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            structDeclaration.addError(new DuplicateStruct(structDeclaration.getLine(), structSymbolTableItem.getName()));
            newNameNeeded = true;
        }
        while (newNameNeeded) {
            try {
                structSymbolTableItem.generateNewName();
                root.put(structSymbolTableItem);
                newNameNeeded = false;
            } catch (ItemAlreadyExistsException e) {
                //do nothing
            }
        }
    }

    private void putFunctionSymbolTableItem(SymbolTable root, FunctionDeclaration functionDeclaration) {
        FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(functionDeclaration);
        functionSymbolTableItem.setFunctionSymbolTable(new SymbolTable(root));
        boolean newNameNeeded = false;
        try {
            root.put(functionSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            functionDeclaration.addError(new DuplicateFunction(functionDeclaration.getLine(), functionSymbolTableItem.getName()));
            newNameNeeded = true;
        }
        while (newNameNeeded) {
            try {
                functionSymbolTableItem.generateNewName();
                root.put(functionSymbolTableItem);
                newNameNeeded = false;
            } catch (ItemAlreadyExistsException e) {
                //do nothing
            }
        }
        try {
            functionSymbolTableItem.getFunctionSymbolTable().pre.getItem(functionSymbolTableItem.getAsStructSymbolTableItem().getKey());
            functionDeclaration.addError(new FunctionStructConflict(functionDeclaration.getLine(), functionSymbolTableItem.getName()));
        } catch (ItemNotFoundException e) {
            //do nothing
        }
    }

}
