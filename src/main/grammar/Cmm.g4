grammar Cmm;

@header{
     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 }

cmm returns[Program cmmProgram]:
    NEWLINE* p = program {$cmmProgram = $p.programRet;} NEWLINE* EOF;

program returns[Program programRet]:
    {$programRet = new Program();
     int line = 1;
     $programRet.setLine(line);}
    (s = structDeclaration {$programRet.addStruct($s.structDeclarationRet);})*
    (f = functionDeclaration {$programRet.addFunction($f.functionDeclarationRet);})*
    m = main {$programRet.setMain($m.mainRet);};

main returns[MainDeclaration mainRet]:
    m = MAIN LPAR RPAR body
    {
        $mainRet = new MainDeclaration();
        $mainRet.setBody($body.bodyRet);
        $mainRet.setLine($m.line);
    };

structDeclaration returns[StructDeclaration structDeclarationRet]:
    {$structDeclarationRet = new StructDeclaration();}
    s = STRUCT  {$structDeclarationRet.setLine($s.line);}
    identifier {$structDeclarationRet.setStructName($identifier.identifierRet);}
    ((b = BEGIN structBody NEWLINE+ END
    {
        BlockStmt blockStmt = new BlockStmt();
        blockStmt.setLine($b.line);
        blockStmt.setStatements($structBody.structBodyRet);
        $structDeclarationRet.setBody(blockStmt);
    }) |
    (NEWLINE+ singleStatementStructBody
    {
        $structDeclarationRet.setBody($singleStatementStructBody.singleStatementStructBodyRet);
    }
     SEMICOLON?)) NEWLINE+;

singleVarWithGetAndSet returns[SetGetVarDeclaration singleVarWithGetAndSetRet]:
    {$singleVarWithGetAndSetRet = new SetGetVarDeclaration();}
    type identifier functionArgsDec BEGIN NEWLINE+ setBody getBody END
    {
        $singleVarWithGetAndSetRet.setVarName($identifier.identifierRet);
        $singleVarWithGetAndSetRet.setVarType($type.typeRet);
        $singleVarWithGetAndSetRet.setArgs($functionArgsDec.functionArgsDecRet);
        $singleVarWithGetAndSetRet.setSetterBody($setBody.setBodyRet);
        $singleVarWithGetAndSetRet.setGetterBody($getBody.getBodyRet);
    };

singleStatementStructBody returns[Statement singleStatementStructBodyRet]:
    varDecStatement {$singleStatementStructBodyRet = $varDecStatement.varDecStatementRet;} |
    singleVarWithGetAndSet {$singleStatementStructBodyRet = $singleVarWithGetAndSet.singleVarWithGetAndSetRet;}
    ;

structBody returns[ArrayList<Statement> structBodyRet]:
    {$structBodyRet = new ArrayList<Statement>();}
    (NEWLINE+ (singleStatementStructBody {$structBodyRet.add($singleStatementStructBody.singleStatementStructBodyRet);} SEMICOLON)*
    singleStatementStructBody {$structBodyRet.add($singleStatementStructBody.singleStatementStructBodyRet);} SEMICOLON?)+;

getBody returns[Statement getBodyRet]:
    GET body {$getBodyRet = $body.bodyRet;} NEWLINE+;

setBody returns[Statement setBodyRet]:
    SET body {$setBodyRet = $body.bodyRet;} NEWLINE+;

functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
    (type | VOID ) identifier functionArgsDec body NEWLINE+
    {
        $functionDeclarationRet = new FunctionDeclaration();
        $functionDeclarationRet.setReturnType($type.typeRet);
        $functionDeclarationRet.setFunctionName($identifier.identifierRet);
        $functionDeclarationRet.setArgs($functionArgsDec.functionArgsDecRet);
        $functionDeclarationRet.setBody($body.bodyRet);
    };

