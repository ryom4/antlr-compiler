grammar llull;

root: program EOF;

program: (proc)+;

procCall: PROCNAME LP RP;
proc: 'void' PROCNAME LP (VAR ',' (VAR)*)? RP LB statements RB; 
statements: (write | expr | ass | procCall)*;

ass: VAR IG expr;

write: WR LP VAR RP;

expr:
    expr DIV expr
    | expr MUL expr
    | expr RES expr
    | expr MES expr
    | INT;

INT: [0-9]+;
VAR: [a-z];
MES: '+';
RES: '-';
MUL: '*';
DIV: '/';
POT: '**';

LP: '(';
RP: ')';
LB: '{';
RB: '}';

WR: 'write';
PROCNAME: VAR+;


IG: '=';
WS: [ \n\r]+ -> skip;
