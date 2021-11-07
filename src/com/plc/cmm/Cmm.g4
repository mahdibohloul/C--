grammar Cmm;
//TODO: Other variables type
//TODO: semicolon problem
//TODO other op '*''/''-'
//TODO: IF ELSE SIZE APPEND FPTR LIST and struct.NAME LINE problem

cmm : (struct_dec)* (functionDefinition)* main;


TYPE_SPECIFIER
    :
    (   VOID
    |   BOOL
    |   INT
    )
    ;


functionParameterList
    :   TYPE_SPECIFIER NAMING_CONVENTION (COMMA TYPE_SPECIFIER NAMING_CONVENTION)*
    ;

functionDefinition
    :   TYPE_SPECIFIER NAMING_CONVENTION parameterTypeList declaration* statement*
    ;

parameterTypeList
    :   LeftParen functionParameterList? RightParen
    ;

func_call: NAMING_CONVENTION LPAREN (argument ',')*(argument) RPAREN SEMICOLON;


functionReturn
    :   Identifier LeftParen identifierList? RightParen
    ;


identifierList
    :   expression (COMMA expression)*
    ;


struct_dec: {int a;}STRUCT a=NAMING_CONVENTION (BEGIN (struct_body)* END | struct_body)
{System.out.println("StructDec: "+$a.text);};


//struct_body: ({int a;}(BUILT_IN_DATA_TYPE | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION{System.out.println("VarDec: "+$a.text);} | (
//            (BUILT_IN_DATA_TYPE | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION {System.out.println("VarDec: "+$a.text);} LPAREN argument RPAREN getter_setter
//);



main: MAIN BEGIN
                    declaration*
                    statement*
                    END
                    ;


