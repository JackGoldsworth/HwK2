grammar HwK;

/*
* Parsing
*/

compilationUnit: (statement | function)* EOF;

imports: '@imp' ID ('.' ID)*;

type: ID;

print: 'print(' expression ')';

statement: variable | print | imports;

variable: 'var' ID '=' expression;

expression: varReference # VAR
          | value # VALUE
          | expression '^' expression # EXP
          | expression '*' expression # MULT
          | expression '/' expression # DIV
          | expression '-' expression # SUB
          | expression '+' expression # ADD;

function: 'fn' ID '(' parameter* ')' '->' type* '{' (variable | print)* '}';

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
fragment DIGIT: [0-9]+;
fragment HEX: '0x' ([0-9] | [a-z] | [A-Z]);
fragment LETTER: [a-zA-Z];