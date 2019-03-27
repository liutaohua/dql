grammar Dql;

root
   :sqlStatements EOF
   ;

sqlStatements
   :dmlStatement
   ;

dmlStatement
   :querySpecificationNointo
   ;

querySpecificationNointo
   :SELECT selectElements  fromClause?
   ;

selectElements
   :(star='*' | selectElement ) (',' selectElement)*
   ;

selectElement
   :leftexpr
   ;

fromClause
   :FROM tableSources
          (WHERE whereExpr=expr)?
   ;
tableSources
   :DUAL;

//query: expr;

expr: booleanExpr       #boolExpr
    | expr 'AND' expr   #andExpr
    | expr 'OR' expr    #orExpr
    | '(' expr ')'      #embbedExpr
    ;

booleanExpr: leftexpr op=('='|'!='|'>'|'<'|'>='|'<=') value
    | leftexpr op=('IN'|'NOT IN') '(' value (',' value)* ')'
    ;
leftexpr: FIELDNAME (('.' FUNC '()')+)?
    ;
value: STRING | INT | FLOAT | TRUE | FALSE;

SELECT:            'SELECT';
FROM:              'FROM';
DUAL:              'DUAL';
WHERE:             'WHERE';

TRUE:              'TRUE';
FALSE:             'FALSE';
FUNC:              'COUNT'|'SUM'|'AVG'|'MAX'|'MIN';
FIELDNAME:         ([a-zA-Z]|'_')+;
STRING:            '\'' .*? '\'';
fragment DIGIT:    [0-9];
INT:               ('+'|'-')? DIGIT+;
FLOAT:             ('+'|'-')? DIGIT+ '.' DIGIT*;
WS:                [ \t\r\n]+ -> skip;