//Camilo Chacón Sartori
grammar SQL;

parse
 : 
 	( sql_stmt_list | error )* EOF
 ;
error
 : 
 	UNEXPECTED_CHAR 
   { 
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text); 
   }
 ;
 
sql_stmt_list
 : 
 	';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;

sql_stmt
	:	
		select_stmt 
		| update_stmt 
		| insert_stmt 
		| delete_stmt
	
	;
	
/////////////////////SELECT/////////////////////////////

select_stmt
	:	
		SQL_K_SELECT (attr_select_value | '*') SQL_K_FROM table_stmt
		(SQL_K_WHERE expr)?
	;
	
attr_select_value
	:	
		(literal_value
		| '.' (IDENTIFIER | '*')
		| ',' IDENTIFIER)
		attr_value?
	;
/////////////////////UPDATE/////////////////////////////
update_stmt
	:	
		SQL_K_UPDATE table_stmt SQL_K_SET assign_update_stmt
		(SQL_K_WHERE expr)?
	;
expr_attr_update 
	:
		(IDENTIFIER ('.' IDENTIFIER)?) 
	;
assign_update_stmt
	:	
		expr_attr_update '=' (expr_attr_update | literal_value)  (',' assign_update_stmt)*
	;

//////////////////////INSERT//////////////////////
insert_stmt
	:	
		SQL_K_INSERT SQL_K_INTO IDENTIFIER attr_insert_stmt SQL_K_VALUES attr_insert_stmt
		(SQL_K_WHERE expr)?
	;
attr_insert_stmt
	:		
		'(' attr_value ')'
	;

values_insert_value
	:	
		(CHARACTER
		| NUMBER 
		| ',' (CHARACTER | NUMBER)) 
		values_insert_value?
	;
/////////////////////DELETE/////////////////////////////
delete_stmt
	:	
		SQL_K_DELETE SQL_K_FROM table_stmt 
		(SQL_K_WHERE expr)?
	;


	
attr_stmt
	:	
		STAR | attr_value
	;

attr_value
	:	
		(literal_value
		| ',' literal_value) attr_value?
	;
	
table_stmt
	:	
		attr_value | select_stmt
	; 
	
expr:
	 '(' expr_logic ')'
	 | expr_logic
	;	
	
expr_logic
	:
		 logic_operator expr_logic*
		| expr_comparation expr_logic*
		| '(' expr_comparation ')' expr_logic*
	;


expr_arithmetic
	:
		(literal_value choose_arithmetic_operator)
		| '(' expr_arithmetic ')'
	;
choose_arithmetic_operator
	:
		(dot_operation 
			| div_operation 
			| plus_operation
			| minus_operation
		)
	;
dot_operation
	:
		STAR literal_value
	;
div_operation
	:
		DIV literal_value
	;
plus_operation
	:
		PLUS literal_value
	;
minus_operation
	:
		MINUS literal_value
	;

expr_literal_arithmetic
	:
		(literal_value | expr_arithmetic) 
	;
expr_comparation
	: 	
		expr_literal_arithmetic  (comparison_operator expr_literal_arithmetic)* 
		|  (comparison_operator expr_literal_arithmetic)
	; 
	
literal_value
	:	
		 ((id | id_with_attribute) | number)
		 | '(' literal_value ')'
	;
id_with_attribute
	:
		id '.' id
	;
id 
	: 
	IDENTIFIER
	;
number
	:
	NUMBER
	;
	
logic_operator
	:	
		AND | OR | IN | NOT | BETWEEN | EXISTS
	;
 	
comparison_operator
	:	
		LT | LT_EQ | GT | GT_EQ | EQ | NOT_EQ1 | NOT_EQ2
 	;
 	
arithmetic_operator
	:	
		STAR | DIV | MOD | PLUS | MINUS 
 	;

AND : A N D;
OR : O R;
IN : I N;
NOT : N O T;
BETWEEN : B E T W E E N;
EXISTS : E X I S T S;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
STAR : '*';
PLUS : '+';
MINUS : '-';
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
 | SQL_K_UPDATE
 | SQL_K_SET
 | SQL_K_INSERT
 | SQL_K_INTO
 | SQL_K_VALUES
 | SQL_K_DELETE
 | SQL_K_WHERE
 | SQL_K_FROM
 ;
 
SQL_K_SELECT : S E L E C T;
SQL_K_UPDATE : U P D A T E;
SQL_K_SET : S E T;
SQL_K_INSERT : I N S E R T;
SQL_K_INTO : I N T O;
SQL_K_VALUES : V A L U E S;
SQL_K_DELETE : D E L E T E;
SQL_K_WHERE : W H E R E;
SQL_K_FROM : F R O M; 

NUMBER
 : [0-9]* ('.' [0-9]*)?
 ;
 
 CHARACTER
 : 
 	'"' ([a-zA-Z_0-9]*) '"'
 	|	'\'' ([a-Z0-9]?) '\''
 ;
 
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
