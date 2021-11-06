grammar Cmm;
//TODO: Other variables type

program   : (func_dec | declaration |struct_dec)* main;


func_dec: {int a;}VAR_DATA_TYPES a=NAME LPAREN (argument ',')* (argument) RPAREN (BEGIN declaration* statement* struct_dec* RETURN NAME END | RETURN NAME)
            {System.out.println("FunctionDec: "+$a.text);}|
            {int a;}VOID a=NAME LPAREN (argument ',')* (argument) RPAREN ((declaration | statement | struct_dec) |  BEGIN declaration* statement* struct_dec* END)
            {System.out.println("FunctionDec: "+$a.text);};


VAR_DATA_TYPES:(INT | STRING  | LIST | BOOL);


struct_dec: {int a;}STRUCT a=NAME (BEGIN (struct_body)* END | struct_body)
{System.out.println("StructDec: "+$a.text);};


struct_body: {int a;}(VAR_DATA_TYPES | (STRUCT NAME)) a=NAME{System.out.println("VarDec: "+$a.text);} | (
            (VAR_DATA_TYPES | (STRUCT NAME)) a=NAME {System.out.println("VarDec: "+$a.text);} LPAREN argument RPAREN getter_setter
);


main: MAIN BEGIN
                    declaration*
                    statement*
                    END
                    ;

getter_setter: BEGIN SET{System.out.println("Setter");} BEGIN (declaration | statement)* END GET {System.out.println("Getter");} RETURN NAME END;

declaration   : {int a;}(VAR_DATA_TYPES | (STRUCT NAME)) a=NAME SEMICOLON
                    {System.out.println("VarDec: "+$a.text);};

argument: {int a;}(VAR_DATA_TYPES | (STRUCT NAME)) a=NAME
                              {System.out.println("ArgumentDec: "+$a.text);};

statement      :
               ifstmt
             | display
             | assignstmt
               ;


ifstmt      :
            IF LPAREN identifier EQUAL integer RPAREN
            statement*
            ENDIF
            ;


display      :
               DISPLAY LPAREN term RPAREN SEMICOLON;


assignstmt : NAME ASSIGN expression SEMICOLON
                ;


expression      :
                term
              |
                term PLUS term
                ;


term          :
              identifier
            | integer
              ;


identifier   : NAME  ;


integer      : INTEGER  ;


IF: 'if';
ENDIF: 'endif';
MAIN: 'main()';
DO: 'do';
RETURN: 'return';
GET: 'get';
SET: 'set';
APPEND: 'append';
SIZE: 'size';
TRUE: 'true';
FALSE: 'false';
FPTR: 'fptr';
DISPLAY: 'display';
INT: 'int';
STRING: 'string';
STRUCT: 'struct';
BOOL: 'bool';
LIST: 'list';
VOID: 'void';
WHILE: 'while';
PLUS: '+';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';
BEGIN: 'begin';
END: 'end';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';

INTEGER: [0-9][0-9]*;

NAME: [a-z]+;

WS: [ \t\r\n]+ -> skip ;