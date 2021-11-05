grammar Cmm;
//TODO: Other variables type

program   : global* | func_dec*  | struct_dec* | main;


func_dec: INT NAME LPAREN term* RPAREN BEGIN declaration* statement* END; //TODO: return func

VAR_DATA_TYPES:(INT | STRING | STRUCT | LIST | BOOL);

struct_dec: STRUCT NAME BEGIN (VAR_DATA_TYPES NAME SEMICOLON)* END;

global: INT NAME SEMICOLON;


main: MAIN BEGIN
                    declaration*
                    statement*
                    END
                    ;

declaration   : var_dec;


var_dec: VAR_DATA_TYPES NAME SEMICOLON;



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