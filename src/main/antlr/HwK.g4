grammar HwK;

/*
* Parsing
*/

compilationUnit: statement* EOF;

imports: '@imp' ID ('.' ID)*;

type: ID;

print: 'print(' ID ')';

statement: variable | imports;

variable: 'var' ID '=' value;

value: (NUMBER | STRING)+;

/*
* Lexer
*/

WS: [ \t\n\r]+ -> skip;
NUMBER: (DIGIT | HEX)+;
ID: LETTER (LETTER | DIGIT)*;
STRING: '"' (LETTER | DIGIT)* '"';
fragment DIGIT: [0-9]+;
fragment HEX: '0x' ([0-9] | [a-z] | [A-Z]);
fragment LETTER: [a-zA-Z];