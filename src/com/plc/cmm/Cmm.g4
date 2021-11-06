grammar Cmm;
//TODO: Other variables type
//TODO: semicolon problem
//TODO other op '*''/''-'
//TODO: IF ELSE SIZE APPEND FPTR LIST and struct.NAME LINE problem

cmm : (struct_dec)* (func_dec)* main;


func_dec: {int a;}BUILT_IN_DATA_TYPE a=NAMING_CONVENTION LPAREN (argument ',')* (argument) RPAREN (BEGIN declaration* statement* struct_dec* RETURN NAMING_CONVENTION END | RETURN NAMING_CONVENTION)
            {System.out.println("FunctionDec: "+$a.text);}|
            {int a;}VOID a=NAMING_CONVENTION LPAREN (argument ',')* (argument) RPAREN ((declaration | statement | struct_dec) |  BEGIN declaration* statement* struct_dec* END)
            {System.out.println("FunctionDec: "+$a.text);};


struct_dec: {int a;}STRUCT a=NAMING_CONVENTION (BEGIN (struct_body)* END | struct_body)
{System.out.println("StructDec: "+$a.text);};


//struct_body: ({int a;}(BUILT_IN_DATA_TYPE | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION{System.out.println("VarDec: "+$a.text);} | (
//            (BUILT_IN_DATA_TYPE | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION {System.out.println("VarDec: "+$a.text);} LPAREN argument RPAREN getter_setter
//);

struct_body: declaration


main: MAIN BEGIN
                    declaration*
                    statement*
                    END
                    ;

getter_setter: BEGIN SET{System.out.println("Setter");} BEGIN (declaration | statement)* END GET {System.out.println("Getter");} RETURN NAMING_CONVENTION END;

declaration   : {int a;}(BUILT_IN_DATA_TYPE | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION
                    {System.out.println("VarDec: "+$a.text);};

argument: {int a;}(BUILT_IN_DATA_TYPE | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION
                              {System.out.println("ArgumentDec: "+$a.text);};

statement      :
               ifstmt
             | display
             | assignsment
               ;


ifstmt      :
            IF LPAREN identifier EQUAL integer RPAREN
            statement*
            ENDIF
            ;


display      :
               DISPLAY LPAREN expression RPAREN SEMICOLON;


assignsment : NAMING_CONVENTION ASSIGN expression
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
NOTEQUAL: '!=';
BEGIN: 'begin';
END: 'end';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
UNDERLINE: '_';
EXCLUDE: '?!';
GREATER: '>';
SMALLER: '<';
GREATER_AND_EQUAL: ('>=' | '=>');
SMALLER_AND_EQUAL: ('<=' | '=<');

KEYWORDS : (APPEND | SIZE | TRUE | FALSE | FPTR | DISPLAY | STRUCT | MAIN | INT | BOOL | LIST | VOID | WHILE | DO | IF | ENDIF | ELSE | RETURN | GET | SET | BEGIN | END);
KEYWORDS_EXCLUDE : (EXCLUDE APPEND | SIZE | TRUE | FALSE | FPTR | DISPLAY | STRUCT | MAIN | INT | BOOL | LIST | VOID | WHILE | DO | IF | ENDIF | ELSE | RETURN | GET | SET | BEGIN | END);

INTEGER: [0-9][0-9]*;

ALPHABET: ([a-z]|[A-Z])+;

NAMING_CONVENTION: '^'(KEYWORDS_EXCLUDE)(ALPHABET | UNDERLINE)+ (ALPHABET | UNDERLINE | INTEGER)*;

WS: [ \t\r\n]+ -> skip ;