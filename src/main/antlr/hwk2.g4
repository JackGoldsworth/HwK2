grammar hwk2;

/*
* Parsing
*/

imports: '@imp' ID ('.' ID)*;

type: ID;

print: 'print(' ID ')';

statement: variable;

variable: 'var' ID '=' (NUMBER | STRING)+;

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