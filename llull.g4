grammar llull;

root: program EOF;

program: (proc)+;


proc: VOID ID LP (ID (',' ID)*)? RP LB statements RB; 


statements: (write | expr | ass | procCall | conditional | loop | forloop | array | setArray | read)+;

procCall: ID LP (expr (',' expr)*)? RP;

write: WR LP (expr | cond) (',' (expr | cond))* RP;
read: READ LP ID RP;

ass: ID IG expr;
array: ARRAY LP ID ',' expr RP;
setArray: SET LP ID ',' expr ',' expr RP;

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
    LP expr RP       #parentesis 
    | expr DIV expr  #div
    | expr MUL expr  #mul 
    | expr MOD expr  #mod
    | expr RES expr  #res 
    | expr MES expr  #mes 
    | ID             #var 
    | STRING         #string
    | GET LP ID ',' expr RP #get
    | INT            #int      
    ;

READ: 'read';
SET: 'set';
GET: 'get';
ARRAY: 'array';
FOR: 'for';
WHILE: 'while';
ELSE: 'else';
IF: 'if';
WR: 'write';
VOID: 'void';

INT: ('-')? [0-9]+;
ID: [a-zA-Z]+ [1-9]* [a-zA-Z]*;

MES: '+';
RES: '-';
MUL: '*';
DIV: '/';
MOD: '%';

STRING: '"' ~[\n]* '"';

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
