grammar Cmm;




// This class defines a complete generic visitor for a parse tree produced by CmmParser.
//cmm : (struct)* (function_definition)* main;
cmm : (comment)* (struct)* (comment)* (function_definition)* (comment)* main;  //MOHADESE
//COMENT DEFINITION
comment      : '/*' (ALPHABET | INTEGER)* '*/' ;

//STRUCT DEFINITION
struct          :
                (
                {int a;}
                STRUCT a=NAMING_CONVENTION {System.out.println("StructDec: "+$a.text);}
                BEGIN NEW_LINE (struct_scope NEW_LINE)+
                END NEW_LINE
                )
                ;

//STRUCT SCOPE DEFINITION
struct_scope    :
                (declaration SEMICOLON)*
                |
                declaration
                |
                struct_var_dec
                |
                (assignment SEMICOLON?)
                ;

struct_var_dec   :
                declaration argument_list BEGIN NEW_LINE
                getter_setter
                NEW_LINE
                END
                ;
getter_setter   :
                (SET {System.out.println("Setter");}BEGIN NEW_LINE (scope_body | return_statement | NEW_LINE)+ NEW_LINE END NEW_LINE GET{System.out.println("Getter");} BEGIN NEW_LINE scope_body_with_return NEW_LINE END)
                |
                (SET {System.out.println("Setter");}BEGIN NEW_LINE (scope_body | return_statement | NEW_LINE)+ NEW_LINE END NEW_LINE GET{System.out.println("Getter");} NEW_LINE return_statement)
                |
                (SET {System.out.println("Setter");}(scope_body_one_line | return_statement)  GET {System.out.println("Getter");} NEW_LINE return_statement)
                |
                (SET {System.out.println("Setter");}(scope_body_one_line | return_statement)  GET{System.out.println("Getter");} BEGIN NEW_LINE scope_body_with_return NEW_LINE END)
                ;