functionArgsDec returns[ArrayList<VariableDeclaration> functionArgsDecRet]:
    {
        $functionArgsDecRet = new ArrayList<VariableDeclaration>();
    }
    LPAR (type identifier {$functionArgsDecRet.add(new VariableDeclaration($identifier.identifierRet, $type.typeRet));}
    (COMMA type identifier {$functionArgsDecRet.add(new VariableDeclaration($identifier.identifierRet, $type.typeRet));})*)? RPAR ;

functionArguments returns[ExprInPar functionArgumentsRet] :
    {
        ArrayList<Expression> inputs = new ArrayList<>();
    }
    (e = expression {inputs.add($e.expressionRet);}
    (COMMA e = expression {inputs.add($e.expressionRet);})*)?
    {
        $functionArgumentsRet = new ExprInPar(inputs);
    }
    ;

body returns [Statement bodyRet]:
     (blockStatement {$bodyRet = $blockStatement.blockStatementRet;}|
     (NEWLINE+ singleStatement {$bodyRet = $singleStatement.singleStatementRet;} (SEMICOLON)?));

loopCondBody returns[Statement loopCondBodyRet]:
     (blockStatement {$loopCondBodyRet = $blockStatement.blockStatementRet;}|
     (NEWLINE+ singleStatement {$loopCondBodyRet = $singleStatement.singleStatementRet;}));

blockStatement returns[BlockStmt blockStatementRet]:
    {$blockStatementRet = new BlockStmt();}
    b = BEGIN {$blockStatementRet.setLine($b.line);}
    (NEWLINE+ (singleStatement {$blockStatementRet.addStatement($singleStatement.singleStatementRet);} SEMICOLON)*
    singleStatement {$blockStatementRet.addStatement($singleStatement.singleStatementRet);}(SEMICOLON)?)+ NEWLINE+ END;

varDecStatement returns[VarDecStmt varDecStatementRet]:
    {
        $varDecStatementRet = new VarDecStmt();
        ArrayList<VariableDeclaration> vars = new ArrayList<>();
    }
    (
    {VariableDeclaration v = null;}
    type identifier
    {
        $varDecStatementRet.setLine($identifier.identifierRet.getLine());
        v = new VariableDeclaration($identifier.identifierRet, $type.typeRet);
        v.setLine($identifier.identifierRet.getLine());
        vars.add(v);
    }
    (ASSIGN orExpression {v.setDefaultValue($orExpression.orExpressionRet);} )?
    )
    (
    {VariableDeclaration v1 = null;}
    COMMA identifier
    {
        v1 = new VariableDeclaration($identifier.identifierRet, $type.typeRet);
        v1.setLine($identifier.identifierRet.getLine());
        vars.add(v1);
    } (ASSIGN orExpression {v1.setDefaultValue($orExpression.orExpressionRet);} )?
    )*
    {
        $varDecStatementRet.setVars(vars);
    }
    ;

functionCallStmt returns[FunctionCallStmt functionCallStmtRet]:
     otherExpression {Expression prev = $otherExpression.otherExpressionRet;}
     (
     (l = LPAR functionArguments RPAR
     {
        FunctionCall f = new FunctionCall(prev);
        f.setArgs($functionArguments.functionArgumentsRet.getInputs());
        f.setLine($l.line);
        prev = f;
     }
     ) |
     (d = DOT identifier
     {
        StructAccess sa = new StructAccess(prev, $identifier.identifierRet);
        sa.setLine($d.line);
        prev = sa;
     }
     )
     )* (l = LPAR functionArguments RPAR
     {
        FunctionCall f = new FunctionCall(prev, $functionArguments.functionArgumentsRet.getInputs());
        f.setLine($l.line);
        $functionCallStmtRet = new FunctionCallStmt(f);
     }
     );

returnStatement returns[ReturnStmt returnStatementRet]:
    {$returnStatementRet = new ReturnStmt();}
    r = RETURN {$returnStatementRet.setLine($r.line);}
    (expression {$returnStatementRet.setReturnedExpr($expression.expressionRet);})?;

