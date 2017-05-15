//Camilo Chacón 
grammar SQL;

parse
 : ( sql_stmt_list | error )* EOF
 ;
error
 : UNEXPECTED_CHAR 
   { 
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text); 
   }
 ;
 
sql_stmt_list
 : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;

sql_stmt
	:(select_stmt)
	;

select_stmt
	:	SQL_K_SELECT attr_stmt SQL_K_FROM table_stmt
		(SQL_K_WHERE where_stmt)?
	;

attr_stmt
	:	(STAR | attr_value)
	;
	
attr_value
	:	(literal_value ',')* literal_value
	;
	
table_stmt
	:	(literal_value | select_stmt)
	; 

where_stmt
	: 	literal_value  comparison_operator (literal_value comparison_operator)* literal_value 
	; 
	
literal_value
	:	IDENTIFIER
	;
comparison_operator
	:	(LT | LT_EQ | GT | GT_EQ | EQ | NOT_EQ1 | NOT_EQ2)
 	;
 	
SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
STAR : '*';
PLUS : '+';
MINUS : '-';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '=';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';

 keyword
 : SQL_K_SELECT
 | SQL_K_WHERE
 | SQL_K_FROM
 ;
 
SQL_K_SELECT : S E L E C T;
SQL_K_WHERE : W H E R E;
SQL_K_FROM : F R O M; 

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | [a-zA-Z_] [a-zA-Z_0-9]* 
 ;
 
 SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;
 
UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
