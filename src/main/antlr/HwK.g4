grammar HwK;

/*
* Parsing
*/

compilationUnit: (imports | statement | function)* EOF;

imports: '@imp' IMPORTNAME;

type: ID;

print: 'print(' expression ')';

statement: variable | print | functionCall;

variable: 'var' ID '=' expression;

expression: varReference # VAR
          | value # VAL
          | expression '*' expression # MULT
          | expression '/' expression # DIV
          | expression '-' expression # SUB
          | expression '+' expression # ADD;

function: 'fn' ID '('? parameter* ')'? ('->' type)? '{' statement* '}';

functionCall: ID '('? (varReference | value)* ')'?;
value: (NUMBER | STRING)+;
varReference: ID;
parameter: type ':' ID ','*;

/*
* Lexer
*/

WS: [ \t\n\r]+ -> skip;
NUMBER: (DIGIT | HEX)+;
ID: LETTER (LETTER | DIGIT)*;
STRING: '"'.*?'"';
IMPORTNAME: ([a-zA-Z] | '/')+;
fragment DIGIT: [0-9]+;
fragment HEX: '0x' ([0-9] | [a-z] | [A-Z]);
fragment LETTER: [a-zA-Z];