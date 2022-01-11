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

public class CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    private String outputPath;
    private FileWriter currentFile;
    private final ArrayList<String> localVars = new ArrayList<>();
    private boolean inStruct;
    private boolean inCtor;
    private static final int stackLimit = 128;
    private static final int localLimit = 128;
    private static final char NEW_LINE = '\n';

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
            functionDec.append(jasminType).append(";");
            addField(variableDeclaration.getVarName().getName());
        }
        functionDec.append(")");
        String jasminType = getJasminType(functionDeclaration.getReturnType());
        functionDec.append(jasminType);
        addCommand(functionDec.toString());
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
        //todo
        return null;
    }

    @Override
    public String visit(FunctionCallStmt functionCallStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(DisplayStmt displayStmt) {
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        String commandsOfArg = displayStmt.getArg().accept(this);

        addCommand(commandsOfArg);
        if (argType instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/println(I)V");
        if (argType instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/println(Z)V");

        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        if (returnStmt.getReturnedExpr() != null) {
            addCommand(returnStmt.getReturnedExpr().accept(this));
            Type returnType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
            if (returnType instanceof IntType || returnType instanceof BoolType) {
                addCommand("ireturn");
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

    //TODO: mahdiiii please check this
    @Override
    public String visit(ListSizeStmt listSizeStmt) {
        String command = listSizeStmt.getListSizeExpr().accept(this);
        addCommand(command);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        //todo
        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        return null;
    }

    @Override
    public String visit(StructAccess structAccess) {
        //todo
        return null;
    }

    //TODO: mahdiiii please check this
    @Override
    public String visit(Identifier identifier) {
        String command="";
        try {
            String functionKey = FunctionSymbolTableItem.START_KEY + identifier.getName();
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            command += "new Fptr\n";
            command += "aload_0";
            if(slotOf(identifier.getName())<4)
                command += "aload_" + slotOf(identifier.getName());
            else
                command += "aload " + slotOf(identifier.getName());

            command += "invokespecial Fptr/<int>(Ljava/lang/String;)v\n";

        } catch (ItemNotFoundException e) {
            Type idType = identifier.accept(expressionTypeChecker);
            if(idType instanceof IntType || idType instanceof BoolType){
                if(slotOf(identifier.getName()) < 4)
                    command += "iload_" + slotOf(identifier.getName());
                else
                    command += "iload " + slotOf(identifier.getName());
            }else {
                if(slotOf(identifier.getName()) < 4)
                    command += "aload_" + slotOf(identifier.getName());
                else
                    command += "aload " + slotOf(identifier.getName());
            }
           command += "\n";
        }
        return command;
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

        //TODO: mahdiiii please check this
        if (((ListType) elementType).getType() instanceof IntType) {
            commands.append("invokevirtual java/lang/Integer/intValue()I\n");
        }
        else if (((ListType) elementType).getType() instanceof BoolType) {
            commands.append("invokevirtual java/lang/Boolean/booleanValue()Z\n");
        }

        return commands.toString();
    }

    //TODO: mahdiiii please check this
    @Override
    public String visit(FunctionCall functionCall) {
        String command = "new ArrayList\n";
        for(Expression argumnet: functionCall.getArgs()){
            Type argumnentType = argumnet.accept(expressionTypeChecker);
            command += argumnet.accept(this);
            if(argumnentType instanceof IntType){
                command += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
            }else if(argumnentType instanceof BoolType){
                command += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
            }
            command += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z";
        }
        return command;
    }

    //TODO: mahdiiii please check this
    @Override
    public String visit(ListSize listSize) {
        String command = listSize.getArg().accept(this);
        command += "invokevirtual List/getSize()I\n";
        command += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
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
            return "java/lang/Integer";
        if (type instanceof BoolType)
            return "java/lang/Boolean";
        if (type instanceof ListType)
            return "List";
        if (type instanceof StructType)
            return ((StructType) type).getStructName().getName();
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
        addCommand("putfield " + getCurrentClass() + "/" +
                variableDeclaration.getVarName().getName() + " " +
                getJasminType(variableDeclaration.getVarType()));
    }

    private void putDefaultValue(VariableDeclaration variableDeclaration) {
        if (variableDeclaration.getDefaultValue() != null) {
            addCommand(variableDeclaration.getDefaultValue().accept(this));
            return;
        }
        if (variableDeclaration.getVarType() instanceof IntType || variableDeclaration.getVarType() instanceof BoolType)
            addCommand("iconst_0");
        else if (variableDeclaration.getVarType() instanceof FptrType)
            addCommand("aconst_null");
        else if (variableDeclaration.getVarType() instanceof StructType)
            addCommand("new " + ((StructType) variableDeclaration.getVarType()).getStructName().getName());
        else if (variableDeclaration.getVarType() instanceof ListType)
            addCommand("new List");
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
        if (variableDeclaration.getVarType() instanceof IntType ||
                variableDeclaration.getVarType() instanceof BoolType) {
            addCommand("istore" + getProperSlot(variableDeclaration.getVarName().getName()));
            return;
        }
        addCommand("astore" + getProperSlot(variableDeclaration.getVarName().getName()));
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

    private String invokeValueOfBoolean() {
        return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean";
    }

    private String invokeValueOfInt() {
        return "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer";
    }

    private String invokeCheckCast(Type type) {
        return "chackcast " + getJasminType(type);
    }
}
