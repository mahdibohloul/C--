package main.visitor.type;

import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.Value;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.FunctionCallStmt;
import main.ast.nodes.statement.Statement;
import main.ast.types.*;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressionTypeChecker extends Visitor<Type> {

    private Statement currentStatement;
    private boolean functionCallInPar;

    private static boolean haveWrongType(Type firstT, Type secondT, Type targetType) {
        if (firstT instanceof NoType && secondT instanceof NoType) return false;
        if (firstT instanceof NoType)
            return secondT.getClass() != targetType.getClass();
        if (secondT instanceof NoType)
            return firstT.getClass() != targetType.getClass();
        return true;
    }

    private static SymbolTableItem getCorrespondSymbolTableItem(SymbolTable symbolTable, String key) {
        try {
            return symbolTable.getItem(key);
        } catch (ItemNotFoundException e) {
            return null;
        }
    }

    private boolean funcArgsAreWrong(List<Type> args, ArrayList<Expression> funcCallArgs) {
        return funcArgsAreWrong(args, funcCallArgs.stream()
                .map(expr -> {
                            if (expr instanceof FunctionCall)
                                functionCallInPar = true;
                            return expr.accept(this);
                        }
                ).collect(Collectors.toList()));
    }

    private boolean funcArgsAreWrong(List<Type> args, List<Type> funcCallArgs) {
        if (args.size() != funcCallArgs.size()) return true;
        for (int i = 0; i < args.size(); i++) {
            if (!args.get(i).getClass().equals(funcCallArgs.get(i).getClass()))
                return true;
        }
        return false;
    }

    private boolean canCallFunction(Type functionReturnType) {
        if (functionReturnType instanceof VoidType) {
            if (functionCallInPar)
                return false;
            if (currentStatement instanceof FunctionCallStmt)
                return true;
            return false;
        }
        return true;
    }

    private boolean isValidLValue(Type lValueType, Expression lValue) {
        if (lValueType instanceof NoType) return true;
        if (lValueType instanceof VoidType) {
            return false;
        }
        if ((lValueType instanceof IntType || lValueType instanceof BoolType) && lValue instanceof Value) {
            return false;
        }
        return true;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Type op1, op2;
        switch (binaryExpression.getBinaryOperator()) {
            case eq -> {
                op1 = binaryExpression.getFirstOperand().accept(this);
                op2 = binaryExpression.getSecondOperand().accept(this);
                if (op1 instanceof NoType || op2 instanceof NoType) return new NoType();
                if (op1.getClass() == op2.getClass()) return new BoolType();
            }
            case and, or -> {
                op1 = binaryExpression.getFirstOperand().accept(this);
                op2 = binaryExpression.getSecondOperand().accept(this);
                if (op1 instanceof BoolType && op2 instanceof BoolType) return new BoolType();
                if (!haveWrongType(op1, op2, new BoolType()))
                    return new NoType();
            }
            case assign -> {
                op1 = binaryExpression.getFirstOperand().accept(this);
                if (op1 instanceof FptrType && binaryExpression.getSecondOperand() instanceof Identifier) {
                    FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) getCorrespondSymbolTableItem(
                            SymbolTable.root,
                            FunctionSymbolTableItem.START_KEY +
                                    ((Identifier) binaryExpression.getSecondOperand()).getName());
                    if (functionSymbolTableItem != null) {
                        if (((FptrType) op1).getReturnType().getClass() !=
                                functionSymbolTableItem.getFunctionDeclaration().getReturnType().getClass())
                            break;
                        if (funcArgsAreWrong(((FptrType) op1).getArgsType(),
                                functionSymbolTableItem.getFunctionDeclaration().getArgs()
                                        .stream().map(VariableDeclaration::getVarType).collect(Collectors.toList())))
                            break;
                        return op1;
                    } else
                        break;
                }
                op2 = binaryExpression.getSecondOperand().accept(this);
                if (!isValidLValue(op1, binaryExpression.getFirstOperand())) {
                    binaryExpression.addError(new LeftSideNotLvalue(binaryExpression.getLine()));
                    return new NoType();
                } else if (op1.getClass() == op2.getClass())
                    return op1;
                else if (op2 instanceof NoType || op1 instanceof NoType)
                    return new NoType();
            }
            case gt, lt -> {
                op1 = binaryExpression.getFirstOperand().accept(this);
                op2 = binaryExpression.getSecondOperand().accept(this);
                if (op1 instanceof IntType && op2 instanceof IntType) return new BoolType();
                if (!haveWrongType(op1, op2, new BoolType()))
                    return new NoType();
            }
            default -> {
                op1 = binaryExpression.getFirstOperand().accept(this);
                op2 = binaryExpression.getSecondOperand().accept(this);
                if (op1 instanceof IntType && op2 instanceof IntType) return new IntType();
                if (!haveWrongType(op1, op2, new IntType())) {
                    return new NoType();
                }
            }
        }
        binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(),
                binaryExpression.getBinaryOperator().name()));
        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        Type opType = unaryExpression.getOperand().accept(this);
        if (unaryExpression.getOperator() == UnaryOperator.minus)
            if (opType instanceof IntType) return new IntType();
        if (unaryExpression.getOperator() == UnaryOperator.not)
            if (opType instanceof BoolType) return new BoolType();
        if (opType instanceof NoType) return new NoType();
        if (opType instanceof VoidType) {
            unaryExpression.addError(new LeftSideNotLvalue(unaryExpression.getLine()));
            return new NoType();
        }
        unaryExpression.addError(
                new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().name())
        );
        return new NoType();
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        Type instanceType;
        if (funcCall.getInstance() instanceof Identifier) {
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)
                    getCorrespondSymbolTableItem(SymbolTable.root,
                            FunctionSymbolTableItem.START_KEY + ((Identifier) funcCall.getInstance()).getName());
            if (functionSymbolTableItem != null) {
                if (!canCallFunction(functionSymbolTableItem.getFunctionDeclaration().getReturnType()))
                    funcCall.addError(new CantUseValueOfVoidFunction(funcCall.getLine()));
                if (funcArgsAreWrong(
                        functionSymbolTableItem.getFunctionDeclaration().getArgs()
                                .stream().map(VariableDeclaration::getVarType).collect(Collectors.toList()),
                        funcCall.getArgs())) {
                    funcCall.addError(new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine()));
                    instanceType = new NoType();
                } else
                    instanceType = functionSymbolTableItem.getFunctionDeclaration().getReturnType();
            } else {
                instanceType = funcCall.getInstance().accept(this);
                if (!(instanceType instanceof FptrType) &&
                        !(instanceType instanceof NoType)) {
                    funcCall.addError(new CallOnNoneFptrType(funcCall.getLine()));
                    instanceType = new NoType();
                } else if (instanceType instanceof FptrType) {
                    if (!canCallFunction(((FptrType) instanceType).getReturnType()))
                        funcCall.addError(new CantUseValueOfVoidFunction(funcCall.getLine()));
                    if (funcArgsAreWrong(((FptrType) instanceType).getArgsType().stream().toList(), funcCall.getArgs())) {
                        funcCall.addError(new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine()));
                        instanceType = new NoType();
                    } else {
                        instanceType = ((FptrType) instanceType).getReturnType();
                    }
                } else {
                    funcCall.getArgs().forEach(x -> {
                        if (x.accept(this) instanceof VoidType)
                            funcCall.addError(new CantUseValueOfVoidFunction(funcCall.getLine()));
                    });
                }
            }
        } else
            instanceType = funcCall.getInstance().accept(this);

        return instanceType;
    }

    @Override
    public Type visit(Identifier identifier) {
        try {
            VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem)
                    SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + identifier.getName());
            return variableSymbolTableItem.getType();
        } catch (ItemNotFoundException e) {
            identifier.addError(new VarNotDeclared(identifier.getLine(), identifier.getName()));
            return new NoType();
        }
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        Type instanceType = listAccessByIndex.getInstance().accept(this);
        Type indexType = listAccessByIndex.getIndex().accept(this);
        if (!(indexType instanceof IntType)) {
            listAccessByIndex.addError(new ListIndexNotInt(listAccessByIndex.getLine()));
        }
        if (!(instanceType instanceof ListType) && !(instanceType instanceof NoType)) {
            listAccessByIndex.addError(new AccessByIndexOnNonList(listAccessByIndex.getLine()));
            return new NoType();
        }
        if (instanceType instanceof NoType)
            return new NoType();
        if (indexType instanceof IntType) {
            return ((ListType) instanceType).getType();
        }
        return new NoType();
    }

    @Override
    public Type visit(StructAccess structAccess) {
        Type structType = structAccess.getInstance().accept(this);
        if (structType instanceof StructType) {
            StructSymbolTableItem structSymbolTableItem;
            try {
                structSymbolTableItem = (StructSymbolTableItem)
                        SymbolTable.root.getItem(
                                StructSymbolTableItem.START_KEY +
                                        ((StructType) structType).getStructName().getName());
            } catch (ItemNotFoundException e) {
                structAccess.addError(
                        new StructNotDeclared(structAccess.getLine(),
                                ((StructType) structType).getStructName().getName()));
                return new NoType();
            }
            try {
                VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem)
                        structSymbolTableItem.getStructSymbolTable().getItem(
                                VariableSymbolTableItem.START_KEY + structAccess.getElement().getName());
                return variableSymbolTableItem.getType();
            } catch (ItemNotFoundException e) {
                structAccess.addError(
                        new StructMemberNotFound(structAccess.getLine(), structSymbolTableItem.getStructDeclaration().getStructName().getName(),
                                structAccess.getElement().getName())
                );
                return new NoType();
            }
        }
        structAccess.addError(new AccessOnNonStruct(structAccess.getLine()));
        return new NoType();
    }

    @Override
    public Type visit(ListSize listSize) {
        Type argType = listSize.getArg().accept(this);
        if (argType instanceof NoType)
            return new NoType();
        if (argType instanceof ListType)
            return new IntType();
        listSize.addError(new GetSizeOfNonList(listSize.getLine()));
        return new NoType();
    }

    @Override
    public Type visit(ListAppend listAppend) {
        Type listType = listAppend.getListArg().accept(this);
        Type elementType = listAppend.getElementArg().accept(this);
        if (listType instanceof NoType)
            return new NoType();
        if (!(listType instanceof ListType)) {
            listAppend.addError(new AppendToNonList(listAppend.getLine()));
            return new NoType();
        }
        if (elementType.getClass() != ((ListType) listType).getType().getClass() &&
                !(elementType instanceof NoType)) {
            listAppend.addError(new NewElementTypeNotMatchListType(listAppend.getLine()));
            return new NoType();
        }
        if (elementType instanceof NoType)
            return new NoType();

        return new VoidType();
    }

    @Override
    public Type visit(ExprInPar exprInPar) {
        return exprInPar.getInputs().get(0).accept(this);
    }

    @Override
    public Type visit(IntValue intValue) {
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        return new BoolType();
    }

    public void setCurrentStatement(Statement currentStatement) {
        this.currentStatement = currentStatement;
    }
}
