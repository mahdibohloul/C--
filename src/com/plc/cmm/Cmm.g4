grammar Cmm;




// This class defines a complete generic visitor for a parse tree produced by CmmParser.
//cmm : (struct)* (function_definition)* main;
cmm : (comment)* (struct)* (comment)* (function_definition)* (comment)* main;  //MOHADESE

//COMENT DEFINITION
comment      : '/*' (ALPHABET | INTEGER)* '*/' ;

//STRUCT DEFINITION
struct          : {int a;}
                STRUCT a=NAMING_CONVENTION BEGIN NEW_LINE
                struct_scope NEW_LINE
                END;

//FUNCTION DEFINITIONS
//TODO check void in function return type
function_definition
    :   ({int a;}
        type_specifier
        a=NAMING_CONVENTION {System.out.println("FunctionDec: "+$a.text);}
        argument_list
        (scope_body_one_line | return_statement)
        |
        (scope_body)* return_statement)
        |
        (
        {int a;}
        VOID a=NAMING_CONVENTION {System.out.println("FunctionDec: "+$a.text);}
                     argument_list
                     (scope_body_one_line )
                     |
                     (scope_body)+
        )
    ;

arguments           :
                    ((argument ',')*(argument))*
                    ;

argument_list       :
                    LPAREN arguments RPAREN
                    ;

function_invoke     :
                    NAMING_CONVENTION
                    argument_list
                    ;


//MAIN DEFINITION
main        :
            {int a;}
            {System.out.println("Main");}
            MAIN LPAREN RPAREN
            scope_body_one_line
            |
            scope_body*
            ;

//BASE DEFINITIONS
statement       :
                if_stament
                |
                while_statement
                |
                do_while_statement
                |
                assignment
                |
                display
                |
                declaration
                |
                expression
                |
                (function_invoke {System.out.println("FunctionCall");})
                |
                size_dec
                |
                append_dec //MOHADESE
                ;

assignment      :
                expression ASSIGN expression
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
                  |
                  function_invoke
              ;

return_statement    :
                    NEW_LINE
                    RETURN
                    {System.out.println("Return");}
                    expression
                    ;
declaration     :
                {int a;}
                (built_in_data_type | (STRUCT NAMING_CONVENTION)) a=NAMING_CONVENTION
                {System.out.println("VarDec: "+$a.text);}
                ;

argument        :
                {int a;}
                type_specifier a=NAMING_CONVENTION
                {System.out.println("ArgumentDec: "+$a.text);}
                ;

//BUILT IN DEFINTIONS
display         :
                DISPLAY
                {System.out.println("Built-in: display");}
                LPAREN expression RPAREN;

append_dec      :
                {System.out.println("Append");}
                APPEND LPAREN NAMING_CONVENTION RPAREN
                ;

size_dec        :
                {System.out.println("Size");}
                SIZE LPAREN NAMING_CONVENTION RPAREN
                ;



//STRUCT SCOPE DEFINITION
struct_scope    :
                (declaration | struct_var_dec)*
             ;

struct_var_dec   :
                declaration argument_list BEGIN NEW_LINE
                getter_setter NEW_LINE
                END NEW_LINE
                ; //non-argumented function with *  //MOHADESE

getter_setter   :
                SET scope_body_one_line GET return_statement
                |
                SET scope_body GET return_statement
                |
                SET scope_body_one_line GET scope_body_with_return
                |
                SET scope_body GET scope_body_with_return
                ;

//SCOPE DEFINITION
scope_body_with_return :
                (scope_body)* return_statement
                ;

scope_body      :
                BEGIN NEW_LINE
                comment*
                (statement SEMICOLON
                |
                scope_body_one_line)+
                |
                comment*
                NEW_LINE
                END
                NEW_LINE
                ;

scope_body_one_line     :
                        NEW_LINE
                        comment*
                        statement
                        comment*
                        NEW_LINE
                        ;

//CONDITIONAL OPERATIONS
if_stament      :
            (IF {System.out.println("Conditional: if");} LPAREN (expression| condition) RPAREN scope_body_one_line)
            |
            (IF {System.out.println("Conditional: if");} LPAREN (expression| condition) RPAREN scope_body_one_line else_stament)
            |
            (IF {System.out.println("Conditional: if");} LPAREN (expression| condition) RPAREN scope_body )
            |
            (IF {System.out.println("Conditional: if");} LPAREN (expression| condition) RPAREN scope_body else_stament)
            ;

else_stament    :
            (ELSE {System.out.println("Conditonal: else");} scope_body_one_line )
            |
            (ELSE {System.out.println("Conditonal: else");} scope_body);

condition : {int a;}(identifier | integer)
                a=(EQUAL | GREATER_AND_EQUAL | SMALLER_AND_EQUAL | SMALLER | GREATER | NOT_EQUAL)
                {System.out.println("Operator: "+$a.text);} (identifier | integer);

//LOOP OPERATIONS
while_statement :
                (WHILE {System.out.println("Loop: while");}
                LPAREN (expression| condition) RPAREN
                scope_body_one_line)
                 |
                (WHILE {System.out.println("Loop: while");}
                LPAREN (expression | condition) RPAREN
                scope_body);

do_while_statement :
                (DO {System.out.println("Loop: do...while");}
                scope_body_one_line
                WHILE
                LPAREN (expression | condition) RPAREN
                SEMICOLON)
                |
                (DO {System.out.println("Loop: do...while");}
                scope_body
                WHILE
                LPAREN (expression | condition) RPAREN
                SEMICOLON);




identifier   : NAMING_CONVENTION  ;


integer      : INTEGER  ;






///Data types Definition
fptr_type       :
                (FPTR SMALLER arguments ARROW type_specifier)
                ;

list_type       :
                (LIST SPACE SHARPSIGN SPACE type_specifier)
                ;
built_in_data_type      :
                    (INT
                    |
                    STRING
                    |
                    list_type
                    |
                    fptr_type
                    |
                    BOOL
                    |
                    FPTR);

type_specifier
    :
    (built_in_data_type | STRUCT NAMING_CONVENTION)
    ;

//Constants Definition
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
SPACE: ' ';
SHARPSIGN: '#';
ARROW: '->';

KEYWORDS : (APPEND | SIZE | TRUE | FALSE | FPTR | DISPLAY | STRUCT | MAIN | INT | BOOL | LIST | VOID | WHILE | DO | IF | ENDIF | ELSE | RETURN | GET | SET | BEGIN | END);
KEYWORDS_EXCLUDE : (EXCLUDE APPEND | SIZE | TRUE | FALSE | FPTR | DISPLAY | STRUCT | MAIN | INT | BOOL | LIST | VOID | WHILE | DO | IF | ENDIF | ELSE | RETURN | GET | SET | BEGIN | END);

INTEGER: [0-9][0-9]*;

ALPHABET: ([a-z]|[A-Z])+;

NAMING_CONVENTION: '^'(KEYWORDS_EXCLUDE)(ALPHABET | UNDERLINE)+ (ALPHABET | UNDERLINE | INTEGER)*;

WS: [\t\r\n]+ -> skip ;