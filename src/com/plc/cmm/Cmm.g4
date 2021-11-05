grammar Cmm;


program       : 'main()''begin'
              declaration*
              statement*
              'end'
              ;


declaration   :
              INT NAME SEMICOLON
              ;


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
DISPLAY: 'display';
INT: 'int';

PLUS: '+';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';

SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';

INTEGER: [0-9][0-9]*;

NAME: [a-z]+;

WS: [ \t\r\n]+ -> skip ;