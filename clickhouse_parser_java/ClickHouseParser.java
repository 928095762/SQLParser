// Generated from ClickHouseParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClickHouseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, AFTER=2, ALIAS=3, ALL=4, ALTER=5, AND=6, ANTI=7, ANY=8, ARRAY=9, 
		AS=10, ASCENDING=11, ASOF=12, AST=13, ASYNC=14, ATTACH=15, BETWEEN=16, 
		BOTH=17, BY=18, CASE=19, CAST=20, CHECK=21, CLEAR=22, CLUSTER=23, CODEC=24, 
		COLLATE=25, COLUMN=26, COMMENT=27, CONSTRAINT=28, CREATE=29, CROSS=30, 
		CUBE=31, DATABASE=32, DATABASES=33, DATE=34, DAY=35, DEDUPLICATE=36, DEFAULT=37, 
		DELAY=38, DELETE=39, DESC=40, DESCENDING=41, DESCRIBE=42, DETACH=43, DICTIONARIES=44, 
		DICTIONARY=45, DISK=46, DISTINCT=47, DISTRIBUTED=48, DROP=49, ELSE=50, 
		END=51, ENGINE=52, EVENTS=53, EXISTS=54, EXPLAIN=55, EXPRESSION=56, EXTRACT=57, 
		FETCHES=58, FINAL=59, FIRST=60, FLUSH=61, FOR=62, FORMAT=63, FREEZE=64, 
		FROM=65, FULL=66, FUNCTION=67, GLOBAL=68, GRANULARITY=69, GROUP=70, HAVING=71, 
		HIERARCHICAL=72, HOUR=73, ID=74, IF=75, ILIKE=76, IN=77, INDEX=78, INF=79, 
		INJECTIVE=80, INNER=81, INSERT=82, INTERVAL=83, INTO=84, IS=85, IS_OBJECT_ID=86, 
		JOIN=87, KEY=88, KILL=89, LAST=90, LAYOUT=91, LEADING=92, LEFT=93, LIFETIME=94, 
		LIKE=95, LIMIT=96, LIVE=97, LOCAL=98, LOGS=99, MATERIALIZE=100, MATERIALIZED=101, 
		MAX=102, MERGES=103, MIN=104, MINUTE=105, MODIFY=106, MONTH=107, MOVE=108, 
		MUTATION=109, NAN_SQL=110, NO=111, NOT=112, NULL_SQL=113, NULLS=114, OFFSET=115, 
		ON=116, OPTIMIZE=117, OR=118, ORDER=119, OUTER=120, OUTFILE=121, PARTITION=122, 
		POPULATE=123, PREWHERE=124, PRIMARY=125, PROJECTION=126, QUARTER=127, 
		RANGE=128, RELOAD=129, REMOVE=130, RENAME=131, REPLACE=132, REPLICA=133, 
		REPLICATED=134, RIGHT=135, ROLLUP=136, SAMPLE=137, SECOND=138, SELECT=139, 
		SEMI=140, SENDS=141, SET=142, SETTINGS=143, SHOW=144, SOURCE=145, START=146, 
		STOP=147, SUBSTRING=148, SYNC=149, SYNTAX=150, SYSTEM=151, TABLE=152, 
		TABLES=153, TEMPORARY=154, TEST=155, THEN=156, TIES=157, TIMEOUT=158, 
		TIMESTAMP=159, TO=160, TOP=161, TOTALS=162, TRAILING=163, TRIM=164, TRUNCATE=165, 
		TTL=166, TYPE=167, UNION=168, UPDATE=169, USE=170, USING=171, UUID=172, 
		VALUES=173, VIEW=174, VOLUME=175, WATCH=176, WEEK=177, WHEN=178, WHERE=179, 
		WITH=180, YEAR=181, JSON_FALSE=182, JSON_TRUE=183, IDENTIFIER=184, FLOATING_LITERAL=185, 
		OCTAL_LITERAL=186, DECIMAL_LITERAL=187, HEXADECIMAL_LITERAL=188, STRING_LITERAL=189, 
		ARROW=190, ASTERISK=191, BACKQUOTE=192, BACKSLASH=193, COLON=194, COMMA=195, 
		CONCAT=196, DASH=197, DOT=198, EQ_DOUBLE=199, EQ_SINGLE=200, GE=201, GT=202, 
		LBRACE=203, LBRACKET=204, LE=205, LPAREN=206, LT=207, NOT_EQ=208, PERCENT=209, 
		PLUS=210, QUERY=211, QUOTE_DOUBLE=212, QUOTE_SINGLE=213, RBRACE=214, RBRACKET=215, 
		RPAREN=216, SEMICOLON=217, SLASH=218, UNDERSCORE=219, MULTI_LINE_COMMENT=220, 
		SINGLE_LINE_COMMENT=221, WHITESPACE=222;
	public static final int
		RULE_queryStmt = 0, RULE_query = 1, RULE_alterStmt = 2, RULE_alterTableClause = 3, 
		RULE_assignmentExprList = 4, RULE_assignmentExpr = 5, RULE_tableColumnPropertyType = 6, 
		RULE_partitionClause = 7, RULE_attachStmt = 8, RULE_checkStmt = 9, RULE_createStmt = 10, 
		RULE_dictionarySchemaClause = 11, RULE_dictionaryAttrDfnt = 12, RULE_dictionaryEngineClause = 13, 
		RULE_dictionaryPrimaryKeyClause = 14, RULE_dictionaryArgExpr = 15, RULE_sourceClause = 16, 
		RULE_lifetimeClause = 17, RULE_layoutClause = 18, RULE_rangeClause = 19, 
		RULE_dictionarySettingsClause = 20, RULE_clusterClause = 21, RULE_uuidClause = 22, 
		RULE_destinationClause = 23, RULE_subqueryClause = 24, RULE_tableSchemaClause = 25, 
		RULE_engineClause = 26, RULE_partitionByClause = 27, RULE_primaryKeyClause = 28, 
		RULE_sampleByClause = 29, RULE_ttlClause = 30, RULE_engineExpr = 31, RULE_tableElementExpr = 32, 
		RULE_tableColumnDfnt = 33, RULE_tableColumnPropertyExpr = 34, RULE_tableIndexDfnt = 35, 
		RULE_tableProjectionDfnt = 36, RULE_codecExpr = 37, RULE_codecArgExpr = 38, 
		RULE_ttlExpr = 39, RULE_describeStmt = 40, RULE_dropStmt = 41, RULE_existsStmt = 42, 
		RULE_explainStmt = 43, RULE_insertStmt = 44, RULE_columnsClause = 45, 
		RULE_dataClause = 46, RULE_killStmt = 47, RULE_optimizeStmt = 48, RULE_renameStmt = 49, 
		RULE_projectionSelectStmt = 50, RULE_selectUnionStmt = 51, RULE_selectStmtWithParens = 52, 
		RULE_selectStmt = 53, RULE_withClause = 54, RULE_topClause = 55, RULE_fromClause = 56, 
		RULE_arrayJoinClause = 57, RULE_prewhereClause = 58, RULE_whereClause = 59, 
		RULE_groupByClause = 60, RULE_havingClause = 61, RULE_orderByClause = 62, 
		RULE_projectionOrderByClause = 63, RULE_limitByClause = 64, RULE_limitClause = 65, 
		RULE_settingsClause = 66, RULE_joinExpr = 67, RULE_joinOp = 68, RULE_joinOpCross = 69, 
		RULE_joinConstraintClause = 70, RULE_sampleClause = 71, RULE_limitExpr = 72, 
		RULE_orderExprList = 73, RULE_orderExpr = 74, RULE_ratioExpr = 75, RULE_settingExprList = 76, 
		RULE_settingExpr = 77, RULE_setStmt = 78, RULE_showStmt = 79, RULE_systemStmt = 80, 
		RULE_truncateStmt = 81, RULE_useStmt = 82, RULE_watchStmt = 83, RULE_columnTypeExpr = 84, 
		RULE_columnExprList = 85, RULE_columnsExpr = 86, RULE_columnExpr = 87, 
		RULE_columnArgList = 88, RULE_columnArgExpr = 89, RULE_columnLambdaExpr = 90, 
		RULE_columnIdentifier = 91, RULE_nestedIdentifier = 92, RULE_tableExpr = 93, 
		RULE_tableFunctionExpr = 94, RULE_tableIdentifier = 95, RULE_tableArgList = 96, 
		RULE_tableArgExpr = 97, RULE_databaseIdentifier = 98, RULE_floatingLiteral = 99, 
		RULE_numberLiteral = 100, RULE_literal = 101, RULE_interval = 102, RULE_keyword = 103, 
		RULE_keywordForAlias = 104, RULE_alias = 105, RULE_identifier = 106, RULE_identifierOrNull = 107, 
		RULE_enumValue = 108;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryStmt", "query", "alterStmt", "alterTableClause", "assignmentExprList", 
			"assignmentExpr", "tableColumnPropertyType", "partitionClause", "attachStmt", 
			"checkStmt", "createStmt", "dictionarySchemaClause", "dictionaryAttrDfnt", 
			"dictionaryEngineClause", "dictionaryPrimaryKeyClause", "dictionaryArgExpr", 
			"sourceClause", "lifetimeClause", "layoutClause", "rangeClause", "dictionarySettingsClause", 
			"clusterClause", "uuidClause", "destinationClause", "subqueryClause", 
			"tableSchemaClause", "engineClause", "partitionByClause", "primaryKeyClause", 
			"sampleByClause", "ttlClause", "engineExpr", "tableElementExpr", "tableColumnDfnt", 
			"tableColumnPropertyExpr", "tableIndexDfnt", "tableProjectionDfnt", "codecExpr", 
			"codecArgExpr", "ttlExpr", "describeStmt", "dropStmt", "existsStmt", 
			"explainStmt", "insertStmt", "columnsClause", "dataClause", "killStmt", 
			"optimizeStmt", "renameStmt", "projectionSelectStmt", "selectUnionStmt", 
			"selectStmtWithParens", "selectStmt", "withClause", "topClause", "fromClause", 
			"arrayJoinClause", "prewhereClause", "whereClause", "groupByClause", 
			"havingClause", "orderByClause", "projectionOrderByClause", "limitByClause", 
			"limitClause", "settingsClause", "joinExpr", "joinOp", "joinOpCross", 
			"joinConstraintClause", "sampleClause", "limitExpr", "orderExprList", 
			"orderExpr", "ratioExpr", "settingExprList", "settingExpr", "setStmt", 
			"showStmt", "systemStmt", "truncateStmt", "useStmt", "watchStmt", "columnTypeExpr", 
			"columnExprList", "columnsExpr", "columnExpr", "columnArgList", "columnArgExpr", 
			"columnLambdaExpr", "columnIdentifier", "nestedIdentifier", "tableExpr", 
			"tableFunctionExpr", "tableIdentifier", "tableArgList", "tableArgExpr", 
			"databaseIdentifier", "floatingLiteral", "numberLiteral", "literal", 
			"interval", "keyword", "keywordForAlias", "alias", "identifier", "identifierOrNull", 
			"enumValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'false'", "'true'", null, null, null, null, null, null, 
			"'->'", "'*'", "'`'", "'\\'", "':'", "','", "'||'", "'-'", "'.'", "'=='", 
			"'='", "'>='", "'>'", "'{'", "'['", "'<='", "'('", "'<'", null, "'%'", 
			"'+'", "'?'", "'\"'", "'''", "'}'", "']'", "')'", "';'", "'/'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AND", "ANTI", "ANY", 
			"ARRAY", "AS", "ASCENDING", "ASOF", "AST", "ASYNC", "ATTACH", "BETWEEN", 
			"BOTH", "BY", "CASE", "CAST", "CHECK", "CLEAR", "CLUSTER", "CODEC", "COLLATE", 
			"COLUMN", "COMMENT", "CONSTRAINT", "CREATE", "CROSS", "CUBE", "DATABASE", 
			"DATABASES", "DATE", "DAY", "DEDUPLICATE", "DEFAULT", "DELAY", "DELETE", 
			"DESC", "DESCENDING", "DESCRIBE", "DETACH", "DICTIONARIES", "DICTIONARY", 
			"DISK", "DISTINCT", "DISTRIBUTED", "DROP", "ELSE", "END", "ENGINE", "EVENTS", 
			"EXISTS", "EXPLAIN", "EXPRESSION", "EXTRACT", "FETCHES", "FINAL", "FIRST", 
			"FLUSH", "FOR", "FORMAT", "FREEZE", "FROM", "FULL", "FUNCTION", "GLOBAL", 
			"GRANULARITY", "GROUP", "HAVING", "HIERARCHICAL", "HOUR", "ID", "IF", 
			"ILIKE", "IN", "INDEX", "INF", "INJECTIVE", "INNER", "INSERT", "INTERVAL", 
			"INTO", "IS", "IS_OBJECT_ID", "JOIN", "KEY", "KILL", "LAST", "LAYOUT", 
			"LEADING", "LEFT", "LIFETIME", "LIKE", "LIMIT", "LIVE", "LOCAL", "LOGS", 
			"MATERIALIZE", "MATERIALIZED", "MAX", "MERGES", "MIN", "MINUTE", "MODIFY", 
			"MONTH", "MOVE", "MUTATION", "NAN_SQL", "NO", "NOT", "NULL_SQL", "NULLS", 
			"OFFSET", "ON", "OPTIMIZE", "OR", "ORDER", "OUTER", "OUTFILE", "PARTITION", 
			"POPULATE", "PREWHERE", "PRIMARY", "PROJECTION", "QUARTER", "RANGE", 
			"RELOAD", "REMOVE", "RENAME", "REPLACE", "REPLICA", "REPLICATED", "RIGHT", 
			"ROLLUP", "SAMPLE", "SECOND", "SELECT", "SEMI", "SENDS", "SET", "SETTINGS", 
			"SHOW", "SOURCE", "START", "STOP", "SUBSTRING", "SYNC", "SYNTAX", "SYSTEM", 
			"TABLE", "TABLES", "TEMPORARY", "TEST", "THEN", "TIES", "TIMEOUT", "TIMESTAMP", 
			"TO", "TOP", "TOTALS", "TRAILING", "TRIM", "TRUNCATE", "TTL", "TYPE", 
			"UNION", "UPDATE", "USE", "USING", "UUID", "VALUES", "VIEW", "VOLUME", 
			"WATCH", "WEEK", "WHEN", "WHERE", "WITH", "YEAR", "JSON_FALSE", "JSON_TRUE", 
			"IDENTIFIER", "FLOATING_LITERAL", "OCTAL_LITERAL", "DECIMAL_LITERAL", 
			"HEXADECIMAL_LITERAL", "STRING_LITERAL", "ARROW", "ASTERISK", "BACKQUOTE", 
			"BACKSLASH", "COLON", "COMMA", "CONCAT", "DASH", "DOT", "EQ_DOUBLE", 
			"EQ_SINGLE", "GE", "GT", "LBRACE", "LBRACKET", "LE", "LPAREN", "LT", 
			"NOT_EQ", "PERCENT", "PLUS", "QUERY", "QUOTE_DOUBLE", "QUOTE_SINGLE", 
			"RBRACE", "RBRACKET", "RPAREN", "SEMICOLON", "SLASH", "UNDERSCORE", "MULTI_LINE_COMMENT", 
			"SINGLE_LINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ClickHouseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClickHouseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryStmtContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public QueryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterQueryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitQueryStmt(this);
		}
	}

	public final QueryStmtContext queryStmt() throws RecognitionException {
		QueryStmtContext _localctx = new QueryStmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStmt);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
			case ATTACH:
			case CHECK:
			case CREATE:
			case DESC:
			case DESCRIBE:
			case DETACH:
			case DROP:
			case EXISTS:
			case EXPLAIN:
			case KILL:
			case OPTIMIZE:
			case RENAME:
			case SELECT:
			case SET:
			case SHOW:
			case SYSTEM:
			case TRUNCATE:
			case USE:
			case WATCH:
			case WITH:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				query();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(219);
					match(INTO);
					setState(220);
					match(OUTFILE);
					setState(221);
					match(STRING_LITERAL);
					}
				}

				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORMAT) {
					{
					setState(224);
					match(FORMAT);
					setState(225);
					identifierOrNull();
					}
				}

				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(228);
					match(SEMICOLON);
					}
				}

				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				insertStmt();
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

	public static class QueryContext extends ParserRuleContext {
		public AlterStmtContext alterStmt() {
			return getRuleContext(AlterStmtContext.class,0);
		}
		public AttachStmtContext attachStmt() {
			return getRuleContext(AttachStmtContext.class,0);
		}
		public CheckStmtContext checkStmt() {
			return getRuleContext(CheckStmtContext.class,0);
		}
		public CreateStmtContext createStmt() {
			return getRuleContext(CreateStmtContext.class,0);
		}
		public DescribeStmtContext describeStmt() {
			return getRuleContext(DescribeStmtContext.class,0);
		}
		public DropStmtContext dropStmt() {
			return getRuleContext(DropStmtContext.class,0);
		}
		public ExistsStmtContext existsStmt() {
			return getRuleContext(ExistsStmtContext.class,0);
		}
		public ExplainStmtContext explainStmt() {
			return getRuleContext(ExplainStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public OptimizeStmtContext optimizeStmt() {
			return getRuleContext(OptimizeStmtContext.class,0);
		}
		public RenameStmtContext renameStmt() {
			return getRuleContext(RenameStmtContext.class,0);
		}
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public ShowStmtContext showStmt() {
			return getRuleContext(ShowStmtContext.class,0);
		}
		public SystemStmtContext systemStmt() {
			return getRuleContext(SystemStmtContext.class,0);
		}
		public TruncateStmtContext truncateStmt() {
			return getRuleContext(TruncateStmtContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public WatchStmtContext watchStmt() {
			return getRuleContext(WatchStmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				alterStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				attachStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				checkStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				createStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				describeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				dropStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				existsStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				explainStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(242);
				killStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(243);
				optimizeStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(244);
				renameStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(245);
				selectUnionStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(246);
				setStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(247);
				showStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(248);
				systemStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(249);
				truncateStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(250);
				useStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(251);
				watchStmt();
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

	public static class AlterStmtContext extends ParserRuleContext {
		public AlterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStmt; }
	 
		public AlterStmtContext() { }
		public void copyFrom(AlterStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableStmtContext extends AlterStmtContext {
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<AlterTableClauseContext> alterTableClause() {
			return getRuleContexts(AlterTableClauseContext.class);
		}
		public AlterTableClauseContext alterTableClause(int i) {
			return getRuleContext(AlterTableClauseContext.class,i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AlterTableStmtContext(AlterStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableStmt(this);
		}
	}

	public final AlterStmtContext alterStmt() throws RecognitionException {
		AlterStmtContext _localctx = new AlterStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterStmt);
		int _la;
		try {
			_localctx = new AlterTableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ALTER);
			setState(255);
			match(TABLE);
			setState(256);
			tableIdentifier();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(257);
				clusterClause();
				}
			}

			setState(260);
			alterTableClause();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				alterTableClause();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AlterTableClauseContext extends ParserRuleContext {
		public AlterTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableClause; }
	 
		public AlterTableClauseContext() { }
		public void copyFrom(AlterTableClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableClauseReplaceContext extends AlterTableClauseContext {
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseReplaceContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseReplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseReplace(this);
		}
	}
	public static class AlterTableClauseModifyOrderByContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseModifyOrderByContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyOrderBy(this);
		}
	}
	public static class AlterTableClauseUpdateContext extends AlterTableClauseContext {
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public AssignmentExprListContext assignmentExprList() {
			return getRuleContext(AssignmentExprListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AlterTableClauseUpdateContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseUpdate(this);
		}
	}
	public static class AlterTableClauseClearProjectionContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseClearProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseClearProjection(this);
		}
	}
	public static class AlterTableClauseModifyRemoveContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TableColumnPropertyTypeContext tableColumnPropertyType() {
			return getRuleContext(TableColumnPropertyTypeContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyRemoveContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyRemove(this);
		}
	}
	public static class AlterTableClauseDeleteContext extends AlterTableClauseContext {
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseDeleteContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDelete(this);
		}
	}
	public static class AlterTableClauseCommentContext extends AlterTableClauseContext {
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseComment(this);
		}
	}
	public static class AlterTableClauseDropColumnContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropColumn(this);
		}
	}
	public static class AlterTableClauseDetachContext extends AlterTableClauseContext {
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDetachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDetach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDetach(this);
		}
	}
	public static class AlterTableClauseAddIndexContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAddIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAddIndex(this);
		}
	}
	public static class AlterTableClauseDropPartitionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDropPartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropPartition(this);
		}
	}
	public static class AlterTableClauseMaterializeIndexContext extends AlterTableClauseContext {
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseMaterializeIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseMaterializeIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseMaterializeIndex(this);
		}
	}
	public static class AlterTableClauseMaterializeProjectionContext extends AlterTableClauseContext {
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseMaterializeProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseMaterializeProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseMaterializeProjection(this);
		}
	}
	public static class AlterTableClauseMovePartitionContext extends AlterTableClauseContext {
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseMovePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseMovePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseMovePartition(this);
		}
	}
	public static class AlterTableClauseRenameContext extends AlterTableClauseContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseRenameContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseRename(this);
		}
	}
	public static class AlterTableClauseFreezePartitionContext extends AlterTableClauseContext {
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseFreezePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseFreezePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseFreezePartition(this);
		}
	}
	public static class AlterTableClauseClearColumnContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseClearColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseClearColumn(this);
		}
	}
	public static class AlterTableClauseModifyContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModify(this);
		}
	}
	public static class AlterTableClauseClearIndexContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseClearIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseClearIndex(this);
		}
	}
	public static class AlterTableClauseRemoveTTLContext extends AlterTableClauseContext {
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public AlterTableClauseRemoveTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseRemoveTTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseRemoveTTL(this);
		}
	}
	public static class AlterTableClauseModifyCodecContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCodecContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyCodec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyCodec(this);
		}
	}
	public static class AlterTableClauseAttachContext extends AlterTableClauseContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseAttachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAttach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAttach(this);
		}
	}
	public static class AlterTableClauseDropProjectionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropProjection(this);
		}
	}
	public static class AlterTableClauseDropIndexContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropIndex(this);
		}
	}
	public static class AlterTableClauseModifyCommentContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyComment(this);
		}
	}
	public static class AlterTableClauseModifyTTLContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TtlClauseContext ttlClause() {
			return getRuleContext(TtlClauseContext.class,0);
		}
		public AlterTableClauseModifyTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyTTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyTTL(this);
		}
	}
	public static class AlterTableClauseAddProjectionContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public TableProjectionDfntContext tableProjectionDfnt() {
			return getRuleContext(TableProjectionDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAddProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAddProjection(this);
		}
	}
	public static class AlterTableClauseAddColumnContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAddColumn(this);
		}
	}

	public final AlterTableClauseContext alterTableClause() throws RecognitionException {
		AlterTableClauseContext _localctx = new AlterTableClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterTableClause);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new AlterTableClauseAddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(ADD);
				setState(269);
				match(COLUMN);
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(270);
					match(IF);
					setState(271);
					match(NOT);
					setState(272);
					match(EXISTS);
					}
					break;
				}
				setState(275);
				tableColumnDfnt();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(276);
					match(AFTER);
					setState(277);
					nestedIdentifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new AlterTableClauseAddIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(ADD);
				setState(281);
				match(INDEX);
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(282);
					match(IF);
					setState(283);
					match(NOT);
					setState(284);
					match(EXISTS);
					}
					break;
				}
				setState(287);
				tableIndexDfnt();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(288);
					match(AFTER);
					setState(289);
					nestedIdentifier();
					}
				}

				}
				break;
			case 3:
				_localctx = new AlterTableClauseAddProjectionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(ADD);
				setState(293);
				match(PROJECTION);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(294);
					match(IF);
					setState(295);
					match(NOT);
					setState(296);
					match(EXISTS);
					}
					break;
				}
				setState(299);
				tableProjectionDfnt();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(300);
					match(AFTER);
					setState(301);
					nestedIdentifier();
					}
				}

				}
				break;
			case 4:
				_localctx = new AlterTableClauseAttachContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(ATTACH);
				setState(305);
				partitionClause();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(306);
					match(FROM);
					setState(307);
					tableIdentifier();
					}
				}

				}
				break;
			case 5:
				_localctx = new AlterTableClauseClearColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(CLEAR);
				setState(311);
				match(COLUMN);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(312);
					match(IF);
					setState(313);
					match(EXISTS);
					}
					break;
				}
				setState(316);
				nestedIdentifier();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(317);
					match(IN);
					setState(318);
					partitionClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new AlterTableClauseClearIndexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				match(CLEAR);
				setState(322);
				match(INDEX);
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(323);
					match(IF);
					setState(324);
					match(EXISTS);
					}
					break;
				}
				setState(327);
				nestedIdentifier();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(328);
					match(IN);
					setState(329);
					partitionClause();
					}
				}

				}
				break;
			case 7:
				_localctx = new AlterTableClauseClearProjectionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				match(CLEAR);
				setState(333);
				match(PROJECTION);
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(334);
					match(IF);
					setState(335);
					match(EXISTS);
					}
					break;
				}
				setState(338);
				nestedIdentifier();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(339);
					match(IN);
					setState(340);
					partitionClause();
					}
				}

				}
				break;
			case 8:
				_localctx = new AlterTableClauseCommentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(343);
				match(COMMENT);
				setState(344);
				match(COLUMN);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(345);
					match(IF);
					setState(346);
					match(EXISTS);
					}
					break;
				}
				setState(349);
				nestedIdentifier();
				setState(350);
				match(STRING_LITERAL);
				}
				break;
			case 9:
				_localctx = new AlterTableClauseDeleteContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(352);
				match(DELETE);
				setState(353);
				match(WHERE);
				setState(354);
				columnExpr(0);
				}
				break;
			case 10:
				_localctx = new AlterTableClauseDetachContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(355);
				match(DETACH);
				setState(356);
				partitionClause();
				}
				break;
			case 11:
				_localctx = new AlterTableClauseDropColumnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(357);
				match(DROP);
				setState(358);
				match(COLUMN);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(359);
					match(IF);
					setState(360);
					match(EXISTS);
					}
					break;
				}
				setState(363);
				nestedIdentifier();
				}
				break;
			case 12:
				_localctx = new AlterTableClauseDropIndexContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(364);
				match(DROP);
				setState(365);
				match(INDEX);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(366);
					match(IF);
					setState(367);
					match(EXISTS);
					}
					break;
				}
				setState(370);
				nestedIdentifier();
				}
				break;
			case 13:
				_localctx = new AlterTableClauseDropProjectionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(371);
				match(DROP);
				setState(372);
				match(PROJECTION);
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(373);
					match(IF);
					setState(374);
					match(EXISTS);
					}
					break;
				}
				setState(377);
				nestedIdentifier();
				}
				break;
			case 14:
				_localctx = new AlterTableClauseDropPartitionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(378);
				match(DROP);
				setState(379);
				partitionClause();
				}
				break;
			case 15:
				_localctx = new AlterTableClauseFreezePartitionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(380);
				match(FREEZE);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(381);
					partitionClause();
					}
				}

				}
				break;
			case 16:
				_localctx = new AlterTableClauseMaterializeIndexContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(384);
				match(MATERIALIZE);
				setState(385);
				match(INDEX);
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(386);
					match(IF);
					setState(387);
					match(EXISTS);
					}
					break;
				}
				setState(390);
				nestedIdentifier();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(391);
					match(IN);
					setState(392);
					partitionClause();
					}
				}

				}
				break;
			case 17:
				_localctx = new AlterTableClauseMaterializeProjectionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(395);
				match(MATERIALIZE);
				setState(396);
				match(PROJECTION);
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(397);
					match(IF);
					setState(398);
					match(EXISTS);
					}
					break;
				}
				setState(401);
				nestedIdentifier();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(402);
					match(IN);
					setState(403);
					partitionClause();
					}
				}

				}
				break;
			case 18:
				_localctx = new AlterTableClauseModifyCodecContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(406);
				match(MODIFY);
				setState(407);
				match(COLUMN);
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(408);
					match(IF);
					setState(409);
					match(EXISTS);
					}
					break;
				}
				setState(412);
				nestedIdentifier();
				setState(413);
				codecExpr();
				}
				break;
			case 19:
				_localctx = new AlterTableClauseModifyCommentContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(415);
				match(MODIFY);
				setState(416);
				match(COLUMN);
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(417);
					match(IF);
					setState(418);
					match(EXISTS);
					}
					break;
				}
				setState(421);
				nestedIdentifier();
				setState(422);
				match(COMMENT);
				setState(423);
				match(STRING_LITERAL);
				}
				break;
			case 20:
				_localctx = new AlterTableClauseModifyRemoveContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(425);
				match(MODIFY);
				setState(426);
				match(COLUMN);
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(427);
					match(IF);
					setState(428);
					match(EXISTS);
					}
					break;
				}
				setState(431);
				nestedIdentifier();
				setState(432);
				match(REMOVE);
				setState(433);
				tableColumnPropertyType();
				}
				break;
			case 21:
				_localctx = new AlterTableClauseModifyContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(435);
				match(MODIFY);
				setState(436);
				match(COLUMN);
				setState(439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(437);
					match(IF);
					setState(438);
					match(EXISTS);
					}
					break;
				}
				setState(441);
				tableColumnDfnt();
				}
				break;
			case 22:
				_localctx = new AlterTableClauseModifyOrderByContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(442);
				match(MODIFY);
				setState(443);
				match(ORDER);
				setState(444);
				match(BY);
				setState(445);
				columnExpr(0);
				}
				break;
			case 23:
				_localctx = new AlterTableClauseModifyTTLContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(446);
				match(MODIFY);
				setState(447);
				ttlClause();
				}
				break;
			case 24:
				_localctx = new AlterTableClauseMovePartitionContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(448);
				match(MOVE);
				setState(449);
				partitionClause();
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(450);
					match(TO);
					setState(451);
					match(DISK);
					setState(452);
					match(STRING_LITERAL);
					}
					break;
				case 2:
					{
					setState(453);
					match(TO);
					setState(454);
					match(VOLUME);
					setState(455);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(456);
					match(TO);
					setState(457);
					match(TABLE);
					setState(458);
					tableIdentifier();
					}
					break;
				}
				}
				break;
			case 25:
				_localctx = new AlterTableClauseRemoveTTLContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(461);
				match(REMOVE);
				setState(462);
				match(TTL);
				}
				break;
			case 26:
				_localctx = new AlterTableClauseRenameContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(463);
				match(RENAME);
				setState(464);
				match(COLUMN);
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(465);
					match(IF);
					setState(466);
					match(EXISTS);
					}
					break;
				}
				setState(469);
				nestedIdentifier();
				setState(470);
				match(TO);
				setState(471);
				nestedIdentifier();
				}
				break;
			case 27:
				_localctx = new AlterTableClauseReplaceContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(473);
				match(REPLACE);
				setState(474);
				partitionClause();
				setState(475);
				match(FROM);
				setState(476);
				tableIdentifier();
				}
				break;
			case 28:
				_localctx = new AlterTableClauseUpdateContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(478);
				match(UPDATE);
				setState(479);
				assignmentExprList();
				setState(480);
				whereClause();
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

	public static class AssignmentExprListContext extends ParserRuleContext {
		public List<AssignmentExprContext> assignmentExpr() {
			return getRuleContexts(AssignmentExprContext.class);
		}
		public AssignmentExprContext assignmentExpr(int i) {
			return getRuleContext(AssignmentExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AssignmentExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAssignmentExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAssignmentExprList(this);
		}
	}

	public final AssignmentExprListContext assignmentExprList() throws RecognitionException {
		AssignmentExprListContext _localctx = new AssignmentExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			assignmentExpr();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(485);
				match(COMMA);
				setState(486);
				assignmentExpr();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AssignmentExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAssignmentExpr(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			nestedIdentifier();
			setState(493);
			match(EQ_SINGLE);
			setState(494);
			columnExpr(0);
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

	public static class TableColumnPropertyTypeContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TableColumnPropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnPropertyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnPropertyType(this);
		}
	}

	public final TableColumnPropertyTypeContext tableColumnPropertyType() throws RecognitionException {
		TableColumnPropertyTypeContext _localctx = new TableColumnPropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableColumnPropertyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << CODEC) | (1L << COMMENT) | (1L << DEFAULT))) != 0) || _la==MATERIALIZED || _la==TTL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPartitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPartitionClause(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partitionClause);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(PARTITION);
				setState(499);
				columnExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(PARTITION);
				setState(501);
				match(ID);
				setState(502);
				match(STRING_LITERAL);
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

	public static class AttachStmtContext extends ParserRuleContext {
		public AttachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachStmt; }
	 
		public AttachStmtContext() { }
		public void copyFrom(AttachStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttachDictionaryStmtContext extends AttachStmtContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public AttachDictionaryStmtContext(AttachStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAttachDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAttachDictionaryStmt(this);
		}
	}

	public final AttachStmtContext attachStmt() throws RecognitionException {
		AttachStmtContext _localctx = new AttachStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attachStmt);
		int _la;
		try {
			_localctx = new AttachDictionaryStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(ATTACH);
			setState(506);
			match(DICTIONARY);
			setState(507);
			tableIdentifier();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(508);
				clusterClause();
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

	public static class CheckStmtContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public CheckStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCheckStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCheckStmt(this);
		}
	}

	public final CheckStmtContext checkStmt() throws RecognitionException {
		CheckStmtContext _localctx = new CheckStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_checkStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(CHECK);
			setState(512);
			match(TABLE);
			setState(513);
			tableIdentifier();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(514);
				partitionClause();
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

	public static class CreateStmtContext extends ParserRuleContext {
		public CreateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStmt; }
	 
		public CreateStmtContext() { }
		public void copyFrom(CreateStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateViewStmtContext extends CreateStmtContext {
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public CreateViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateViewStmt(this);
		}
	}
	public static class CreateDictionaryStmtContext extends CreateStmtContext {
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DictionarySchemaClauseContext dictionarySchemaClause() {
			return getRuleContext(DictionarySchemaClauseContext.class,0);
		}
		public DictionaryEngineClauseContext dictionaryEngineClause() {
			return getRuleContext(DictionaryEngineClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public CreateDictionaryStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateDictionaryStmt(this);
		}
	}
	public static class CreateDatabaseStmtContext extends CreateStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public CreateDatabaseStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateDatabaseStmt(this);
		}
	}
	public static class CreateLiveViewStmtContext extends CreateStmtContext {
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public CreateLiveViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateLiveViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateLiveViewStmt(this);
		}
	}
	public static class CreateMaterializedViewStmtContext extends CreateStmtContext {
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public CreateMaterializedViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateMaterializedViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateMaterializedViewStmt(this);
		}
	}
	public static class CreateTableStmtContext extends CreateStmtContext {
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public CreateTableStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateTableStmt(this);
		}
	}

	public final CreateStmtContext createStmt() throws RecognitionException {
		CreateStmtContext _localctx = new CreateStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createStmt);
		int _la;
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new CreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(518);
				match(DATABASE);
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(519);
					match(IF);
					setState(520);
					match(NOT);
					setState(521);
					match(EXISTS);
					}
					break;
				}
				setState(524);
				databaseIdentifier();
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(525);
					clusterClause();
					}
				}

				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(528);
					engineExpr();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				match(DICTIONARY);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(533);
					match(IF);
					setState(534);
					match(NOT);
					setState(535);
					match(EXISTS);
					}
					break;
				}
				setState(538);
				tableIdentifier();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(539);
					uuidClause();
					}
				}

				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(542);
					clusterClause();
					}
				}

				setState(545);
				dictionarySchemaClause();
				setState(546);
				dictionaryEngineClause();
				}
				break;
			case 3:
				_localctx = new CreateLiveViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(549);
				match(LIVE);
				setState(550);
				match(VIEW);
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(551);
					match(IF);
					setState(552);
					match(NOT);
					setState(553);
					match(EXISTS);
					}
					break;
				}
				setState(556);
				tableIdentifier();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(557);
					uuidClause();
					}
				}

				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(560);
					clusterClause();
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(563);
					match(WITH);
					setState(564);
					match(TIMEOUT);
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DECIMAL_LITERAL) {
						{
						setState(565);
						match(DECIMAL_LITERAL);
						}
					}

					}
				}

				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(570);
					destinationClause();
					}
				}

				setState(574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(573);
					tableSchemaClause();
					}
					break;
				}
				setState(576);
				subqueryClause();
				}
				break;
			case 4:
				_localctx = new CreateMaterializedViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(579);
				match(MATERIALIZED);
				setState(580);
				match(VIEW);
				setState(584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(581);
					match(IF);
					setState(582);
					match(NOT);
					setState(583);
					match(EXISTS);
					}
					break;
				}
				setState(586);
				tableIdentifier();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(587);
					uuidClause();
					}
				}

				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(590);
					clusterClause();
					}
				}

				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==LPAREN) {
					{
					setState(593);
					tableSchemaClause();
					}
				}

				setState(601);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TO:
					{
					setState(596);
					destinationClause();
					}
					break;
				case ENGINE:
					{
					setState(597);
					engineClause();
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POPULATE) {
						{
						setState(598);
						match(POPULATE);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(603);
				subqueryClause();
				}
				break;
			case 5:
				_localctx = new CreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(606);
					match(TEMPORARY);
					}
				}

				setState(609);
				match(TABLE);
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(610);
					match(IF);
					setState(611);
					match(NOT);
					setState(612);
					match(EXISTS);
					}
					break;
				}
				setState(615);
				tableIdentifier();
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(616);
					uuidClause();
					}
				}

				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(619);
					clusterClause();
					}
				}

				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(622);
					tableSchemaClause();
					}
					break;
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(625);
					engineClause();
					}
				}

				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(628);
					subqueryClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(631);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(632);
					match(OR);
					setState(633);
					match(REPLACE);
					}
				}

				setState(636);
				match(VIEW);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(637);
					match(IF);
					setState(638);
					match(NOT);
					setState(639);
					match(EXISTS);
					}
					break;
				}
				setState(642);
				tableIdentifier();
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(643);
					uuidClause();
					}
				}

				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(646);
					clusterClause();
					}
				}

				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(649);
					tableSchemaClause();
					}
					break;
				}
				setState(652);
				subqueryClause();
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

	public static class DictionarySchemaClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<DictionaryAttrDfntContext> dictionaryAttrDfnt() {
			return getRuleContexts(DictionaryAttrDfntContext.class);
		}
		public DictionaryAttrDfntContext dictionaryAttrDfnt(int i) {
			return getRuleContext(DictionaryAttrDfntContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public DictionarySchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySchemaClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionarySchemaClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionarySchemaClause(this);
		}
	}

	public final DictionarySchemaClauseContext dictionarySchemaClause() throws RecognitionException {
		DictionarySchemaClauseContext _localctx = new DictionarySchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dictionarySchemaClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(LPAREN);
			setState(657);
			dictionaryAttrDfnt();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(658);
				match(COMMA);
				setState(659);
				dictionaryAttrDfnt();
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			match(RPAREN);
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

	public static class DictionaryAttrDfntContext extends ParserRuleContext {
		Set<String> attrs = new HashSet();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(ClickHouseParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(ClickHouseParser.DEFAULT, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> EXPRESSION() { return getTokens(ClickHouseParser.EXPRESSION); }
		public TerminalNode EXPRESSION(int i) {
			return getToken(ClickHouseParser.EXPRESSION, i);
		}
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> HIERARCHICAL() { return getTokens(ClickHouseParser.HIERARCHICAL); }
		public TerminalNode HIERARCHICAL(int i) {
			return getToken(ClickHouseParser.HIERARCHICAL, i);
		}
		public List<TerminalNode> INJECTIVE() { return getTokens(ClickHouseParser.INJECTIVE); }
		public TerminalNode INJECTIVE(int i) {
			return getToken(ClickHouseParser.INJECTIVE, i);
		}
		public List<TerminalNode> IS_OBJECT_ID() { return getTokens(ClickHouseParser.IS_OBJECT_ID); }
		public TerminalNode IS_OBJECT_ID(int i) {
			return getToken(ClickHouseParser.IS_OBJECT_ID, i);
		}
		public DictionaryAttrDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryAttrDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryAttrDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryAttrDfnt(this);
		}
	}

	public final DictionaryAttrDfntContext dictionaryAttrDfnt() throws RecognitionException {
		DictionaryAttrDfntContext _localctx = new DictionaryAttrDfntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dictionaryAttrDfnt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			identifier();
			setState(668);
			columnTypeExpr();
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(669);
						if (!(!_localctx.attrs.contains("default"))) throw new FailedPredicateException(this, "!$attrs.contains(\"default\")");
						setState(670);
						match(DEFAULT);
						setState(671);
						literal();
						_localctx.attrs.add("default");
						}
						break;
					case 2:
						{
						setState(674);
						if (!(!_localctx.attrs.contains("expression"))) throw new FailedPredicateException(this, "!$attrs.contains(\"expression\")");
						setState(675);
						match(EXPRESSION);
						setState(676);
						columnExpr(0);
						_localctx.attrs.add("expression");
						}
						break;
					case 3:
						{
						setState(679);
						if (!(!_localctx.attrs.contains("hierarchical"))) throw new FailedPredicateException(this, "!$attrs.contains(\"hierarchical\")");
						setState(680);
						match(HIERARCHICAL);
						_localctx.attrs.add("hierarchical");
						}
						break;
					case 4:
						{
						setState(682);
						if (!(!_localctx.attrs.contains("injective"))) throw new FailedPredicateException(this, "!$attrs.contains(\"injective\")");
						setState(683);
						match(INJECTIVE);
						_localctx.attrs.add("injective");
						}
						break;
					case 5:
						{
						setState(685);
						if (!(!_localctx.attrs.contains("is_object_id"))) throw new FailedPredicateException(this, "!$attrs.contains(\"is_object_id\")");
						setState(686);
						match(IS_OBJECT_ID);
						_localctx.attrs.add("is_object_id");
						}
						break;
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class DictionaryEngineClauseContext extends ParserRuleContext {
		Set<String> clauses = new HashSet();
		public DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() {
			return getRuleContext(DictionaryPrimaryKeyClauseContext.class,0);
		}
		public List<SourceClauseContext> sourceClause() {
			return getRuleContexts(SourceClauseContext.class);
		}
		public SourceClauseContext sourceClause(int i) {
			return getRuleContext(SourceClauseContext.class,i);
		}
		public List<LifetimeClauseContext> lifetimeClause() {
			return getRuleContexts(LifetimeClauseContext.class);
		}
		public LifetimeClauseContext lifetimeClause(int i) {
			return getRuleContext(LifetimeClauseContext.class,i);
		}
		public List<LayoutClauseContext> layoutClause() {
			return getRuleContexts(LayoutClauseContext.class);
		}
		public LayoutClauseContext layoutClause(int i) {
			return getRuleContext(LayoutClauseContext.class,i);
		}
		public List<RangeClauseContext> rangeClause() {
			return getRuleContexts(RangeClauseContext.class);
		}
		public RangeClauseContext rangeClause(int i) {
			return getRuleContext(RangeClauseContext.class,i);
		}
		public List<DictionarySettingsClauseContext> dictionarySettingsClause() {
			return getRuleContexts(DictionarySettingsClauseContext.class);
		}
		public DictionarySettingsClauseContext dictionarySettingsClause(int i) {
			return getRuleContext(DictionarySettingsClauseContext.class,i);
		}
		public DictionaryEngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryEngineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryEngineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryEngineClause(this);
		}
	}

	public final DictionaryEngineClauseContext dictionaryEngineClause() throws RecognitionException {
		DictionaryEngineClauseContext _localctx = new DictionaryEngineClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictionaryEngineClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(693);
				dictionaryPrimaryKeyClause();
				}
				break;
			}
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(716);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(696);
						if (!(!_localctx.clauses.contains("source"))) throw new FailedPredicateException(this, "!$clauses.contains(\"source\")");
						setState(697);
						sourceClause();
						_localctx.clauses.add("source");
						}
						break;
					case 2:
						{
						setState(700);
						if (!(!_localctx.clauses.contains("lifetime"))) throw new FailedPredicateException(this, "!$clauses.contains(\"lifetime\")");
						setState(701);
						lifetimeClause();
						_localctx.clauses.add("lifetime");
						}
						break;
					case 3:
						{
						setState(704);
						if (!(!_localctx.clauses.contains("layout"))) throw new FailedPredicateException(this, "!$clauses.contains(\"layout\")");
						setState(705);
						layoutClause();
						_localctx.clauses.add("layout");
						}
						break;
					case 4:
						{
						setState(708);
						if (!(!_localctx.clauses.contains("range"))) throw new FailedPredicateException(this, "!$clauses.contains(\"range\")");
						setState(709);
						rangeClause();
						_localctx.clauses.add("range");
						}
						break;
					case 5:
						{
						setState(712);
						if (!(!_localctx.clauses.contains("settings"))) throw new FailedPredicateException(this, "!$clauses.contains(\"settings\")");
						setState(713);
						dictionarySettingsClause();
						_localctx.clauses.add("settings");
						}
						break;
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	public static class DictionaryPrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public DictionaryPrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPrimaryKeyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryPrimaryKeyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryPrimaryKeyClause(this);
		}
	}

	public final DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() throws RecognitionException {
		DictionaryPrimaryKeyClauseContext _localctx = new DictionaryPrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dictionaryPrimaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(PRIMARY);
			setState(722);
			match(KEY);
			setState(723);
			columnExprList();
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

	public static class DictionaryArgExprContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionaryArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryArgExpr(this);
		}
	}

	public final DictionaryArgExprContext dictionaryArgExpr() throws RecognitionException {
		DictionaryArgExprContext _localctx = new DictionaryArgExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dictionaryArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			identifier();
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(726);
				identifier();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(727);
					match(LPAREN);
					setState(728);
					match(RPAREN);
					}
				}

				}
				break;
			case INF:
			case NAN_SQL:
			case NULL_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case STRING_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				{
				setState(731);
				literal();
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

	public static class SourceClauseContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public SourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSourceClause(this);
		}
	}

	public final SourceClauseContext sourceClause() throws RecognitionException {
		SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(SOURCE);
			setState(735);
			match(LPAREN);
			setState(736);
			identifier();
			setState(737);
			match(LPAREN);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(738);
				dictionaryArgExpr();
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(744);
			match(RPAREN);
			setState(745);
			match(RPAREN);
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

	public static class LifetimeClauseContext extends ParserRuleContext {
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public LifetimeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLifetimeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLifetimeClause(this);
		}
	}

	public final LifetimeClauseContext lifetimeClause() throws RecognitionException {
		LifetimeClauseContext _localctx = new LifetimeClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lifetimeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(LIFETIME);
			setState(748);
			match(LPAREN);
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				{
				setState(749);
				match(DECIMAL_LITERAL);
				}
				break;
			case MIN:
				{
				setState(750);
				match(MIN);
				setState(751);
				match(DECIMAL_LITERAL);
				setState(752);
				match(MAX);
				setState(753);
				match(DECIMAL_LITERAL);
				}
				break;
			case MAX:
				{
				setState(754);
				match(MAX);
				setState(755);
				match(DECIMAL_LITERAL);
				setState(756);
				match(MIN);
				setState(757);
				match(DECIMAL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(760);
			match(RPAREN);
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

	public static class LayoutClauseContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public LayoutClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLayoutClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLayoutClause(this);
		}
	}

	public final LayoutClauseContext layoutClause() throws RecognitionException {
		LayoutClauseContext _localctx = new LayoutClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_layoutClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(LAYOUT);
			setState(763);
			match(LPAREN);
			setState(764);
			identifier();
			setState(765);
			match(LPAREN);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(766);
				dictionaryArgExpr();
				}
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(772);
			match(RPAREN);
			setState(773);
			match(RPAREN);
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

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRangeClause(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(RANGE);
			setState(776);
			match(LPAREN);
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				{
				setState(777);
				match(MIN);
				setState(778);
				identifier();
				setState(779);
				match(MAX);
				setState(780);
				identifier();
				}
				break;
			case MAX:
				{
				setState(782);
				match(MAX);
				setState(783);
				identifier();
				setState(784);
				match(MIN);
				setState(785);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(789);
			match(RPAREN);
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

	public static class DictionarySettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionarySettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySettingsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionarySettingsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionarySettingsClause(this);
		}
	}

	public final DictionarySettingsClauseContext dictionarySettingsClause() throws RecognitionException {
		DictionarySettingsClauseContext _localctx = new DictionarySettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dictionarySettingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(SETTINGS);
			setState(792);
			match(LPAREN);
			setState(793);
			settingExprList();
			setState(794);
			match(RPAREN);
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

	public static class ClusterClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterClusterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitClusterClause(this);
		}
	}

	public final ClusterClauseContext clusterClause() throws RecognitionException {
		ClusterClauseContext _localctx = new ClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_clusterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(ON);
			setState(797);
			match(CLUSTER);
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(798);
				identifier();
				}
				break;
			case STRING_LITERAL:
				{
				setState(799);
				match(STRING_LITERAL);
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

	public static class UuidClauseContext extends ParserRuleContext {
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public UuidClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uuidClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterUuidClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitUuidClause(this);
		}
	}

	public final UuidClauseContext uuidClause() throws RecognitionException {
		UuidClauseContext _localctx = new UuidClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uuidClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(UUID);
			setState(803);
			match(STRING_LITERAL);
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

	public static class DestinationClauseContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DestinationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDestinationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDestinationClause(this);
		}
	}

	public final DestinationClauseContext destinationClause() throws RecognitionException {
		DestinationClauseContext _localctx = new DestinationClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_destinationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(TO);
			setState(806);
			tableIdentifier();
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

	public static class SubqueryClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SubqueryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSubqueryClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSubqueryClause(this);
		}
	}

	public final SubqueryClauseContext subqueryClause() throws RecognitionException {
		SubqueryClauseContext _localctx = new SubqueryClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subqueryClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(AS);
			setState(809);
			selectUnionStmt();
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

	public static class TableSchemaClauseContext extends ParserRuleContext {
		public TableSchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSchemaClause; }
	 
		public TableSchemaClauseContext() { }
		public void copyFrom(TableSchemaClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SchemaAsTableClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SchemaAsTableClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaAsTableClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaAsTableClause(this);
		}
	}
	public static class SchemaAsFunctionClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public SchemaAsFunctionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaAsFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaAsFunctionClause(this);
		}
	}
	public static class SchemaDescriptionClauseContext extends TableSchemaClauseContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<TableElementExprContext> tableElementExpr() {
			return getRuleContexts(TableElementExprContext.class);
		}
		public TableElementExprContext tableElementExpr(int i) {
			return getRuleContext(TableElementExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SchemaDescriptionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaDescriptionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaDescriptionClause(this);
		}
	}

	public final TableSchemaClauseContext tableSchemaClause() throws RecognitionException {
		TableSchemaClauseContext _localctx = new TableSchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableSchemaClause);
		int _la;
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new SchemaDescriptionClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				match(LPAREN);
				setState(812);
				tableElementExpr();
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(813);
					match(COMMA);
					setState(814);
					tableElementExpr();
					}
					}
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(820);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SchemaAsTableClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				match(AS);
				setState(823);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new SchemaAsFunctionClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				match(AS);
				setState(825);
				tableFunctionExpr();
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

	public static class EngineClauseContext extends ParserRuleContext {
		Set<String> clauses = new HashSet();
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public List<PartitionByClauseContext> partitionByClause() {
			return getRuleContexts(PartitionByClauseContext.class);
		}
		public PartitionByClauseContext partitionByClause(int i) {
			return getRuleContext(PartitionByClauseContext.class,i);
		}
		public List<PrimaryKeyClauseContext> primaryKeyClause() {
			return getRuleContexts(PrimaryKeyClauseContext.class);
		}
		public PrimaryKeyClauseContext primaryKeyClause(int i) {
			return getRuleContext(PrimaryKeyClauseContext.class,i);
		}
		public List<SampleByClauseContext> sampleByClause() {
			return getRuleContexts(SampleByClauseContext.class);
		}
		public SampleByClauseContext sampleByClause(int i) {
			return getRuleContext(SampleByClauseContext.class,i);
		}
		public List<TtlClauseContext> ttlClause() {
			return getRuleContexts(TtlClauseContext.class);
		}
		public TtlClauseContext ttlClause(int i) {
			return getRuleContext(TtlClauseContext.class,i);
		}
		public List<SettingsClauseContext> settingsClause() {
			return getRuleContexts(SettingsClauseContext.class);
		}
		public SettingsClauseContext settingsClause(int i) {
			return getRuleContext(SettingsClauseContext.class,i);
		}
		public EngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEngineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEngineClause(this);
		}
	}

	public final EngineClauseContext engineClause() throws RecognitionException {
		EngineClauseContext _localctx = new EngineClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_engineClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			engineExpr();
			setState(855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(853);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(829);
						if (!(!_localctx.clauses.contains("orderByClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"orderByClause\")");
						setState(830);
						orderByClause();
						_localctx.clauses.add("orderByClause");
						}
						break;
					case 2:
						{
						setState(833);
						if (!(!_localctx.clauses.contains("partitionByClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"partitionByClause\")");
						setState(834);
						partitionByClause();
						_localctx.clauses.add("partitionByClause");
						}
						break;
					case 3:
						{
						setState(837);
						if (!(!_localctx.clauses.contains("primaryKeyClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"primaryKeyClause\")");
						setState(838);
						primaryKeyClause();
						_localctx.clauses.add("primaryKeyClause");
						}
						break;
					case 4:
						{
						setState(841);
						if (!(!_localctx.clauses.contains("sampleByClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"sampleByClause\")");
						setState(842);
						sampleByClause();
						_localctx.clauses.add("sampleByClause");
						}
						break;
					case 5:
						{
						setState(845);
						if (!(!_localctx.clauses.contains("ttlClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"ttlClause\")");
						setState(846);
						ttlClause();
						_localctx.clauses.add("ttlClause");
						}
						break;
					case 6:
						{
						setState(849);
						if (!(!_localctx.clauses.contains("settingsClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"settingsClause\")");
						setState(850);
						settingsClause();
						_localctx.clauses.add("settingsClause");
						}
						break;
					}
					} 
				}
				setState(857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPartitionByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPartitionByClause(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(PARTITION);
			setState(859);
			match(BY);
			setState(860);
			columnExpr(0);
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

	public static class PrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPrimaryKeyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPrimaryKeyClause(this);
		}
	}

	public final PrimaryKeyClauseContext primaryKeyClause() throws RecognitionException {
		PrimaryKeyClauseContext _localctx = new PrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(PRIMARY);
			setState(863);
			match(KEY);
			setState(864);
			columnExpr(0);
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

	public static class SampleByClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public SampleByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSampleByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSampleByClause(this);
		}
	}

	public final SampleByClauseContext sampleByClause() throws RecognitionException {
		SampleByClauseContext _localctx = new SampleByClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sampleByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(SAMPLE);
			setState(867);
			match(BY);
			setState(868);
			columnExpr(0);
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

	public static class TtlClauseContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public List<TtlExprContext> ttlExpr() {
			return getRuleContexts(TtlExprContext.class);
		}
		public TtlExprContext ttlExpr(int i) {
			return getRuleContext(TtlExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TtlClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTtlClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTtlClause(this);
		}
	}

	public final TtlClauseContext ttlClause() throws RecognitionException {
		TtlClauseContext _localctx = new TtlClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ttlClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(TTL);
			setState(871);
			ttlExpr();
			setState(876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(872);
					match(COMMA);
					setState(873);
					ttlExpr();
					}
					} 
				}
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class EngineExprContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public EngineExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEngineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEngineExpr(this);
		}
	}

	public final EngineExprContext engineExpr() throws RecognitionException {
		EngineExprContext _localctx = new EngineExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_engineExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(ENGINE);
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_SINGLE) {
				{
				setState(880);
				match(EQ_SINGLE);
				}
			}

			setState(883);
			identifierOrNull();
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(884);
				match(LPAREN);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (DASH - 197)) | (1L << (DOT - 197)) | (1L << (LBRACKET - 197)) | (1L << (LPAREN - 197)) | (1L << (PLUS - 197)))) != 0)) {
					{
					setState(885);
					columnExprList();
					}
				}

				setState(888);
				match(RPAREN);
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

	public static class TableElementExprContext extends ParserRuleContext {
		public TableElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElementExpr; }
	 
		public TableElementExprContext() { }
		public void copyFrom(TableElementExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableElementExprProjectionContext extends TableElementExprContext {
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public TableProjectionDfntContext tableProjectionDfnt() {
			return getRuleContext(TableProjectionDfntContext.class,0);
		}
		public TableElementExprProjectionContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprProjection(this);
		}
	}
	public static class TableElementExprConstraintContext extends TableElementExprContext {
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableElementExprConstraintContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprConstraint(this);
		}
	}
	public static class TableElementExprColumnContext extends TableElementExprContext {
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TableElementExprColumnContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprColumn(this);
		}
	}
	public static class TableElementExprIndexContext extends TableElementExprContext {
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TableElementExprIndexContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprIndex(this);
		}
	}

	public final TableElementExprContext tableElementExpr() throws RecognitionException {
		TableElementExprContext _localctx = new TableElementExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableElementExpr);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new TableElementExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				tableColumnDfnt();
				}
				break;
			case 2:
				_localctx = new TableElementExprConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(CONSTRAINT);
				setState(893);
				identifier();
				setState(894);
				match(CHECK);
				setState(895);
				columnExpr(0);
				}
				break;
			case 3:
				_localctx = new TableElementExprIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(897);
				match(INDEX);
				setState(898);
				tableIndexDfnt();
				}
				break;
			case 4:
				_localctx = new TableElementExprProjectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(899);
				match(PROJECTION);
				setState(900);
				tableProjectionDfnt();
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

	public static class TableColumnDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TableColumnPropertyExprContext tableColumnPropertyExpr() {
			return getRuleContext(TableColumnPropertyExprContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableColumnDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnDfnt(this);
		}
	}

	public final TableColumnDfntContext tableColumnDfnt() throws RecognitionException {
		TableColumnDfntContext _localctx = new TableColumnDfntContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableColumnDfnt);
		int _la;
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				nestedIdentifier();
				setState(904);
				columnTypeExpr();
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) {
					{
					setState(905);
					tableColumnPropertyExpr();
					}
				}

				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(908);
					match(COMMENT);
					setState(909);
					match(STRING_LITERAL);
					}
				}

				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(912);
					codecExpr();
					}
				}

				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(915);
					match(TTL);
					setState(916);
					columnExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				nestedIdentifier();
				setState(921);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(920);
					columnTypeExpr();
					}
					break;
				}
				setState(923);
				tableColumnPropertyExpr();
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(924);
					match(COMMENT);
					setState(925);
					match(STRING_LITERAL);
					}
				}

				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(928);
					codecExpr();
					}
				}

				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(931);
					match(TTL);
					setState(932);
					columnExpr(0);
					}
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

	public static class TableColumnPropertyExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TableColumnPropertyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnPropertyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnPropertyExpr(this);
		}
	}

	public final TableColumnPropertyExprContext tableColumnPropertyExpr() throws RecognitionException {
		TableColumnPropertyExprContext _localctx = new TableColumnPropertyExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableColumnPropertyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_la = _input.LA(1);
			if ( !(_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(938);
			columnExpr(0);
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

	public static class TableIndexDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TableIndexDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableIndexDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableIndexDfnt(this);
		}
	}

	public final TableIndexDfntContext tableIndexDfnt() throws RecognitionException {
		TableIndexDfntContext _localctx = new TableIndexDfntContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableIndexDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			nestedIdentifier();
			setState(941);
			columnExpr(0);
			setState(942);
			match(TYPE);
			setState(943);
			columnTypeExpr();
			setState(944);
			match(GRANULARITY);
			setState(945);
			match(DECIMAL_LITERAL);
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

	public static class TableProjectionDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ProjectionSelectStmtContext projectionSelectStmt() {
			return getRuleContext(ProjectionSelectStmtContext.class,0);
		}
		public TableProjectionDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProjectionDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableProjectionDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableProjectionDfnt(this);
		}
	}

	public final TableProjectionDfntContext tableProjectionDfnt() throws RecognitionException {
		TableProjectionDfntContext _localctx = new TableProjectionDfntContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableProjectionDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			nestedIdentifier();
			setState(948);
			projectionSelectStmt();
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

	public static class CodecExprContext extends ParserRuleContext {
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<CodecArgExprContext> codecArgExpr() {
			return getRuleContexts(CodecArgExprContext.class);
		}
		public CodecArgExprContext codecArgExpr(int i) {
			return getRuleContext(CodecArgExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public CodecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCodecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCodecExpr(this);
		}
	}

	public final CodecExprContext codecExpr() throws RecognitionException {
		CodecExprContext _localctx = new CodecExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_codecExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(CODEC);
			setState(951);
			match(LPAREN);
			setState(952);
			codecArgExpr();
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(953);
				match(COMMA);
				setState(954);
				codecArgExpr();
				}
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
			match(RPAREN);
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

	public static class CodecArgExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public CodecArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCodecArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCodecArgExpr(this);
		}
	}

	public final CodecArgExprContext codecArgExpr() throws RecognitionException {
		CodecArgExprContext _localctx = new CodecArgExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_codecArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			identifier();
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(963);
				match(LPAREN);
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (DASH - 197)) | (1L << (DOT - 197)) | (1L << (LBRACKET - 197)) | (1L << (LPAREN - 197)) | (1L << (PLUS - 197)))) != 0)) {
					{
					setState(964);
					columnExprList();
					}
				}

				setState(967);
				match(RPAREN);
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

	public static class TtlExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TtlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTtlExpr(this);
		}
	}

	public final TtlExprContext ttlExpr() throws RecognitionException {
		TtlExprContext _localctx = new TtlExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ttlExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			columnExpr(0);
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(971);
				match(DELETE);
				}
				break;
			case 2:
				{
				setState(972);
				match(TO);
				setState(973);
				match(DISK);
				setState(974);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(975);
				match(TO);
				setState(976);
				match(VOLUME);
				setState(977);
				match(STRING_LITERAL);
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

	public static class DescribeStmtContext extends ParserRuleContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public DescribeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDescribeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDescribeStmt(this);
		}
	}

	public final DescribeStmtContext describeStmt() throws RecognitionException {
		DescribeStmtContext _localctx = new DescribeStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_describeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_la = _input.LA(1);
			if ( !(_la==DESC || _la==DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(981);
				match(TABLE);
				}
				break;
			}
			setState(984);
			tableExpr(0);
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

	public static class DropStmtContext extends ParserRuleContext {
		public DropStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStmt; }
	 
		public DropStmtContext() { }
		public void copyFrom(DropStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropDatabaseStmtContext extends DropStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public DropDatabaseStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDropDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDropDatabaseStmt(this);
		}
	}
	public static class DropTableStmtContext extends DropStmtContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DropTableStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDropTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDropTableStmt(this);
		}
	}

	public final DropStmtContext dropStmt() throws RecognitionException {
		DropStmtContext _localctx = new DropStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dropStmt);
		int _la;
		try {
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				_localctx = new DropDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(987);
				match(DATABASE);
				setState(990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(988);
					match(IF);
					setState(989);
					match(EXISTS);
					}
					break;
				}
				setState(992);
				databaseIdentifier();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(993);
					clusterClause();
					}
				}

				}
				break;
			case 2:
				_localctx = new DropTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1003);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DICTIONARY:
					{
					setState(997);
					match(DICTIONARY);
					}
					break;
				case TABLE:
				case TEMPORARY:
					{
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(998);
						match(TEMPORARY);
						}
					}

					setState(1001);
					match(TABLE);
					}
					break;
				case VIEW:
					{
					setState(1002);
					match(VIEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1005);
					match(IF);
					setState(1006);
					match(EXISTS);
					}
					break;
				}
				setState(1009);
				tableIdentifier();
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1010);
					clusterClause();
					}
				}

				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1013);
					match(NO);
					setState(1014);
					match(DELAY);
					}
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

	public static class ExistsStmtContext extends ParserRuleContext {
		public ExistsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsStmt; }
	 
		public ExistsStmtContext() { }
		public void copyFrom(ExistsStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistsTableStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public ExistsTableStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExistsTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExistsTableStmt(this);
		}
	}
	public static class ExistsDatabaseStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ExistsDatabaseStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExistsDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExistsDatabaseStmt(this);
		}
	}

	public final ExistsStmtContext existsStmt() throws RecognitionException {
		ExistsStmtContext _localctx = new ExistsStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_existsStmt);
		int _la;
		try {
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new ExistsDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				match(EXISTS);
				setState(1020);
				match(DATABASE);
				setState(1021);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ExistsTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(EXISTS);
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1023);
					match(DICTIONARY);
					}
					break;
				case 2:
					{
					setState(1025);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(1024);
						match(TEMPORARY);
						}
					}

					setState(1027);
					match(TABLE);
					}
					break;
				case 3:
					{
					setState(1028);
					match(VIEW);
					}
					break;
				}
				setState(1031);
				tableIdentifier();
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

	public static class ExplainStmtContext extends ParserRuleContext {
		public ExplainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainStmt; }
	 
		public ExplainStmtContext() { }
		public void copyFrom(ExplainStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainSyntaxStmtContext extends ExplainStmtContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainSyntaxStmtContext(ExplainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExplainSyntaxStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExplainSyntaxStmt(this);
		}
	}
	public static class ExplainASTStmtContext extends ExplainStmtContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode AST() { return getToken(ClickHouseParser.AST, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainASTStmtContext(ExplainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExplainASTStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExplainASTStmt(this);
		}
	}

	public final ExplainStmtContext explainStmt() throws RecognitionException {
		ExplainStmtContext _localctx = new ExplainStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_explainStmt);
		try {
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				_localctx = new ExplainASTStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(EXPLAIN);
				setState(1035);
				match(AST);
				setState(1036);
				query();
				}
				break;
			case 2:
				_localctx = new ExplainSyntaxStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				match(EXPLAIN);
				setState(1038);
				match(SYNTAX);
				setState(1039);
				query();
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

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public DataClauseContext dataClause() {
			return getRuleContext(DataClauseContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ColumnsClauseContext columnsClause() {
			return getRuleContext(ColumnsClauseContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitInsertStmt(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(INSERT);
			setState(1043);
			match(INTO);
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1044);
				match(TABLE);
				}
				break;
			}
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1047);
				tableIdentifier();
				}
				break;
			case 2:
				{
				setState(1048);
				match(FUNCTION);
				setState(1049);
				tableFunctionExpr();
				}
				break;
			}
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1052);
				columnsClause();
				}
				break;
			}
			setState(1055);
			dataClause();
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

	public static class ColumnsClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsClause(this);
		}
	}

	public final ColumnsClauseContext columnsClause() throws RecognitionException {
		ColumnsClauseContext _localctx = new ColumnsClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_columnsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(LPAREN);
			setState(1058);
			nestedIdentifier();
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1059);
				match(COMMA);
				setState(1060);
				nestedIdentifier();
				}
				}
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1066);
			match(RPAREN);
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

	public static class DataClauseContext extends ParserRuleContext {
		public DataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataClause; }
	 
		public DataClauseContext() { }
		public void copyFrom(DataClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataClauseValuesContext extends DataClauseContext {
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public DataClauseValuesContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseValues(this);
		}
	}
	public static class DataClauseFormatContext extends DataClauseContext {
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataClauseFormatContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseFormat(this);
		}
	}
	public static class DataClauseSelectContext extends DataClauseContext {
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ClickHouseParser.EOF, 0); }
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public DataClauseSelectContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseSelect(this);
		}
	}

	public final DataClauseContext dataClause() throws RecognitionException {
		DataClauseContext _localctx = new DataClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dataClause);
		int _la;
		try {
			setState(1077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new DataClauseFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				match(FORMAT);
				setState(1069);
				identifier();
				}
				break;
			case VALUES:
				_localctx = new DataClauseValuesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(VALUES);
				}
				break;
			case SELECT:
			case WITH:
			case LPAREN:
				_localctx = new DataClauseSelectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				selectUnionStmt();
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(1072);
					match(SEMICOLON);
					}
				}

				setState(1075);
				match(EOF);
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

	public static class KillStmtContext extends ParserRuleContext {
		public KillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStmt; }
	 
		public KillStmtContext() { }
		public void copyFrom(KillStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KillMutationStmtContext extends KillStmtContext {
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public KillMutationStmtContext(KillStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKillMutationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKillMutationStmt(this);
		}
	}

	public final KillStmtContext killStmt() throws RecognitionException {
		KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_killStmt);
		int _la;
		try {
			_localctx = new KillMutationStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(KILL);
			setState(1080);
			match(MUTATION);
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1081);
				clusterClause();
				}
			}

			setState(1084);
			whereClause();
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC || _la==SYNC || _la==TEST) {
				{
				setState(1085);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==SYNC || _la==TEST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class OptimizeStmtContext extends ParserRuleContext {
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public OptimizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimizeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOptimizeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOptimizeStmt(this);
		}
	}

	public final OptimizeStmtContext optimizeStmt() throws RecognitionException {
		OptimizeStmtContext _localctx = new OptimizeStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_optimizeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(OPTIMIZE);
			setState(1089);
			match(TABLE);
			setState(1090);
			tableIdentifier();
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1091);
				clusterClause();
				}
			}

			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1094);
				partitionClause();
				}
			}

			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(1097);
				match(FINAL);
				}
			}

			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEDUPLICATE) {
				{
				setState(1100);
				match(DEDUPLICATE);
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

	public static class RenameStmtContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(ClickHouseParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(ClickHouseParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public RenameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRenameStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRenameStmt(this);
		}
	}

	public final RenameStmtContext renameStmt() throws RecognitionException {
		RenameStmtContext _localctx = new RenameStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_renameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(RENAME);
			setState(1104);
			match(TABLE);
			setState(1105);
			tableIdentifier();
			setState(1106);
			match(TO);
			setState(1107);
			tableIdentifier();
			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1108);
				match(COMMA);
				setState(1109);
				tableIdentifier();
				setState(1110);
				match(TO);
				setState(1111);
				tableIdentifier();
				}
				}
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1118);
				clusterClause();
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

	public static class ProjectionSelectStmtContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public ProjectionOrderByClauseContext projectionOrderByClause() {
			return getRuleContext(ProjectionOrderByClauseContext.class,0);
		}
		public ProjectionSelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionSelectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterProjectionSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitProjectionSelectStmt(this);
		}
	}

	public final ProjectionSelectStmtContext projectionSelectStmt() throws RecognitionException {
		ProjectionSelectStmtContext _localctx = new ProjectionSelectStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_projectionSelectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(LPAREN);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1122);
				withClause();
				}
			}

			setState(1125);
			match(SELECT);
			setState(1126);
			columnExprList();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1127);
				groupByClause();
				}
			}

			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1130);
				projectionOrderByClause();
				}
			}

			setState(1133);
			match(RPAREN);
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

	public static class SelectUnionStmtContext extends ParserRuleContext {
		public List<SelectStmtWithParensContext> selectStmtWithParens() {
			return getRuleContexts(SelectStmtWithParensContext.class);
		}
		public SelectStmtWithParensContext selectStmtWithParens(int i) {
			return getRuleContext(SelectStmtWithParensContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(ClickHouseParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(ClickHouseParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(ClickHouseParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(ClickHouseParser.ALL, i);
		}
		public SelectUnionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectUnionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectUnionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectUnionStmt(this);
		}
	}

	public final SelectUnionStmtContext selectUnionStmt() throws RecognitionException {
		SelectUnionStmtContext _localctx = new SelectUnionStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectUnionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			selectStmtWithParens();
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1136);
				match(UNION);
				setState(1137);
				match(ALL);
				setState(1138);
				selectStmtWithParens();
				}
				}
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SelectStmtWithParensContext extends ParserRuleContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public SelectStmtWithParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmtWithParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectStmtWithParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectStmtWithParens(this);
		}
	}

	public final SelectStmtWithParensContext selectStmtWithParens() throws RecognitionException {
		SelectStmtWithParensContext _localctx = new SelectStmtWithParensContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selectStmtWithParens);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				selectStmt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				match(LPAREN);
				setState(1146);
				selectUnionStmt();
				setState(1147);
				match(RPAREN);
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

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TopClauseContext topClause() {
			return getRuleContext(TopClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public ArrayJoinClauseContext arrayJoinClause() {
			return getRuleContext(ArrayJoinClauseContext.class,0);
		}
		public PrewhereClauseContext prewhereClause() {
			return getRuleContext(PrewhereClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(ClickHouseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(ClickHouseParser.WITH, i);
		}
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitByClauseContext limitByClause() {
			return getRuleContext(LimitByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SettingsClauseContext settingsClause() {
			return getRuleContext(SettingsClauseContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectStmt(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1151);
				withClause();
				}
			}

			setState(1154);
			match(SELECT);
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1155);
				match(DISTINCT);
				}
				break;
			}
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1158);
				topClause();
				}
				break;
			}
			setState(1161);
			columnExprList();
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1162);
				fromClause();
				}
			}

			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY || _la==INNER || _la==LEFT) {
				{
				setState(1165);
				arrayJoinClause();
				}
			}

			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREWHERE) {
				{
				setState(1168);
				prewhereClause();
				}
			}

			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1171);
				whereClause();
				}
			}

			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1174);
				groupByClause();
				}
			}

			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1177);
				match(WITH);
				setState(1178);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1181);
				match(WITH);
				setState(1182);
				match(TOTALS);
				}
			}

			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1185);
				havingClause();
				}
			}

			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1188);
				orderByClause();
				}
			}

			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1191);
				limitByClause();
				}
				break;
			}
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1194);
				limitClause();
				}
			}

			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTINGS) {
				{
				setState(1197);
				settingsClause();
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

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWithClause(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(WITH);
			setState(1201);
			columnExprList();
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

	public static class TopClauseContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TopClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTopClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTopClause(this);
		}
	}

	public final TopClauseContext topClause() throws RecognitionException {
		TopClauseContext _localctx = new TopClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_topClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(TOP);
			setState(1204);
			match(DECIMAL_LITERAL);
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1205);
				match(WITH);
				setState(1206);
				match(TIES);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			match(FROM);
			setState(1210);
			joinExpr(0);
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

	public static class ArrayJoinClauseContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public ArrayJoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayJoinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterArrayJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitArrayJoinClause(this);
		}
	}

	public final ArrayJoinClauseContext arrayJoinClause() throws RecognitionException {
		ArrayJoinClauseContext _localctx = new ArrayJoinClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayJoinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INNER || _la==LEFT) {
				{
				setState(1212);
				_la = _input.LA(1);
				if ( !(_la==INNER || _la==LEFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1215);
			match(ARRAY);
			setState(1216);
			match(JOIN);
			setState(1217);
			columnExprList();
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

	public static class PrewhereClauseContext extends ParserRuleContext {
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrewhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prewhereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPrewhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPrewhereClause(this);
		}
	}

	public final PrewhereClauseContext prewhereClause() throws RecognitionException {
		PrewhereClauseContext _localctx = new PrewhereClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_prewhereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(PREWHERE);
			setState(1220);
			columnExpr(0);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(WHERE);
			setState(1223);
			columnExpr(0);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitGroupByClause(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(GROUP);
			setState(1226);
			match(BY);
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1227);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1228);
				match(LPAREN);
				setState(1229);
				columnExprList();
				setState(1230);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(1232);
				columnExprList();
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitHavingClause(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(HAVING);
			setState(1236);
			columnExpr(0);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderByClause(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(ORDER);
			setState(1239);
			match(BY);
			setState(1240);
			orderExprList();
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

	public static class ProjectionOrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ProjectionOrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionOrderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterProjectionOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitProjectionOrderByClause(this);
		}
	}

	public final ProjectionOrderByClauseContext projectionOrderByClause() throws RecognitionException {
		ProjectionOrderByClauseContext _localctx = new ProjectionOrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_projectionOrderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			match(ORDER);
			setState(1243);
			match(BY);
			setState(1244);
			columnExprList();
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

	public static class LimitByClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public LimitByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitByClause(this);
		}
	}

	public final LimitByClauseContext limitByClause() throws RecognitionException {
		LimitByClauseContext _localctx = new LimitByClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_limitByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(LIMIT);
			setState(1247);
			limitExpr();
			setState(1248);
			match(BY);
			setState(1249);
			columnExprList();
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitClause(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(LIMIT);
			setState(1252);
			limitExpr();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1253);
				match(WITH);
				setState(1254);
				match(TIES);
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

	public static class SettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingsClause(this);
		}
	}

	public final SettingsClauseContext settingsClause() throws RecognitionException {
		SettingsClauseContext _localctx = new SettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_settingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(SETTINGS);
			setState(1258);
			settingExprList();
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

	public static class JoinExprContext extends ParserRuleContext {
		public JoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinExpr; }
	 
		public JoinExprContext() { }
		public void copyFrom(JoinExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinExprOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public JoinConstraintClauseContext joinConstraintClause() {
			return getRuleContext(JoinConstraintClauseContext.class,0);
		}
		public JoinOpContext joinOp() {
			return getRuleContext(JoinOpContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public JoinExprOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprOp(this);
		}
	}
	public static class JoinExprTableContext extends JoinExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public SampleClauseContext sampleClause() {
			return getRuleContext(SampleClauseContext.class,0);
		}
		public JoinExprTableContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprTable(this);
		}
	}
	public static class JoinExprParensContext extends JoinExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinExprParensContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprParens(this);
		}
	}
	public static class JoinExprCrossOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public JoinOpCrossContext joinOpCross() {
			return getRuleContext(JoinOpCrossContext.class,0);
		}
		public JoinExprCrossOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprCrossOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprCrossOp(this);
		}
	}

	public final JoinExprContext joinExpr() throws RecognitionException {
		return joinExpr(0);
	}

	private JoinExprContext joinExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinExprContext _localctx = new JoinExprContext(_ctx, _parentState);
		JoinExprContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_joinExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				_localctx = new JoinExprTableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1261);
				tableExpr(0);
				setState(1263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1262);
					match(FINAL);
					}
					break;
				}
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1265);
					sampleClause();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new JoinExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1268);
				match(LPAREN);
				setState(1269);
				joinExpr(0);
				setState(1270);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						_localctx = new JoinExprCrossOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1274);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1275);
						joinOpCross();
						setState(1276);
						joinExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new JoinExprOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1278);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1280);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==GLOBAL || _la==LOCAL) {
							{
							setState(1279);
							_la = _input.LA(1);
							if ( !(_la==GLOBAL || _la==LOCAL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(1283);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (ALL - 4)) | (1L << (ANTI - 4)) | (1L << (ANY - 4)) | (1L << (ASOF - 4)) | (1L << (FULL - 4)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INNER - 81)) | (1L << (LEFT - 81)) | (1L << (RIGHT - 81)) | (1L << (SEMI - 81)))) != 0)) {
							{
							setState(1282);
							joinOp();
							}
						}

						setState(1285);
						match(JOIN);
						setState(1286);
						joinExpr(0);
						setState(1287);
						joinConstraintClause();
						}
						break;
					}
					} 
				}
				setState(1293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinOpContext extends ParserRuleContext {
		public JoinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOp; }
	 
		public JoinOpContext() { }
		public void copyFrom(JoinOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinOpFullContext extends JoinOpContext {
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public JoinOpFullContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpFull(this);
		}
	}
	public static class JoinOpInnerContext extends JoinOpContext {
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpInnerContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpInner(this);
		}
	}
	public static class JoinOpLeftRightContext extends JoinOpContext {
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpLeftRightContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpLeftRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpLeftRight(this);
		}
	}

	public final JoinOpContext joinOp() throws RecognitionException {
		JoinOpContext _localctx = new JoinOpContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_joinOp);
		int _la;
		try {
			setState(1337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				_localctx = new JoinOpInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1294);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1297);
					match(INNER);
					}
					break;
				case 2:
					{
					setState(1298);
					match(INNER);
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1299);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				case 3:
					{
					setState(1302);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new JoinOpLeftRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1305);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1308);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1309);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1312);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1313);
						match(OUTER);
						}
					}

					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1316);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new JoinOpFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1321);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1324);
					match(FULL);
					setState(1326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1325);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1328);
					match(FULL);
					setState(1330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1329);
						match(OUTER);
						}
					}

					setState(1333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1332);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
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

	public static class JoinOpCrossContext extends ParserRuleContext {
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public JoinOpCrossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOpCross; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpCross(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpCross(this);
		}
	}

	public final JoinOpCrossContext joinOpCross() throws RecognitionException {
		JoinOpCrossContext _localctx = new JoinOpCrossContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_joinOpCross);
		int _la;
		try {
			setState(1345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS:
			case GLOBAL:
			case LOCAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL) {
					{
					setState(1339);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1342);
				match(CROSS);
				setState(1343);
				match(JOIN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				match(COMMA);
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

	public static class JoinConstraintClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinConstraintClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinConstraintClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinConstraintClause(this);
		}
	}

	public final JoinConstraintClauseContext joinConstraintClause() throws RecognitionException {
		JoinConstraintClauseContext _localctx = new JoinConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_joinConstraintClause);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1347);
				match(ON);
				setState(1348);
				columnExprList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1349);
				match(USING);
				setState(1350);
				match(LPAREN);
				setState(1351);
				columnExprList();
				setState(1352);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1354);
				match(USING);
				setState(1355);
				columnExprList();
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

	public static class SampleClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public List<RatioExprContext> ratioExpr() {
			return getRuleContexts(RatioExprContext.class);
		}
		public RatioExprContext ratioExpr(int i) {
			return getRuleContext(RatioExprContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public SampleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSampleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSampleClause(this);
		}
	}

	public final SampleClauseContext sampleClause() throws RecognitionException {
		SampleClauseContext _localctx = new SampleClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sampleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(SAMPLE);
			setState(1359);
			ratioExpr();
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1360);
				match(OFFSET);
				setState(1361);
				ratioExpr();
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

	public static class LimitExprContext extends ParserRuleContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public LimitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitExpr(this);
		}
	}

	public final LimitExprContext limitExpr() throws RecognitionException {
		LimitExprContext _localctx = new LimitExprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_limitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			columnExpr(0);
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET || _la==COMMA) {
				{
				setState(1365);
				_la = _input.LA(1);
				if ( !(_la==OFFSET || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1366);
				columnExpr(0);
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

	public static class OrderExprListContext extends ParserRuleContext {
		public List<OrderExprContext> orderExpr() {
			return getRuleContexts(OrderExprContext.class);
		}
		public OrderExprContext orderExpr(int i) {
			return getRuleContext(OrderExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public OrderExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderExprList(this);
		}
	}

	public final OrderExprListContext orderExprList() throws RecognitionException {
		OrderExprListContext _localctx = new OrderExprListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_orderExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			orderExpr();
			setState(1374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1370);
					match(COMMA);
					setState(1371);
					orderExpr();
					}
					} 
				}
				setState(1376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
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

	public static class OrderExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderExpr(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			columnExpr(0);
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1378);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1381);
				match(NULLS);
				setState(1382);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1385);
				match(COLLATE);
				setState(1386);
				match(STRING_LITERAL);
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

	public static class RatioExprContext extends ParserRuleContext {
		public List<NumberLiteralContext> numberLiteral() {
			return getRuleContexts(NumberLiteralContext.class);
		}
		public NumberLiteralContext numberLiteral(int i) {
			return getRuleContext(NumberLiteralContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public RatioExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratioExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRatioExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRatioExpr(this);
		}
	}

	public final RatioExprContext ratioExpr() throws RecognitionException {
		RatioExprContext _localctx = new RatioExprContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ratioExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			numberLiteral();
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1390);
				match(SLASH);
				setState(1391);
				numberLiteral();
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

	public static class SettingExprListContext extends ParserRuleContext {
		public List<SettingExprContext> settingExpr() {
			return getRuleContexts(SettingExprContext.class);
		}
		public SettingExprContext settingExpr(int i) {
			return getRuleContext(SettingExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SettingExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingExprList(this);
		}
	}

	public final SettingExprListContext settingExprList() throws RecognitionException {
		SettingExprListContext _localctx = new SettingExprListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_settingExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			settingExpr();
			setState(1399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1395);
					match(COMMA);
					setState(1396);
					settingExpr();
					}
					} 
				}
				setState(1401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class SettingExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SettingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingExpr(this);
		}
	}

	public final SettingExprContext settingExpr() throws RecognitionException {
		SettingExprContext _localctx = new SettingExprContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_settingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			identifier();
			setState(1403);
			match(EQ_SINGLE);
			setState(1404);
			literal();
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

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSetStmt(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(SET);
			setState(1407);
			settingExprList();
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

	public static class ShowStmtContext extends ParserRuleContext {
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }
	 
		public ShowStmtContext() { }
		public void copyFrom(ShowStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowCreateDatabaseStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowCreateDatabaseStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateDatabaseStmt(this);
		}
	}
	public static class ShowDatabasesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public ShowDatabasesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowDatabasesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowDatabasesStmt(this);
		}
	}
	public static class ShowCreateTableStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ShowCreateTableStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateTableStmt(this);
		}
	}
	public static class ShowTablesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public ShowTablesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowTablesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowTablesStmt(this);
		}
	}
	public static class ShowDictionariesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowDictionariesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowDictionariesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowDictionariesStmt(this);
		}
	}
	public static class ShowCreateDictionaryStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateDictionaryStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateDictionaryStmt(this);
		}
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_showStmt);
		int _la;
		try {
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				_localctx = new ShowCreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				match(SHOW);
				setState(1410);
				match(CREATE);
				setState(1411);
				match(DATABASE);
				setState(1412);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ShowCreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				match(SHOW);
				setState(1414);
				match(CREATE);
				setState(1415);
				match(DICTIONARY);
				setState(1416);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new ShowCreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1417);
				match(SHOW);
				setState(1418);
				match(CREATE);
				setState(1420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1419);
					match(TEMPORARY);
					}
					break;
				}
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1422);
					match(TABLE);
					}
					break;
				}
				setState(1425);
				tableIdentifier();
				}
				break;
			case 4:
				_localctx = new ShowDatabasesStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1426);
				match(SHOW);
				setState(1427);
				match(DATABASES);
				}
				break;
			case 5:
				_localctx = new ShowDictionariesStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1428);
				match(SHOW);
				setState(1429);
				match(DICTIONARIES);
				setState(1432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1430);
					match(FROM);
					setState(1431);
					databaseIdentifier();
					}
				}

				}
				break;
			case 6:
				_localctx = new ShowTablesStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1434);
				match(SHOW);
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1435);
					match(TEMPORARY);
					}
				}

				setState(1438);
				match(TABLES);
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(1439);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1440);
					databaseIdentifier();
					}
				}

				setState(1446);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIKE:
					{
					setState(1443);
					match(LIKE);
					setState(1444);
					match(STRING_LITERAL);
					}
					break;
				case WHERE:
					{
					setState(1445);
					whereClause();
					}
					break;
				case EOF:
				case FORMAT:
				case INTO:
				case LIMIT:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(1448);
					limitClause();
					}
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

	public static class SystemStmtContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public SystemStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSystemStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSystemStmt(this);
		}
	}

	public final SystemStmtContext systemStmt() throws RecognitionException {
		SystemStmtContext _localctx = new SystemStmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_systemStmt);
		int _la;
		try {
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				match(SYSTEM);
				setState(1454);
				match(FLUSH);
				setState(1455);
				match(DISTRIBUTED);
				setState(1456);
				tableIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				match(SYSTEM);
				setState(1458);
				match(FLUSH);
				setState(1459);
				match(LOGS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
				match(SYSTEM);
				setState(1461);
				match(RELOAD);
				setState(1462);
				match(DICTIONARIES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1463);
				match(SYSTEM);
				setState(1464);
				match(RELOAD);
				setState(1465);
				match(DICTIONARY);
				setState(1466);
				tableIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1467);
				match(SYSTEM);
				setState(1468);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1476);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISTRIBUTED:
					{
					setState(1469);
					match(DISTRIBUTED);
					setState(1470);
					match(SENDS);
					}
					break;
				case FETCHES:
					{
					setState(1471);
					match(FETCHES);
					}
					break;
				case MERGES:
				case TTL:
					{
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TTL) {
						{
						setState(1472);
						match(TTL);
						}
					}

					setState(1475);
					match(MERGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1478);
				tableIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1479);
				match(SYSTEM);
				setState(1480);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1481);
				match(REPLICATED);
				setState(1482);
				match(SENDS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1483);
				match(SYSTEM);
				setState(1484);
				match(SYNC);
				setState(1485);
				match(REPLICA);
				setState(1486);
				tableIdentifier();
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

	public static class TruncateStmtContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTruncateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTruncateStmt(this);
		}
	}

	public final TruncateStmtContext truncateStmt() throws RecognitionException {
		TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_truncateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(TRUNCATE);
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1490);
				match(TEMPORARY);
				}
				break;
			}
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1493);
				match(TABLE);
				}
				break;
			}
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1496);
				match(IF);
				setState(1497);
				match(EXISTS);
				}
				break;
			}
			setState(1500);
			tableIdentifier();
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1501);
				clusterClause();
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

	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterUseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitUseStmt(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(USE);
			setState(1505);
			databaseIdentifier();
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

	public static class WatchStmtContext extends ParserRuleContext {
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public WatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_watchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWatchStmt(this);
		}
	}

	public final WatchStmtContext watchStmt() throws RecognitionException {
		WatchStmtContext _localctx = new WatchStmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_watchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(WATCH);
			setState(1508);
			tableIdentifier();
			setState(1510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENTS) {
				{
				setState(1509);
				match(EVENTS);
				}
			}

			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1512);
				match(LIMIT);
				setState(1513);
				match(DECIMAL_LITERAL);
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

	public static class ColumnTypeExprContext extends ParserRuleContext {
		public ColumnTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnTypeExpr; }
	 
		public ColumnTypeExprContext() { }
		public void copyFrom(ColumnTypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnTypeExprNestedContext extends ColumnTypeExprContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprNestedContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprNested(this);
		}
	}
	public static class ColumnTypeExprParamContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnTypeExprParamContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprParam(this);
		}
	}
	public static class ColumnTypeExprSimpleContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprSimpleContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprSimple(this);
		}
	}
	public static class ColumnTypeExprComplexContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprComplexContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprComplex(this);
		}
	}
	public static class ColumnTypeExprEnumContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprEnumContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprEnum(this);
		}
	}

	public final ColumnTypeExprContext columnTypeExpr() throws RecognitionException {
		ColumnTypeExprContext _localctx = new ColumnTypeExprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_columnTypeExpr);
		int _la;
		try {
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				_localctx = new ColumnTypeExprSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1516);
				identifier();
				}
				break;
			case 2:
				_localctx = new ColumnTypeExprNestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				identifier();
				setState(1518);
				match(LPAREN);
				setState(1519);
				identifier();
				setState(1520);
				columnTypeExpr();
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1521);
					match(COMMA);
					setState(1522);
					identifier();
					setState(1523);
					columnTypeExpr();
					}
					}
					setState(1529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1530);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnTypeExprEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				identifier();
				setState(1533);
				match(LPAREN);
				setState(1534);
				enumValue();
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1535);
					match(COMMA);
					setState(1536);
					enumValue();
					}
					}
					setState(1541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1542);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ColumnTypeExprComplexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1544);
				identifier();
				setState(1545);
				match(LPAREN);
				setState(1546);
				columnTypeExpr();
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1547);
					match(COMMA);
					setState(1548);
					columnTypeExpr();
					}
					}
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1554);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ColumnTypeExprParamContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1556);
				identifier();
				setState(1557);
				match(LPAREN);
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (DASH - 197)) | (1L << (DOT - 197)) | (1L << (LBRACKET - 197)) | (1L << (LPAREN - 197)) | (1L << (PLUS - 197)))) != 0)) {
					{
					setState(1558);
					columnExprList();
					}
				}

				setState(1561);
				match(RPAREN);
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

	public static class ColumnExprListContext extends ParserRuleContext {
		public List<ColumnsExprContext> columnsExpr() {
			return getRuleContexts(ColumnsExprContext.class);
		}
		public ColumnsExprContext columnsExpr(int i) {
			return getRuleContext(ColumnsExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprList(this);
		}
	}

	public final ColumnExprListContext columnExprList() throws RecognitionException {
		ColumnExprListContext _localctx = new ColumnExprListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_columnExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			columnsExpr();
			setState(1570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1566);
					match(COMMA);
					setState(1567);
					columnsExpr();
					}
					} 
				}
				setState(1572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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

	public static class ColumnsExprContext extends ParserRuleContext {
		public ColumnsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsExpr; }
	 
		public ColumnsExprContext() { }
		public void copyFrom(ColumnsExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnsExprColumnContext extends ColumnsExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnsExprColumnContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprColumn(this);
		}
	}
	public static class ColumnsExprAsteriskContext extends ColumnsExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnsExprAsteriskContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprAsterisk(this);
		}
	}
	public static class ColumnsExprSubqueryContext extends ColumnsExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnsExprSubqueryContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprSubquery(this);
		}
	}

	public final ColumnsExprContext columnsExpr() throws RecognitionException {
		ColumnsExprContext _localctx = new ColumnsExprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_columnsExpr);
		int _la;
		try {
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				_localctx = new ColumnsExprAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
					{
					setState(1573);
					tableIdentifier();
					setState(1574);
					match(DOT);
					}
				}

				setState(1578);
				match(ASTERISK);
				}
				break;
			case 2:
				_localctx = new ColumnsExprSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				match(LPAREN);
				setState(1580);
				selectUnionStmt();
				setState(1581);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnsExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1583);
				columnExpr(0);
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

	public static class ColumnExprContext extends ParserRuleContext {
		public ColumnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExpr; }
	 
		public ColumnExprContext() { }
		public void copyFrom(ColumnExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnExprTernaryOpContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode QUERY() { return getToken(ClickHouseParser.QUERY, 0); }
		public TerminalNode COLON() { return getToken(ClickHouseParser.COLON, 0); }
		public ColumnExprTernaryOpContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTernaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTernaryOp(this);
		}
	}
	public static class ColumnExprAliasContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnExprAliasContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAlias(this);
		}
	}
	public static class ColumnExprExtractContext extends ColumnExprContext {
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprExtractContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprExtract(this);
		}
	}
	public static class ColumnExprNegateContext extends ColumnExprContext {
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNegateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprNegate(this);
		}
	}
	public static class ColumnExprSubqueryContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprSubqueryContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprSubquery(this);
		}
	}
	public static class ColumnExprLiteralContext extends ColumnExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnExprLiteralContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprLiteral(this);
		}
	}
	public static class ColumnExprArrayContext extends ColumnExprContext {
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprArrayContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprArray(this);
		}
	}
	public static class ColumnExprSubstringContext extends ColumnExprContext {
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public ColumnExprSubstringContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprSubstring(this);
		}
	}
	public static class ColumnExprCastContext extends ColumnExprContext {
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprCastContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprCast(this);
		}
	}
	public static class ColumnExprOrContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public ColumnExprOrContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprOr(this);
		}
	}
	public static class ColumnExprPrecedence1Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ClickHouseParser.PERCENT, 0); }
		public ColumnExprPrecedence1Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence1(this);
		}
	}
	public static class ColumnExprPrecedence2Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public TerminalNode CONCAT() { return getToken(ClickHouseParser.CONCAT, 0); }
		public ColumnExprPrecedence2Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence2(this);
		}
	}
	public static class ColumnExprPrecedence3Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode EQ_DOUBLE() { return getToken(ClickHouseParser.EQ_DOUBLE, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode NOT_EQ() { return getToken(ClickHouseParser.NOT_EQ, 0); }
		public TerminalNode LE() { return getToken(ClickHouseParser.LE, 0); }
		public TerminalNode GE() { return getToken(ClickHouseParser.GE, 0); }
		public TerminalNode LT() { return getToken(ClickHouseParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClickHouseParser.GT, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprPrecedence3Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence3(this);
		}
	}
	public static class ColumnExprIntervalContext extends ColumnExprContext {
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ColumnExprIntervalContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprInterval(this);
		}
	}
	public static class ColumnExprIsNullContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprIsNullContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprIsNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprIsNull(this);
		}
	}
	public static class ColumnExprTrimContext extends ColumnExprContext {
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public ColumnExprTrimContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTrim(this);
		}
	}
	public static class ColumnExprTupleContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprTupleContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTuple(this);
		}
	}
	public static class ColumnExprArrayAccessContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprArrayAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprArrayAccess(this);
		}
	}
	public static class ColumnExprBetweenContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprBetweenContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprBetween(this);
		}
	}
	public static class ColumnExprParensContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprParensContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprParens(this);
		}
	}
	public static class ColumnExprTimestampContext extends ColumnExprContext {
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprTimestampContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTimestamp(this);
		}
	}
	public static class ColumnExprAndContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public ColumnExprAndContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAnd(this);
		}
	}
	public static class ColumnExprTupleAccessContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public ColumnExprTupleAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTupleAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTupleAccess(this);
		}
	}
	public static class ColumnExprCaseContext extends ColumnExprContext {
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(ClickHouseParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(ClickHouseParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(ClickHouseParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ClickHouseParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public ColumnExprCaseContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprCase(this);
		}
	}
	public static class ColumnExprDateContext extends ColumnExprContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprDateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprDate(this);
		}
	}
	public static class ColumnExprNotContext extends ColumnExprContext {
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNotContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprNot(this);
		}
	}
	public static class ColumnExprIdentifierContext extends ColumnExprContext {
		public ColumnIdentifierContext columnIdentifier() {
			return getRuleContext(ColumnIdentifierContext.class,0);
		}
		public ColumnExprIdentifierContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprIdentifier(this);
		}
	}
	public static class ColumnExprFunctionContext extends ColumnExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public ColumnArgListContext columnArgList() {
			return getRuleContext(ColumnArgListContext.class,0);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprFunction(this);
		}
	}
	public static class ColumnExprAsteriskContext extends ColumnExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnExprAsteriskContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAsterisk(this);
		}
	}

	public final ColumnExprContext columnExpr() throws RecognitionException {
		return columnExpr(0);
	}

	private ColumnExprContext columnExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ColumnExprContext _localctx = new ColumnExprContext(_ctx, _parentState);
		ColumnExprContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_columnExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				_localctx = new ColumnExprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1587);
				match(CASE);
				setState(1589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1588);
					columnExpr(0);
					}
					break;
				}
				setState(1596); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1591);
					match(WHEN);
					setState(1592);
					columnExpr(0);
					setState(1593);
					match(THEN);
					setState(1594);
					columnExpr(0);
					}
					}
					setState(1598); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1600);
					match(ELSE);
					setState(1601);
					columnExpr(0);
					}
				}

				setState(1604);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new ColumnExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1606);
				match(CAST);
				setState(1607);
				match(LPAREN);
				setState(1608);
				columnExpr(0);
				setState(1609);
				match(AS);
				setState(1610);
				columnTypeExpr();
				setState(1611);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ColumnExprDateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1613);
				match(DATE);
				setState(1614);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				{
				_localctx = new ColumnExprExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1615);
				match(EXTRACT);
				setState(1616);
				match(LPAREN);
				setState(1617);
				interval();
				setState(1618);
				match(FROM);
				setState(1619);
				columnExpr(0);
				setState(1620);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ColumnExprIntervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1622);
				match(INTERVAL);
				setState(1623);
				columnExpr(0);
				setState(1624);
				interval();
				}
				break;
			case 6:
				{
				_localctx = new ColumnExprSubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1626);
				match(SUBSTRING);
				setState(1627);
				match(LPAREN);
				setState(1628);
				columnExpr(0);
				setState(1629);
				match(FROM);
				setState(1630);
				columnExpr(0);
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1631);
					match(FOR);
					setState(1632);
					columnExpr(0);
					}
				}

				setState(1635);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ColumnExprTimestampContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1637);
				match(TIMESTAMP);
				setState(1638);
				match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new ColumnExprTrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1639);
				match(TRIM);
				setState(1640);
				match(LPAREN);
				setState(1641);
				_la = _input.LA(1);
				if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1642);
				match(STRING_LITERAL);
				setState(1643);
				match(FROM);
				setState(1644);
				columnExpr(0);
				setState(1645);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new ColumnExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1647);
				identifier();
				setState(1653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1648);
					match(LPAREN);
					setState(1650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (DASH - 197)) | (1L << (DOT - 197)) | (1L << (LBRACKET - 197)) | (1L << (LPAREN - 197)) | (1L << (PLUS - 197)))) != 0)) {
						{
						setState(1649);
						columnExprList();
						}
					}

					setState(1652);
					match(RPAREN);
					}
					break;
				}
				setState(1655);
				match(LPAREN);
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1656);
					match(DISTINCT);
					}
					break;
				}
				setState(1660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (DASH - 197)) | (1L << (DOT - 197)) | (1L << (LBRACKET - 197)) | (1L << (LPAREN - 197)) | (1L << (PLUS - 197)))) != 0)) {
					{
					setState(1659);
					columnArgList();
					}
				}

				setState(1662);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ColumnExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1664);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new ColumnExprNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1665);
				match(DASH);
				setState(1666);
				columnExpr(17);
				}
				break;
			case 12:
				{
				_localctx = new ColumnExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1667);
				match(NOT);
				setState(1668);
				columnExpr(12);
				}
				break;
			case 13:
				{
				_localctx = new ColumnExprAsteriskContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
					{
					setState(1669);
					tableIdentifier();
					setState(1670);
					match(DOT);
					}
				}

				setState(1674);
				match(ASTERISK);
				}
				break;
			case 14:
				{
				_localctx = new ColumnExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1675);
				match(LPAREN);
				setState(1676);
				selectUnionStmt();
				setState(1677);
				match(RPAREN);
				}
				break;
			case 15:
				{
				_localctx = new ColumnExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1679);
				match(LPAREN);
				setState(1680);
				columnExpr(0);
				setState(1681);
				match(RPAREN);
				}
				break;
			case 16:
				{
				_localctx = new ColumnExprTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1683);
				match(LPAREN);
				setState(1684);
				columnExprList();
				setState(1685);
				match(RPAREN);
				}
				break;
			case 17:
				{
				_localctx = new ColumnExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1687);
				match(LBRACKET);
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (DASH - 197)) | (1L << (DOT - 197)) | (1L << (LBRACKET - 197)) | (1L << (LPAREN - 197)) | (1L << (PLUS - 197)))) != 0)) {
					{
					setState(1688);
					columnExprList();
					}
				}

				setState(1691);
				match(RBRACKET);
				}
				break;
			case 18:
				{
				_localctx = new ColumnExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1692);
				columnIdentifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
					case 1:
						{
						_localctx = new ColumnExprPrecedence1Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1695);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1696);
						_la = _input.LA(1);
						if ( !(((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (ASTERISK - 191)) | (1L << (PERCENT - 191)) | (1L << (SLASH - 191)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1697);
						columnExpr(17);
						}
						break;
					case 2:
						{
						_localctx = new ColumnExprPrecedence2Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1698);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1699);
						_la = _input.LA(1);
						if ( !(((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (CONCAT - 196)) | (1L << (DASH - 196)) | (1L << (PLUS - 196)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1700);
						columnExpr(16);
						}
						break;
					case 3:
						{
						_localctx = new ColumnExprPrecedence3Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1701);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1720);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
						case 1:
							{
							setState(1702);
							match(EQ_DOUBLE);
							}
							break;
						case 2:
							{
							setState(1703);
							match(EQ_SINGLE);
							}
							break;
						case 3:
							{
							setState(1704);
							match(NOT_EQ);
							}
							break;
						case 4:
							{
							setState(1705);
							match(LE);
							}
							break;
						case 5:
							{
							setState(1706);
							match(GE);
							}
							break;
						case 6:
							{
							setState(1707);
							match(LT);
							}
							break;
						case 7:
							{
							setState(1708);
							match(GT);
							}
							break;
						case 8:
							{
							setState(1710);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==GLOBAL) {
								{
								setState(1709);
								match(GLOBAL);
								}
							}

							setState(1713);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1712);
								match(NOT);
								}
							}

							setState(1715);
							match(IN);
							}
							break;
						case 9:
							{
							setState(1717);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1716);
								match(NOT);
								}
							}

							setState(1719);
							_la = _input.LA(1);
							if ( !(_la==ILIKE || _la==LIKE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						setState(1722);
						columnExpr(15);
						}
						break;
					case 4:
						{
						_localctx = new ColumnExprAndContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1723);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1724);
						match(AND);
						setState(1725);
						columnExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new ColumnExprOrContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1726);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1727);
						match(OR);
						setState(1728);
						columnExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new ColumnExprBetweenContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1729);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1731);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1730);
							match(NOT);
							}
						}

						setState(1733);
						match(BETWEEN);
						setState(1734);
						columnExpr(0);
						setState(1735);
						match(AND);
						setState(1736);
						columnExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new ColumnExprTernaryOpContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1738);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1739);
						match(QUERY);
						setState(1740);
						columnExpr(0);
						setState(1741);
						match(COLON);
						setState(1742);
						columnExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new ColumnExprArrayAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1744);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1745);
						match(LBRACKET);
						setState(1746);
						columnExpr(0);
						setState(1747);
						match(RBRACKET);
						}
						break;
					case 9:
						{
						_localctx = new ColumnExprTupleAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1749);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1750);
						match(DOT);
						setState(1751);
						match(DECIMAL_LITERAL);
						}
						break;
					case 10:
						{
						_localctx = new ColumnExprIsNullContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1752);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1753);
						match(IS);
						setState(1755);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1754);
							match(NOT);
							}
						}

						setState(1757);
						match(NULL_SQL);
						}
						break;
					case 11:
						{
						_localctx = new ColumnExprAliasContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1758);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1762);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DATE:
						case FIRST:
						case ID:
						case KEY:
						case IDENTIFIER:
							{
							setState(1759);
							alias();
							}
							break;
						case AS:
							{
							setState(1760);
							match(AS);
							setState(1761);
							identifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ColumnArgListContext extends ParserRuleContext {
		public List<ColumnArgExprContext> columnArgExpr() {
			return getRuleContexts(ColumnArgExprContext.class);
		}
		public ColumnArgExprContext columnArgExpr(int i) {
			return getRuleContext(ColumnArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnArgList(this);
		}
	}

	public final ColumnArgListContext columnArgList() throws RecognitionException {
		ColumnArgListContext _localctx = new ColumnArgListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_columnArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			columnArgExpr();
			setState(1774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1770);
				match(COMMA);
				setState(1771);
				columnArgExpr();
				}
				}
				setState(1776);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ColumnArgExprContext extends ParserRuleContext {
		public ColumnLambdaExprContext columnLambdaExpr() {
			return getRuleContext(ColumnLambdaExprContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnArgExpr(this);
		}
	}

	public final ColumnArgExprContext columnArgExpr() throws RecognitionException {
		ColumnArgExprContext _localctx = new ColumnArgExprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_columnArgExpr);
		try {
			setState(1779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1777);
				columnLambdaExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				columnExpr(0);
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

	public static class ColumnLambdaExprContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ClickHouseParser.ARROW, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnLambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnLambdaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnLambdaExpr(this);
		}
	}

	public final ColumnLambdaExprContext columnLambdaExpr() throws RecognitionException {
		ColumnLambdaExprContext _localctx = new ColumnLambdaExprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_columnLambdaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1781);
				match(LPAREN);
				setState(1782);
				identifier();
				setState(1787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1783);
					match(COMMA);
					setState(1784);
					identifier();
					}
					}
					setState(1789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1790);
				match(RPAREN);
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(1792);
				identifier();
				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1793);
					match(COMMA);
					setState(1794);
					identifier();
					}
					}
					setState(1799);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1802);
			match(ARROW);
			setState(1803);
			columnExpr(0);
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

	public static class ColumnIdentifierContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnIdentifier(this);
		}
	}

	public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
		ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_columnIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1805);
				tableIdentifier();
				setState(1806);
				match(DOT);
				}
				break;
			}
			setState(1810);
			nestedIdentifier();
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

	public static class NestedIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public NestedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterNestedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitNestedIdentifier(this);
		}
	}

	public final NestedIdentifierContext nestedIdentifier() throws RecognitionException {
		NestedIdentifierContext _localctx = new NestedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_nestedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			identifier();
			setState(1815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1813);
				match(DOT);
				setState(1814);
				identifier();
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

	public static class TableExprContext extends ParserRuleContext {
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }
	 
		public TableExprContext() { }
		public void copyFrom(TableExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableExprIdentifierContext extends TableExprContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableExprIdentifierContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprIdentifier(this);
		}
	}
	public static class TableExprSubqueryContext extends TableExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableExprSubqueryContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprSubquery(this);
		}
	}
	public static class TableExprAliasContext extends TableExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableExprAliasContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprAlias(this);
		}
	}
	public static class TableExprFunctionContext extends TableExprContext {
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TableExprFunctionContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprFunction(this);
		}
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		return tableExpr(0);
	}

	private TableExprContext tableExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableExprContext _localctx = new TableExprContext(_ctx, _parentState);
		TableExprContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_tableExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				_localctx = new TableExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1818);
				tableIdentifier();
				}
				break;
			case 2:
				{
				_localctx = new TableExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1819);
				tableFunctionExpr();
				}
				break;
			case 3:
				{
				_localctx = new TableExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1820);
				match(LPAREN);
				setState(1821);
				selectUnionStmt();
				setState(1822);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TableExprAliasContext(new TableExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tableExpr);
					setState(1826);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1830);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATE:
					case FIRST:
					case ID:
					case KEY:
					case IDENTIFIER:
						{
						setState(1827);
						alias();
						}
						break;
					case AS:
						{
						setState(1828);
						match(AS);
						setState(1829);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TableFunctionExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableArgListContext tableArgList() {
			return getRuleContext(TableArgListContext.class,0);
		}
		public TableFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunctionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableFunctionExpr(this);
		}
	}

	public final TableFunctionExprContext tableFunctionExpr() throws RecognitionException {
		TableFunctionExprContext _localctx = new TableFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tableFunctionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			identifier();
			setState(1838);
			match(LPAREN);
			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (DASH - 197)) | (1L << (DOT - 197)) | (1L << (PLUS - 197)))) != 0)) {
				{
				setState(1839);
				tableArgList();
				}
			}

			setState(1842);
			match(RPAREN);
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableIdentifier(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1844);
				databaseIdentifier();
				setState(1845);
				match(DOT);
				}
				break;
			}
			setState(1849);
			identifier();
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

	public static class TableArgListContext extends ParserRuleContext {
		public List<TableArgExprContext> tableArgExpr() {
			return getRuleContexts(TableArgExprContext.class);
		}
		public TableArgExprContext tableArgExpr(int i) {
			return getRuleContext(TableArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TableArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableArgList(this);
		}
	}

	public final TableArgListContext tableArgList() throws RecognitionException {
		TableArgListContext _localctx = new TableArgListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_tableArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			tableArgExpr();
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1852);
				match(COMMA);
				setState(1853);
				tableArgExpr();
				}
				}
				setState(1858);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TableArgExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TableArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableArgExpr(this);
		}
	}

	public final TableArgExprContext tableArgExpr() throws RecognitionException {
		TableArgExprContext _localctx = new TableArgExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_tableArgExpr);
		try {
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				nestedIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1860);
				tableFunctionExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1861);
				literal();
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

	public static class DatabaseIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDatabaseIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDatabaseIdentifier(this);
		}
	}

	public final DatabaseIdentifierContext databaseIdentifier() throws RecognitionException {
		DatabaseIdentifierContext _localctx = new DatabaseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_databaseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			identifier();
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

	public static class FloatingLiteralContext extends ParserRuleContext {
		public TerminalNode FLOATING_LITERAL() { return getToken(ClickHouseParser.FLOATING_LITERAL, 0); }
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public FloatingLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFloatingLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFloatingLiteral(this);
		}
	}

	public final FloatingLiteralContext floatingLiteral() throws RecognitionException {
		FloatingLiteralContext _localctx = new FloatingLiteralContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_floatingLiteral);
		int _la;
		try {
			setState(1874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1866);
				match(FLOATING_LITERAL);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1867);
				match(DOT);
				setState(1868);
				_la = _input.LA(1);
				if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1869);
				match(DECIMAL_LITERAL);
				setState(1870);
				match(DOT);
				setState(1872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1871);
					_la = _input.LA(1);
					if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public FloatingLiteralContext floatingLiteral() {
			return getRuleContext(FloatingLiteralContext.class,0);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(ClickHouseParser.HEXADECIMAL_LITERAL, 0); }
		public TerminalNode INF() { return getToken(ClickHouseParser.INF, 0); }
		public TerminalNode NAN_SQL() { return getToken(ClickHouseParser.NAN_SQL, 0); }
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitNumberLiteral(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==PLUS) {
				{
				setState(1876);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1879);
				floatingLiteral();
				}
				break;
			case 2:
				{
				setState(1880);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				{
				setState(1881);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				{
				setState(1882);
				match(HEXADECIMAL_LITERAL);
				}
				break;
			case 5:
				{
				setState(1883);
				match(INF);
				}
				break;
			case 6:
				{
				setState(1884);
				match(NAN_SQL);
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

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_literal);
		try {
			setState(1890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INF:
			case NAN_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1888);
				match(STRING_LITERAL);
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1889);
				match(NULL_SQL);
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(ClickHouseParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(ClickHouseParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(ClickHouseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(ClickHouseParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(ClickHouseParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(ClickHouseParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(ClickHouseParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(ClickHouseParser.YEAR, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (HOUR - 73)) | (1L << (MINUTE - 73)) | (1L << (MONTH - 73)) | (1L << (QUARTER - 73)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (SECOND - 138)) | (1L << (WEEK - 138)) | (1L << (YEAR - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public TerminalNode AST() { return getToken(ClickHouseParser.AST, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode EXPRESSION() { return getToken(ClickHouseParser.EXPRESSION, 0); }
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public TerminalNode HIERARCHICAL() { return getToken(ClickHouseParser.HIERARCHICAL, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TerminalNode INJECTIVE() { return getToken(ClickHouseParser.INJECTIVE, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode IS_OBJECT_ID() { return getToken(ClickHouseParser.IS_OBJECT_ID, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode JSON_FALSE() { return getToken(ClickHouseParser.JSON_FALSE, 0); }
		public TerminalNode JSON_TRUE() { return getToken(ClickHouseParser.JSON_TRUE, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public TerminalNode THEN() { return getToken(ClickHouseParser.THEN, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public TerminalNode UNION() { return getToken(ClickHouseParser.UNION, 0); }
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TerminalNode WHEN() { return getToken(ClickHouseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class KeywordForAliasContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public KeywordForAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordForAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKeywordForAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKeywordForAlias(this);
		}
	}

	public final KeywordForAliasContext keywordForAlias() throws RecognitionException {
		KeywordForAliasContext _localctx = new KeywordForAliasContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_keywordForAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (DATE - 34)) | (1L << (FIRST - 34)) | (1L << (ID - 34)) | (1L << (KEY - 34)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public KeywordForAliasContext keywordForAlias() {
			return getRuleContext(KeywordForAliasContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_alias);
		try {
			setState(1900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				match(IDENTIFIER);
				}
				break;
			case DATE:
			case FIRST:
			case ID:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				keywordForAlias();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_identifier);
		try {
			setState(1905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1902);
				match(IDENTIFIER);
				}
				break;
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case QUARTER:
			case SECOND:
			case WEEK:
			case YEAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1903);
				interval();
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MODIFY:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WHEN:
			case WHERE:
			case WITH:
			case JSON_FALSE:
			case JSON_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1904);
				keyword();
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

	public static class IdentifierOrNullContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public IdentifierOrNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterIdentifierOrNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitIdentifierOrNull(this);
		}
	}

	public final IdentifierOrNullContext identifierOrNull() throws RecognitionException {
		IdentifierOrNullContext _localctx = new IdentifierOrNullContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_identifierOrNull);
		try {
			setState(1909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907);
				identifier();
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1908);
				match(NULL_SQL);
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

	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEnumValue(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			match(STRING_LITERAL);
			setState(1912);
			match(EQ_SINGLE);
			setState(1913);
			numberLiteral();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return dictionaryAttrDfnt_sempred((DictionaryAttrDfntContext)_localctx, predIndex);
		case 13:
			return dictionaryEngineClause_sempred((DictionaryEngineClauseContext)_localctx, predIndex);
		case 26:
			return engineClause_sempred((EngineClauseContext)_localctx, predIndex);
		case 67:
			return joinExpr_sempred((JoinExprContext)_localctx, predIndex);
		case 87:
			return columnExpr_sempred((ColumnExprContext)_localctx, predIndex);
		case 93:
			return tableExpr_sempred((TableExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dictionaryAttrDfnt_sempred(DictionaryAttrDfntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_localctx.attrs.contains("default");
		case 1:
			return !_localctx.attrs.contains("expression");
		case 2:
			return !_localctx.attrs.contains("hierarchical");
		case 3:
			return !_localctx.attrs.contains("injective");
		case 4:
			return !_localctx.attrs.contains("is_object_id");
		}
		return true;
	}
	private boolean dictionaryEngineClause_sempred(DictionaryEngineClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_localctx.clauses.contains("source");
		case 6:
			return !_localctx.clauses.contains("lifetime");
		case 7:
			return !_localctx.clauses.contains("layout");
		case 8:
			return !_localctx.clauses.contains("range");
		case 9:
			return !_localctx.clauses.contains("settings");
		}
		return true;
	}
	private boolean engineClause_sempred(EngineClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return !_localctx.clauses.contains("orderByClause");
		case 11:
			return !_localctx.clauses.contains("partitionByClause");
		case 12:
			return !_localctx.clauses.contains("primaryKeyClause");
		case 13:
			return !_localctx.clauses.contains("sampleByClause");
		case 14:
			return !_localctx.clauses.contains("ttlClause");
		case 15:
			return !_localctx.clauses.contains("settingsClause");
		}
		return true;
	}
	private boolean joinExpr_sempred(JoinExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean columnExpr_sempred(ColumnExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 16);
		case 19:
			return precpred(_ctx, 15);
		case 20:
			return precpred(_ctx, 14);
		case 21:
			return precpred(_ctx, 11);
		case 22:
			return precpred(_ctx, 10);
		case 23:
			return precpred(_ctx, 9);
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 19);
		case 26:
			return precpred(_ctx, 18);
		case 27:
			return precpred(_ctx, 13);
		case 28:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean tableExpr_sempred(TableExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e0\u077e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\3\2\3\2\5\2\u00e1\n\2\3\2\3\2\5\2\u00e5\n"+
		"\2\3\2\5\2\u00e8\n\2\3\2\5\2\u00eb\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ff\n\3\3\4\3\4\3\4\3\4"+
		"\5\4\u0105\n\4\3\4\3\4\3\4\7\4\u010a\n\4\f\4\16\4\u010d\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u0114\n\5\3\5\3\5\3\5\5\5\u0119\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0120\n\5\3\5\3\5\3\5\5\5\u0125\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u012c"+
		"\n\5\3\5\3\5\3\5\5\5\u0131\n\5\3\5\3\5\3\5\3\5\5\5\u0137\n\5\3\5\3\5\3"+
		"\5\3\5\5\5\u013d\n\5\3\5\3\5\3\5\5\5\u0142\n\5\3\5\3\5\3\5\3\5\5\5\u0148"+
		"\n\5\3\5\3\5\3\5\5\5\u014d\n\5\3\5\3\5\3\5\3\5\5\5\u0153\n\5\3\5\3\5\3"+
		"\5\5\5\u0158\n\5\3\5\3\5\3\5\3\5\5\5\u015e\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u016c\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0173\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u017a\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0181\n\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0187\n\5\3\5\3\5\3\5\5\5\u018c\n\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0192\n\5\3\5\3\5\3\5\5\5\u0197\n\5\3\5\3\5\3\5\3\5\5\5\u019d\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01a6\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u01b0\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01ba\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u01ce\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01d6\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01e5\n\5\3\6\3\6\3\6\7\6\u01ea\n"+
		"\6\f\6\16\6\u01ed\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u01fa\n\t\3\n\3\n\3\n\3\n\5\n\u0200\n\n\3\13\3\13\3\13\3\13\5\13\u0206"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u020d\n\f\3\f\3\f\5\f\u0211\n\f\3\f\5\f"+
		"\u0214\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u021b\n\f\3\f\3\f\5\f\u021f\n\f\3\f"+
		"\5\f\u0222\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u022d\n\f\3\f\3"+
		"\f\5\f\u0231\n\f\3\f\5\f\u0234\n\f\3\f\3\f\3\f\5\f\u0239\n\f\5\f\u023b"+
		"\n\f\3\f\5\f\u023e\n\f\3\f\5\f\u0241\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u024b\n\f\3\f\3\f\5\f\u024f\n\f\3\f\5\f\u0252\n\f\3\f\5\f\u0255"+
		"\n\f\3\f\3\f\3\f\5\f\u025a\n\f\5\f\u025c\n\f\3\f\3\f\3\f\3\f\5\f\u0262"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u0268\n\f\3\f\3\f\5\f\u026c\n\f\3\f\5\f\u026f"+
		"\n\f\3\f\5\f\u0272\n\f\3\f\5\f\u0275\n\f\3\f\5\f\u0278\n\f\3\f\3\f\3\f"+
		"\5\f\u027d\n\f\3\f\3\f\3\f\3\f\5\f\u0283\n\f\3\f\3\f\5\f\u0287\n\f\3\f"+
		"\5\f\u028a\n\f\3\f\5\f\u028d\n\f\3\f\3\f\5\f\u0291\n\f\3\r\3\r\3\r\3\r"+
		"\7\r\u0297\n\r\f\r\16\r\u029a\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u02b3\n\16\f\16\16\16\u02b6\13\16\3\17\5\17\u02b9\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u02cf\n\17\f\17\16\17\u02d2\13\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u02dc\n\21\3\21\5\21\u02df"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u02e6\n\22\f\22\16\22\u02e9\13\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u02f9\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0302\n\24\f"+
		"\24\16\24\u0305\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0316\n\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\5\27\u0323\n\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0332\n\33\f\33\16\33\u0335\13"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u033d\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0358\n\34\f\34\16\34\u035b\13"+
		"\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \7 \u036d\n \f \16 \u0370\13 \3!\3!\5!\u0374\n!\3!\3!\3!\5!\u0379"+
		"\n!\3!\5!\u037c\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0388\n"+
		"\"\3#\3#\3#\5#\u038d\n#\3#\3#\5#\u0391\n#\3#\5#\u0394\n#\3#\3#\5#\u0398"+
		"\n#\3#\3#\5#\u039c\n#\3#\3#\3#\5#\u03a1\n#\3#\5#\u03a4\n#\3#\3#\5#\u03a8"+
		"\n#\5#\u03aa\n#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\7\'\u03be\n\'\f\'\16\'\u03c1\13\'\3\'\3\'\3(\3(\3(\5(\u03c8\n(\3"+
		"(\5(\u03cb\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u03d5\n)\3*\3*\5*\u03d9\n*\3"+
		"*\3*\3+\3+\3+\3+\5+\u03e1\n+\3+\3+\5+\u03e5\n+\3+\3+\3+\5+\u03ea\n+\3"+
		"+\3+\5+\u03ee\n+\3+\3+\5+\u03f2\n+\3+\3+\5+\u03f6\n+\3+\3+\5+\u03fa\n"+
		"+\5+\u03fc\n+\3,\3,\3,\3,\3,\3,\5,\u0404\n,\3,\3,\5,\u0408\n,\3,\5,\u040b"+
		"\n,\3-\3-\3-\3-\3-\3-\5-\u0413\n-\3.\3.\3.\5.\u0418\n.\3.\3.\3.\5.\u041d"+
		"\n.\3.\5.\u0420\n.\3.\3.\3/\3/\3/\3/\7/\u0428\n/\f/\16/\u042b\13/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\5\60\u0434\n\60\3\60\3\60\5\60\u0438\n\60\3"+
		"\61\3\61\3\61\5\61\u043d\n\61\3\61\3\61\5\61\u0441\n\61\3\62\3\62\3\62"+
		"\3\62\5\62\u0447\n\62\3\62\5\62\u044a\n\62\3\62\5\62\u044d\n\62\3\62\5"+
		"\62\u0450\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63"+
		"\u045c\n\63\f\63\16\63\u045f\13\63\3\63\5\63\u0462\n\63\3\64\3\64\5\64"+
		"\u0466\n\64\3\64\3\64\3\64\5\64\u046b\n\64\3\64\5\64\u046e\n\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\7\65\u0476\n\65\f\65\16\65\u0479\13\65\3\66\3"+
		"\66\3\66\3\66\3\66\5\66\u0480\n\66\3\67\5\67\u0483\n\67\3\67\3\67\5\67"+
		"\u0487\n\67\3\67\5\67\u048a\n\67\3\67\3\67\5\67\u048e\n\67\3\67\5\67\u0491"+
		"\n\67\3\67\5\67\u0494\n\67\3\67\5\67\u0497\n\67\3\67\5\67\u049a\n\67\3"+
		"\67\3\67\5\67\u049e\n\67\3\67\3\67\5\67\u04a2\n\67\3\67\5\67\u04a5\n\67"+
		"\3\67\5\67\u04a8\n\67\3\67\5\67\u04ab\n\67\3\67\5\67\u04ae\n\67\3\67\5"+
		"\67\u04b1\n\67\38\38\38\39\39\39\39\59\u04ba\n9\3:\3:\3:\3;\5;\u04c0\n"+
		";\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04d4\n>\3"+
		"?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\5C\u04ea\n"+
		"C\3D\3D\3D\3E\3E\3E\5E\u04f2\nE\3E\5E\u04f5\nE\3E\3E\3E\3E\5E\u04fb\n"+
		"E\3E\3E\3E\3E\3E\3E\5E\u0503\nE\3E\5E\u0506\nE\3E\3E\3E\3E\7E\u050c\n"+
		"E\fE\16E\u050f\13E\3F\5F\u0512\nF\3F\3F\3F\5F\u0517\nF\3F\5F\u051a\nF"+
		"\3F\5F\u051d\nF\3F\3F\5F\u0521\nF\3F\3F\5F\u0525\nF\3F\5F\u0528\nF\5F"+
		"\u052a\nF\3F\5F\u052d\nF\3F\3F\5F\u0531\nF\3F\3F\5F\u0535\nF\3F\5F\u0538"+
		"\nF\5F\u053a\nF\5F\u053c\nF\3G\5G\u053f\nG\3G\3G\3G\5G\u0544\nG\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\5H\u054f\nH\3I\3I\3I\3I\5I\u0555\nI\3J\3J\3J\5J"+
		"\u055a\nJ\3K\3K\3K\7K\u055f\nK\fK\16K\u0562\13K\3L\3L\5L\u0566\nL\3L\3"+
		"L\5L\u056a\nL\3L\3L\5L\u056e\nL\3M\3M\3M\5M\u0573\nM\3N\3N\3N\7N\u0578"+
		"\nN\fN\16N\u057b\13N\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\5Q\u058f\nQ\3Q\5Q\u0592\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u059b\nQ\3Q\3"+
		"Q\5Q\u059f\nQ\3Q\3Q\3Q\5Q\u05a4\nQ\3Q\3Q\3Q\5Q\u05a9\nQ\3Q\5Q\u05ac\n"+
		"Q\5Q\u05ae\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\5R\u05c4\nR\3R\5R\u05c7\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u05d2\n"+
		"R\3S\3S\5S\u05d6\nS\3S\5S\u05d9\nS\3S\3S\5S\u05dd\nS\3S\3S\5S\u05e1\n"+
		"S\3T\3T\3T\3U\3U\3U\5U\u05e9\nU\3U\3U\5U\u05ed\nU\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\7V\u05f8\nV\fV\16V\u05fb\13V\3V\3V\3V\3V\3V\3V\3V\7V\u0604\nV"+
		"\fV\16V\u0607\13V\3V\3V\3V\3V\3V\3V\3V\7V\u0610\nV\fV\16V\u0613\13V\3"+
		"V\3V\3V\3V\3V\5V\u061a\nV\3V\3V\5V\u061e\nV\3W\3W\3W\7W\u0623\nW\fW\16"+
		"W\u0626\13W\3X\3X\3X\5X\u062b\nX\3X\3X\3X\3X\3X\3X\5X\u0633\nX\3Y\3Y\3"+
		"Y\5Y\u0638\nY\3Y\3Y\3Y\3Y\3Y\6Y\u063f\nY\rY\16Y\u0640\3Y\3Y\5Y\u0645\n"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0664\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\5Y\u0675\nY\3Y\5Y\u0678\nY\3Y\3Y\5Y\u067c\nY\3Y\5Y\u067f\nY\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u068b\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\5Y\u069c\nY\3Y\3Y\5Y\u06a0\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u06b1\nY\3Y\5Y\u06b4\nY\3Y\3Y\5Y\u06b8\nY\3"+
		"Y\5Y\u06bb\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u06c6\nY\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u06de\nY\3Y\3Y\3"+
		"Y\3Y\3Y\5Y\u06e5\nY\7Y\u06e7\nY\fY\16Y\u06ea\13Y\3Z\3Z\3Z\7Z\u06ef\nZ"+
		"\fZ\16Z\u06f2\13Z\3[\3[\5[\u06f6\n[\3\\\3\\\3\\\3\\\7\\\u06fc\n\\\f\\"+
		"\16\\\u06ff\13\\\3\\\3\\\3\\\3\\\3\\\7\\\u0706\n\\\f\\\16\\\u0709\13\\"+
		"\5\\\u070b\n\\\3\\\3\\\3\\\3]\3]\3]\5]\u0713\n]\3]\3]\3^\3^\3^\5^\u071a"+
		"\n^\3_\3_\3_\3_\3_\3_\3_\5_\u0723\n_\3_\3_\3_\3_\5_\u0729\n_\7_\u072b"+
		"\n_\f_\16_\u072e\13_\3`\3`\3`\5`\u0733\n`\3`\3`\3a\3a\3a\5a\u073a\na\3"+
		"a\3a\3b\3b\3b\7b\u0741\nb\fb\16b\u0744\13b\3c\3c\3c\5c\u0749\nc\3d\3d"+
		"\3e\3e\3e\3e\3e\3e\5e\u0753\ne\5e\u0755\ne\3f\5f\u0758\nf\3f\3f\3f\3f"+
		"\3f\3f\5f\u0760\nf\3g\3g\3g\5g\u0765\ng\3h\3h\3i\3i\3j\3j\3k\3k\5k\u076f"+
		"\nk\3l\3l\3l\5l\u0774\nl\3m\3m\5m\u0778\nm\3n\3n\3n\3n\3n\2\5\u0088\u00b0"+
		"\u00bco\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\2\35\b\2\5\5\32\32\35\35\'\'gg\u00a8\u00a8\4"+
		"\2\21\21\37\37\5\2\5\5\'\'gg\4\2**,,\4\2--\63\63\5\2\20\20\u0097\u0097"+
		"\u009d\u009d\4\2!!\u008a\u008a\4\2SS__\4\2FFdd\5\2\6\6\n\n\16\16\6\2\6"+
		"\6\t\n\16\16\u008e\u008e\4\2__\u0089\u0089\4\2\6\6\n\n\4\2uu\u00c5\u00c5"+
		"\4\2\r\r*+\4\2>>\\\\\4\2CCOO\3\2\u0094\u0095\5\2\23\23^^\u00a5\u00a5\5"+
		"\2\u00c1\u00c1\u00d3\u00d3\u00dc\u00dc\4\2\u00c6\u00c7\u00d4\u00d4\4\2"+
		"NNaa\3\2\u00bc\u00bd\4\2\u00c7\u00c7\u00d4\u00d4\n\2%%KKkkmm\u0081\u0081"+
		"\u008c\u008c\u00b3\u00b3\u00b7\u00b7\16\2\4$&JLPRjllnoqrt\177\u0082\u008b"+
		"\u008d\u00b2\u00b4\u00b6\u00b8\u00b9\6\2$$>>LLZZ\2\u088f\2\u00ea\3\2\2"+
		"\2\4\u00fe\3\2\2\2\6\u0100\3\2\2\2\b\u01e4\3\2\2\2\n\u01e6\3\2\2\2\f\u01ee"+
		"\3\2\2\2\16\u01f2\3\2\2\2\20\u01f9\3\2\2\2\22\u01fb\3\2\2\2\24\u0201\3"+
		"\2\2\2\26\u0290\3\2\2\2\30\u0292\3\2\2\2\32\u029d\3\2\2\2\34\u02b8\3\2"+
		"\2\2\36\u02d3\3\2\2\2 \u02d7\3\2\2\2\"\u02e0\3\2\2\2$\u02ed\3\2\2\2&\u02fc"+
		"\3\2\2\2(\u0309\3\2\2\2*\u0319\3\2\2\2,\u031e\3\2\2\2.\u0324\3\2\2\2\60"+
		"\u0327\3\2\2\2\62\u032a\3\2\2\2\64\u033c\3\2\2\2\66\u033e\3\2\2\28\u035c"+
		"\3\2\2\2:\u0360\3\2\2\2<\u0364\3\2\2\2>\u0368\3\2\2\2@\u0371\3\2\2\2B"+
		"\u0387\3\2\2\2D\u03a9\3\2\2\2F\u03ab\3\2\2\2H\u03ae\3\2\2\2J\u03b5\3\2"+
		"\2\2L\u03b8\3\2\2\2N\u03c4\3\2\2\2P\u03cc\3\2\2\2R\u03d6\3\2\2\2T\u03fb"+
		"\3\2\2\2V\u040a\3\2\2\2X\u0412\3\2\2\2Z\u0414\3\2\2\2\\\u0423\3\2\2\2"+
		"^\u0437\3\2\2\2`\u0439\3\2\2\2b\u0442\3\2\2\2d\u0451\3\2\2\2f\u0463\3"+
		"\2\2\2h\u0471\3\2\2\2j\u047f\3\2\2\2l\u0482\3\2\2\2n\u04b2\3\2\2\2p\u04b5"+
		"\3\2\2\2r\u04bb\3\2\2\2t\u04bf\3\2\2\2v\u04c5\3\2\2\2x\u04c8\3\2\2\2z"+
		"\u04cb\3\2\2\2|\u04d5\3\2\2\2~\u04d8\3\2\2\2\u0080\u04dc\3\2\2\2\u0082"+
		"\u04e0\3\2\2\2\u0084\u04e5\3\2\2\2\u0086\u04eb\3\2\2\2\u0088\u04fa\3\2"+
		"\2\2\u008a\u053b\3\2\2\2\u008c\u0543\3\2\2\2\u008e\u054e\3\2\2\2\u0090"+
		"\u0550\3\2\2\2\u0092\u0556\3\2\2\2\u0094\u055b\3\2\2\2\u0096\u0563\3\2"+
		"\2\2\u0098\u056f\3\2\2\2\u009a\u0574\3\2\2\2\u009c\u057c\3\2\2\2\u009e"+
		"\u0580\3\2\2\2\u00a0\u05ad\3\2\2\2\u00a2\u05d1\3\2\2\2\u00a4\u05d3\3\2"+
		"\2\2\u00a6\u05e2\3\2\2\2\u00a8\u05e5\3\2\2\2\u00aa\u061d\3\2\2\2\u00ac"+
		"\u061f\3\2\2\2\u00ae\u0632\3\2\2\2\u00b0\u069f\3\2\2\2\u00b2\u06eb\3\2"+
		"\2\2\u00b4\u06f5\3\2\2\2\u00b6\u070a\3\2\2\2\u00b8\u0712\3\2\2\2\u00ba"+
		"\u0716\3\2\2\2\u00bc\u0722\3\2\2\2\u00be\u072f\3\2\2\2\u00c0\u0739\3\2"+
		"\2\2\u00c2\u073d\3\2\2\2\u00c4\u0748\3\2\2\2\u00c6\u074a\3\2\2\2\u00c8"+
		"\u0754\3\2\2\2\u00ca\u0757\3\2\2\2\u00cc\u0764\3\2\2\2\u00ce\u0766\3\2"+
		"\2\2\u00d0\u0768\3\2\2\2\u00d2\u076a\3\2\2\2\u00d4\u076e\3\2\2\2\u00d6"+
		"\u0773\3\2\2\2\u00d8\u0777\3\2\2\2\u00da\u0779\3\2\2\2\u00dc\u00e0\5\4"+
		"\3\2\u00dd\u00de\7V\2\2\u00de\u00df\7{\2\2\u00df\u00e1\7\u00bf\2\2\u00e0"+
		"\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\7A"+
		"\2\2\u00e3\u00e5\5\u00d8m\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e8\7\u00db\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\5Z.\2\u00ea\u00dc\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\3\3\2\2\2\u00ec\u00ff\5\6\4\2\u00ed\u00ff\5\22\n"+
		"\2\u00ee\u00ff\5\24\13\2\u00ef\u00ff\5\26\f\2\u00f0\u00ff\5R*\2\u00f1"+
		"\u00ff\5T+\2\u00f2\u00ff\5V,\2\u00f3\u00ff\5X-\2\u00f4\u00ff\5`\61\2\u00f5"+
		"\u00ff\5b\62\2\u00f6\u00ff\5d\63\2\u00f7\u00ff\5h\65\2\u00f8\u00ff\5\u009e"+
		"P\2\u00f9\u00ff\5\u00a0Q\2\u00fa\u00ff\5\u00a2R\2\u00fb\u00ff\5\u00a4"+
		"S\2\u00fc\u00ff\5\u00a6T\2\u00fd\u00ff\5\u00a8U\2\u00fe\u00ec\3\2\2\2"+
		"\u00fe\u00ed\3\2\2\2\u00fe\u00ee\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f0"+
		"\3\2\2\2\u00fe\u00f1\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f3\3\2\2\2\u00fe"+
		"\u00f4\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00f7\3\2"+
		"\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe"+
		"\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\5\3\2\2\2"+
		"\u0100\u0101\7\7\2\2\u0101\u0102\7\u009a\2\2\u0102\u0104\5\u00c0a\2\u0103"+
		"\u0105\5,\27\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u010b\5\b\5\2\u0107\u0108\7\u00c5\2\2\u0108\u010a\5\b\5\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\7\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\3\2\2\u010f\u0113"+
		"\7\34\2\2\u0110\u0111\7M\2\2\u0111\u0112\7r\2\2\u0112\u0114\78\2\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\5D"+
		"#\2\u0116\u0117\7\4\2\2\u0117\u0119\5\u00ba^\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u01e5\3\2\2\2\u011a\u011b\7\3\2\2\u011b\u011f\7P"+
		"\2\2\u011c\u011d\7M\2\2\u011d\u011e\7r\2\2\u011e\u0120\78\2\2\u011f\u011c"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\5H%\2\u0122"+
		"\u0123\7\4\2\2\u0123\u0125\5\u00ba^\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u01e5\3\2\2\2\u0126\u0127\7\3\2\2\u0127\u012b\7\u0080\2"+
		"\2\u0128\u0129\7M\2\2\u0129\u012a\7r\2\2\u012a\u012c\78\2\2\u012b\u0128"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\5J&\2\u012e"+
		"\u012f\7\4\2\2\u012f\u0131\5\u00ba^\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u01e5\3\2\2\2\u0132\u0133\7\21\2\2\u0133\u0136\5\20\t\2"+
		"\u0134\u0135\7C\2\2\u0135\u0137\5\u00c0a\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u01e5\3\2\2\2\u0138\u0139\7\30\2\2\u0139\u013c\7\34\2\2"+
		"\u013a\u013b\7M\2\2\u013b\u013d\78\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\5\u00ba^\2\u013f\u0140\7O\2\2"+
		"\u0140\u0142\5\20\t\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u01e5"+
		"\3\2\2\2\u0143\u0144\7\30\2\2\u0144\u0147\7P\2\2\u0145\u0146\7M\2\2\u0146"+
		"\u0148\78\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014c\5\u00ba^\2\u014a\u014b\7O\2\2\u014b\u014d\5\20\t\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u01e5\3\2\2\2\u014e\u014f\7\30"+
		"\2\2\u014f\u0152\7\u0080\2\2\u0150\u0151\7M\2\2\u0151\u0153\78\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\5\u00ba"+
		"^\2\u0155\u0156\7O\2\2\u0156\u0158\5\20\t\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u01e5\3\2\2\2\u0159\u015a\7\35\2\2\u015a\u015d\7"+
		"\34\2\2\u015b\u015c\7M\2\2\u015c\u015e\78\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5\u00ba^\2\u0160\u0161"+
		"\7\u00bf\2\2\u0161\u01e5\3\2\2\2\u0162\u0163\7)\2\2\u0163\u0164\7\u00b5"+
		"\2\2\u0164\u01e5\5\u00b0Y\2\u0165\u0166\7-\2\2\u0166\u01e5\5\20\t\2\u0167"+
		"\u0168\7\63\2\2\u0168\u016b\7\34\2\2\u0169\u016a\7M\2\2\u016a\u016c\7"+
		"8\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u01e5\5\u00ba^\2\u016e\u016f\7\63\2\2\u016f\u0172\7P\2\2\u0170\u0171"+
		"\7M\2\2\u0171\u0173\78\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u01e5\5\u00ba^\2\u0175\u0176\7\63\2\2\u0176\u0179"+
		"\7\u0080\2\2\u0177\u0178\7M\2\2\u0178\u017a\78\2\2\u0179\u0177\3\2\2\2"+
		"\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u01e5\5\u00ba^\2\u017c"+
		"\u017d\7\63\2\2\u017d\u01e5\5\20\t\2\u017e\u0180\7B\2\2\u017f\u0181\5"+
		"\20\t\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u01e5\3\2\2\2\u0182"+
		"\u0183\7f\2\2\u0183\u0186\7P\2\2\u0184\u0185\7M\2\2\u0185\u0187\78\2\2"+
		"\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b"+
		"\5\u00ba^\2\u0189\u018a\7O\2\2\u018a\u018c\5\20\t\2\u018b\u0189\3\2\2"+
		"\2\u018b\u018c\3\2\2\2\u018c\u01e5\3\2\2\2\u018d\u018e\7f\2\2\u018e\u0191"+
		"\7\u0080\2\2\u018f\u0190\7M\2\2\u0190\u0192\78\2\2\u0191\u018f\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\5\u00ba^\2\u0194"+
		"\u0195\7O\2\2\u0195\u0197\5\20\t\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u01e5\3\2\2\2\u0198\u0199\7l\2\2\u0199\u019c\7\34\2\2\u019a"+
		"\u019b\7M\2\2\u019b\u019d\78\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2"+
		"\2\u019d\u019e\3\2\2\2\u019e\u019f\5\u00ba^\2\u019f\u01a0\5L\'\2\u01a0"+
		"\u01e5\3\2\2\2\u01a1\u01a2\7l\2\2\u01a2\u01a5\7\34\2\2\u01a3\u01a4\7M"+
		"\2\2\u01a4\u01a6\78\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\5\u00ba^\2\u01a8\u01a9\7\35\2\2\u01a9\u01aa"+
		"\7\u00bf\2\2\u01aa\u01e5\3\2\2\2\u01ab\u01ac\7l\2\2\u01ac\u01af\7\34\2"+
		"\2\u01ad\u01ae\7M\2\2\u01ae\u01b0\78\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\5\u00ba^\2\u01b2\u01b3\7\u0084"+
		"\2\2\u01b3\u01b4\5\16\b\2\u01b4\u01e5\3\2\2\2\u01b5\u01b6\7l\2\2\u01b6"+
		"\u01b9\7\34\2\2\u01b7\u01b8\7M\2\2\u01b8\u01ba\78\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01e5\5D#\2\u01bc\u01bd"+
		"\7l\2\2\u01bd\u01be\7y\2\2\u01be\u01bf\7\24\2\2\u01bf\u01e5\5\u00b0Y\2"+
		"\u01c0\u01c1\7l\2\2\u01c1\u01e5\5> \2\u01c2\u01c3\7n\2\2\u01c3\u01cd\5"+
		"\20\t\2\u01c4\u01c5\7\u00a2\2\2\u01c5\u01c6\7\60\2\2\u01c6\u01ce\7\u00bf"+
		"\2\2\u01c7\u01c8\7\u00a2\2\2\u01c8\u01c9\7\u00b1\2\2\u01c9\u01ce\7\u00bf"+
		"\2\2\u01ca\u01cb\7\u00a2\2\2\u01cb\u01cc\7\u009a\2\2\u01cc\u01ce\5\u00c0"+
		"a\2\u01cd\u01c4\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01ca\3\2\2\2\u01ce"+
		"\u01e5\3\2\2\2\u01cf\u01d0\7\u0084\2\2\u01d0\u01e5\7\u00a8\2\2\u01d1\u01d2"+
		"\7\u0085\2\2\u01d2\u01d5\7\34\2\2\u01d3\u01d4\7M\2\2\u01d4\u01d6\78\2"+
		"\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8"+
		"\5\u00ba^\2\u01d8\u01d9\7\u00a2\2\2\u01d9\u01da\5\u00ba^\2\u01da\u01e5"+
		"\3\2\2\2\u01db\u01dc\7\u0086\2\2\u01dc\u01dd\5\20\t\2\u01dd\u01de\7C\2"+
		"\2\u01de\u01df\5\u00c0a\2\u01df\u01e5\3\2\2\2\u01e0\u01e1\7\u00ab\2\2"+
		"\u01e1\u01e2\5\n\6\2\u01e2\u01e3\5x=\2\u01e3\u01e5\3\2\2\2\u01e4\u010e"+
		"\3\2\2\2\u01e4\u011a\3\2\2\2\u01e4\u0126\3\2\2\2\u01e4\u0132\3\2\2\2\u01e4"+
		"\u0138\3\2\2\2\u01e4\u0143\3\2\2\2\u01e4\u014e\3\2\2\2\u01e4\u0159\3\2"+
		"\2\2\u01e4\u0162\3\2\2\2\u01e4\u0165\3\2\2\2\u01e4\u0167\3\2\2\2\u01e4"+
		"\u016e\3\2\2\2\u01e4\u0175\3\2\2\2\u01e4\u017c\3\2\2\2\u01e4\u017e\3\2"+
		"\2\2\u01e4\u0182\3\2\2\2\u01e4\u018d\3\2\2\2\u01e4\u0198\3\2\2\2\u01e4"+
		"\u01a1\3\2\2\2\u01e4\u01ab\3\2\2\2\u01e4\u01b5\3\2\2\2\u01e4\u01bc\3\2"+
		"\2\2\u01e4\u01c0\3\2\2\2\u01e4\u01c2\3\2\2\2\u01e4\u01cf\3\2\2\2\u01e4"+
		"\u01d1\3\2\2\2\u01e4\u01db\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e5\t\3\2\2\2"+
		"\u01e6\u01eb\5\f\7\2\u01e7\u01e8\7\u00c5\2\2\u01e8\u01ea\5\f\7\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\13\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\5\u00ba^\2\u01ef"+
		"\u01f0\7\u00ca\2\2\u01f0\u01f1\5\u00b0Y\2\u01f1\r\3\2\2\2\u01f2\u01f3"+
		"\t\2\2\2\u01f3\17\3\2\2\2\u01f4\u01f5\7|\2\2\u01f5\u01fa\5\u00b0Y\2\u01f6"+
		"\u01f7\7|\2\2\u01f7\u01f8\7L\2\2\u01f8\u01fa\7\u00bf\2\2\u01f9\u01f4\3"+
		"\2\2\2\u01f9\u01f6\3\2\2\2\u01fa\21\3\2\2\2\u01fb\u01fc\7\21\2\2\u01fc"+
		"\u01fd\7/\2\2\u01fd\u01ff\5\u00c0a\2\u01fe\u0200\5,\27\2\u01ff\u01fe\3"+
		"\2\2\2\u01ff\u0200\3\2\2\2\u0200\23\3\2\2\2\u0201\u0202\7\27\2\2\u0202"+
		"\u0203\7\u009a\2\2\u0203\u0205\5\u00c0a\2\u0204\u0206\5\20\t\2\u0205\u0204"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\25\3\2\2\2\u0207\u0208\t\3\2\2\u0208"+
		"\u020c\7\"\2\2\u0209\u020a\7M\2\2\u020a\u020b\7r\2\2\u020b\u020d\78\2"+
		"\2\u020c\u0209\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210"+
		"\5\u00c6d\2\u020f\u0211\5,\27\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2"+
		"\2\u0211\u0213\3\2\2\2\u0212\u0214\5@!\2\u0213\u0212\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0291\3\2\2\2\u0215\u0216\t\3\2\2\u0216\u021a\7/\2\2\u0217"+
		"\u0218\7M\2\2\u0218\u0219\7r\2\2\u0219\u021b\78\2\2\u021a\u0217\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\5\u00c0a\2\u021d"+
		"\u021f\5.\30\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2"+
		"\2\2\u0220\u0222\5,\27\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\5\30\r\2\u0224\u0225\5\34\17\2\u0225\u0291"+
		"\3\2\2\2\u0226\u0227\t\3\2\2\u0227\u0228\7c\2\2\u0228\u022c\7\u00b0\2"+
		"\2\u0229\u022a\7M\2\2\u022a\u022b\7r\2\2\u022b\u022d\78\2\2\u022c\u0229"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\5\u00c0a"+
		"\2\u022f\u0231\5.\30\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233"+
		"\3\2\2\2\u0232\u0234\5,\27\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u023a\3\2\2\2\u0235\u0236\7\u00b6\2\2\u0236\u0238\7\u00a0\2\2\u0237\u0239"+
		"\7\u00bd\2\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2"+
		"\2\u023a\u0235\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023e"+
		"\5\60\31\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2"+
		"\u023f\u0241\5\64\33\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242"+
		"\3\2\2\2\u0242\u0243\5\62\32\2\u0243\u0291\3\2\2\2\u0244\u0245\t\3\2\2"+
		"\u0245\u0246\7g\2\2\u0246\u024a\7\u00b0\2\2\u0247\u0248\7M\2\2\u0248\u0249"+
		"\7r\2\2\u0249\u024b\78\2\2\u024a\u0247\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024e\5\u00c0a\2\u024d\u024f\5.\30\2\u024e\u024d"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0252\5,\27\2\u0251"+
		"\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0255\5\64"+
		"\33\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u025b\3\2\2\2\u0256"+
		"\u025c\5\60\31\2\u0257\u0259\5\66\34\2\u0258\u025a\7}\2\2\u0259\u0258"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0256\3\2\2\2\u025b"+
		"\u0257\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\5\62\32\2\u025e\u0291\3"+
		"\2\2\2\u025f\u0261\t\3\2\2\u0260\u0262\7\u009c\2\2\u0261\u0260\3\2\2\2"+
		"\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0267\7\u009a\2\2\u0264"+
		"\u0265\7M\2\2\u0265\u0266\7r\2\2\u0266\u0268\78\2\2\u0267\u0264\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\5\u00c0a\2\u026a"+
		"\u026c\5.\30\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2"+
		"\2\2\u026d\u026f\5,\27\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0271\3\2\2\2\u0270\u0272\5\64\33\2\u0271\u0270\3\2\2\2\u0271\u0272\3"+
		"\2\2\2\u0272\u0274\3\2\2\2\u0273\u0275\5\66\34\2\u0274\u0273\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0278\5\62\32\2\u0277\u0276\3"+
		"\2\2\2\u0277\u0278\3\2\2\2\u0278\u0291\3\2\2\2\u0279\u027c\t\3\2\2\u027a"+
		"\u027b\7x\2\2\u027b\u027d\7\u0086\2\2\u027c\u027a\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0282\7\u00b0\2\2\u027f\u0280\7M\2"+
		"\2\u0280\u0281\7r\2\2\u0281\u0283\78\2\2\u0282\u027f\3\2\2\2\u0282\u0283"+
		"\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\5\u00c0a\2\u0285\u0287\5.\30"+
		"\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u028a"+
		"\5,\27\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b"+
		"\u028d\5\64\33\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3"+
		"\2\2\2\u028e\u028f\5\62\32\2\u028f\u0291\3\2\2\2\u0290\u0207\3\2\2\2\u0290"+
		"\u0215\3\2\2\2\u0290\u0226\3\2\2\2\u0290\u0244\3\2\2\2\u0290\u025f\3\2"+
		"\2\2\u0290\u0279\3\2\2\2\u0291\27\3\2\2\2\u0292\u0293\7\u00d0\2\2\u0293"+
		"\u0298\5\32\16\2\u0294\u0295\7\u00c5\2\2\u0295\u0297\5\32\16\2\u0296\u0294"+
		"\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\7\u00da\2\2\u029c\31\3"+
		"\2\2\2\u029d\u029e\5\u00d6l\2\u029e\u02b4\5\u00aaV\2\u029f\u02a0\6\16"+
		"\2\3\u02a0\u02a1\7\'\2\2\u02a1\u02a2\5\u00ccg\2\u02a2\u02a3\b\16\1\2\u02a3"+
		"\u02b3\3\2\2\2\u02a4\u02a5\6\16\3\3\u02a5\u02a6\7:\2\2\u02a6\u02a7\5\u00b0"+
		"Y\2\u02a7\u02a8\b\16\1\2\u02a8\u02b3\3\2\2\2\u02a9\u02aa\6\16\4\3\u02aa"+
		"\u02ab\7J\2\2\u02ab\u02b3\b\16\1\2\u02ac\u02ad\6\16\5\3\u02ad\u02ae\7"+
		"R\2\2\u02ae\u02b3\b\16\1\2\u02af\u02b0\6\16\6\3\u02b0\u02b1\7X\2\2\u02b1"+
		"\u02b3\b\16\1\2\u02b2\u029f\3\2\2\2\u02b2\u02a4\3\2\2\2\u02b2\u02a9\3"+
		"\2\2\2\u02b2\u02ac\3\2\2\2\u02b2\u02af\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\33\3\2\2\2\u02b6\u02b4\3\2\2"+
		"\2\u02b7\u02b9\5\36\20\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02d0\3\2\2\2\u02ba\u02bb\6\17\7\3\u02bb\u02bc\5\"\22\2\u02bc\u02bd\b"+
		"\17\1\2\u02bd\u02cf\3\2\2\2\u02be\u02bf\6\17\b\3\u02bf\u02c0\5$\23\2\u02c0"+
		"\u02c1\b\17\1\2\u02c1\u02cf\3\2\2\2\u02c2\u02c3\6\17\t\3\u02c3\u02c4\5"+
		"&\24\2\u02c4\u02c5\b\17\1\2\u02c5\u02cf\3\2\2\2\u02c6\u02c7\6\17\n\3\u02c7"+
		"\u02c8\5(\25\2\u02c8\u02c9\b\17\1\2\u02c9\u02cf\3\2\2\2\u02ca\u02cb\6"+
		"\17\13\3\u02cb\u02cc\5*\26\2\u02cc\u02cd\b\17\1\2\u02cd\u02cf\3\2\2\2"+
		"\u02ce\u02ba\3\2\2\2\u02ce\u02be\3\2\2\2\u02ce\u02c2\3\2\2\2\u02ce\u02c6"+
		"\3\2\2\2\u02ce\u02ca\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\35\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4\7\177"+
		"\2\2\u02d4\u02d5\7Z\2\2\u02d5\u02d6\5\u00acW\2\u02d6\37\3\2\2\2\u02d7"+
		"\u02de\5\u00d6l\2\u02d8\u02db\5\u00d6l\2\u02d9\u02da\7\u00d0\2\2\u02da"+
		"\u02dc\7\u00da\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df"+
		"\3\2\2\2\u02dd\u02df\5\u00ccg\2\u02de\u02d8\3\2\2\2\u02de\u02dd\3\2\2"+
		"\2\u02df!\3\2\2\2\u02e0\u02e1\7\u0093\2\2\u02e1\u02e2\7\u00d0\2\2\u02e2"+
		"\u02e3\5\u00d6l\2\u02e3\u02e7\7\u00d0\2\2\u02e4\u02e6\5 \21\2\u02e5\u02e4"+
		"\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02eb\7\u00da\2\2\u02eb\u02ec"+
		"\7\u00da\2\2\u02ec#\3\2\2\2\u02ed\u02ee\7`\2\2\u02ee\u02f8\7\u00d0\2\2"+
		"\u02ef\u02f9\7\u00bd\2\2\u02f0\u02f1\7j\2\2\u02f1\u02f2\7\u00bd\2\2\u02f2"+
		"\u02f3\7h\2\2\u02f3\u02f9\7\u00bd\2\2\u02f4\u02f5\7h\2\2\u02f5\u02f6\7"+
		"\u00bd\2\2\u02f6\u02f7\7j\2\2\u02f7\u02f9\7\u00bd\2\2\u02f8\u02ef\3\2"+
		"\2\2\u02f8\u02f0\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fb\7\u00da\2\2\u02fb%\3\2\2\2\u02fc\u02fd\7]\2\2\u02fd\u02fe\7\u00d0"+
		"\2\2\u02fe\u02ff\5\u00d6l\2\u02ff\u0303\7\u00d0\2\2\u0300\u0302\5 \21"+
		"\2\u0301\u0300\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304"+
		"\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307\7\u00da\2"+
		"\2\u0307\u0308\7\u00da\2\2\u0308\'\3\2\2\2\u0309\u030a\7\u0082\2\2\u030a"+
		"\u0315\7\u00d0\2\2\u030b\u030c\7j\2\2\u030c\u030d\5\u00d6l\2\u030d\u030e"+
		"\7h\2\2\u030e\u030f\5\u00d6l\2\u030f\u0316\3\2\2\2\u0310\u0311\7h\2\2"+
		"\u0311\u0312\5\u00d6l\2\u0312\u0313\7j\2\2\u0313\u0314\5\u00d6l\2\u0314"+
		"\u0316\3\2\2\2\u0315\u030b\3\2\2\2\u0315\u0310\3\2\2\2\u0316\u0317\3\2"+
		"\2\2\u0317\u0318\7\u00da\2\2\u0318)\3\2\2\2\u0319\u031a\7\u0091\2\2\u031a"+
		"\u031b\7\u00d0\2\2\u031b\u031c\5\u009aN\2\u031c\u031d\7\u00da\2\2\u031d"+
		"+\3\2\2\2\u031e\u031f\7v\2\2\u031f\u0322\7\31\2\2\u0320\u0323\5\u00d6"+
		"l\2\u0321\u0323\7\u00bf\2\2\u0322\u0320\3\2\2\2\u0322\u0321\3\2\2\2\u0323"+
		"-\3\2\2\2\u0324\u0325\7\u00ae\2\2\u0325\u0326\7\u00bf\2\2\u0326/\3\2\2"+
		"\2\u0327\u0328\7\u00a2\2\2\u0328\u0329\5\u00c0a\2\u0329\61\3\2\2\2\u032a"+
		"\u032b\7\f\2\2\u032b\u032c\5h\65\2\u032c\63\3\2\2\2\u032d\u032e\7\u00d0"+
		"\2\2\u032e\u0333\5B\"\2\u032f\u0330\7\u00c5\2\2\u0330\u0332\5B\"\2\u0331"+
		"\u032f\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\7\u00da\2\2\u0337"+
		"\u033d\3\2\2\2\u0338\u0339\7\f\2\2\u0339\u033d\5\u00c0a\2\u033a\u033b"+
		"\7\f\2\2\u033b\u033d\5\u00be`\2\u033c\u032d\3\2\2\2\u033c\u0338\3\2\2"+
		"\2\u033c\u033a\3\2\2\2\u033d\65\3\2\2\2\u033e\u0359\5@!\2\u033f\u0340"+
		"\6\34\f\3\u0340\u0341\5~@\2\u0341\u0342\b\34\1\2\u0342\u0358\3\2\2\2\u0343"+
		"\u0344\6\34\r\3\u0344\u0345\58\35\2\u0345\u0346\b\34\1\2\u0346\u0358\3"+
		"\2\2\2\u0347\u0348\6\34\16\3\u0348\u0349\5:\36\2\u0349\u034a\b\34\1\2"+
		"\u034a\u0358\3\2\2\2\u034b\u034c\6\34\17\3\u034c\u034d\5<\37\2\u034d\u034e"+
		"\b\34\1\2\u034e\u0358\3\2\2\2\u034f\u0350\6\34\20\3\u0350\u0351\5> \2"+
		"\u0351\u0352\b\34\1\2\u0352\u0358\3\2\2\2\u0353\u0354\6\34\21\3\u0354"+
		"\u0355\5\u0086D\2\u0355\u0356\b\34\1\2\u0356\u0358\3\2\2\2\u0357\u033f"+
		"\3\2\2\2\u0357\u0343\3\2\2\2\u0357\u0347\3\2\2\2\u0357\u034b\3\2\2\2\u0357"+
		"\u034f\3\2\2\2\u0357\u0353\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2"+
		"\2\2\u0359\u035a\3\2\2\2\u035a\67\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035d"+
		"\7|\2\2\u035d\u035e\7\24\2\2\u035e\u035f\5\u00b0Y\2\u035f9\3\2\2\2\u0360"+
		"\u0361\7\177\2\2\u0361\u0362\7Z\2\2\u0362\u0363\5\u00b0Y\2\u0363;\3\2"+
		"\2\2\u0364\u0365\7\u008b\2\2\u0365\u0366\7\24\2\2\u0366\u0367\5\u00b0"+
		"Y\2\u0367=\3\2\2\2\u0368\u0369\7\u00a8\2\2\u0369\u036e\5P)\2\u036a\u036b"+
		"\7\u00c5\2\2\u036b\u036d\5P)\2\u036c\u036a\3\2\2\2\u036d\u0370\3\2\2\2"+
		"\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f?\3\2\2\2\u0370\u036e\3"+
		"\2\2\2\u0371\u0373\7\66\2\2\u0372\u0374\7\u00ca\2\2\u0373\u0372\3\2\2"+
		"\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u037b\5\u00d8m\2\u0376"+
		"\u0378\7\u00d0\2\2\u0377\u0379\5\u00acW\2\u0378\u0377\3\2\2\2\u0378\u0379"+
		"\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\7\u00da\2\2\u037b\u0376\3\2\2"+
		"\2\u037b\u037c\3\2\2\2\u037cA\3\2\2\2\u037d\u0388\5D#\2\u037e\u037f\7"+
		"\36\2\2\u037f\u0380\5\u00d6l\2\u0380\u0381\7\27\2\2\u0381\u0382\5\u00b0"+
		"Y\2\u0382\u0388\3\2\2\2\u0383\u0384\7P\2\2\u0384\u0388\5H%\2\u0385\u0386"+
		"\7\u0080\2\2\u0386\u0388\5J&\2\u0387\u037d\3\2\2\2\u0387\u037e\3\2\2\2"+
		"\u0387\u0383\3\2\2\2\u0387\u0385\3\2\2\2\u0388C\3\2\2\2\u0389\u038a\5"+
		"\u00ba^\2\u038a\u038c\5\u00aaV\2\u038b\u038d\5F$\2\u038c\u038b\3\2\2\2"+
		"\u038c\u038d\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038f\7\35\2\2\u038f\u0391"+
		"\7\u00bf\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\3\2\2"+
		"\2\u0392\u0394\5L\'\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0397"+
		"\3\2\2\2\u0395\u0396\7\u00a8\2\2\u0396\u0398\5\u00b0Y\2\u0397\u0395\3"+
		"\2\2\2\u0397\u0398\3\2\2\2\u0398\u03aa\3\2\2\2\u0399\u039b\5\u00ba^\2"+
		"\u039a\u039c\5\u00aaV\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039d\u03a0\5F$\2\u039e\u039f\7\35\2\2\u039f\u03a1\7\u00bf"+
		"\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2"+
		"\u03a4\5L\'\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a7\3\2"+
		"\2\2\u03a5\u03a6\7\u00a8\2\2\u03a6\u03a8\5\u00b0Y\2\u03a7\u03a5\3\2\2"+
		"\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u0389\3\2\2\2\u03a9\u0399"+
		"\3\2\2\2\u03aaE\3\2\2\2\u03ab\u03ac\t\4\2\2\u03ac\u03ad\5\u00b0Y\2\u03ad"+
		"G\3\2\2\2\u03ae\u03af\5\u00ba^\2\u03af\u03b0\5\u00b0Y\2\u03b0\u03b1\7"+
		"\u00a9\2\2\u03b1\u03b2\5\u00aaV\2\u03b2\u03b3\7G\2\2\u03b3\u03b4\7\u00bd"+
		"\2\2\u03b4I\3\2\2\2\u03b5\u03b6\5\u00ba^\2\u03b6\u03b7\5f\64\2\u03b7K"+
		"\3\2\2\2\u03b8\u03b9\7\32\2\2\u03b9\u03ba\7\u00d0\2\2\u03ba\u03bf\5N("+
		"\2\u03bb\u03bc\7\u00c5\2\2\u03bc\u03be\5N(\2\u03bd\u03bb\3\2\2\2\u03be"+
		"\u03c1\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\3\2"+
		"\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03c3\7\u00da\2\2\u03c3M\3\2\2\2\u03c4"+
		"\u03ca\5\u00d6l\2\u03c5\u03c7\7\u00d0\2\2\u03c6\u03c8\5\u00acW\2\u03c7"+
		"\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\7\u00da"+
		"\2\2\u03ca\u03c5\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cbO\3\2\2\2\u03cc\u03d4"+
		"\5\u00b0Y\2\u03cd\u03d5\7)\2\2\u03ce\u03cf\7\u00a2\2\2\u03cf\u03d0\7\60"+
		"\2\2\u03d0\u03d5\7\u00bf\2\2\u03d1\u03d2\7\u00a2\2\2\u03d2\u03d3\7\u00b1"+
		"\2\2\u03d3\u03d5\7\u00bf\2\2\u03d4\u03cd\3\2\2\2\u03d4\u03ce\3\2\2\2\u03d4"+
		"\u03d1\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5Q\3\2\2\2\u03d6\u03d8\t\5\2\2"+
		"\u03d7\u03d9\7\u009a\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"\u03da\3\2\2\2\u03da\u03db\5\u00bc_\2\u03dbS\3\2\2\2\u03dc\u03dd\t\6\2"+
		"\2\u03dd\u03e0\7\"\2\2\u03de\u03df\7M\2\2\u03df\u03e1\78\2\2\u03e0\u03de"+
		"\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\5\u00c6d"+
		"\2\u03e3\u03e5\5,\27\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03fc"+
		"\3\2\2\2\u03e6\u03ed\t\6\2\2\u03e7\u03ee\7/\2\2\u03e8\u03ea\7\u009c\2"+
		"\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ee"+
		"\7\u009a\2\2\u03ec\u03ee\7\u00b0\2\2\u03ed\u03e7\3\2\2\2\u03ed\u03e9\3"+
		"\2\2\2\u03ed\u03ec\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03f0\7M\2\2\u03f0"+
		"\u03f2\78\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2"+
		"\2\2\u03f3\u03f5\5\u00c0a\2\u03f4\u03f6\5,\27\2\u03f5\u03f4\3\2\2\2\u03f5"+
		"\u03f6\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f8\7q\2\2\u03f8\u03fa\7(\2"+
		"\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03dc"+
		"\3\2\2\2\u03fb\u03e6\3\2\2\2\u03fcU\3\2\2\2\u03fd\u03fe\78\2\2\u03fe\u03ff"+
		"\7\"\2\2\u03ff\u040b\5\u00c6d\2\u0400\u0407\78\2\2\u0401\u0408\7/\2\2"+
		"\u0402\u0404\7\u009c\2\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0408\7\u009a\2\2\u0406\u0408\7\u00b0\2\2\u0407\u0401"+
		"\3\2\2\2\u0407\u0403\3\2\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u0409\3\2\2\2\u0409\u040b\5\u00c0a\2\u040a\u03fd\3\2\2\2\u040a\u0400"+
		"\3\2\2\2\u040bW\3\2\2\2\u040c\u040d\79\2\2\u040d\u040e\7\17\2\2\u040e"+
		"\u0413\5\4\3\2\u040f\u0410\79\2\2\u0410\u0411\7\u0098\2\2\u0411\u0413"+
		"\5\4\3\2\u0412\u040c\3\2\2\2\u0412\u040f\3\2\2\2\u0413Y\3\2\2\2\u0414"+
		"\u0415\7T\2\2\u0415\u0417\7V\2\2\u0416\u0418\7\u009a\2\2\u0417\u0416\3"+
		"\2\2\2\u0417\u0418\3\2\2\2\u0418\u041c\3\2\2\2\u0419\u041d\5\u00c0a\2"+
		"\u041a\u041b\7E\2\2\u041b\u041d\5\u00be`\2\u041c\u0419\3\2\2\2\u041c\u041a"+
		"\3\2\2\2\u041d\u041f\3\2\2\2\u041e\u0420\5\\/\2\u041f\u041e\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\5^\60\2\u0422[\3\2\2\2"+
		"\u0423\u0424\7\u00d0\2\2\u0424\u0429\5\u00ba^\2\u0425\u0426\7\u00c5\2"+
		"\2\u0426\u0428\5\u00ba^\2\u0427\u0425\3\2\2\2\u0428\u042b\3\2\2\2\u0429"+
		"\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c\3\2\2\2\u042b\u0429\3\2"+
		"\2\2\u042c\u042d\7\u00da\2\2\u042d]\3\2\2\2\u042e\u042f\7A\2\2\u042f\u0438"+
		"\5\u00d6l\2\u0430\u0438\7\u00af\2\2\u0431\u0433\5h\65\2\u0432\u0434\7"+
		"\u00db\2\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2"+
		"\u0435\u0436\7\2\2\3\u0436\u0438\3\2\2\2\u0437\u042e\3\2\2\2\u0437\u0430"+
		"\3\2\2\2\u0437\u0431\3\2\2\2\u0438_\3\2\2\2\u0439\u043a\7[\2\2\u043a\u043c"+
		"\7o\2\2\u043b\u043d\5,\27\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u043e\3\2\2\2\u043e\u0440\5x=\2\u043f\u0441\t\7\2\2\u0440\u043f\3\2\2"+
		"\2\u0440\u0441\3\2\2\2\u0441a\3\2\2\2\u0442\u0443\7w\2\2\u0443\u0444\7"+
		"\u009a\2\2\u0444\u0446\5\u00c0a\2\u0445\u0447\5,\27\2\u0446\u0445\3\2"+
		"\2\2\u0446\u0447\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u044a\5\20\t\2\u0449"+
		"\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b\u044d\7="+
		"\2\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044f\3\2\2\2\u044e"+
		"\u0450\7&\2\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450c\3\2\2\2\u0451"+
		"\u0452\7\u0085\2\2\u0452\u0453\7\u009a\2\2\u0453\u0454\5\u00c0a\2\u0454"+
		"\u0455\7\u00a2\2\2\u0455\u045d\5\u00c0a\2\u0456\u0457\7\u00c5\2\2\u0457"+
		"\u0458\5\u00c0a\2\u0458\u0459\7\u00a2\2\2\u0459\u045a\5\u00c0a\2\u045a"+
		"\u045c\3\2\2\2\u045b\u0456\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2"+
		"\2\2\u045d\u045e\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u0460"+
		"\u0462\5,\27\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462e\3\2\2\2"+
		"\u0463\u0465\7\u00d0\2\2\u0464\u0466\5n8\2\u0465\u0464\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\7\u008d\2\2\u0468\u046a\5\u00ac"+
		"W\2\u0469\u046b\5z>\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046d"+
		"\3\2\2\2\u046c\u046e\5\u0080A\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2"+
		"\2\u046e\u046f\3\2\2\2\u046f\u0470\7\u00da\2\2\u0470g\3\2\2\2\u0471\u0477"+
		"\5j\66\2\u0472\u0473\7\u00aa\2\2\u0473\u0474\7\6\2\2\u0474\u0476\5j\66"+
		"\2\u0475\u0472\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478"+
		"\3\2\2\2\u0478i\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u0480\5l\67\2\u047b"+
		"\u047c\7\u00d0\2\2\u047c\u047d\5h\65\2\u047d\u047e\7\u00da\2\2\u047e\u0480"+
		"\3\2\2\2\u047f\u047a\3\2\2\2\u047f\u047b\3\2\2\2\u0480k\3\2\2\2\u0481"+
		"\u0483\5n8\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2"+
		"\2\u0484\u0486\7\u008d\2\2\u0485\u0487\7\61\2\2\u0486\u0485\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0489\3\2\2\2\u0488\u048a\5p9\2\u0489\u0488\3\2\2"+
		"\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048d\5\u00acW\2\u048c"+
		"\u048e\5r:\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2"+
		"\2\u048f\u0491\5t;\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493"+
		"\3\2\2\2\u0492\u0494\5v<\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0496\3\2\2\2\u0495\u0497\5x=\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2"+
		"\2\u0497\u0499\3\2\2\2\u0498\u049a\5z>\2\u0499\u0498\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049d\3\2\2\2\u049b\u049c\7\u00b6\2\2\u049c\u049e\t\b\2"+
		"\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u04a0"+
		"\7\u00b6\2\2\u04a0\u04a2\7\u00a4\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3"+
		"\2\2\2\u04a2\u04a4\3\2\2\2\u04a3\u04a5\5|?\2\u04a4\u04a3\3\2\2\2\u04a4"+
		"\u04a5\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6\u04a8\5~@\2\u04a7\u04a6\3\2\2"+
		"\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04ab\5\u0082B\2\u04aa"+
		"\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad\3\2\2\2\u04ac\u04ae\5\u0084"+
		"C\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af"+
		"\u04b1\5\u0086D\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1m\3\2\2"+
		"\2\u04b2\u04b3\7\u00b6\2\2\u04b3\u04b4\5\u00acW\2\u04b4o\3\2\2\2\u04b5"+
		"\u04b6\7\u00a3\2\2\u04b6\u04b9\7\u00bd\2\2\u04b7\u04b8\7\u00b6\2\2\u04b8"+
		"\u04ba\7\u009f\2\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04baq\3\2"+
		"\2\2\u04bb\u04bc\7C\2\2\u04bc\u04bd\5\u0088E\2\u04bds\3\2\2\2\u04be\u04c0"+
		"\t\t\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1"+
		"\u04c2\7\13\2\2\u04c2\u04c3\7Y\2\2\u04c3\u04c4\5\u00acW\2\u04c4u\3\2\2"+
		"\2\u04c5\u04c6\7~\2\2\u04c6\u04c7\5\u00b0Y\2\u04c7w\3\2\2\2\u04c8\u04c9"+
		"\7\u00b5\2\2\u04c9\u04ca\5\u00b0Y\2\u04cay\3\2\2\2\u04cb\u04cc\7H\2\2"+
		"\u04cc\u04d3\7\24\2\2\u04cd\u04ce\t\b\2\2\u04ce\u04cf\7\u00d0\2\2\u04cf"+
		"\u04d0\5\u00acW\2\u04d0\u04d1\7\u00da\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d4"+
		"\5\u00acW\2\u04d3\u04cd\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4{\3\2\2\2\u04d5"+
		"\u04d6\7I\2\2\u04d6\u04d7\5\u00b0Y\2\u04d7}\3\2\2\2\u04d8\u04d9\7y\2\2"+
		"\u04d9\u04da\7\24\2\2\u04da\u04db\5\u0094K\2\u04db\177\3\2\2\2\u04dc\u04dd"+
		"\7y\2\2\u04dd\u04de\7\24\2\2\u04de\u04df\5\u00acW\2\u04df\u0081\3\2\2"+
		"\2\u04e0\u04e1\7b\2\2\u04e1\u04e2\5\u0092J\2\u04e2\u04e3\7\24\2\2\u04e3"+
		"\u04e4\5\u00acW\2\u04e4\u0083\3\2\2\2\u04e5\u04e6\7b\2\2\u04e6\u04e9\5"+
		"\u0092J\2\u04e7\u04e8\7\u00b6\2\2\u04e8\u04ea\7\u009f\2\2\u04e9\u04e7"+
		"\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u0085\3\2\2\2\u04eb\u04ec\7\u0091\2"+
		"\2\u04ec\u04ed\5\u009aN\2\u04ed\u0087\3\2\2\2\u04ee\u04ef\bE\1\2\u04ef"+
		"\u04f1\5\u00bc_\2\u04f0\u04f2\7=\2\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3"+
		"\2\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04f5\5\u0090I\2\u04f4\u04f3\3\2\2\2"+
		"\u04f4\u04f5\3\2\2\2\u04f5\u04fb\3\2\2\2\u04f6\u04f7\7\u00d0\2\2\u04f7"+
		"\u04f8\5\u0088E\2\u04f8\u04f9\7\u00da\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04ee"+
		"\3\2\2\2\u04fa\u04f6\3\2\2\2\u04fb\u050d\3\2\2\2\u04fc\u04fd\f\5\2\2\u04fd"+
		"\u04fe\5\u008cG\2\u04fe\u04ff\5\u0088E\6\u04ff\u050c\3\2\2\2\u0500\u0502"+
		"\f\6\2\2\u0501\u0503\t\n\2\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u0505\3\2\2\2\u0504\u0506\5\u008aF\2\u0505\u0504\3\2\2\2\u0505\u0506"+
		"\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\7Y\2\2\u0508\u0509\5\u0088E\2"+
		"\u0509\u050a\5\u008eH\2\u050a\u050c\3\2\2\2\u050b\u04fc\3\2\2\2\u050b"+
		"\u0500\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2"+
		"\2\2\u050e\u0089\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0512\t\13\2\2\u0511"+
		"\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u051a\7S"+
		"\2\2\u0514\u0516\7S\2\2\u0515\u0517\t\13\2\2\u0516\u0515\3\2\2\2\u0516"+
		"\u0517\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u051a\t\13\2\2\u0519\u0511\3"+
		"\2\2\2\u0519\u0514\3\2\2\2\u0519\u0518\3\2\2\2\u051a\u053c\3\2\2\2\u051b"+
		"\u051d\t\f\2\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2"+
		"\2\2\u051e\u0520\t\r\2\2\u051f\u0521\7z\2\2\u0520\u051f\3\2\2\2\u0520"+
		"\u0521\3\2\2\2\u0521\u052a\3\2\2\2\u0522\u0524\t\r\2\2\u0523\u0525\7z"+
		"\2\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526"+
		"\u0528\t\f\2\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052a\3\2"+
		"\2\2\u0529\u051c\3\2\2\2\u0529\u0522\3\2\2\2\u052a\u053c\3\2\2\2\u052b"+
		"\u052d\t\16\2\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\3"+
		"\2\2\2\u052e\u0530\7D\2\2\u052f\u0531\7z\2\2\u0530\u052f\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u053a\3\2\2\2\u0532\u0534\7D\2\2\u0533\u0535\7z\2"+
		"\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536\u0538"+
		"\t\16\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053a\3\2\2\2"+
		"\u0539\u052c\3\2\2\2\u0539\u0532\3\2\2\2\u053a\u053c\3\2\2\2\u053b\u0519"+
		"\3\2\2\2\u053b\u0529\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u008b\3\2\2\2\u053d"+
		"\u053f\t\n\2\2\u053e\u053d\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2"+
		"\2\2\u0540\u0541\7 \2\2\u0541\u0544\7Y\2\2\u0542\u0544\7\u00c5\2\2\u0543"+
		"\u053e\3\2\2\2\u0543\u0542\3\2\2\2\u0544\u008d\3\2\2\2\u0545\u0546\7v"+
		"\2\2\u0546\u054f\5\u00acW\2\u0547\u0548\7\u00ad\2\2\u0548\u0549\7\u00d0"+
		"\2\2\u0549\u054a\5\u00acW\2\u054a\u054b\7\u00da\2\2\u054b\u054f\3\2\2"+
		"\2\u054c\u054d\7\u00ad\2\2\u054d\u054f\5\u00acW\2\u054e\u0545\3\2\2\2"+
		"\u054e\u0547\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u008f\3\2\2\2\u0550\u0551"+
		"\7\u008b\2\2\u0551\u0554\5\u0098M\2\u0552\u0553\7u\2\2\u0553\u0555\5\u0098"+
		"M\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0091\3\2\2\2\u0556"+
		"\u0559\5\u00b0Y\2\u0557\u0558\t\17\2\2\u0558\u055a\5\u00b0Y\2\u0559\u0557"+
		"\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u0093\3\2\2\2\u055b\u0560\5\u0096L"+
		"\2\u055c\u055d\7\u00c5\2\2\u055d\u055f\5\u0096L\2\u055e\u055c\3\2\2\2"+
		"\u055f\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0095"+
		"\3\2\2\2\u0562\u0560\3\2\2\2\u0563\u0565\5\u00b0Y\2\u0564\u0566\t\20\2"+
		"\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0568"+
		"\7t\2\2\u0568\u056a\t\21\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056d\3\2\2\2\u056b\u056c\7\33\2\2\u056c\u056e\7\u00bf\2\2\u056d\u056b"+
		"\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0097\3\2\2\2\u056f\u0572\5\u00caf"+
		"\2\u0570\u0571\7\u00dc\2\2\u0571\u0573\5\u00caf\2\u0572\u0570\3\2\2\2"+
		"\u0572\u0573\3\2\2\2\u0573\u0099\3\2\2\2\u0574\u0579\5\u009cO\2\u0575"+
		"\u0576\7\u00c5\2\2\u0576\u0578\5\u009cO\2\u0577\u0575\3\2\2\2\u0578\u057b"+
		"\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u009b\3\2\2\2\u057b"+
		"\u0579\3\2\2\2\u057c\u057d\5\u00d6l\2\u057d\u057e\7\u00ca\2\2\u057e\u057f"+
		"\5\u00ccg\2\u057f\u009d\3\2\2\2\u0580\u0581\7\u0090\2\2\u0581\u0582\5"+
		"\u009aN\2\u0582\u009f\3\2\2\2\u0583\u0584\7\u0092\2\2\u0584\u0585\7\37"+
		"\2\2\u0585\u0586\7\"\2\2\u0586\u05ae\5\u00c6d\2\u0587\u0588\7\u0092\2"+
		"\2\u0588\u0589\7\37\2\2\u0589\u058a\7/\2\2\u058a\u05ae\5\u00c0a\2\u058b"+
		"\u058c\7\u0092\2\2\u058c\u058e\7\37\2\2\u058d\u058f\7\u009c\2\2\u058e"+
		"\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0591\3\2\2\2\u0590\u0592\7\u009a"+
		"\2\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u05ae\5\u00c0a\2\u0594\u0595\7\u0092\2\2\u0595\u05ae\7#\2\2\u0596\u0597"+
		"\7\u0092\2\2\u0597\u059a\7.\2\2\u0598\u0599\7C\2\2\u0599\u059b\5\u00c6"+
		"d\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u05ae\3\2\2\2\u059c"+
		"\u059e\7\u0092\2\2\u059d\u059f\7\u009c\2\2\u059e\u059d\3\2\2\2\u059e\u059f"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a3\7\u009b\2\2\u05a1\u05a2\t\22"+
		"\2\2\u05a2\u05a4\5\u00c6d\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u05a8\3\2\2\2\u05a5\u05a6\7a\2\2\u05a6\u05a9\7\u00bf\2\2\u05a7\u05a9"+
		"\5x=\2\u05a8\u05a5\3\2\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05ab\3\2\2\2\u05aa\u05ac\5\u0084C\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac"+
		"\3\2\2\2\u05ac\u05ae\3\2\2\2\u05ad\u0583\3\2\2\2\u05ad\u0587\3\2\2\2\u05ad"+
		"\u058b\3\2\2\2\u05ad\u0594\3\2\2\2\u05ad\u0596\3\2\2\2\u05ad\u059c\3\2"+
		"\2\2\u05ae\u00a1\3\2\2\2\u05af\u05b0\7\u0099\2\2\u05b0\u05b1\7?\2\2\u05b1"+
		"\u05b2\7\62\2\2\u05b2\u05d2\5\u00c0a\2\u05b3\u05b4\7\u0099\2\2\u05b4\u05b5"+
		"\7?\2\2\u05b5\u05d2\7e\2\2\u05b6\u05b7\7\u0099\2\2\u05b7\u05b8\7\u0083"+
		"\2\2\u05b8\u05d2\7.\2\2\u05b9\u05ba\7\u0099\2\2\u05ba\u05bb\7\u0083\2"+
		"\2\u05bb\u05bc\7/\2\2\u05bc\u05d2\5\u00c0a\2\u05bd\u05be\7\u0099\2\2\u05be"+
		"\u05c6\t\23\2\2\u05bf\u05c0\7\62\2\2\u05c0\u05c7\7\u008f\2\2\u05c1\u05c7"+
		"\7<\2\2\u05c2\u05c4\7\u00a8\2\2\u05c3\u05c2\3\2\2\2\u05c3\u05c4\3\2\2"+
		"\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\7i\2\2\u05c6\u05bf\3\2\2\2\u05c6\u05c1"+
		"\3\2\2\2\u05c6\u05c3\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05d2\5\u00c0a"+
		"\2\u05c9\u05ca\7\u0099\2\2\u05ca\u05cb\t\23\2\2\u05cb\u05cc\7\u0088\2"+
		"\2\u05cc\u05d2\7\u008f\2\2\u05cd\u05ce\7\u0099\2\2\u05ce\u05cf\7\u0097"+
		"\2\2\u05cf\u05d0\7\u0087\2\2\u05d0\u05d2\5\u00c0a\2\u05d1\u05af\3\2\2"+
		"\2\u05d1\u05b3\3\2\2\2\u05d1\u05b6\3\2\2\2\u05d1\u05b9\3\2\2\2\u05d1\u05bd"+
		"\3\2\2\2\u05d1\u05c9\3\2\2\2\u05d1\u05cd\3\2\2\2\u05d2\u00a3\3\2\2\2\u05d3"+
		"\u05d5\7\u00a7\2\2\u05d4\u05d6\7\u009c\2\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6"+
		"\3\2\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05d9\7\u009a\2\2\u05d8\u05d7\3\2\2"+
		"\2\u05d8\u05d9\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05db\7M\2\2\u05db\u05dd"+
		"\78\2\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de"+
		"\u05e0\5\u00c0a\2\u05df\u05e1\5,\27\2\u05e0\u05df\3\2\2\2\u05e0\u05e1"+
		"\3\2\2\2\u05e1\u00a5\3\2\2\2\u05e2\u05e3\7\u00ac\2\2\u05e3\u05e4\5\u00c6"+
		"d\2\u05e4\u00a7\3\2\2\2\u05e5\u05e6\7\u00b2\2\2\u05e6\u05e8\5\u00c0a\2"+
		"\u05e7\u05e9\7\67\2\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ec"+
		"\3\2\2\2\u05ea\u05eb\7b\2\2\u05eb\u05ed\7\u00bd\2\2\u05ec\u05ea\3\2\2"+
		"\2\u05ec\u05ed\3\2\2\2\u05ed\u00a9\3\2\2\2\u05ee\u061e\5\u00d6l\2\u05ef"+
		"\u05f0\5\u00d6l\2\u05f0\u05f1\7\u00d0\2\2\u05f1\u05f2\5\u00d6l\2\u05f2"+
		"\u05f9\5\u00aaV\2\u05f3\u05f4\7\u00c5\2\2\u05f4\u05f5\5\u00d6l\2\u05f5"+
		"\u05f6\5\u00aaV\2\u05f6\u05f8\3\2\2\2\u05f7\u05f3\3\2\2\2\u05f8\u05fb"+
		"\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fc\3\2\2\2\u05fb"+
		"\u05f9\3\2\2\2\u05fc\u05fd\7\u00da\2\2\u05fd\u061e\3\2\2\2\u05fe\u05ff"+
		"\5\u00d6l\2\u05ff\u0600\7\u00d0\2\2\u0600\u0605\5\u00dan\2\u0601\u0602"+
		"\7\u00c5\2\2\u0602\u0604\5\u00dan\2\u0603\u0601\3\2\2\2\u0604\u0607\3"+
		"\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607"+
		"\u0605\3\2\2\2\u0608\u0609\7\u00da\2\2\u0609\u061e\3\2\2\2\u060a\u060b"+
		"\5\u00d6l\2\u060b\u060c\7\u00d0\2\2\u060c\u0611\5\u00aaV\2\u060d\u060e"+
		"\7\u00c5\2\2\u060e\u0610\5\u00aaV\2\u060f\u060d\3\2\2\2\u0610\u0613\3"+
		"\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\3\2\2\2\u0613"+
		"\u0611\3\2\2\2\u0614\u0615\7\u00da\2\2\u0615\u061e\3\2\2\2\u0616\u0617"+
		"\5\u00d6l\2\u0617\u0619\7\u00d0\2\2\u0618\u061a\5\u00acW\2\u0619\u0618"+
		"\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061c\7\u00da\2"+
		"\2\u061c\u061e\3\2\2\2\u061d\u05ee\3\2\2\2\u061d\u05ef\3\2\2\2\u061d\u05fe"+
		"\3\2\2\2\u061d\u060a\3\2\2\2\u061d\u0616\3\2\2\2\u061e\u00ab\3\2\2\2\u061f"+
		"\u0624\5\u00aeX\2\u0620\u0621\7\u00c5\2\2\u0621\u0623\5\u00aeX\2\u0622"+
		"\u0620\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625\u00ad\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u0628\5\u00c0a\2\u0628"+
		"\u0629\7\u00c8\2\2\u0629\u062b\3\2\2\2\u062a\u0627\3\2\2\2\u062a\u062b"+
		"\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u0633\7\u00c1\2\2\u062d\u062e\7\u00d0"+
		"\2\2\u062e\u062f\5h\65\2\u062f\u0630\7\u00da\2\2\u0630\u0633\3\2\2\2\u0631"+
		"\u0633\5\u00b0Y\2\u0632\u062a\3\2\2\2\u0632\u062d\3\2\2\2\u0632\u0631"+
		"\3\2\2\2\u0633\u00af\3\2\2\2\u0634\u0635\bY\1\2\u0635\u0637\7\25\2\2\u0636"+
		"\u0638\5\u00b0Y\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063e"+
		"\3\2\2\2\u0639\u063a\7\u00b4\2\2\u063a\u063b\5\u00b0Y\2\u063b\u063c\7"+
		"\u009e\2\2\u063c\u063d\5\u00b0Y\2\u063d\u063f\3\2\2\2\u063e\u0639\3\2"+
		"\2\2\u063f\u0640\3\2\2\2\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
		"\u0644\3\2\2\2\u0642\u0643\7\64\2\2\u0643\u0645\5\u00b0Y\2\u0644\u0642"+
		"\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\7\65\2\2"+
		"\u0647\u06a0\3\2\2\2\u0648\u0649\7\26\2\2\u0649\u064a\7\u00d0\2\2\u064a"+
		"\u064b\5\u00b0Y\2\u064b\u064c\7\f\2\2\u064c\u064d\5\u00aaV\2\u064d\u064e"+
		"\7\u00da\2\2\u064e\u06a0\3\2\2\2\u064f\u0650\7$\2\2\u0650\u06a0\7\u00bf"+
		"\2\2\u0651\u0652\7;\2\2\u0652\u0653\7\u00d0\2\2\u0653\u0654\5\u00ceh\2"+
		"\u0654\u0655\7C\2\2\u0655\u0656\5\u00b0Y\2\u0656\u0657\7\u00da\2\2\u0657"+
		"\u06a0\3\2\2\2\u0658\u0659\7U\2\2\u0659\u065a\5\u00b0Y\2\u065a\u065b\5"+
		"\u00ceh\2\u065b\u06a0\3\2\2\2\u065c\u065d\7\u0096\2\2\u065d\u065e\7\u00d0"+
		"\2\2\u065e\u065f\5\u00b0Y\2\u065f\u0660\7C\2\2\u0660\u0663\5\u00b0Y\2"+
		"\u0661\u0662\7@\2\2\u0662\u0664\5\u00b0Y\2\u0663\u0661\3\2\2\2\u0663\u0664"+
		"\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0666\7\u00da\2\2\u0666\u06a0\3\2\2"+
		"\2\u0667\u0668\7\u00a1\2\2\u0668\u06a0\7\u00bf\2\2\u0669\u066a\7\u00a6"+
		"\2\2\u066a\u066b\7\u00d0\2\2\u066b\u066c\t\24\2\2\u066c\u066d\7\u00bf"+
		"\2\2\u066d\u066e\7C\2\2\u066e\u066f\5\u00b0Y\2\u066f\u0670\7\u00da\2\2"+
		"\u0670\u06a0\3\2\2\2\u0671\u0677\5\u00d6l\2\u0672\u0674\7\u00d0\2\2\u0673"+
		"\u0675\5\u00acW\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676"+
		"\3\2\2\2\u0676\u0678\7\u00da\2\2\u0677\u0672\3\2\2\2\u0677\u0678\3\2\2"+
		"\2\u0678\u0679\3\2\2\2\u0679\u067b\7\u00d0\2\2\u067a\u067c\7\61\2\2\u067b"+
		"\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\3\2\2\2\u067d\u067f\5\u00b2"+
		"Z\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\3\2\2\2\u0680"+
		"\u0681\7\u00da\2\2\u0681\u06a0\3\2\2\2\u0682\u06a0\5\u00ccg\2\u0683\u0684"+
		"\7\u00c7\2\2\u0684\u06a0\5\u00b0Y\23\u0685\u0686\7r\2\2\u0686\u06a0\5"+
		"\u00b0Y\16\u0687\u0688\5\u00c0a\2\u0688\u0689\7\u00c8\2\2\u0689\u068b"+
		"\3\2\2\2\u068a\u0687\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c\3\2\2\2\u068c"+
		"\u06a0\7\u00c1\2\2\u068d\u068e\7\u00d0\2\2\u068e\u068f\5h\65\2\u068f\u0690"+
		"\7\u00da\2\2\u0690\u06a0\3\2\2\2\u0691\u0692\7\u00d0\2\2\u0692\u0693\5"+
		"\u00b0Y\2\u0693\u0694\7\u00da\2\2\u0694\u06a0\3\2\2\2\u0695\u0696\7\u00d0"+
		"\2\2\u0696\u0697\5\u00acW\2\u0697\u0698\7\u00da\2\2\u0698\u06a0\3\2\2"+
		"\2\u0699\u069b\7\u00ce\2\2\u069a\u069c\5\u00acW\2\u069b\u069a\3\2\2\2"+
		"\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a0\7\u00d9\2\2\u069e"+
		"\u06a0\5\u00b8]\2\u069f\u0634\3\2\2\2\u069f\u0648\3\2\2\2\u069f\u064f"+
		"\3\2\2\2\u069f\u0651\3\2\2\2\u069f\u0658\3\2\2\2\u069f\u065c\3\2\2\2\u069f"+
		"\u0667\3\2\2\2\u069f\u0669\3\2\2\2\u069f\u0671\3\2\2\2\u069f\u0682\3\2"+
		"\2\2\u069f\u0683\3\2\2\2\u069f\u0685\3\2\2\2\u069f\u068a\3\2\2\2\u069f"+
		"\u068d\3\2\2\2\u069f\u0691\3\2\2\2\u069f\u0695\3\2\2\2\u069f\u0699\3\2"+
		"\2\2\u069f\u069e\3\2\2\2\u06a0\u06e8\3\2\2\2\u06a1\u06a2\f\22\2\2\u06a2"+
		"\u06a3\t\25\2\2\u06a3\u06e7\5\u00b0Y\23\u06a4\u06a5\f\21\2\2\u06a5\u06a6"+
		"\t\26\2\2\u06a6\u06e7\5\u00b0Y\22\u06a7\u06ba\f\20\2\2\u06a8\u06bb\7\u00c9"+
		"\2\2\u06a9\u06bb\7\u00ca\2\2\u06aa\u06bb\7\u00d2\2\2\u06ab\u06bb\7\u00cf"+
		"\2\2\u06ac\u06bb\7\u00cb\2\2\u06ad\u06bb\7\u00d1\2\2\u06ae\u06bb\7\u00cc"+
		"\2\2\u06af\u06b1\7F\2\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1"+
		"\u06b3\3\2\2\2\u06b2\u06b4\7r\2\2\u06b3\u06b2\3\2\2\2\u06b3\u06b4\3\2"+
		"\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06bb\7O\2\2\u06b6\u06b8\7r\2\2\u06b7\u06b6"+
		"\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb\t\27\2\2"+
		"\u06ba\u06a8\3\2\2\2\u06ba\u06a9\3\2\2\2\u06ba\u06aa\3\2\2\2\u06ba\u06ab"+
		"\3\2\2\2\u06ba\u06ac\3\2\2\2\u06ba\u06ad\3\2\2\2\u06ba\u06ae\3\2\2\2\u06ba"+
		"\u06b0\3\2\2\2\u06ba\u06b7\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06e7\5\u00b0"+
		"Y\21\u06bd\u06be\f\r\2\2\u06be\u06bf\7\b\2\2\u06bf\u06e7\5\u00b0Y\16\u06c0"+
		"\u06c1\f\f\2\2\u06c1\u06c2\7x\2\2\u06c2\u06e7\5\u00b0Y\r\u06c3\u06c5\f"+
		"\13\2\2\u06c4\u06c6\7r\2\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6"+
		"\u06c7\3\2\2\2\u06c7\u06c8\7\22\2\2\u06c8\u06c9\5\u00b0Y\2\u06c9\u06ca"+
		"\7\b\2\2\u06ca\u06cb\5\u00b0Y\f\u06cb\u06e7\3\2\2\2\u06cc\u06cd\f\n\2"+
		"\2\u06cd\u06ce\7\u00d5\2\2\u06ce\u06cf\5\u00b0Y\2\u06cf\u06d0\7\u00c4"+
		"\2\2\u06d0\u06d1\5\u00b0Y\n\u06d1\u06e7\3\2\2\2\u06d2\u06d3\f\25\2\2\u06d3"+
		"\u06d4\7\u00ce\2\2\u06d4\u06d5\5\u00b0Y\2\u06d5\u06d6\7\u00d9\2\2\u06d6"+
		"\u06e7\3\2\2\2\u06d7\u06d8\f\24\2\2\u06d8\u06d9\7\u00c8\2\2\u06d9\u06e7"+
		"\7\u00bd\2\2\u06da\u06db\f\17\2\2\u06db\u06dd\7W\2\2\u06dc\u06de\7r\2"+
		"\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e7"+
		"\7s\2\2\u06e0\u06e4\f\t\2\2\u06e1\u06e5\5\u00d4k\2\u06e2\u06e3\7\f\2\2"+
		"\u06e3\u06e5\5\u00d6l\2\u06e4\u06e1\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5"+
		"\u06e7\3\2\2\2\u06e6\u06a1\3\2\2\2\u06e6\u06a4\3\2\2\2\u06e6\u06a7\3\2"+
		"\2\2\u06e6\u06bd\3\2\2\2\u06e6\u06c0\3\2\2\2\u06e6\u06c3\3\2\2\2\u06e6"+
		"\u06cc\3\2\2\2\u06e6\u06d2\3\2\2\2\u06e6\u06d7\3\2\2\2\u06e6\u06da\3\2"+
		"\2\2\u06e6\u06e0\3\2\2\2\u06e7\u06ea\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e8"+
		"\u06e9\3\2\2\2\u06e9\u00b1\3\2\2\2\u06ea\u06e8\3\2\2\2\u06eb\u06f0\5\u00b4"+
		"[\2\u06ec\u06ed\7\u00c5\2\2\u06ed\u06ef\5\u00b4[\2\u06ee\u06ec\3\2\2\2"+
		"\u06ef\u06f2\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u00b3"+
		"\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f3\u06f6\5\u00b6\\\2\u06f4\u06f6\5\u00b0"+
		"Y\2\u06f5\u06f3\3\2\2\2\u06f5\u06f4\3\2\2\2\u06f6\u00b5\3\2\2\2\u06f7"+
		"\u06f8\7\u00d0\2\2\u06f8\u06fd\5\u00d6l\2\u06f9\u06fa\7\u00c5\2\2\u06fa"+
		"\u06fc\5\u00d6l\2\u06fb\u06f9\3\2\2\2\u06fc\u06ff\3\2\2\2\u06fd\u06fb"+
		"\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0700\3\2\2\2\u06ff\u06fd\3\2\2\2\u0700"+
		"\u0701\7\u00da\2\2\u0701\u070b\3\2\2\2\u0702\u0707\5\u00d6l\2\u0703\u0704"+
		"\7\u00c5\2\2\u0704\u0706\5\u00d6l\2\u0705\u0703\3\2\2\2\u0706\u0709\3"+
		"\2\2\2\u0707\u0705\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070b\3\2\2\2\u0709"+
		"\u0707\3\2\2\2\u070a\u06f7\3\2\2\2\u070a\u0702\3\2\2\2\u070b\u070c\3\2"+
		"\2\2\u070c\u070d\7\u00c0\2\2\u070d\u070e\5\u00b0Y\2\u070e\u00b7\3\2\2"+
		"\2\u070f\u0710\5\u00c0a\2\u0710\u0711\7\u00c8\2\2\u0711\u0713\3\2\2\2"+
		"\u0712\u070f\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0715"+
		"\5\u00ba^\2\u0715\u00b9\3\2\2\2\u0716\u0719\5\u00d6l\2\u0717\u0718\7\u00c8"+
		"\2\2\u0718\u071a\5\u00d6l\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a"+
		"\u00bb\3\2\2\2\u071b\u071c\b_\1\2\u071c\u0723\5\u00c0a\2\u071d\u0723\5"+
		"\u00be`\2\u071e\u071f\7\u00d0\2\2\u071f\u0720\5h\65\2\u0720\u0721\7\u00da"+
		"\2\2\u0721\u0723\3\2\2\2\u0722\u071b\3\2\2\2\u0722\u071d\3\2\2\2\u0722"+
		"\u071e\3\2\2\2\u0723\u072c\3\2\2\2\u0724\u0728\f\3\2\2\u0725\u0729\5\u00d4"+
		"k\2\u0726\u0727\7\f\2\2\u0727\u0729\5\u00d6l\2\u0728\u0725\3\2\2\2\u0728"+
		"\u0726\3\2\2\2\u0729\u072b\3\2\2\2\u072a\u0724\3\2\2\2\u072b\u072e\3\2"+
		"\2\2\u072c\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u00bd\3\2\2\2\u072e"+
		"\u072c\3\2\2\2\u072f\u0730\5\u00d6l\2\u0730\u0732\7\u00d0\2\2\u0731\u0733"+
		"\5\u00c2b\2\u0732\u0731\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734\3\2\2"+
		"\2\u0734\u0735\7\u00da\2\2\u0735\u00bf\3\2\2\2\u0736\u0737\5\u00c6d\2"+
		"\u0737\u0738\7\u00c8\2\2\u0738\u073a\3\2\2\2\u0739\u0736\3\2\2\2\u0739"+
		"\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c\5\u00d6l\2\u073c\u00c1"+
		"\3\2\2\2\u073d\u0742\5\u00c4c\2\u073e\u073f\7\u00c5\2\2\u073f\u0741\5"+
		"\u00c4c\2\u0740\u073e\3\2\2\2\u0741\u0744\3\2\2\2\u0742\u0740\3\2\2\2"+
		"\u0742\u0743\3\2\2\2\u0743\u00c3\3\2\2\2\u0744\u0742\3\2\2\2\u0745\u0749"+
		"\5\u00ba^\2\u0746\u0749\5\u00be`\2\u0747\u0749\5\u00ccg\2\u0748\u0745"+
		"\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0747\3\2\2\2\u0749\u00c5\3\2\2\2\u074a"+
		"\u074b\5\u00d6l\2\u074b\u00c7\3\2\2\2\u074c\u0755\7\u00bb\2\2\u074d\u074e"+
		"\7\u00c8\2\2\u074e\u0755\t\30\2\2\u074f\u0750\7\u00bd\2\2\u0750\u0752"+
		"\7\u00c8\2\2\u0751\u0753\t\30\2\2\u0752\u0751\3\2\2\2\u0752\u0753\3\2"+
		"\2\2\u0753\u0755\3\2\2\2\u0754\u074c\3\2\2\2\u0754\u074d\3\2\2\2\u0754"+
		"\u074f\3\2\2\2\u0755\u00c9\3\2\2\2\u0756\u0758\t\31\2\2\u0757\u0756\3"+
		"\2\2\2\u0757\u0758\3\2\2\2\u0758\u075f\3\2\2\2\u0759\u0760\5\u00c8e\2"+
		"\u075a\u0760\7\u00bc\2\2\u075b\u0760\7\u00bd\2\2\u075c\u0760\7\u00be\2"+
		"\2\u075d\u0760\7Q\2\2\u075e\u0760\7p\2\2\u075f\u0759\3\2\2\2\u075f\u075a"+
		"\3\2\2\2\u075f\u075b\3\2\2\2\u075f\u075c\3\2\2\2\u075f\u075d\3\2\2\2\u075f"+
		"\u075e\3\2\2\2\u0760\u00cb\3\2\2\2\u0761\u0765\5\u00caf\2\u0762\u0765"+
		"\7\u00bf\2\2\u0763\u0765\7s\2\2\u0764\u0761\3\2\2\2\u0764\u0762\3\2\2"+
		"\2\u0764\u0763\3\2\2\2\u0765\u00cd\3\2\2\2\u0766\u0767\t\32\2\2\u0767"+
		"\u00cf\3\2\2\2\u0768\u0769\t\33\2\2\u0769\u00d1\3\2\2\2\u076a\u076b\t"+
		"\34\2\2\u076b\u00d3\3\2\2\2\u076c\u076f\7\u00ba\2\2\u076d\u076f\5\u00d2"+
		"j\2\u076e\u076c\3\2\2\2\u076e\u076d\3\2\2\2\u076f\u00d5\3\2\2\2\u0770"+
		"\u0774\7\u00ba\2\2\u0771\u0774\5\u00ceh\2\u0772\u0774\5\u00d0i\2\u0773"+
		"\u0770\3\2\2\2\u0773\u0771\3\2\2\2\u0773\u0772\3\2\2\2\u0774\u00d7\3\2"+
		"\2\2\u0775\u0778\5\u00d6l\2\u0776\u0778\7s\2\2\u0777\u0775\3\2\2\2\u0777"+
		"\u0776\3\2\2\2\u0778\u00d9\3\2\2\2\u0779\u077a\7\u00bf\2\2\u077a\u077b"+
		"\7\u00ca\2\2\u077b\u077c\5\u00caf\2\u077c\u00db\3\2\2\2\u0103\u00e0\u00e4"+
		"\u00e7\u00ea\u00fe\u0104\u010b\u0113\u0118\u011f\u0124\u012b\u0130\u0136"+
		"\u013c\u0141\u0147\u014c\u0152\u0157\u015d\u016b\u0172\u0179\u0180\u0186"+
		"\u018b\u0191\u0196\u019c\u01a5\u01af\u01b9\u01cd\u01d5\u01e4\u01eb\u01f9"+
		"\u01ff\u0205\u020c\u0210\u0213\u021a\u021e\u0221\u022c\u0230\u0233\u0238"+
		"\u023a\u023d\u0240\u024a\u024e\u0251\u0254\u0259\u025b\u0261\u0267\u026b"+
		"\u026e\u0271\u0274\u0277\u027c\u0282\u0286\u0289\u028c\u0290\u0298\u02b2"+
		"\u02b4\u02b8\u02ce\u02d0\u02db\u02de\u02e7\u02f8\u0303\u0315\u0322\u0333"+
		"\u033c\u0357\u0359\u036e\u0373\u0378\u037b\u0387\u038c\u0390\u0393\u0397"+
		"\u039b\u03a0\u03a3\u03a7\u03a9\u03bf\u03c7\u03ca\u03d4\u03d8\u03e0\u03e4"+
		"\u03e9\u03ed\u03f1\u03f5\u03f9\u03fb\u0403\u0407\u040a\u0412\u0417\u041c"+
		"\u041f\u0429\u0433\u0437\u043c\u0440\u0446\u0449\u044c\u044f\u045d\u0461"+
		"\u0465\u046a\u046d\u0477\u047f\u0482\u0486\u0489\u048d\u0490\u0493\u0496"+
		"\u0499\u049d\u04a1\u04a4\u04a7\u04aa\u04ad\u04b0\u04b9\u04bf\u04d3\u04e9"+
		"\u04f1\u04f4\u04fa\u0502\u0505\u050b\u050d\u0511\u0516\u0519\u051c\u0520"+
		"\u0524\u0527\u0529\u052c\u0530\u0534\u0537\u0539\u053b\u053e\u0543\u054e"+
		"\u0554\u0559\u0560\u0565\u0569\u056d\u0572\u0579\u058e\u0591\u059a\u059e"+
		"\u05a3\u05a8\u05ab\u05ad\u05c3\u05c6\u05d1\u05d5\u05d8\u05dc\u05e0\u05e8"+
		"\u05ec\u05f9\u0605\u0611\u0619\u061d\u0624\u062a\u0632\u0637\u0640\u0644"+
		"\u0663\u0674\u0677\u067b\u067e\u068a\u069b\u069f\u06b0\u06b3\u06b7\u06ba"+
		"\u06c5\u06dd\u06e4\u06e6\u06e8\u06f0\u06f5\u06fd\u0707\u070a\u0712\u0719"+
		"\u0722\u0728\u072c\u0732\u0739\u0742\u0748\u0752\u0754\u0757\u075f\u0764"+
		"\u076e\u0773\u0777";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}