ifStatement returns[ConditionalStmt ifStatementRet]:
    i = IF expression
    {
        $ifStatementRet = new ConditionalStmt($expression.expressionRet);
        $ifStatementRet.setLine($i.line);
    }
    (loopCondBody {$ifStatementRet.setThenBody($loopCondBody.loopCondBodyRet);} |
    body elseStatement
    {
        $ifStatementRet.setThenBody($body.bodyRet);
        $ifStatementRet.setElseBody($elseStatement.elseStatementRet);
    });

elseStatement returns[Statement elseStatementRet]:
     NEWLINE* ELSE loopCondBody {$elseStatementRet = $loopCondBody.loopCondBodyRet;};

loopStatement returns [LoopStmt loopStatementRet]:
    whileLoopStatement {$loopStatementRet = $whileLoopStatement.whileLoopStatementRet;} |
    doWhileLoopStatement {$loopStatementRet = $doWhileLoopStatement.doWhileLoopStatementRet;}
    ;

whileLoopStatement returns [LoopStmt whileLoopStatementRet]:
    w = WHILE expression loopCondBody
    {
        $whileLoopStatementRet = new LoopStmt();
        $whileLoopStatementRet.setCondition($expression.expressionRet);
        $whileLoopStatementRet.setBody($loopCondBody.loopCondBodyRet);
        $whileLoopStatementRet.setLine($w.line);
    };

doWhileLoopStatement returns[LoopStmt doWhileLoopStatementRet]:
    d = DO body NEWLINE* WHILE expression
    {
        $doWhileLoopStatementRet = new LoopStmt();
        $doWhileLoopStatementRet.setCondition($expression.expressionRet);
        $doWhileLoopStatementRet.setBody($body.bodyRet);
        $doWhileLoopStatementRet.setLine($d.getLine());
    }
    ;

displayStatement returns [DisplayStmt displayStatementRet]:

  d = DISPLAY LPAR expression RPAR
  {
      $displayStatementRet = new DisplayStmt($expression.expressionRet);
      $displayStatementRet.setLine($d.line);
  }
  ;

assignmentStatement returns [AssignmentStmt assignmentStatementRet]:
    {
        Expression lhs = null;
        Expression rhs = null;
    }
    orExpression {lhs = $orExpression.orExpressionRet;}
    a = ASSIGN expression {rhs = $expression.expressionRet;}
    {
        $assignmentStatementRet = new AssignmentStmt(lhs, rhs);
        $assignmentStatementRet.setLine($a.line);
    }
    ;

singleStatement returns [Statement singleStatementRet]:
    ifStatement {$singleStatementRet = $ifStatement.ifStatementRet;} |
    displayStatement {$singleStatementRet = $displayStatement.displayStatementRet;} |
    functionCallStmt {$singleStatementRet = $functionCallStmt.functionCallStmtRet;} |
    returnStatement {$singleStatementRet = $returnStatement.returnStatementRet;} |
    assignmentStatement {$singleStatementRet = $assignmentStatement.assignmentStatementRet;} |
    varDecStatement {$singleStatementRet = $varDecStatement.varDecStatementRet;} |
    loopStatement {$singleStatementRet = $loopStatement.loopStatementRet;} |
    append {$singleStatementRet = new ListAppendStmt($append.appendRet);} |
    size {$singleStatementRet = new ListSizeStmt($size.sizeRet);};

expression returns[Expression expressionRet]:
    {Expression prev = null;}
    orExpression {prev = $orExpression.orExpressionRet;}
    (op = ASSIGN expression
    {
        prev = new BinaryExpression(prev,
                                    $expression.expressionRet,
                                    BinaryOperator.assign);
        prev.setLine($op.line);
    }
    )?
    {$expressionRet = prev;}
    ;

orExpression returns[Expression orExpressionRet]:
    {Expression prev = null;}
    ae1 = andExpression {prev = $ae1.andExpressionRet;}
    (op = OR ae2 = andExpression
    {
        prev = new BinaryExpression(prev,
                                $ae2.andExpressionRet,
                                BinaryOperator.or);
        prev.setLine($op.line);
    }
    )*
    {$orExpressionRet = prev;}
    ;

