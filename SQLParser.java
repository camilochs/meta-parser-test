// Generated from SQL.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, IN=3, NOT=4, BETWEEN=5, EXISTS=6, SCOL=7, DOT=8, OPEN_PAR=9, 
		CLOSE_PAR=10, COMMA=11, STAR=12, PLUS=13, MINUS=14, DIV=15, MOD=16, LT=17, 
		LT_EQ=18, GT=19, GT_EQ=20, EQ=21, NOT_EQ1=22, NOT_EQ2=23, SQL_K_SELECT=24, 
		SQL_K_UPDATE=25, SQL_K_SET=26, SQL_K_INSERT=27, SQL_K_INTO=28, SQL_K_VALUES=29, 
		SQL_K_DELETE=30, SQL_K_WHERE=31, SQL_K_FROM=32, NUMBER=33, CHARACTER=34, 
		IDENTIFIER=35, SPACES=36, UNEXPECTED_CHAR=37;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_select_stmt = 4, RULE_attr_select_value = 5, RULE_update_stmt = 6, 
		RULE_expr_attr_update = 7, RULE_assign_update_stmt = 8, RULE_insert_stmt = 9, 
		RULE_attr_insert_stmt = 10, RULE_values_insert_value = 11, RULE_delete_stmt = 12, 
		RULE_attr_stmt = 13, RULE_attr_value = 14, RULE_table_stmt = 15, RULE_expr = 16, 
		RULE_expr_logic = 17, RULE_expr_arithmetic = 18, RULE_choose_arithmetic_operator = 19, 
		RULE_dot_operation = 20, RULE_div_operation = 21, RULE_plus_operation = 22, 
		RULE_minus_operation = 23, RULE_expr_literal_arithmetic = 24, RULE_expr_comparation = 25, 
		RULE_literal_value = 26, RULE_id_with_attribute = 27, RULE_id = 28, RULE_number = 29, 
		RULE_logic_operator = 30, RULE_comparison_operator = 31, RULE_arithmetic_operator = 32, 
		RULE_keyword = 33;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "select_stmt", "attr_select_value", 
		"update_stmt", "expr_attr_update", "assign_update_stmt", "insert_stmt", 
		"attr_insert_stmt", "values_insert_value", "delete_stmt", "attr_stmt", 
		"attr_value", "table_stmt", "expr", "expr_logic", "expr_arithmetic", "choose_arithmetic_operator", 
		"dot_operation", "div_operation", "plus_operation", "minus_operation", 
		"expr_literal_arithmetic", "expr_comparation", "literal_value", "id_with_attribute", 
		"id", "number", "logic_operator", "comparison_operator", "arithmetic_operator", 
		"keyword"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "';'", "'.'", "'('", "')'", 
		"','", "'*'", "'+'", "'-'", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", 
		"'='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "IN", "NOT", "BETWEEN", "EXISTS", "SCOL", "DOT", "OPEN_PAR", 
		"CLOSE_PAR", "COMMA", "STAR", "PLUS", "MINUS", "DIV", "MOD", "LT", "LT_EQ", 
		"GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "SQL_K_SELECT", "SQL_K_UPDATE", 
		"SQL_K_SET", "SQL_K_INSERT", "SQL_K_INTO", "SQL_K_VALUES", "SQL_K_DELETE", 
		"SQL_K_WHERE", "SQL_K_FROM", "NUMBER", "CHARACTER", "IDENTIFIER", "SPACES", 
		"UNEXPECTED_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << SQL_K_SELECT) | (1L << SQL_K_UPDATE) | (1L << SQL_K_INSERT) | (1L << SQL_K_DELETE) | (1L << UNEXPECTED_CHAR))) != 0)) {
				{
				setState(70);
				switch (_input.LA(1)) {
				case SCOL:
				case SQL_K_SELECT:
				case SQL_K_UPDATE:
				case SQL_K_INSERT:
				case SQL_K_DELETE:
					{
					setState(68);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(69);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(80);
				match(SCOL);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			sql_stmt();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(87);
						match(SCOL);
						}
						}
						setState(90); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(92);
					sql_stmt();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					match(SCOL);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case SQL_K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				select_stmt();
				}
				break;
			case SQL_K_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				update_stmt();
				}
				break;
			case SQL_K_INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				insert_stmt();
				}
				break;
			case SQL_K_DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				delete_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SQL_K_SELECT() { return getToken(SQLParser.SQL_K_SELECT, 0); }
		public TerminalNode SQL_K_FROM() { return getToken(SQLParser.SQL_K_FROM, 0); }
		public Table_stmtContext table_stmt() {
			return getRuleContext(Table_stmtContext.class,0);
		}
		public Attr_select_valueContext attr_select_value() {
			return getRuleContext(Attr_select_valueContext.class,0);
		}
		public TerminalNode SQL_K_WHERE() { return getToken(SQLParser.SQL_K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(SQL_K_SELECT);
			setState(113);
			switch (_input.LA(1)) {
			case DOT:
			case OPEN_PAR:
			case COMMA:
			case NUMBER:
			case IDENTIFIER:
				{
				setState(111);
				attr_select_value();
				}
				break;
			case STAR:
				{
				setState(112);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			match(SQL_K_FROM);
			setState(116);
			table_stmt();
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(117);
				match(SQL_K_WHERE);
				setState(118);
				expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_select_valueContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Attr_valueContext attr_value() {
			return getRuleContext(Attr_valueContext.class,0);
		}
		public Attr_select_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_select_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAttr_select_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAttr_select_value(this);
		}
	}

	public final Attr_select_valueContext attr_select_value() throws RecognitionException {
		Attr_select_valueContext _localctx = new Attr_select_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attr_select_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case NUMBER:
			case IDENTIFIER:
				{
				setState(121);
				literal_value();
				}
				break;
			case DOT:
				{
				setState(122);
				match(DOT);
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case COMMA:
				{
				setState(124);
				match(COMMA);
				setState(125);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << COMMA) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(128);
				attr_value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode SQL_K_UPDATE() { return getToken(SQLParser.SQL_K_UPDATE, 0); }
		public Table_stmtContext table_stmt() {
			return getRuleContext(Table_stmtContext.class,0);
		}
		public TerminalNode SQL_K_SET() { return getToken(SQLParser.SQL_K_SET, 0); }
		public Assign_update_stmtContext assign_update_stmt() {
			return getRuleContext(Assign_update_stmtContext.class,0);
		}
		public TerminalNode SQL_K_WHERE() { return getToken(SQLParser.SQL_K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(SQL_K_UPDATE);
			setState(132);
			table_stmt();
			setState(133);
			match(SQL_K_SET);
			setState(134);
			assign_update_stmt();
			setState(137);
			_la = _input.LA(1);
			if (_la==SQL_K_WHERE) {
				{
				setState(135);
				match(SQL_K_WHERE);
				setState(136);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_attr_updateContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public Expr_attr_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_attr_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_attr_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_attr_update(this);
		}
	}

	public final Expr_attr_updateContext expr_attr_update() throws RecognitionException {
		Expr_attr_updateContext _localctx = new Expr_attr_updateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_attr_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(139);
			match(IDENTIFIER);
			setState(142);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(140);
				match(DOT);
				setState(141);
				match(IDENTIFIER);
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_update_stmtContext extends ParserRuleContext {
		public List<Expr_attr_updateContext> expr_attr_update() {
			return getRuleContexts(Expr_attr_updateContext.class);
		}
		public Expr_attr_updateContext expr_attr_update(int i) {
			return getRuleContext(Expr_attr_updateContext.class,i);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public List<Assign_update_stmtContext> assign_update_stmt() {
			return getRuleContexts(Assign_update_stmtContext.class);
		}
		public Assign_update_stmtContext assign_update_stmt(int i) {
			return getRuleContext(Assign_update_stmtContext.class,i);
		}
		public Assign_update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssign_update_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssign_update_stmt(this);
		}
	}

	public final Assign_update_stmtContext assign_update_stmt() throws RecognitionException {
		Assign_update_stmtContext _localctx = new Assign_update_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_update_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expr_attr_update();
			setState(145);
			match(EQ);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(146);
				expr_attr_update();
				}
				break;
			case 2:
				{
				setState(147);
				literal_value();
				}
				break;
			}
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					assign_update_stmt();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode SQL_K_INSERT() { return getToken(SQLParser.SQL_K_INSERT, 0); }
		public TerminalNode SQL_K_INTO() { return getToken(SQLParser.SQL_K_INTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public List<Attr_insert_stmtContext> attr_insert_stmt() {
			return getRuleContexts(Attr_insert_stmtContext.class);
		}
		public Attr_insert_stmtContext attr_insert_stmt(int i) {
			return getRuleContext(Attr_insert_stmtContext.class,i);
		}
		public TerminalNode SQL_K_VALUES() { return getToken(SQLParser.SQL_K_VALUES, 0); }
		public TerminalNode SQL_K_WHERE() { return getToken(SQLParser.SQL_K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(SQL_K_INSERT);
			setState(158);
			match(SQL_K_INTO);
			setState(159);
			match(IDENTIFIER);
			setState(160);
			attr_insert_stmt();
			setState(161);
			match(SQL_K_VALUES);
			setState(162);
			attr_insert_stmt();
			setState(165);
			_la = _input.LA(1);
			if (_la==SQL_K_WHERE) {
				{
				setState(163);
				match(SQL_K_WHERE);
				setState(164);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_insert_stmtContext extends ParserRuleContext {
		public Attr_valueContext attr_value() {
			return getRuleContext(Attr_valueContext.class,0);
		}
		public Attr_insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAttr_insert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAttr_insert_stmt(this);
		}
	}

	public final Attr_insert_stmtContext attr_insert_stmt() throws RecognitionException {
		Attr_insert_stmtContext _localctx = new Attr_insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attr_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(OPEN_PAR);
			setState(168);
			attr_value();
			setState(169);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_insert_valueContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public TerminalNode NUMBER() { return getToken(SQLParser.NUMBER, 0); }
		public Values_insert_valueContext values_insert_value() {
			return getRuleContext(Values_insert_valueContext.class,0);
		}
		public Values_insert_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_insert_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValues_insert_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValues_insert_value(this);
		}
	}

	public final Values_insert_valueContext values_insert_value() throws RecognitionException {
		Values_insert_valueContext _localctx = new Values_insert_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_values_insert_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch (_input.LA(1)) {
			case CHARACTER:
				{
				setState(171);
				match(CHARACTER);
				}
				break;
			case NUMBER:
				{
				setState(172);
				match(NUMBER);
				}
				break;
			case COMMA:
				{
				setState(173);
				match(COMMA);
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(177);
				values_insert_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode SQL_K_DELETE() { return getToken(SQLParser.SQL_K_DELETE, 0); }
		public TerminalNode SQL_K_FROM() { return getToken(SQLParser.SQL_K_FROM, 0); }
		public Table_stmtContext table_stmt() {
			return getRuleContext(Table_stmtContext.class,0);
		}
		public TerminalNode SQL_K_WHERE() { return getToken(SQLParser.SQL_K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(SQL_K_DELETE);
			setState(181);
			match(SQL_K_FROM);
			setState(182);
			table_stmt();
			setState(185);
			_la = _input.LA(1);
			if (_la==SQL_K_WHERE) {
				{
				setState(183);
				match(SQL_K_WHERE);
				setState(184);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_stmtContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Attr_valueContext attr_value() {
			return getRuleContext(Attr_valueContext.class,0);
		}
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAttr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAttr_stmt(this);
		}
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attr_stmt);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(STAR);
				}
				break;
			case OPEN_PAR:
			case COMMA:
			case NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				attr_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_valueContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Attr_valueContext attr_value() {
			return getRuleContext(Attr_valueContext.class,0);
		}
		public Attr_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAttr_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAttr_value(this);
		}
	}

	public final Attr_valueContext attr_value() throws RecognitionException {
		Attr_valueContext _localctx = new Attr_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attr_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case NUMBER:
			case IDENTIFIER:
				{
				setState(191);
				literal_value();
				}
				break;
			case COMMA:
				{
				setState(192);
				match(COMMA);
				setState(193);
				literal_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << COMMA) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(196);
				attr_value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_stmtContext extends ParserRuleContext {
		public Attr_valueContext attr_value() {
			return getRuleContext(Attr_valueContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_stmt(this);
		}
	}

	public final Table_stmtContext table_stmt() throws RecognitionException {
		Table_stmtContext _localctx = new Table_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_stmt);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case COMMA:
			case NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				attr_value();
				}
				break;
			case SQL_K_SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr_logicContext expr_logic() {
			return getRuleContext(Expr_logicContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(OPEN_PAR);
				setState(204);
				expr_logic();
				setState(205);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				expr_logic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_logicContext extends ParserRuleContext {
		public Logic_operatorContext logic_operator() {
			return getRuleContext(Logic_operatorContext.class,0);
		}
		public List<Expr_logicContext> expr_logic() {
			return getRuleContexts(Expr_logicContext.class);
		}
		public Expr_logicContext expr_logic(int i) {
			return getRuleContext(Expr_logicContext.class,i);
		}
		public Expr_comparationContext expr_comparation() {
			return getRuleContext(Expr_comparationContext.class,0);
		}
		public Expr_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_logic(this);
		}
	}

	public final Expr_logicContext expr_logic() throws RecognitionException {
		Expr_logicContext _localctx = new Expr_logicContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_logic);
		try {
			int _alt;
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				logic_operator();
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(211);
						expr_logic();
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				expr_comparation();
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(218);
						expr_logic();
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(OPEN_PAR);
				setState(225);
				expr_comparation();
				setState(226);
				match(CLOSE_PAR);
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						expr_logic();
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_arithmeticContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Choose_arithmetic_operatorContext choose_arithmetic_operator() {
			return getRuleContext(Choose_arithmetic_operatorContext.class,0);
		}
		public Expr_arithmeticContext expr_arithmetic() {
			return getRuleContext(Expr_arithmeticContext.class,0);
		}
		public Expr_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_arithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_arithmetic(this);
		}
	}

	public final Expr_arithmeticContext expr_arithmetic() throws RecognitionException {
		Expr_arithmeticContext _localctx = new Expr_arithmeticContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_arithmetic);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(235);
				literal_value();
				setState(236);
				choose_arithmetic_operator();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(OPEN_PAR);
				setState(239);
				expr_arithmetic();
				setState(240);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Choose_arithmetic_operatorContext extends ParserRuleContext {
		public Dot_operationContext dot_operation() {
			return getRuleContext(Dot_operationContext.class,0);
		}
		public Div_operationContext div_operation() {
			return getRuleContext(Div_operationContext.class,0);
		}
		public Plus_operationContext plus_operation() {
			return getRuleContext(Plus_operationContext.class,0);
		}
		public Minus_operationContext minus_operation() {
			return getRuleContext(Minus_operationContext.class,0);
		}
		public Choose_arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choose_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterChoose_arithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitChoose_arithmetic_operator(this);
		}
	}

	public final Choose_arithmetic_operatorContext choose_arithmetic_operator() throws RecognitionException {
		Choose_arithmetic_operatorContext _localctx = new Choose_arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_choose_arithmetic_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(244);
				dot_operation();
				}
				break;
			case DIV:
				{
				setState(245);
				div_operation();
				}
				break;
			case PLUS:
				{
				setState(246);
				plus_operation();
				}
				break;
			case MINUS:
				{
				setState(247);
				minus_operation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_operationContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Dot_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDot_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDot_operation(this);
		}
	}

	public final Dot_operationContext dot_operation() throws RecognitionException {
		Dot_operationContext _localctx = new Dot_operationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dot_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(STAR);
			setState(251);
			literal_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Div_operationContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Div_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDiv_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDiv_operation(this);
		}
	}

	public final Div_operationContext div_operation() throws RecognitionException {
		Div_operationContext _localctx = new Div_operationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_div_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(DIV);
			setState(254);
			literal_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Plus_operationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Plus_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPlus_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPlus_operation(this);
		}
	}

	public final Plus_operationContext plus_operation() throws RecognitionException {
		Plus_operationContext _localctx = new Plus_operationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_plus_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(PLUS);
			setState(257);
			literal_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Minus_operationContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Minus_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterMinus_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitMinus_operation(this);
		}
	}

	public final Minus_operationContext minus_operation() throws RecognitionException {
		Minus_operationContext _localctx = new Minus_operationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_minus_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(MINUS);
			setState(260);
			literal_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_literal_arithmeticContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Expr_arithmeticContext expr_arithmetic() {
			return getRuleContext(Expr_arithmeticContext.class,0);
		}
		public Expr_literal_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_literal_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_literal_arithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_literal_arithmetic(this);
		}
	}

	public final Expr_literal_arithmeticContext expr_literal_arithmetic() throws RecognitionException {
		Expr_literal_arithmeticContext _localctx = new Expr_literal_arithmeticContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_literal_arithmetic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(262);
				literal_value();
				}
				break;
			case 2:
				{
				setState(263);
				expr_arithmetic();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_comparationContext extends ParserRuleContext {
		public List<Expr_literal_arithmeticContext> expr_literal_arithmetic() {
			return getRuleContexts(Expr_literal_arithmeticContext.class);
		}
		public Expr_literal_arithmeticContext expr_literal_arithmetic(int i) {
			return getRuleContext(Expr_literal_arithmeticContext.class,i);
		}
		public List<Comparison_operatorContext> comparison_operator() {
			return getRuleContexts(Comparison_operatorContext.class);
		}
		public Comparison_operatorContext comparison_operator(int i) {
			return getRuleContext(Comparison_operatorContext.class,i);
		}
		public Expr_comparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_comparation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_comparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_comparation(this);
		}
	}

	public final Expr_comparationContext expr_comparation() throws RecognitionException {
		Expr_comparationContext _localctx = new Expr_comparationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_comparation);
		try {
			int _alt;
			setState(278);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				expr_literal_arithmetic();
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267);
						comparison_operator();
						setState(268);
						expr_literal_arithmetic();
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case LT:
			case LT_EQ:
			case GT:
			case GT_EQ:
			case EQ:
			case NOT_EQ1:
			case NOT_EQ2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(275);
				comparison_operator();
				setState(276);
				expr_literal_arithmetic();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_with_attributeContext id_with_attribute() {
			return getRuleContext(Id_with_attributeContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal_value);
		try {
			setState(291);
			switch (_input.LA(1)) {
			case NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(280);
						id();
						}
						break;
					case 2:
						{
						setState(281);
						id_with_attribute();
						}
						break;
					}
					}
					break;
				case NUMBER:
					{
					setState(284);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(OPEN_PAR);
				setState(288);
				literal_value();
				setState(289);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_with_attributeContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Id_with_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_with_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterId_with_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitId_with_attribute(this);
		}
	}

	public final Id_with_attributeContext id_with_attribute() throws RecognitionException {
		Id_with_attributeContext _localctx = new Id_with_attributeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id_with_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			id();
			setState(294);
			match(DOT);
			setState(295);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SQLParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLParser.OR, 0); }
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLogic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLogic_operator(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << IN) | (1L << NOT) | (1L << BETWEEN) | (1L << EXISTS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitComparison_operator(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArithmetic_operator(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode SQL_K_SELECT() { return getToken(SQLParser.SQL_K_SELECT, 0); }
		public TerminalNode SQL_K_UPDATE() { return getToken(SQLParser.SQL_K_UPDATE, 0); }
		public TerminalNode SQL_K_SET() { return getToken(SQLParser.SQL_K_SET, 0); }
		public TerminalNode SQL_K_INSERT() { return getToken(SQLParser.SQL_K_INSERT, 0); }
		public TerminalNode SQL_K_INTO() { return getToken(SQLParser.SQL_K_INTO, 0); }
		public TerminalNode SQL_K_VALUES() { return getToken(SQLParser.SQL_K_VALUES, 0); }
		public TerminalNode SQL_K_DELETE() { return getToken(SQLParser.SQL_K_DELETE, 0); }
		public TerminalNode SQL_K_WHERE() { return getToken(SQLParser.SQL_K_WHERE, 0); }
		public TerminalNode SQL_K_FROM() { return getToken(SQLParser.SQL_K_FROM, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQL_K_SELECT) | (1L << SQL_K_UPDATE) | (1L << SQL_K_SET) | (1L << SQL_K_INSERT) | (1L << SQL_K_INTO) | (1L << SQL_K_VALUES) | (1L << SQL_K_DELETE) | (1L << SQL_K_WHERE) | (1L << SQL_K_FROM))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\6\4[\n\4\r\4\16\4\\\3\4\7\4`\n\4"+
		"\f\4\16\4c\13\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\5\3\5\3\5\3\5\5\5o\n\5\3"+
		"\6\3\6\3\6\5\6t\n\6\3\6\3\6\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u0081"+
		"\n\7\3\7\5\7\u0084\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3"+
		"\t\5\t\u0091\n\t\3\n\3\n\3\n\3\n\5\n\u0097\n\n\3\n\3\n\7\n\u009b\n\n\f"+
		"\n\16\n\u009e\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a8"+
		"\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\r\5\r\u00b5\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00bc\n\16\3\17\3\17\5\17\u00c0\n\17\3"+
		"\20\3\20\3\20\5\20\u00c5\n\20\3\20\5\20\u00c8\n\20\3\21\3\21\5\21\u00cc"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00d3\n\22\3\23\3\23\7\23\u00d7\n"+
		"\23\f\23\16\23\u00da\13\23\3\23\3\23\7\23\u00de\n\23\f\23\16\23\u00e1"+
		"\13\23\3\23\3\23\3\23\3\23\7\23\u00e7\n\23\f\23\16\23\u00ea\13\23\5\23"+
		"\u00ec\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f5\n\24\3\25\3"+
		"\25\3\25\3\25\5\25\u00fb\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\5\32\u010b\n\32\3\33\3\33\3\33\3\33\7\33"+
		"\u0111\n\33\f\33\16\33\u0114\13\33\3\33\3\33\3\33\5\33\u0119\n\33\3\34"+
		"\3\34\5\34\u011d\n\34\3\34\5\34\u0120\n\34\3\34\3\34\3\34\3\34\5\34\u0126"+
		"\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BD\2\b\4\2\16\16%%\3\2#$\3\2\3\b\3\2\23\31\3\2\16\22\3\2\32\"\u0140"+
		"\2J\3\2\2\2\4O\3\2\2\2\6U\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\f\u0080\3\2\2"+
		"\2\16\u0085\3\2\2\2\20\u008d\3\2\2\2\22\u0092\3\2\2\2\24\u009f\3\2\2\2"+
		"\26\u00a9\3\2\2\2\30\u00b1\3\2\2\2\32\u00b6\3\2\2\2\34\u00bf\3\2\2\2\36"+
		"\u00c4\3\2\2\2 \u00cb\3\2\2\2\"\u00d2\3\2\2\2$\u00eb\3\2\2\2&\u00f4\3"+
		"\2\2\2(\u00fa\3\2\2\2*\u00fc\3\2\2\2,\u00ff\3\2\2\2.\u0102\3\2\2\2\60"+
		"\u0105\3\2\2\2\62\u010a\3\2\2\2\64\u0118\3\2\2\2\66\u0125\3\2\2\28\u0127"+
		"\3\2\2\2:\u012b\3\2\2\2<\u012d\3\2\2\2>\u012f\3\2\2\2@\u0131\3\2\2\2B"+
		"\u0133\3\2\2\2D\u0135\3\2\2\2FI\5\6\4\2GI\5\4\3\2HF\3\2\2\2HG\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\2\2\3N\3\3\2\2"+
		"\2OP\7\'\2\2PQ\b\3\1\2Q\5\3\2\2\2RT\7\t\2\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2Xa\5\b\5\2Y[\7\t\2\2ZY\3\2\2\2[\\\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\5\b\5\2_Z\3\2\2\2`c\3\2\2\2a"+
		"_\3\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\7\t\2\2ed\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2h\7\3\2\2\2ig\3\2\2\2jo\5\n\6\2ko\5\16\b\2lo\5\24"+
		"\13\2mo\5\32\16\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\t\3\2\2\2p"+
		"s\7\32\2\2qt\5\f\7\2rt\7\16\2\2sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2uv\7\"\2"+
		"\2vy\5 \21\2wx\7!\2\2xz\5\"\22\2yw\3\2\2\2yz\3\2\2\2z\13\3\2\2\2{\u0081"+
		"\5\66\34\2|}\7\n\2\2}\u0081\t\2\2\2~\177\7\r\2\2\177\u0081\7%\2\2\u0080"+
		"{\3\2\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084"+
		"\5\36\20\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\r\3\2\2\2\u0085"+
		"\u0086\7\33\2\2\u0086\u0087\5 \21\2\u0087\u0088\7\34\2\2\u0088\u008b\5"+
		"\22\n\2\u0089\u008a\7!\2\2\u008a\u008c\5\"\22\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u0090\7%\2\2\u008e\u008f\7\n\2\2"+
		"\u008f\u0091\7%\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3"+
		"\2\2\2\u0092\u0093\5\20\t\2\u0093\u0096\7\27\2\2\u0094\u0097\5\20\t\2"+
		"\u0095\u0097\5\66\34\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009c"+
		"\3\2\2\2\u0098\u0099\7\r\2\2\u0099\u009b\5\22\n\2\u009a\u0098\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\23"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a1\7\36\2\2"+
		"\u00a1\u00a2\7%\2\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\7\37\2\2\u00a4\u00a7"+
		"\5\26\f\2\u00a5\u00a6\7!\2\2\u00a6\u00a8\5\"\22\2\u00a7\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab"+
		"\5\36\20\2\u00ab\u00ac\7\f\2\2\u00ac\27\3\2\2\2\u00ad\u00b2\7$\2\2\u00ae"+
		"\u00b2\7#\2\2\u00af\u00b0\7\r\2\2\u00b0\u00b2\t\3\2\2\u00b1\u00ad\3\2"+
		"\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b5\5\30\r\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\31\3\2\2"+
		"\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\7\"\2\2\u00b8\u00bb\5 \21\2\u00b9\u00ba"+
		"\7!\2\2\u00ba\u00bc\5\"\22\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\33\3\2\2\2\u00bd\u00c0\7\16\2\2\u00be\u00c0\5\36\20\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00be\3\2\2\2\u00c0\35\3\2\2\2\u00c1\u00c5\5\66\34\2\u00c2"+
		"\u00c3\7\r\2\2\u00c3\u00c5\5\66\34\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\5\36\20\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00cc\5\36\20\2\u00ca\u00cc\5\n"+
		"\6\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc!\3\2\2\2\u00cd\u00ce"+
		"\7\13\2\2\u00ce\u00cf\5$\23\2\u00cf\u00d0\7\f\2\2\u00d0\u00d3\3\2\2\2"+
		"\u00d1\u00d3\5$\23\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3#\3"+
		"\2\2\2\u00d4\u00d8\5> \2\u00d5\u00d7\5$\23\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00ec\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00df\5\64\33\2\u00dc\u00de\5$\23\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00ec\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\13\2\2\u00e3"+
		"\u00e4\5\64\33\2\u00e4\u00e8\7\f\2\2\u00e5\u00e7\5$\23\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00d4\3\2\2\2\u00eb\u00db\3\2"+
		"\2\2\u00eb\u00e2\3\2\2\2\u00ec%\3\2\2\2\u00ed\u00ee\5\66\34\2\u00ee\u00ef"+
		"\5(\25\2\u00ef\u00f5\3\2\2\2\u00f0\u00f1\7\13\2\2\u00f1\u00f2\5&\24\2"+
		"\u00f2\u00f3\7\f\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00f0"+
		"\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00fb\5*\26\2\u00f7\u00fb\5,\27\2\u00f8"+
		"\u00fb\5.\30\2\u00f9\u00fb\5\60\31\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb)\3\2\2\2\u00fc\u00fd"+
		"\7\16\2\2\u00fd\u00fe\5\66\34\2\u00fe+\3\2\2\2\u00ff\u0100\7\21\2\2\u0100"+
		"\u0101\5\66\34\2\u0101-\3\2\2\2\u0102\u0103\7\17\2\2\u0103\u0104\5\66"+
		"\34\2\u0104/\3\2\2\2\u0105\u0106\7\20\2\2\u0106\u0107\5\66\34\2\u0107"+
		"\61\3\2\2\2\u0108\u010b\5\66\34\2\u0109\u010b\5&\24\2\u010a\u0108\3\2"+
		"\2\2\u010a\u0109\3\2\2\2\u010b\63\3\2\2\2\u010c\u0112\5\62\32\2\u010d"+
		"\u010e\5@!\2\u010e\u010f\5\62\32\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0119\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\5@!\2\u0116\u0117\5\62"+
		"\32\2\u0117\u0119\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u0115\3\2\2\2\u0119"+
		"\65\3\2\2\2\u011a\u011d\5:\36\2\u011b\u011d\58\35\2\u011c\u011a\3\2\2"+
		"\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u0120\5<\37\2\u011f\u011c"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0126\3\2\2\2\u0121\u0122\7\13\2\2"+
		"\u0122\u0123\5\66\34\2\u0123\u0124\7\f\2\2\u0124\u0126\3\2\2\2\u0125\u011f"+
		"\3\2\2\2\u0125\u0121\3\2\2\2\u0126\67\3\2\2\2\u0127\u0128\5:\36\2\u0128"+
		"\u0129\7\n\2\2\u0129\u012a\5:\36\2\u012a9\3\2\2\2\u012b\u012c\7%\2\2\u012c"+
		";\3\2\2\2\u012d\u012e\7#\2\2\u012e=\3\2\2\2\u012f\u0130\t\4\2\2\u0130"+
		"?\3\2\2\2\u0131\u0132\t\5\2\2\u0132A\3\2\2\2\u0133\u0134\t\6\2\2\u0134"+
		"C\3\2\2\2\u0135\u0136\t\7\2\2\u0136E\3\2\2\2&HJU\\agnsy\u0080\u0083\u008b"+
		"\u0090\u0096\u009c\u00a7\u00b1\u00b4\u00bb\u00bf\u00c4\u00c7\u00cb\u00d2"+
		"\u00d8\u00df\u00e8\u00eb\u00f4\u00fa\u010a\u0112\u0118\u011c\u011f\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}