declaration   : {int a;}(BUILT_IN_DATA_TYPE | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION
                    {System.out.println("VarDec: "+$a.text);};

argument: {int a;}(BUILT_IN_DATA_TYPE | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION
                              {System.out.println("ArgumentDec: "+$a.text);};






return_statement    :
            RETURN expression
            ;

display      :
               DISPLAY LPAREN expression RPAREN SEMICOLON;

statement      :
               if_stament | while_statement | assignment | display | return_statement;

assignment : NAMING_CONVENTION ASSIGN expression
                ;


expression      :
                  term
                  |
                  term PRODUCT term
                  |
                  term DIVIDE term
                  |
                  term SUM term
                  |
                  term SUBTRACT term
                ;


term          :
                  identifier
                  |
                  integer
              ;


identifier   : NAMING_CONVENTION  ;


integer      : INTEGER  ;

comment      : '/*' (ALPHABET | INTEGER)* '*/' ;

/// DATA TYPE
BUILT_IN_DATA_TYPE:(INT | STRING  | LIST | BOOL | FPTR);
STRUCT_DATA_TYPE: STRUCT;

//STRUCT SCOPE
struct_scope    :
                (declaration | )*
             ;

struct_var_dec   :
                declaration LPAREN (argument COMMA)* (argument) RPAREN BEGIN NEW_LINE getter_setter NEW_LINE END NEW_LINE;

getter_setter   :
                SET NEW_LINE scope_body_one_line NEW_LINE GET NEW_LINE return_statement NEW_LINE
                |
                SET BEGIN NEW_LINE scope_body NEW_LINE END GET NEW_LINE return_statement NEW_LINE
                |
                SET NEW_LINE scope_body_one_line NEW_LINE GET BEGIN NEW_LINE scope_body_with_return NEW_LINE END NEW_LINE
                |
                SET BEGIN NEW_LINE scope_body NEW_LINE GET BEGIN NEW_LINE scope_body_with_return NEW_LINE END NEW_LINE
                ;


//BEGIN SET{System.out.println("Setter");} BEGIN (declaration | statement)* END GET {System.out.println("Getter");} RETURN NAMING_CONVENTION END;


//SCOPE DEFINITION
scope_body_with_return :
                (declaration | if_stament | while_statement | assignment | display)*
                return_statement
                ;


scope_body      :
            ((declaration SEMICOLON) |  (statement SEMICOLON) | scope_body_one_line)*
                ;

scope_body_one_line :
            ((declaration NEW_LINE) | (statement NEW_LINE))
                ;

//CONDITIONAL OPERATIONS
if_stament      :{int a;}
            (a=IF {System.out.println("Conditional: "+$a.text);} LPAREN (expression| condition) RPAREN NEW_LINE scope_body_one_line NEW_LINE)
            |
            (a=IF {System.out.println("Conditional: "+$a.text);} LPAREN (expression| condition) RPAREN NEW_LINE scope_body_one_line NEW_LINE else_stament)
            |
            (a=IF {System.out.println("Conditional: "+$a.text);} LPAREN (expression| condition) RPAREN BEGIN NEW_LINE scope_body  NEW_LINE END NEW_LINE)
            |
            (a=IF {System.out.println("Conditional: "+$a.text);} LPAREN (expression| condition) RPAREN BEGIN NEW_LINE scope_body  NEW_LINE END NEW_LINE else_stament)
            ;

else_stament    :{int a;}
            (a=ELSE {System.out.println("Conditonal: "+$a.txt);} NEW_LINE scope_body_one_line  NEW_LINE)
            |
            (a=ELSE {System.out.println("Conditonal: "+$a.txt);} BEGIN NEW_LINE scope_body  NEW_LINE END NEW_LINE);

condition : {int a;}(identifier | integer)
                a=(EQUAL | GREATER_AND_EQUAL | SMALLER_AND_EQUAL | SMALLER | GREATER | NOT_EQUAL)
                {System.out.println("Operator: "+$a.text);} (identifier | integer);

//LOOP OPERATIONS
while_statement : {int a;}
                (a=WHILE {System.out.println("Loop: "+$a.text);}
                LPAREN (expression| condition) RPAREN NEW_LINE
                 scope_body_one_line
                 NEW_LINE)
                 |
                (a=WHILE {System.out.println("Loop: "+$a.text);}
                LPAREN (expression | condition) RPAREN BEGIN
                NEW_LINE declaration* statement* NEW_LINE
                END NEW_LINE);


APPEND: 'append';
SIZE: 'size';
TRUE: 'true';
FALSE: 'false';
FPTR: 'fptr';
DISPLAY: 'display';
STRING: 'string';
STRUCT: 'struct';
MAIN: 'main';
INT: 'int';
BOOL: 'bool';
LIST: 'list';
VOID: 'void';
WHILE: 'while';
DO: 'do';
IF: 'if';
ENDIF: 'endif';
ELSE: 'else';
RETURN: 'return';
GET: 'get';
SET: 'set';
SUM: '+';
PRODUCT: '*';
SUBTRACT: '-';
DIVIDE: '/';
EQUAL: '==';
ASSIGN: '=';
NOT_EQUAL: '!=';
BEGIN: 'begin';
END: 'end';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
UNDERLINE: '_';
EXCLUDE: '?!';
GREATER: '>';
SMALLER: '<';
COMMA: ',';
GREATER_AND_EQUAL: ('>=' | '=>');
SMALLER_AND_EQUAL: ('<=' | '=<');
NEW_LINE: '\n';

KEYWORDS : (APPEND | SIZE | TRUE | FALSE | FPTR | DISPLAY | STRUCT | MAIN | INT | BOOL | LIST | VOID | WHILE | DO | IF | ENDIF | ELSE | RETURN | GET | SET | BEGIN | END);
KEYWORDS_EXCLUDE : (EXCLUDE APPEND | SIZE | TRUE | FALSE | FPTR | DISPLAY | STRUCT | MAIN | INT | BOOL | LIST | VOID | WHILE | DO | IF | ENDIF | ELSE | RETURN | GET | SET | BEGIN | END);

INTEGER: [0-9][0-9]*;

ALPHABET: ([a-z]|[A-Z])+;

NAMING_CONVENTION: '^'(KEYWORDS_EXCLUDE)(ALPHABET | UNDERLINE)+ (ALPHABET | UNDERLINE | INTEGER)*;

WS: [\t\r\n]+ -> skip ;