andExpression returns[Expression andExpressionRet]:
    {Expression prev = null;}
    ex1 = equalityExpression {prev = $ex1.equalityExpressionRet;}
    (op = AND ex2 = equalityExpression
    {
        prev = new BinaryExpression(prev,
                                $ex2.equalityExpressionRet,
                                BinaryOperator.and);
        prev.setLine($op.line);
    }
    )*
    {$andExpressionRet = prev;}
    ;

equalityExpression returns[Expression equalityExpressionRet]:
    {Expression prev = null;}
    re1 = relationalExpression {prev = $re1.relationalExpressionRet;}
    (op = EQUAL relationalExpression
    {
        prev = new BinaryExpression(prev,
                                $relationalExpression.relationalExpressionRet,
                                BinaryOperator.eq);
        prev.setLine($op.line);
    }
    )*
    {$equalityExpressionRet = prev;}
    ;

relationalExpression returns[Expression relationalExpressionRet]:
    {Expression prev = null;}
    ae = additiveExpression {prev = $ae.additiveExpressionRet;}
    ((op = GREATER_THAN | op = LESS_THAN) additiveExpression
    {
        BinaryOperator op = null;
        if($op.text == ">")
            op = BinaryOperator.gt;
        else
            op = BinaryOperator.lt;
        prev = new BinaryExpression(prev,
                                    $additiveExpression.additiveExpressionRet,
                                    op);
        prev.setLine($op.line);
    }
    )*
    {$relationalExpressionRet = prev;}
    ;

additiveExpression returns[Expression additiveExpressionRet]:
    {Expression prev = null;}
    me = multiplicativeExpression {prev = $me.multiplicativeExpressionRet;}
    ((op = PLUS | op = MINUS) multiplicativeExpression
    {
        BinaryOperator op = null;
        if($op.text == "+")
            op = BinaryOperator.add;
        else
            op = BinaryOperator.sub;
        prev = new BinaryExpression(prev,
                                    $multiplicativeExpression.multiplicativeExpressionRet,
                                    op);
        prev.setLine($op.line);
    }
    )*
    {$additiveExpressionRet = prev;}
    ;

multiplicativeExpression returns[Expression multiplicativeExpressionRet]:
    {Expression prev = null;}
    pue = preUnaryExpression {prev = $pue.preUnaryExpressionRet;}
    ((op = MULT | op = DIVIDE) preUnaryExpression
    {
        BinaryOperator op = null;
        if($op.text == "*")
            op = BinaryOperator.mult;
        else
            op = BinaryOperator.div;
        prev = new BinaryExpression(prev,
                                    $preUnaryExpression.preUnaryExpressionRet,
                                    op);
        prev.setLine($op.line);
    }
    )*
    {$multiplicativeExpressionRet = prev;}
    ;

preUnaryExpression returns[Expression preUnaryExpressionRet]:
    ((op = NOT | op = MINUS) preUnaryExpression ) {
        UnaryExpression curr = null;
        if($op.text == "~")
            curr = new UnaryExpression($preUnaryExpression.preUnaryExpressionRet,
                                    UnaryOperator.not);
        else
            curr = new UnaryExpression($preUnaryExpression.preUnaryExpressionRet,
                                    UnaryOperator.minus);
        curr.setLine($op.line);
        $preUnaryExpressionRet = curr;
    } |
    accessExpression {$preUnaryExpressionRet = $accessExpression.accessExpressionRet;}
    ;

accessExpression returns[Expression accessExpressionRet]:
    otherExpression
    {Expression prev = $otherExpression.otherExpressionRet;}
    ((
    l = LPAR
    functionArguments
    RPAR
    {
        FunctionCall f = new FunctionCall(prev);
        f.setArgs($functionArguments.functionArgumentsRet.getInputs());
        f.setLine($l.line);
        prev = f;
    }
    ) |
    (
    d = DOT identifier
    {
        StructAccess sa = new StructAccess(prev, $identifier.identifierRet);
        sa.setLine($d.line);
        prev = sa;
    }
    )
    )*
    ((
    l = LBRACK
    expression
    RBRACK
    {
        ListAccessByIndex l = new ListAccessByIndex(prev, $expression.expressionRet);
        l.setLine($l.line);
    }
    ) |
    (
    d = DOT
    identifier
    {
        StructAccess sa = new StructAccess(prev, $identifier.identifierRet);
        sa.setLine($d.line);
        prev = sa;
    }
    )
    )*
    {$accessExpressionRet = prev;}
    ;

