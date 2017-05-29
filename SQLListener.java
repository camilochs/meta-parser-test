// Generated from SQL.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#attr_select_value}.
	 * @param ctx the parse tree
	 */
	void enterAttr_select_value(SQLParser.Attr_select_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#attr_select_value}.
	 * @param ctx the parse tree
	 */
	void exitAttr_select_value(SQLParser.Attr_select_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_attr_update}.
	 * @param ctx the parse tree
	 */
	void enterExpr_attr_update(SQLParser.Expr_attr_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_attr_update}.
	 * @param ctx the parse tree
	 */
	void exitExpr_attr_update(SQLParser.Expr_attr_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assign_update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_update_stmt(SQLParser.Assign_update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assign_update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_update_stmt(SQLParser.Assign_update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#attr_insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr_insert_stmt(SQLParser.Attr_insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#attr_insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr_insert_stmt(SQLParser.Attr_insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#values_insert_value}.
	 * @param ctx the parse tree
	 */
	void enterValues_insert_value(SQLParser.Values_insert_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#values_insert_value}.
	 * @param ctx the parse tree
	 */
	void exitValues_insert_value(SQLParser.Values_insert_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr_stmt(SQLParser.Attr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr_stmt(SQLParser.Attr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#attr_value}.
	 * @param ctx the parse tree
	 */
	void enterAttr_value(SQLParser.Attr_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#attr_value}.
	 * @param ctx the parse tree
	 */
	void exitAttr_value(SQLParser.Attr_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTable_stmt(SQLParser.Table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTable_stmt(SQLParser.Table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void enterExpr_logic(SQLParser.Expr_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void exitExpr_logic(SQLParser.Expr_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterExpr_arithmetic(SQLParser.Expr_arithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitExpr_arithmetic(SQLParser.Expr_arithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#choose_arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterChoose_arithmetic_operator(SQLParser.Choose_arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#choose_arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitChoose_arithmetic_operator(SQLParser.Choose_arithmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dot_operation}.
	 * @param ctx the parse tree
	 */
	void enterDot_operation(SQLParser.Dot_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dot_operation}.
	 * @param ctx the parse tree
	 */
	void exitDot_operation(SQLParser.Dot_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#div_operation}.
	 * @param ctx the parse tree
	 */
	void enterDiv_operation(SQLParser.Div_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#div_operation}.
	 * @param ctx the parse tree
	 */
	void exitDiv_operation(SQLParser.Div_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#plus_operation}.
	 * @param ctx the parse tree
	 */
	void enterPlus_operation(SQLParser.Plus_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#plus_operation}.
	 * @param ctx the parse tree
	 */
	void exitPlus_operation(SQLParser.Plus_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#minus_operation}.
	 * @param ctx the parse tree
	 */
	void enterMinus_operation(SQLParser.Minus_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#minus_operation}.
	 * @param ctx the parse tree
	 */
	void exitMinus_operation(SQLParser.Minus_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_literal_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterExpr_literal_arithmetic(SQLParser.Expr_literal_arithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_literal_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitExpr_literal_arithmetic(SQLParser.Expr_literal_arithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_comparation}.
	 * @param ctx the parse tree
	 */
	void enterExpr_comparation(SQLParser.Expr_comparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_comparation}.
	 * @param ctx the parse tree
	 */
	void exitExpr_comparation(SQLParser.Expr_comparationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#id_with_attribute}.
	 * @param ctx the parse tree
	 */
	void enterId_with_attribute(SQLParser.Id_with_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#id_with_attribute}.
	 * @param ctx the parse tree
	 */
	void exitId_with_attribute(SQLParser.Id_with_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SQLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SQLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SQLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SQLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator(SQLParser.Logic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator(SQLParser.Logic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(SQLParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(SQLParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(SQLParser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(SQLParser.Arithmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLParser.KeywordContext ctx);
}