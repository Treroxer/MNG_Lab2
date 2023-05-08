grammar Calculator;


expression: multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*;
multiplyingExpression: poweringExpression ((MULT | DIV) poweringExpression)*;
poweringExpression: sqrtExpression | integralExpression(POW poweringExpression)*;
sqrtExpression: SQRT INT;
integralExpression: MINUS INT | INT;

INT: [0-9]+ ;
PLUS: '+' ;
MINUS: '-' ;
MULT: '*' ;
DIV: '/' ;
POW: '^' ;
SQRT: 'sqrt' ;
INTEGRAL: 'cal';
WS : [ \t\r\n]+ -> skip ;
