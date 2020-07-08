grammar HwK;

/*
* Parsing
*/

compilationUnit: (imports | statement | function)* EOF;

imports: '@imp' IMPORTNAME;

statement: variable | print | functionCall | ifStatement;

expression: varReference # VAR
          | value # VAL
          | functionCall # FUNC
          | expression '>' expression # GREATER_THAN
          | expression '<' expression # LESS_THAN
          | expression '==' expression # EQUALS
          | expression '&&' expression # AND
          | expression '||' expression # OR
          | expression '*' expression # MULT
          | expression '/' expression # DIV
          | expression '-' expression # SUB
          | expression '+' expression # ADD;

print: 'print(' expression ')';

/*
* Control Statements
*/

ifStatement: 'if' expression 'then' '{' statement* '}' ('else' '{' statement* '}')?;

/*
* Functions
*/

function: 'fn' ID ('(' parameter (',' parameter)* ')')? ('->' type)? '{' statement* ret? '}';
functionCall: ID '(' funcArgs? ')';
parameter: type ':' ID;
funcArgs: expression (',' expression)*;
ret: 'ret' expression;

/*
* Values and Variables
*/

variable: 'var' ID '=' expression;
value: (NUMBER | STRING | BOOL)+;
varReference: ID;
type: ID;

/*
* Lexer
*/

WS: [ \t\n\r]+ -> skip;
NUMBER: (DIGIT | HEX)+;
STRING: '"'.*?'"';
BOOL: ('true' | 'false')+;
ID: LETTER (LETTER | DIGIT)*;
IMPORTNAME: ([a-zA-Z] | '/')+;
fragment DIGIT: '-'? [0-9]+;
fragment HEX: '0x' ([0-9] | [a-z] | [A-Z]);
fragment LETTER: [a-zA-Z];