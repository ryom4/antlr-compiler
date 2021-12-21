grammar llull;

root: program EOF;

program: (proc)+;


proc: VOID ID LP (ID (',' ID)*)? RP LB statements RB; 


statements: (write | expr | ass | procCall | conditional | loop | forloop)+;

procCall: ID LP parameters RP;

parameters: (expr (',' expr)*)?;

write: WR LP expr (',' expr)* RP;

ass: ID IG expr;

conditional: IF LP cond RP LB statements RB (elseConditional)?;
elseConditional: ELSE LB statements RB;

loop: WHILE LP cond RP LB statements RB; 
forloop: FOR LP ass ';' cond ';' ass RP LB statements RB;

cond: 
    expr MENOR expr
    | expr MAJOR expr
    | expr IGUAL expr
    | expr DIFERENCIA expr
    | expr MENORIGUAL expr
    | expr MAJORIGUAL expr
    ;


expr:
    expr DIV expr   
    | expr MUL expr 
    | expr RES expr 
    | expr MES expr 
    | ID   
    | STRING
    | INT;          

FOR: 'for';
WHILE: 'while';
ELSE: 'else';
IF: 'if';
WR: 'write';
VOID: 'void';

INT: [0-9]+;
ID: [a-z]+;

MES: '+';
RES: '-';
MUL: '*';
DIV: '/';

STRING: '"' (' ')? ID (' ' ID)* (' ')? '"';

LP: '(';
RP: ')';
LB: '{';
RB: '}';

IG: '=';
IGUAL: '==';
DIFERENCIA: '<>';
MENOR: '<';
MAJOR: '>';
MENORIGUAL: '<=';
MAJORIGUAL: '>=';


COMM: '#' ~[\r\n]* -> skip;
WS: [ \n\r]+ -> skip;