otherExpression returns[Expression otherExpressionRet]:
    v = value {$otherExpressionRet = $v.valueRet;} |
    i = identifier {$otherExpressionRet = $i.identifierRet;} |
    l = LPAR
    (f = functionArguments)
    RPAR
    {
        $f.functionArgumentsRet.setLine($l.line);
        $otherExpressionRet = $f.functionArgumentsRet;
    } |
    s = size {$otherExpressionRet = $s.sizeRet;} |
    a = append {$otherExpressionRet = $a.appendRet;}
    ;

size returns[ListSize sizeRet]:
    {Expression arg = null;}
    s = SIZE LPAR
    e = expression {$sizeRet = new ListSize($e.expressionRet);}
    RPAR
    {$sizeRet.setLine($s.line);};

append returns[ListAppend appendRet]:
    {
    Expression listArg = null;
    Expression elementArg = null;
    }
    a = APPEND LPAR la = expression {listArg = $la.expressionRet;}
    COMMA
    ea = expression {elementArg = $ea.expressionRet;} RPAR
    {
    $appendRet = new ListAppend(listArg, elementArg);
    $appendRet.setLine($a.line);
    };

value returns[Value valueRet] :
    b = boolValue {$valueRet = $b.boolValueRet;} |
    i = INT_VALUE {$valueRet = new IntValue($i.int); $valueRet.setLine($i.line);};

boolValue returns[BoolValue boolValueRet]:
    t = TRUE {$boolValueRet = new BoolValue(true); $boolValueRet.setLine($t.line);}
    |
    f = FALSE {$boolValueRet = new BoolValue(false); $boolValueRet.setLine($f.line);};

identifier returns[Identifier identifierRet]:
    i = IDENTIFIER {$identifierRet = new Identifier($i.text);
                    $identifierRet.setLine($i.line);};

type returns[Type typeRet]:
    INT { $typeRet = new IntType(); } |
    BOOL { $typeRet = new BoolType(); } |
    LIST SHARP t = type { $typeRet = new ListType($t.typeRet); } |
    STRUCT i = identifier { $typeRet = new StructType($i.identifierRet); } |
    f = fptrType {$typeRet = $f.fptrTypeRet;}
    ;

fptrType returns[FptrType fptrTypeRet]:
    {
        ArrayList<Type> args = new ArrayList<>();
        Type returnType = null;
    }
    FPTR LESS_THAN
    (
    VOID { args.add(new VoidType()); }|
    (t1 = type { args.add($t1.typeRet); }
    (COMMA t2 = type { args.add($t2.typeRet); })*))
    ARROW (t3 = type { returnType = $t3.typeRet; } |
    VOID { returnType = new VoidType(); })
    GREATER_THAN { $fptrTypeRet = new FptrType(args, returnType); }
    ;

MAIN: 'main';
RETURN: 'return';
VOID: 'void';

SIZE: 'size';
DISPLAY: 'display';
APPEND: 'append';

IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';


EQUAL: '==';
ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';


AND: '&';
OR: '|';
NOT: '~';

TRUE: 'true';
FALSE: 'false';

BEGIN: 'begin';
END: 'end';

INT: 'int';
BOOL: 'bool';
LIST: 'list';
STRUCT: 'struct';
FPTR: 'fptr';
GET: 'get';
SET: 'set';
WHILE: 'while';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';

COMMA: ',';
DOT: '.';
SEMICOLON: ';';
NEWLINE: '\n';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;


COMMENT: ('/*' .*? '*/') -> skip;
WS: ([ \t\r]) -> skip;