//FUNCTION DEFINITIONS
//TODO check void in function return type
function_definition
    :   (
        {int a;}
        type_specifier
        a=NAMING_CONVENTION {System.out.println("FunctionDec: "+$a.text);}
        argument_list
        ((NEW_LINE scope_body_one_line |  return_statement) | (BEGIN NEW_LINE (scope_body | NEW_LINE | (return_statement SEMICOLON?))* NEW_LINE END NEW_LINE))
        )
        |
        (
        {int a;}
        VOID a=NAMING_CONVENTION {System.out.println("FunctionDec: "+$a.text);}
                     argument_list
                     (NEW_LINE scope_body_one_line NEW_LINE*)
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

function_invoke     :{System.out.println("FunctionCall");}
                    NAMING_CONVENTION (LPAREN
                    ((expression | keywords)(COMMA (keywords | expression))*)?
                    RPAREN)+
                    ;

//MAIN DEFINITION
main        :
            {int a;}
            {System.out.println("Main");}
            (MAIN LPAREN RPAREN NEW_LINE scope_body_one_line)
            |
            (MAIN LPAREN RPAREN BEGIN NEW_LINE (scope_body | NEW_LINE)* NEW_LINE END NEW_LINE*)
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
                append_dec
                ;


expression      :
                  expression {int a;} a=PRODUCT {System.out.println("Operator: " + $a.text);} expression
                  |
                  expression {int a;} a=DIVIDE {System.out.println("Operator: " + $a.text);} expression
                  |
                  expression {int a;}a=SUM {System.out.println("Operator: " + $a.text);}expression
                  |
                  expression {int a;}a=SUBTRACT {System.out.println("Operator: " + $a.text);}expression
                  |
                  SUBTRACT {System.out.println("Operator: -");} expression
                  |
                  expression {int a;}a=AND {System.out.println("Operator: " + $a.text);}expression
                  |
                  expression {int a;} a=OR {System.out.println("Operator: " + $a.text);}expression
                  |
                  term
                  |
                  list_accessor
                  |
                  LPAREN expression RPAREN
                  |
                  TILDA {System.out.println("Operator: ~");} LPAREN expression RPAREN
                  |
                  condition
                ;


term          :
                  function_invoke
                  |
                  identifier
                  |
                  integer
                  |
                  struct_accessor
                  |
                  size_dec
              ;

struct_accessor     :   NAMING_CONVENTION DOT NAMING_CONVENTION;
return_statement    : RETURN {System.out.println("Return");} ((expression | append_dec) SEMICOLON?)?;

argument        :
                {int a;}
                type_specifier a=NAMING_CONVENTION
                {System.out.println("ArgumentDec: "+$a.text);}
                ;

assignment      :
                (expression | declaration) ASSIGN expression SEMICOLON?
                ;
declaration     :

                ((built_in_data_type | (STRUCT NAMING_CONVENTION) | fptr_accessor) identifier)(COMMA identifier)*
                ;
//BUILT IN DEFINTIONS
display         :
                DISPLAY
                {System.out.println("Built-in: display");}
                LPAREN statement RPAREN;

append_dec      :
                {System.out.println("Append");}
                APPEND LPAREN (NAMING_CONVENTION | list_accessor | struct_accessor | function_invoke) COMMA expression RPAREN
                ;

size_dec        :
                {System.out.println("Size");}
                SIZE LPAREN NAMING_CONVENTION RPAREN
                ;







//SCOPE DEFINITION
scope_body_with_return :
                (scope_body)* return_statement
                ;

scope_body      : comment? (statement SEMICOLON?) comment?;

scope_body_one_line     : comment? (statement) comment? ;

//CONDITIONAL OPERATIONS
if_stament      :
            (IF {System.out.println("Conditional: if");} LPAREN (expression | condition) RPAREN (scope_body_one_line | return_statement) NEW_LINE)
            |
            (IF {System.out.println("Conditional: if");} LPAREN (expression | condition) RPAREN (scope_body_one_line | return_statement) else_stament)
            |
            (IF {System.out.println("Conditional: if");} LPAREN (expression | condition) RPAREN BEGIN NEW_LINE (scope_body | scope_body return_statement) NEW_LINE END)
            |
            (IF {System.out.println("Conditional: if");} LPAREN (expression | condition) RPAREN BEGIN NEW_LINE (scope_body | scope_body return_statement) NEW_LINE END else_stament)
            |
            (IF {System.out.println("Conditional: if");}  (expression | condition) NEW_LINE  (scope_body_one_line | return_statement SEMICOLON?) NEW_LINE)
            |
            (IF {System.out.println("Conditional: if");}  (expression| condition) NEW_LINE (scope_body_one_line | return_statement SEMICOLON?) NEW_LINE else_stament)
            |
            (IF {System.out.println("Conditional: if");}  (expression| condition)  BEGIN NEW_LINE (scope_body | scope_body return_statement) NEW_LINE END)
            |
            (IF {System.out.println("Conditional: if");}  (expression| condition) BEGIN NEW_LINE (scope_body | scope_body return_statement) NEW_LINE END else_stament)
            ;

else_stament    :
            (ELSE {System.out.println("Conditonal: else");} NEW_LINE (scope_body_one_line | return_statement SEMICOLON?))
            |
            (ELSE {System.out.println("Conditonal: else");} BEGIN NEW_LINE (scope_body | scope_body return_statement SEMICOLON?) NEW_LINE END)
            ;

condition :
            ({int a;}(integer | identifier) a=(EQUAL | GREATER_AND_EQUAL | SMALLER_AND_EQUAL | SMALLER | GREATER | NOT_EQUAL | AND | OR){System.out.println("Operator: "+$a.text);} (integer | identifier));




//LOOP OPERATIONS
while_statement :
                (WHILE {System.out.println("Loop: while");} LPAREN (expression)  RPAREN NEW_LINE scope_body_one_line)
                |
                (WHILE {System.out.println("Loop: while");} LPAREN (expression)  RPAREN BEGIN NEW_LINE (scope_body | NEW_LINE)+ NEW_LINE END NEW_LINE)
                ;

do_while_statement :
                (DO NEW_LINE+ {System.out.println("Loop: do...while");}
                scope_body_one_line SEMICOLON
                NEW_LINE+
                WHILE
                (expression | condition))
                |
                (DO {System.out.println("Loop: do...while");}
                scope_body
                WHILE
                LPAREN (expression | condition) RPAREN
                SEMICOLON);




identifier   :  {int a;}
                a=NAMING_CONVENTION
                {System.out.println("VarDec: "+$a.text);}
                ;


integer      : INTEGER  ;




///Data types Definition
fptr_type       :
                FPTR SMALLER (((type_specifier|VOID) COMMA)* (type_specifier | VOID))* ARROW type_specifier GREATER
                ;
fptr_accessor   :
                FPTR SMALLER (((type_specifier | VOID) ARROW (type_specifier|VOID)) GREATER);

list_type       :
                (LIST SHARPSIGN type_specifier)
                ;
list_accessor   :
                ((NAMING_CONVENTION | append_dec) LBRACKET INTEGER RBRACKET (LBRACKET INTEGER RBRACKET)*)
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

//Constants Definition
WHILE: 'while';
STRUCT: 'struct';
APPEND: 'append';
SIZE: 'size';
TRUE: 'true';
FALSE: 'false';
FPTR: 'fptr';
DISPLAY: 'display';
STRING: 'string';
MAIN: 'main';
INT: 'int';
BOOL: 'bool';
LIST: 'list';
VOID: 'void';
DO: 'do';
IF: 'if';
ENDIF: 'endif';
ELSE: 'else';
RETURN: 'return';
GET: 'get';
BEGIN: 'begin';
END: 'end';
SET: 'set';
NAMING_CONVENTION: [a-zA-Z_][A-Za-z0-9_]*;

SUM: '+';
PRODUCT: '*';
ARROW: '->';
SUBTRACT: '-';
DIVIDE: '/';
EQUAL: '==';
ASSIGN: '=';
NOT_EQUAL: '!=';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
UNDERLINE: '_';
GREATER: '>';
SMALLER: '<';
COMMA: ',';
AND: '&';
OR: '|';
GREATER_AND_EQUAL: ('>=' | '=>');
SMALLER_AND_EQUAL: ('<=' | '=<');
//WS: (' ' | '\t' | '\n') -> skip;
NEW_LINE: '\n';
SHARPSIGN: '#';
DOT: '.';
TAB: '\t';
LBRACKET: '[';
RBRACKET: ']';
TILDA : '~';

keywords : (APPEND | SIZE | TRUE | FALSE | FPTR | DISPLAY | STRUCT | MAIN | INT | BOOL | LIST | VOID | WHILE | DO | IF | ENDIF | ELSE | RETURN | GET | SET | BEGIN | END);

INTEGER: [0-9][0-9]*;

ALPHABET: ([a-z]|[A-Z])+;

type_specifier
    :
    (built_in_data_type | STRUCT NAMING_CONVENTION | list_accessor)
    ;

Whitespace: ([ \t]+ | Linebreak) -> skip;
Linebreak: [\r\n]+;