package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.ast.types.FptrType;
import main.ast.types.ListType;
import main.ast.types.StructType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.visitor.Visitor;
import main.visitor.type.ExpressionTypeChecker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    private String outputPath;
    private FileWriter currentFile;
    private final ArrayList<String> localVars = new ArrayList<>();
    private final Map<String, ArrayList<Type>> functionPointers = new HashMap<>();
    private boolean inStruct;
    private boolean inCtor;
    private static final int stackLimit = 128;
    private static final int localLimit = 128;
    private static final char NEW_LINE = '\n';
    private static final String loadObject = "aload";
    private static final String loadPrimitive = "iload";
    private static final String storePrimitive = "istore";
    private static final String storeObject = "astore";
    private static final String add = "iadd";
    private static final String sub = "isub";
    private static final String mult = "imul";
    private static final String div = "idiv";
    private static String afterLabel;
    private static String trueLabel;
    private static String falseLabel;
    private static int labelCounter = 0;

    @Override
    public String visit(Program program) {
        prepareOutputFolder();

        for (StructDeclaration structDeclaration : program.getStructs()) {
            structDeclaration.accept(this);
        }

        createFile("Main");

        program.getMain().accept(this);

        for (FunctionDeclaration functionDeclaration : program.getFunctions()) {
            functionDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(StructDeclaration structDeclaration) {
        try {
            String structKey = StructSymbolTableItem.START_KEY + structDeclaration.getStructName().getName();
            StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(structKey);
            SymbolTable.push(structSymbolTableItem.getStructSymbolTable());
        } catch (ItemNotFoundException e) {//unreachable
        }
        createFile(structDeclaration.getStructName().getName());
        inStruct = true;
        createClass(structDeclaration.getStructName().getName());
        addField(structDeclaration.getStructName().getName());
        structDeclaration.getBody().accept(this);
        inCtor = true;
        addCommand(".method public <init>()V");
        addCommand(".limit stack " + stackLimit);
        addCommand(".limit locals " + localLimit);
        addCommand("aload_0");
        addCommand("invokespecial java/lang/Object/<init>()V");
        structDeclaration.getBody().accept(this);
        addCommand("return");
        addCommand(".end method");
        inStruct = false;
        inCtor = false;
        clearLocalVars();
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        try {
            String functionKey = FunctionSymbolTableItem.START_KEY + functionDeclaration.getFunctionName().getName();
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        } catch (ItemNotFoundException e) {//unreachable
        }
        StringBuilder functionDec = new StringBuilder(".method public " + functionDeclaration.getFunctionName().getName() + "(");
        addField(functionDeclaration.getFunctionName().getName());
        for (VariableDeclaration variableDeclaration : functionDeclaration.getArgs()) {
            String jasminType = getJasminType(variableDeclaration.getVarType());
            functionDec.append(jasminType);
            if (!functionDec.toString().endsWith(";"))
                functionDec.append(";");
            addField(variableDeclaration.getVarName().getName());
        }
        functionDec.append(")");
        String jasminType = getJasminType(functionDeclaration.getReturnType());
        functionDec.append(jasminType);
        addCommand(functionDec.toString());
        addCommand(".limit stack " + stackLimit);
        addCommand(".limit locals " + localLimit);
        functionDeclaration.getBody().accept(this);
        if (functionDeclaration.getReturnType() instanceof VoidType) handleVoidFunction();
        addCommand(".end method");
        clearLocalVars();
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        try {
            String functionKey = FunctionSymbolTableItem.START_KEY + "main";
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        } catch (ItemNotFoundException e) {//unreachable
        }
        createClass("Main");
        addStaticMainMethod();
        inCtor = true;
        addCommand(".method public <init>()V");
        addCommand(".limit stack " + stackLimit);
        addCommand(".limit locals " + localLimit);
        addCommand("aload_0");
        addCommand("invokespecial java/lang/Object/<init>()V");
        addField("Main");
        mainDeclaration.getBody().accept(this);
        inCtor = false;
        clearLocalVars();
        addCommand("return");
        addCommand(".end method");
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        if (inStruct) {
            if (inCtor)
                initialClassProperty(variableDeclaration);
            else {
                addCommand(".field " + variableDeclaration.getVarName().getName() + " " +
                        getJasminType(variableDeclaration.getVarType()));
                addField(variableDeclaration.getVarName().getName());
            }
        } else {
            addField(variableDeclaration.getVarName().getName());
            putDefaultValue(variableDeclaration);
            storeVariable(variableDeclaration);
        }
        return null;
    }

    @Override
    public String visit(SetGetVarDeclaration setGetVarDeclaration) {
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        BinaryExpression assignmentExpression = new BinaryExpression(
                assignmentStmt.getLValue(),
                assignmentStmt.getRValue(),
                BinaryOperator.assign);
        addCommand(assignmentExpression.accept(this));
        pop();
        return null;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        for (Statement statement : blockStmt.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        afterLabel = getNewLabel();
        trueLabel = getNewLabel();
        falseLabel = getNewLabel();
        addCommand(conditionalStmt.getCondition().accept(this));
        addCommand(invokeLabel(trueLabel) + NEW_LINE);
        conditionalStmt.getThenBody().accept(this);
        addCommand(invokeLabel(falseLabel) + NEW_LINE);
        if (conditionalStmt.getElseBody() != null) {
            conditionalStmt.getElseBody().accept(this);
        }
        addCommand(invokeLabel(afterLabel) + NEW_LINE);
        return null;
    }

    @Override
    public String visit(FunctionCallStmt functionCallStmt) {
        expressionTypeChecker.setInFunctionCallStmt(true);
        functionCallStmt.getFunctionCall().accept(this);
        expressionTypeChecker.setInFunctionCallStmt(false);
        pop();
        return null;
    }

    @Override
    public String visit(DisplayStmt displayStmt) {
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        String commandsOfArg = displayStmt.getArg().accept(this);

        addCommand(commandsOfArg);
        if (argType instanceof IntType) {
            addCommand(invokeIntegerToInt());
            addCommand("invokevirtual java/io/PrintStream/println(I)V");
        }
        if (argType instanceof BoolType) {
            addCommand(invokeBooleanToBool());
            addCommand("invokevirtual java/io/PrintStream/println(Z)V");
        }

        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        if (returnStmt.getReturnedExpr() != null) {
            addCommand(returnStmt.getReturnedExpr().accept(this));
            Type returnType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
            if (returnType instanceof IntType || returnType instanceof BoolType) {
                addCommand("areturn");
                return null;
            }
            addCommand("areturn");
        }
        return null;
    }

    @Override
    public String visit(LoopStmt loopStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(VarDecStmt varDecStmt) {
        for (VariableDeclaration variableDeclaration : varDecStmt.getVars()) {
            variableDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ListAppendStmt listAppendStmt) {
        expressionTypeChecker.setInFunctionCallStmt(true);
        addCommand(listAppendStmt.getListAppendExpr().accept(this));
        expressionTypeChecker.setInFunctionCallStmt(false);
        return null;
    }

    @Override
    public String visit(ListSizeStmt listSizeStmt) {
        addCommand(listSizeStmt.getListSizeExpr().accept(this));
        pop();
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        BinaryOperator op = binaryExpression.getBinaryOperator();
        Expression left = binaryExpression.getFirstOperand();
        Expression right = binaryExpression.getSecondOperand();
        switch (op) {
            case add, div, mult, sub -> {
                return left.accept(this) + NEW_LINE +
                        invokeIntegerToInt() + NEW_LINE +
                        right.accept(this) + NEW_LINE +
                        invokeIntegerToInt() + NEW_LINE + getOperatorAsString(op) + NEW_LINE;
            }
            case and -> {
                String nextLabel = getNewLabel();
                return left.accept(this) +
                        invokeBooleanToBool() +
                        NEW_LINE +
                        "iconst_0" +
                        NEW_LINE +
                        "ifne " + nextLabel +
                        NEW_LINE +
                        invokeGoto(falseLabel) +
                        NEW_LINE +
                        invokeLabel(nextLabel) +
                        NEW_LINE +
                        right.accept(this) +
                        NEW_LINE +
                        invokeBooleanToBool() +
                        NEW_LINE +
                        "iconst_0" +
                        NEW_LINE +
                        "ifne " + trueLabel +
                        NEW_LINE +
                        invokeGoto(falseLabel) +
                        NEW_LINE +
                        "iconst_1" +
                        NEW_LINE;
            }
            case or -> {
                String nextLabel = getNewLabel();

                return left.accept(this) + NEW_LINE +
                        invokeBooleanToBool() + NEW_LINE +
                        "iconst_1" + NEW_LINE +
                        "ifne " + nextLabel + NEW_LINE +
                        invokeGoto(trueLabel) + NEW_LINE +
                        invokeLabel(nextLabel) + NEW_LINE +
                        right.accept(this) + NEW_LINE +
                        invokeBooleanToBool() + NEW_LINE +
                        "iconst_1" + NEW_LINE +
                        "ifne " + afterLabel + NEW_LINE +
                        invokeGoto(trueLabel) + NEW_LINE;
            }
            case assign -> {
                return handleAssignExpression(left, right) + NEW_LINE;
            }
            case eq -> {


            }
            case gt -> {


            }
            case lt -> {
            }
        }
        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        return null;
    }

    @Override
    public String visit(StructAccess structAccess) {
        String command = structAccess.getInstance().accept(this);

        Type elementType = structAccess.accept(expressionTypeChecker);
        StructType structType = (StructType) structAccess.getInstance().accept(expressionTypeChecker);

        command += getClassProperty(structType.getStructName().getName(),
                structAccess.getElement().getName(), elementType);
        command += NEW_LINE;
        return command;
    }

    @Override
    public String visit(Identifier identifier) {
        Type identifierType = identifier.accept(expressionTypeChecker);
        if (identifierType instanceof IntType || identifierType instanceof BoolType) {
            return loadObject + getProperSlot(identifier.getName()) + NEW_LINE;
        }
        if (identifierType instanceof FptrType) {
            return newFptrObject(identifier.getName()) + NEW_LINE;
        }
        return loadObject + getProperSlot(identifier.getName()) + NEW_LINE;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex) {
        StringBuilder commands = new StringBuilder();
        Type elementType = ((ListType) listAccessByIndex.getInstance().accept(expressionTypeChecker)).getType();
        commands.append(listAccessByIndex.getInstance().accept(this));
        commands.append(listAccessByIndex.getIndex().accept(this));
        commands.append(invokeListGetElement());
        commands.append(NEW_LINE);
        commands.append(invokeCheckCast(elementType));
        commands.append(NEW_LINE);
        if (elementType instanceof IntType) {
            commands.append(invokeIntegerToInt());
            commands.append(NEW_LINE);
        } else if (elementType instanceof BoolType) {
            commands.append(invokeBooleanToBool());
            commands.append(NEW_LINE);
        }
        commands.append(invokeArrayListAdd());
        commands.append(NEW_LINE);
        return commands.toString();
    }

    @Override
    public String visit(FunctionCall functionCall) {
        StringBuilder commands = new StringBuilder();
        commands.append(newArrayList());
        commands.append(NEW_LINE);
        for (Expression argument : functionCall.getArgs()) {
            Type argumentType = argument.accept(expressionTypeChecker);
            commands.append(argument.accept(this));
            commands.append(NEW_LINE);
            if (argumentType instanceof IntType) {
                commands.append(invokeValueOfInt());
                commands.append(NEW_LINE);
            } else if (argumentType instanceof BoolType) {
                commands.append(invokeBooleanToBool());
                commands.append(NEW_LINE);
            }
            commands.append(invokeArrayListAdd());
            commands.append(NEW_LINE);
        }
        return commands.toString();
    }

    @Override
    public String visit(ListSize listSize) {
        String command = listSize.getArg().accept(this);
        command += invokeListGetSize() + NEW_LINE;
        command += invokeValueOfInt() + NEW_LINE;
        return command;
    }

    @Override
    public String visit(ListAppend listAppend) {
        return listAppend.getListArg().accept(this) +
                listAppend.getElementArg().accept(this) +
                invokeListAddElement() +
                NEW_LINE;
    }

    @Override
    public String visit(IntValue intValue) {
        String command = "ldc " + intValue.getConstant();
        command += NEW_LINE;
        command += invokeValueOfInt();
        command += NEW_LINE;
        return command;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String command = boolValue.getConstant() ? "ldc 1" : "ldc 0";
        command += NEW_LINE;
        command += invokeValueOfBoolean();
        command += NEW_LINE;
        return command;
    }

    @Override
    public String visit(ExprInPar exprInPar) {
        return exprInPar.getInputs().get(0).accept(this);
    }

    private String getJasminType(Type type) {
        if (type instanceof IntType)
            return "Ljava/lang/Integer;";
        if (type instanceof BoolType)
            return "Ljava/lang/Boolean;";
        if (type instanceof ListType)
            return "LList;";
        if (type instanceof StructType)
            return "L" + ((StructType) type).getStructName().getName() + ";";
        if (type instanceof VoidType)
            return "V";
        if (type instanceof FptrType)
            return "Fptr";
        return null;
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {//unreachable
        }
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try {
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if (files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        } catch (SecurityException e) {//unreachable

        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            this.currentFile = new FileWriter(path);
        } catch (IOException e) {//never reached
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if (command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if (command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {//unreachable

        }
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method");
    }

    private int slotOf(String identifier) {
        if (identifier.equalsIgnoreCase("")) {
            localVars.add("");
            return localVars.size() - 1;
        }
        if (localVars.contains(identifier))
            return localVars.indexOf(identifier);
        return 0;
    }

    private void createClass(String className) {
        addCommand(".class public " + className);
        addCommand(".super java/lang/Object");
    }

    private void addField(String fieldName) {
        localVars.add(fieldName);
    }

    private void clearLocalVars() {
        localVars.clear();
    }

    private void createFunction(String methodName, String returnType, boolean isStatic, String... args) {
        StringBuilder argsString = new StringBuilder();
        for (String arg : args) {
            argsString.append(arg);
            argsString.append(" ");
        }
        if (isStatic)
            addCommand(".method public static " + methodName + "(" + argsString + ")" + returnType);
        else
            addCommand(".method public " + methodName + "(" + argsString + ")" + returnType);
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
    }

    private void initialClassProperty(VariableDeclaration variableDeclaration) {
        addCommand("aload_0");
        putDefaultValue(variableDeclaration);
        addCommand(putField(getCurrentClass(),
                variableDeclaration.getVarName().getName(),
                variableDeclaration.getVarType()));
    }

    private String putField(String className, String fieldName, Type varType) {
        return "putfield " + className + "/" +
                fieldName + " " +
                getJasminType(varType);
    }

    private String getClassProperty(String structName, String elementName, Type elementType) {
        return "getfield " + structName + "/" + elementName + " " + getJasminType(elementType);
    }

    private void putDefaultValue(VariableDeclaration variableDeclaration) {
        if (variableDeclaration.getDefaultValue() != null) {
            addCommand(variableDeclaration.getDefaultValue().accept(this));
            return;
        }
        if (variableDeclaration.getVarType() instanceof IntType || variableDeclaration.getVarType() instanceof BoolType)
            addCommand((new IntValue(0).accept(this)));
        else if (variableDeclaration.getVarType() instanceof FptrType)
            addCommand("aconst_null");
        else if (variableDeclaration.getVarType() instanceof StructType)
            addCommand(initiateClass(((StructType) variableDeclaration.getVarType()).getStructName().getName()));
        else if (variableDeclaration.getVarType() instanceof ListType)
            addCommand("new List;");
    }

    private String getCurrentClass() {
        return localVars.get(0);
    }

    private void handleVoidFunction() {
        pop();
        addCommand("return");
    }

    private void pop() {
        addCommand("pop");
    }

    private void storeVariable(VariableDeclaration variableDeclaration) {
        addCommand(storeObject + getProperSlot(variableDeclaration.getVarName().getName()));
    }

    private String getProperSlot(String identifier) {
        int slot = slotOf(identifier);
        if (slot < 4)
            return "_" + slot;
        return " " + slot;
    }

    private String invokeListGetElement() {
        return "invokevirtual List/getElement(I)Ljava/lang/Object";
    }

    private String invokeListAddElement() {
        return "invokevirtual List/addElement(Ljava/lang/Object;)V";
    }

    private String invokeListGetSize() {
        return "invokevirtual List/getSize()I";
    }

    private String invokeListSetElement() {
        return "invokevirtual List/setElement(I;Ljava/lang/Object;)V";
    }

    private String invokeValueOfBoolean() {
        return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
    }

    private String invokeValueOfInt() {
        return "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
    }

    private String invokeIntegerToInt() {
        return "invokevirtual java/lang/Integer/intValue()I";
    }

    private String invokeBooleanToBool() {
        return "invokevirtual java/lang/Boolean/booleanValue()Z";
    }

    private String invokeArrayListAdd() {
        return "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z";
    }

    private String invokeCheckCast(Type type) {
        return "chackcast " + getJasminType(type);
    }

    private String invokeFptr() {
        return "invokevirtual Fptr/invoke()Ljava/lang/Object;";
    }

    private String initiateFptr() {
        return "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V";
    }

    private String initiateClass(String className) {

        return "new " + className + NEW_LINE +
                "dup" + NEW_LINE +
                "invokespecial " + className + "/<init>()V";
    }

    private String newFptrObject(String identifierName) {
        return "new Fptr" +
                NEW_LINE +
                (loadObject + getProperSlot(identifierName)) +
                NEW_LINE +
                initiateFptr();
    }

    private void setFptrArgs(String fptrName, ArrayList<Type> args) {
        functionPointers.put(fptrName, args);
    }

    private ArrayList<Type> getFptrArgs(String fptrName) {
        return functionPointers.get(fptrName);
    }

    private String getNewLabel() {
        return "Label_" + labelCounter++;
    }

    private String newArrayList() {
        return "new ArrayList";
    }

    private String invokeGoto(String label) {
        return "goto " + label;
    }

    private String invokeLabel(String label) {
        return label + ":";
    }

    private String getOperatorAsString(BinaryOperator binaryOperator) {
        switch (binaryOperator) {
            case add -> {
                return add;
            }
            case sub -> {
                return sub;
            }
            case mult -> {
                return mult;
            }
            case div -> {
                return div;
            }
        }
        return null;
    }

    private String invokeListCopyCtor() {
        return "invokevirtual List/<init>(LList;)V";
    }

    private String invokeNewListDup() {
        return "new List" + NEW_LINE + "dup";
    }

    private String handleAssignExpression(Expression left, Expression right) {
        String command = "";
        Type rightType = right.accept(expressionTypeChecker);
        String listTypeHandled = handleListType(rightType, right);
        if (left instanceof StructAccess) {
            command += ((StructAccess) left).getInstance().accept(this);
            command += NEW_LINE;
            Type elementType = left.accept(expressionTypeChecker);
            StructType structType = (StructType) ((StructAccess) left).getInstance().accept(expressionTypeChecker);
            command += listTypeHandled + NEW_LINE;
            command += putField(structType.getStructName().getName(),
                    ((StructAccess) left).getElement().getName(), elementType) + NEW_LINE;
            command += left.accept(this);
        } else if (left instanceof Identifier) {
            command += listTypeHandled + NEW_LINE;
            command += storeObject + getProperSlot(((Identifier) left).getName());
        } else if (left instanceof ListAccessByIndex) {
            command += ((ListAccessByIndex) left).getInstance().accept(this) + NEW_LINE;
            command += ((ListAccessByIndex) left).getIndex().accept(this) + NEW_LINE;
            command += listTypeHandled + NEW_LINE;
            command += invokeListSetElement() + NEW_LINE;
            command += right.accept(this);
        }
        return command;
    }

    private String handleListType(Type rightType, Expression right) {
        String command = "";
        if (rightType instanceof ListType) command += invokeNewListDup() + NEW_LINE;
        command += right.accept(this) + NEW_LINE;
        if (rightType instanceof ListType) command += invokeListCopyCtor();
        return command;
    }
}
