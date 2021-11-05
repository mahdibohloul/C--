grammar Cmm;
//TODO: Other variables type

program   : (func_dec | global |struct_dec)* main;


func_dec: VAR_DATA_TYPES NAME LPAREN ((VAR_DATA_TYPES NAME | STRUCT NAME NAME) ',')* ((VAR_DATA_TYPES | STRUCT NAME) NAME) RPAREN (BEGIN declaration* statement* struct_dec* RETURN NAME END | RETURN NAME)
            |
            VOID NAME LPAREN ((VAR_DATA_TYPES NAME | STRUCT NAME NAME) ',')* ((VAR_DATA_TYPES | STRUCT NAME) NAME) RPAREN ((declaration | statement | struct_dec) |  BEGIN declaration* statement* struct_dec* END)
                        ;


VAR_DATA_TYPES:(INT | STRING  | LIST | BOOL);


struct_dec: STRUCT NAME (BEGIN (VAR_DATA_TYPES NAME)* END | VAR_DATA_TYPES NAME);

global: (VAR_DATA_TYPES  | STRUCT NAME)NAME SEMICOLON;


main: MAIN BEGIN
                    declaration*
                    statement*
                    END
                    ;

declaration   : (VAR_DATA_TYPES | (STRUCT NAME)) NAME SEMICOLON ;



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