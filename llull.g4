grammar llull;

root: program EOF;

program: ass | expr;

ass: CAR IG expr;

write: WR CAR;

expr:
	<assoc = right> expr POT expr
	| expr DIV expr
	| expr MUL expr
	| expr RES expr
	| expr MES expr
	| INT;

CAR: [a-z]+;
INT: [0-9]+;

MES: '+';
RES: '-';
MUL: '*';
DIV: '/';
POT: '**';

IG: ':=';
WR: 'write';
WS: [ \n]+ -> skip;
