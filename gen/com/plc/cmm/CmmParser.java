// Generated from /home/tapsi/codes/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.1
package com.plc.cmm;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, APPEND=3, SIZE=4, TRUE=5, FALSE=6, FPTR=7, DISPLAY=8, 
		STRING=9, STRUCT=10, MAIN=11, INT=12, BOOL=13, LIST=14, VOID=15, WHILE=16, 
		DO=17, IF=18, ENDIF=19, ELSE=20, RETURN=21, GET=22, SET=23, SUM=24, PRODUCT=25, 
		SUBTRACT=26, DIVIDE=27, EQUAL=28, ASSIGN=29, NOT_EQUAL=30, BEGIN=31, END=32, 
		SEMICOLON=33, LPAREN=34, RPAREN=35, UNDERLINE=36, EXCLUDE=37, GREATER=38, 
		SMALLER=39, COMMA=40, GREATER_AND_EQUAL=41, SMALLER_AND_EQUAL=42, NEW_LINE=43, 
		SPACE=44, SHARPSIGN=45, ARROW=46, KEYWORDS=47, KEYWORDS_EXCLUDE=48, INTEGER=49, 
		ALPHABET=50, NAMING_CONVENTION=51, WS=52;
	public static final int
		RULE_cmm = 0, RULE_comment = 1, RULE_struct = 2, RULE_function_definition = 3, 
		RULE_arguments = 4, RULE_argument_list = 5, RULE_function_invoke = 6, 
		RULE_main = 7, RULE_statement = 8, RULE_assignment = 9, RULE_expression = 10, 
		RULE_term = 11, RULE_return_statement = 12, RULE_declaration = 13, RULE_argument = 14, 
		RULE_display = 15, RULE_append_dec = 16, RULE_size_dec = 17, RULE_struct_scope = 18, 
		RULE_struct_var_dec = 19, RULE_getter_setter = 20, RULE_scope_body_with_return = 21, 
		RULE_scope_body = 22, RULE_scope_body_one_line = 23, RULE_if_stament = 24, 
		RULE_else_stament = 25, RULE_condition = 26, RULE_while_statement = 27, 
		RULE_do_while_statement = 28, RULE_identifier = 29, RULE_integer = 30, 
		RULE_fptr_type = 31, RULE_list_type = 32, RULE_built_in_data_type = 33, 
		RULE_type_specifier = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "comment", "struct", "function_definition", "arguments", "argument_list", 
			"function_invoke", "main", "statement", "assignment", "expression", "term", 
			"return_statement", "declaration", "argument", "display", "append_dec", 
			"size_dec", "struct_scope", "struct_var_dec", "getter_setter", "scope_body_with_return", 
			"scope_body", "scope_body_one_line", "if_stament", "else_stament", "condition", 
			"while_statement", "do_while_statement", "identifier", "integer", "fptr_type", 
			"list_type", "built_in_data_type", "type_specifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'*/'", "'append'", "'size'", "'true'", "'false'", "'fptr'", 
			"'display'", "'string'", "'struct'", "'main'", "'int'", "'bool'", "'list'", 
			"'void'", "'while'", "'do'", "'if'", "'endif'", "'else'", "'return'", 
			"'get'", "'set'", "'+'", "'*'", "'-'", "'/'", "'=='", "'='", "'!='", 
			"'begin'", "'end'", "';'", "'('", "')'", "'_'", "'?!'", "'>'", "'<'", 
			"','", null, null, "'\n'", "' '", "'#'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "APPEND", "SIZE", "TRUE", "FALSE", "FPTR", "DISPLAY", 
			"STRING", "STRUCT", "MAIN", "INT", "BOOL", "LIST", "VOID", "WHILE", "DO", 
			"IF", "ENDIF", "ELSE", "RETURN", "GET", "SET", "SUM", "PRODUCT", "SUBTRACT", 
			"DIVIDE", "EQUAL", "ASSIGN", "NOT_EQUAL", "BEGIN", "END", "SEMICOLON", 
			"LPAREN", "RPAREN", "UNDERLINE", "EXCLUDE", "GREATER", "SMALLER", "COMMA", 
			"GREATER_AND_EQUAL", "SMALLER_AND_EQUAL", "NEW_LINE", "SPACE", "SHARPSIGN", 
			"ARROW", "KEYWORDS", "KEYWORDS_EXCLUDE", "INTEGER", "ALPHABET", "NAMING_CONVENTION", 
			"WS"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmmContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public CmmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCmm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCmm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCmm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmmContext cmm() throws RecognitionException {
		CmmContext _localctx = new CmmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					comment();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					struct();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					comment();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					function_definition();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					comment();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(100);
			main();
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> ALPHABET() { return getTokens(CmmParser.ALPHABET); }
		public TerminalNode ALPHABET(int i) {
			return getToken(CmmParser.ALPHABET, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(CmmParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(CmmParser.INTEGER, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__0);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER || _la==ALPHABET) {
				{
				{
				setState(103);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==ALPHABET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__1);
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

	public static class StructContext extends ParserRuleContext {
		public Token a;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Struct_scopeContext struct_scope() {
			return getRuleContext(Struct_scopeContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(112);
			match(STRUCT);
			setState(113);
			((StructContext)_localctx).a = match(NAMING_CONVENTION);
			setState(114);
			match(BEGIN);
			setState(115);
			match(NEW_LINE);
			setState(116);
			struct_scope();
			setState(117);
			match(NEW_LINE);
			setState(118);
			match(END);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Token a;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_definition);
		try {
			int _alt;
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FPTR:
				case STRING:
				case STRUCT:
				case INT:
				case BOOL:
				case LIST:
					{
					int a;
					setState(121);
					type_specifier();
					setState(122);
					((Function_definitionContext)_localctx).a = match(NAMING_CONVENTION);
					System.out.println("FunctionDec: "+(((Function_definitionContext)_localctx).a!=null?((Function_definitionContext)_localctx).a.getText():null));
					setState(124);
					argument_list();
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(125);
						scope_body_one_line();
						}
						break;
					case 2:
						{
						setState(126);
						return_statement();
						}
						break;
					}
					}
					break;
				case T__0:
				case BEGIN:
				case NEW_LINE:
					{
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(129);
							scope_body();
							}
							} 
						}
						setState(134);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(135);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					int a;
					setState(139);
					match(VOID);
					setState(140);
					((Function_definitionContext)_localctx).a = match(NAMING_CONVENTION);
					System.out.println("FunctionDec: "+(((Function_definitionContext)_localctx).a!=null?((Function_definitionContext)_localctx).a.getText():null));
					setState(142);
					argument_list();
					{
					setState(143);
					scope_body_one_line();
					}
					}
					break;
				case T__0:
				case BEGIN:
				case NEW_LINE:
					{
					setState(146); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(145);
							scope_body();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(148); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FPTR) | (1L << STRING) | (1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST))) != 0)) {
				{
				{
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						argument();
						setState(155);
						match(COMMA);
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				{
				setState(162);
				argument();
				}
				}
				}
				setState(167);
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

	public static class Argument_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LPAREN);
			setState(169);
			arguments();
			setState(170);
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

	public static class Function_invokeContext extends ParserRuleContext {
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Function_invokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction_invoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction_invoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction_invoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invokeContext function_invoke() throws RecognitionException {
		Function_invokeContext _localctx = new Function_invokeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_invoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NAMING_CONVENTION);
			setState(173);
			argument_list();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN:
				enterOuterAlt(_localctx, 1);
				{
				int a;
				System.out.println("Main");
				setState(177);
				match(MAIN);
				setState(178);
				match(LPAREN);
				setState(179);
				match(RPAREN);
				setState(180);
				scope_body_one_line();
				}
				break;
			case EOF:
			case T__0:
			case BEGIN:
			case NEW_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BEGIN) | (1L << NEW_LINE))) != 0)) {
					{
					{
					setState(181);
					scope_body();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public If_stamentContext if_stament() {
			return getRuleContext(If_stamentContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_invokeContext function_invoke() {
			return getRuleContext(Function_invokeContext.class,0);
		}
		public Size_decContext size_dec() {
			return getRuleContext(Size_decContext.class,0);
		}
		public Append_decContext append_dec() {
			return getRuleContext(Append_decContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				if_stament();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				while_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				do_while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				display();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(196);
				function_invoke();
				System.out.println("FunctionCall");
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				size_dec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				append_dec();
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			expression();
			setState(204);
			match(ASSIGN);
			setState(205);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PRODUCT() { return getToken(CmmParser.PRODUCT, 0); }
		public TerminalNode DIVIDE() { return getToken(CmmParser.DIVIDE, 0); }
		public TerminalNode SUM() { return getToken(CmmParser.SUM, 0); }
		public TerminalNode SUBTRACT() { return getToken(CmmParser.SUBTRACT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				term();
				setState(209);
				match(PRODUCT);
				setState(210);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				term();
				setState(213);
				match(DIVIDE);
				setState(214);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				term();
				setState(217);
				match(SUM);
				setState(218);
				term();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				term();
				setState(221);
				match(SUBTRACT);
				setState(222);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Function_invokeContext function_invoke() {
			return getRuleContext(Function_invokeContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				function_invoke();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(CmmParser.NEW_LINE, 0); }
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(NEW_LINE);
			setState(232);
			match(RETURN);
			System.out.println("Return");
			setState(234);
			expression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token a;
		public List<TerminalNode> NAMING_CONVENTION() { return getTokens(CmmParser.NAMING_CONVENTION); }
		public TerminalNode NAMING_CONVENTION(int i) {
			return getToken(CmmParser.NAMING_CONVENTION, i);
		}
		public Built_in_data_typeContext built_in_data_type() {
			return getRuleContext(Built_in_data_typeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
				{
				setState(237);
				built_in_data_type();
				}
				break;
			case STRUCT:
				{
				{
				setState(238);
				match(STRUCT);
				setState(239);
				match(NAMING_CONVENTION);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			((DeclarationContext)_localctx).a = match(NAMING_CONVENTION);
			System.out.println("VarDec: "+(((DeclarationContext)_localctx).a!=null?((DeclarationContext)_localctx).a.getText():null));
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

	public static class ArgumentContext extends ParserRuleContext {
		public Token a;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(246);
			type_specifier();
			setState(247);
			((ArgumentContext)_localctx).a = match(NAMING_CONVENTION);
			System.out.println("ArgumentDec: "+(((ArgumentContext)_localctx).a!=null?((ArgumentContext)_localctx).a.getText():null));
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

	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDisplay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(DISPLAY);
			System.out.println("Built-in: display");
			setState(252);
			match(LPAREN);
			setState(253);
			expression();
			setState(254);
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

	public static class Append_decContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Append_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppend_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppend_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppend_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_decContext append_dec() throws RecognitionException {
		Append_decContext _localctx = new Append_decContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_append_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("Append");
			setState(257);
			match(APPEND);
			setState(258);
			match(LPAREN);
			setState(259);
			match(NAMING_CONVENTION);
			setState(260);
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

	public static class Size_decContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Size_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSize_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSize_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSize_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Size_decContext size_dec() throws RecognitionException {
		Size_decContext _localctx = new Size_decContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_size_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("Size");
			setState(263);
			match(SIZE);
			setState(264);
			match(LPAREN);
			setState(265);
			match(NAMING_CONVENTION);
			setState(266);
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

	public static class Struct_scopeContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Struct_var_decContext> struct_var_dec() {
			return getRuleContexts(Struct_var_decContext.class);
		}
		public Struct_var_decContext struct_var_dec(int i) {
			return getRuleContext(Struct_var_decContext.class,i);
		}
		public Struct_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_scopeContext struct_scope() throws RecognitionException {
		Struct_scopeContext _localctx = new Struct_scopeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_struct_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FPTR) | (1L << STRING) | (1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST))) != 0)) {
				{
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(268);
					declaration();
					}
					break;
				case 2:
					{
					setState(269);
					struct_var_dec();
					}
					break;
				}
				}
				setState(274);
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

	public static class Struct_var_decContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Getter_setterContext getter_setter() {
			return getRuleContext(Getter_setterContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public Struct_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct_var_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct_var_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct_var_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_var_decContext struct_var_dec() throws RecognitionException {
		Struct_var_decContext _localctx = new Struct_var_decContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_struct_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			declaration();
			setState(276);
			argument_list();
			setState(277);
			match(BEGIN);
			setState(278);
			match(NEW_LINE);
			setState(279);
			getter_setter();
			setState(280);
			match(NEW_LINE);
			setState(281);
			match(END);
			setState(282);
			match(NEW_LINE);
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

	public static class Getter_setterContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public Scope_body_with_returnContext scope_body_with_return() {
			return getRuleContext(Scope_body_with_returnContext.class,0);
		}
		public Getter_setterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetter_setter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetter_setter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetter_setter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setterContext getter_setter() throws RecognitionException {
		Getter_setterContext _localctx = new Getter_setterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_getter_setter);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(SET);
				setState(285);
				scope_body_one_line();
				setState(286);
				match(GET);
				setState(287);
				return_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(SET);
				setState(290);
				scope_body();
				setState(291);
				match(GET);
				setState(292);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(SET);
				setState(295);
				scope_body_one_line();
				setState(296);
				match(GET);
				setState(297);
				scope_body_with_return();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(SET);
				setState(300);
				scope_body();
				setState(301);
				match(GET);
				setState(302);
				scope_body_with_return();
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

	public static class Scope_body_with_returnContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public Scope_body_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_body_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterScope_body_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitScope_body_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitScope_body_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_body_with_returnContext scope_body_with_return() throws RecognitionException {
		Scope_body_with_returnContext _localctx = new Scope_body_with_returnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scope_body_with_return);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					scope_body();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(312);
			return_statement();
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

	public static class Scope_bodyContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public List<Scope_body_one_lineContext> scope_body_one_line() {
			return getRuleContexts(Scope_body_one_lineContext.class);
		}
		public Scope_body_one_lineContext scope_body_one_line(int i) {
			return getRuleContext(Scope_body_one_lineContext.class,i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public Scope_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterScope_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitScope_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitScope_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_bodyContext scope_body() throws RecognitionException {
		Scope_bodyContext _localctx = new Scope_bodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_scope_body);
		int _la;
		try {
			int _alt;
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(BEGIN);
				setState(315);
				match(NEW_LINE);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(316);
					comment();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(326);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case APPEND:
						case SIZE:
						case FPTR:
						case DISPLAY:
						case STRING:
						case STRUCT:
						case INT:
						case BOOL:
						case LIST:
						case WHILE:
						case DO:
						case IF:
						case INTEGER:
						case NAMING_CONVENTION:
							{
							setState(322);
							statement();
							setState(323);
							match(SEMICOLON);
							}
							break;
						case NEW_LINE:
							{
							setState(325);
							scope_body_one_line();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(328); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__0:
			case NEW_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(330);
					comment();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(NEW_LINE);
				setState(337);
				match(END);
				setState(338);
				match(NEW_LINE);
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

	public static class Scope_body_one_lineContext extends ParserRuleContext {
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Scope_body_one_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_body_one_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterScope_body_one_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitScope_body_one_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitScope_body_one_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_body_one_lineContext scope_body_one_line() throws RecognitionException {
		Scope_body_one_lineContext _localctx = new Scope_body_one_lineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_scope_body_one_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(NEW_LINE);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(342);
				comment();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			statement();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(349);
				comment();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(NEW_LINE);
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

	public static class If_stamentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Else_stamentContext else_stament() {
			return getRuleContext(Else_stamentContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public If_stamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stament; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIf_stament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIf_stament(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIf_stament(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stamentContext if_stament() throws RecognitionException {
		If_stamentContext _localctx = new If_stamentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_stament);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(357);
				match(IF);
				System.out.println("Conditional: if");
				setState(359);
				match(LPAREN);
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(360);
					expression();
					}
					break;
				case 2:
					{
					setState(361);
					condition();
					}
					break;
				}
				setState(364);
				match(RPAREN);
				setState(365);
				scope_body_one_line();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(367);
				match(IF);
				System.out.println("Conditional: if");
				setState(369);
				match(LPAREN);
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(370);
					expression();
					}
					break;
				case 2:
					{
					setState(371);
					condition();
					}
					break;
				}
				setState(374);
				match(RPAREN);
				setState(375);
				scope_body_one_line();
				setState(376);
				else_stament();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(378);
				match(IF);
				System.out.println("Conditional: if");
				setState(380);
				match(LPAREN);
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(381);
					expression();
					}
					break;
				case 2:
					{
					setState(382);
					condition();
					}
					break;
				}
				setState(385);
				match(RPAREN);
				setState(386);
				scope_body();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(388);
				match(IF);
				System.out.println("Conditional: if");
				setState(390);
				match(LPAREN);
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(391);
					expression();
					}
					break;
				case 2:
					{
					setState(392);
					condition();
					}
					break;
				}
				setState(395);
				match(RPAREN);
				setState(396);
				scope_body();
				setState(397);
				else_stament();
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

	public static class Else_stamentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public Else_stamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stament; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElse_stament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElse_stament(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElse_stament(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stamentContext else_stament() throws RecognitionException {
		Else_stamentContext _localctx = new Else_stamentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_else_stament);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(401);
				match(ELSE);
				System.out.println("Conditonal: else");
				setState(403);
				scope_body_one_line();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(404);
				match(ELSE);
				System.out.println("Conditonal: else");
				setState(406);
				scope_body();
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

	public static class ConditionContext extends ParserRuleContext {
		public Token a;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(CmmParser.EQUAL, 0); }
		public TerminalNode GREATER_AND_EQUAL() { return getToken(CmmParser.GREATER_AND_EQUAL, 0); }
		public TerminalNode SMALLER_AND_EQUAL() { return getToken(CmmParser.SMALLER_AND_EQUAL, 0); }
		public TerminalNode SMALLER() { return getToken(CmmParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(CmmParser.GREATER, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CmmParser.NOT_EQUAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMING_CONVENTION:
				{
				setState(410);
				identifier();
				}
				break;
			case INTEGER:
				{
				setState(411);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414);
			((ConditionContext)_localctx).a = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << GREATER) | (1L << SMALLER) | (1L << GREATER_AND_EQUAL) | (1L << SMALLER_AND_EQUAL))) != 0)) ) {
				((ConditionContext)_localctx).a = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			System.out.println("Operator: "+(((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null));
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMING_CONVENTION:
				{
				setState(416);
				identifier();
				}
				break;
			case INTEGER:
				{
				setState(417);
				integer();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_statement);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(420);
				match(WHILE);
				System.out.println("Loop: while");
				setState(422);
				match(LPAREN);
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(423);
					expression();
					}
					break;
				case 2:
					{
					setState(424);
					condition();
					}
					break;
				}
				setState(427);
				match(RPAREN);
				setState(428);
				scope_body_one_line();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(430);
				match(WHILE);
				System.out.println("Loop: while");
				setState(432);
				match(LPAREN);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(433);
					expression();
					}
					break;
				case 2:
					{
					setState(434);
					condition();
					}
					break;
				}
				setState(437);
				match(RPAREN);
				setState(438);
				scope_body();
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_do_while_statement);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(442);
				match(DO);
				System.out.println("Loop: do...while");
				setState(444);
				scope_body_one_line();
				setState(445);
				match(WHILE);
				setState(446);
				match(LPAREN);
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(447);
					expression();
					}
					break;
				case 2:
					{
					setState(448);
					condition();
					}
					break;
				}
				setState(451);
				match(RPAREN);
				setState(452);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(454);
				match(DO);
				System.out.println("Loop: do...while");
				setState(456);
				scope_body();
				setState(457);
				match(WHILE);
				setState(458);
				match(LPAREN);
				setState(461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(459);
					expression();
					}
					break;
				case 2:
					{
					setState(460);
					condition();
					}
					break;
				}
				setState(463);
				match(RPAREN);
				setState(464);
				match(SEMICOLON);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(NAMING_CONVENTION);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CmmParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(INTEGER);
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

	public static class Fptr_typeContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode SMALLER() { return getToken(CmmParser.SMALLER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Fptr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fptr_typeContext fptr_type() throws RecognitionException {
		Fptr_typeContext _localctx = new Fptr_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fptr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(472);
			match(FPTR);
			setState(473);
			match(SMALLER);
			setState(474);
			arguments();
			setState(475);
			match(ARROW);
			setState(476);
			type_specifier();
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

	public static class List_typeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CmmParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CmmParser.SPACE, i);
		}
		public TerminalNode SHARPSIGN() { return getToken(CmmParser.SHARPSIGN, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public List_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterList_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitList_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitList_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_typeContext list_type() throws RecognitionException {
		List_typeContext _localctx = new List_typeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_list_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(478);
			match(LIST);
			setState(479);
			match(SPACE);
			setState(480);
			match(SHARPSIGN);
			setState(481);
			match(SPACE);
			setState(482);
			type_specifier();
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

	public static class Built_in_data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CmmParser.STRING, 0); }
		public List_typeContext list_type() {
			return getRuleContext(List_typeContext.class,0);
		}
		public Fptr_typeContext fptr_type() {
			return getRuleContext(Fptr_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public Built_in_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBuilt_in_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBuilt_in_data_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBuilt_in_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_data_typeContext built_in_data_type() throws RecognitionException {
		Built_in_data_typeContext _localctx = new Built_in_data_typeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_built_in_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(484);
				match(INT);
				}
				break;
			case 2:
				{
				setState(485);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(486);
				list_type();
				}
				break;
			case 4:
				{
				setState(487);
				fptr_type();
				}
				break;
			case 5:
				{
				setState(488);
				match(BOOL);
				}
				break;
			case 6:
				{
				setState(489);
				match(FPTR);
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Built_in_data_typeContext built_in_data_type() {
			return getRuleContext(Built_in_data_typeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
				{
				setState(492);
				built_in_data_type();
				}
				break;
			case STRUCT:
				{
				setState(493);
				match(STRUCT);
				setState(494);
				match(NAMING_CONVENTION);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u01f4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P\n\2\f\2\16"+
		"\2S\13\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2"+
		"\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3\3\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0082\n\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\5\5\5\u008b\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0095\n\5\r\5\16\5\u0096\5\5\u0099\n"+
		"\5\5\5\u009b\n\5\3\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6\7\6"+
		"\u00a6\n\6\f\6\16\6\u00a9\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u00b9\n\t\f\t\16\t\u00bc\13\t\5\t\u00be\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cc\n\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00e3\n\f\3\r\3\r\3\r\5\r\u00e8\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\5\17\u00f3\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u0111\n\24\f\24\16\24\u0114\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0133\n\26\3\27\7\27\u0136\n\27\f\27\16\27\u0139\13\27\3"+
		"\27\3\27\3\30\3\30\3\30\7\30\u0140\n\30\f\30\16\30\u0143\13\30\3\30\3"+
		"\30\3\30\3\30\6\30\u0149\n\30\r\30\16\30\u014a\3\30\7\30\u014e\n\30\f"+
		"\30\16\30\u0151\13\30\3\30\3\30\3\30\5\30\u0156\n\30\3\31\3\31\7\31\u015a"+
		"\n\31\f\31\16\31\u015d\13\31\3\31\3\31\7\31\u0161\n\31\f\31\16\31\u0164"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u016d\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0177\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0182\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u018c\n\32\3\32\3\32\3\32\3\32\5\32\u0192\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u019a\n\33\3\34\3\34\3\34\5\34\u019f\n\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01a5\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u01ac\n"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01b6\n\35\3\35\3\35"+
		"\3\35\5\35\u01bb\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01c4\n"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01d0\n\36"+
		"\3\36\3\36\3\36\5\36\u01d5\n\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u01ed\n#\3$\3$\3$\5$\u01f2\n"+
		"$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDF\2\4\3\2\63\64\6\2\36\36  ()+,\2\u0213\2K\3\2\2\2\4h\3\2\2\2\6"+
		"q\3\2\2\2\b\u009a\3\2\2\2\n\u00a7\3\2\2\2\f\u00aa\3\2\2\2\16\u00ae\3\2"+
		"\2\2\20\u00bd\3\2\2\2\22\u00cb\3\2\2\2\24\u00cd\3\2\2\2\26\u00e2\3\2\2"+
		"\2\30\u00e7\3\2\2\2\32\u00e9\3\2\2\2\34\u00ee\3\2\2\2\36\u00f7\3\2\2\2"+
		" \u00fc\3\2\2\2\"\u0102\3\2\2\2$\u0108\3\2\2\2&\u0112\3\2\2\2(\u0115\3"+
		"\2\2\2*\u0132\3\2\2\2,\u0137\3\2\2\2.\u0155\3\2\2\2\60\u0157\3\2\2\2\62"+
		"\u0191\3\2\2\2\64\u0199\3\2\2\2\66\u019b\3\2\2\28\u01ba\3\2\2\2:\u01d4"+
		"\3\2\2\2<\u01d6\3\2\2\2>\u01d8\3\2\2\2@\u01da\3\2\2\2B\u01e0\3\2\2\2D"+
		"\u01ec\3\2\2\2F\u01f1\3\2\2\2HJ\5\4\3\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\6\4\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2RW\3\2\2\2SQ\3\2\2\2TV\5\4\3\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2"+
		"WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\5\b\5\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b\5\4\3\2a`\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\5\20\t\2g\3\3\2\2\2hl\7\3\2\2ik\t\2"+
		"\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\4"+
		"\2\2p\5\3\2\2\2qr\b\4\1\2rs\7\f\2\2st\7\65\2\2tu\7!\2\2uv\7-\2\2vw\5&"+
		"\24\2wx\7-\2\2xy\7\"\2\2y\7\3\2\2\2z{\b\5\1\2{|\5F$\2|}\7\65\2\2}~\b\5"+
		"\1\2~\u0081\5\f\7\2\177\u0082\5\60\31\2\u0080\u0082\5\32\16\2\u0081\177"+
		"\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u008b\3\2\2\2\u0083\u0085\5.\30\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\5\32\16\2\u008a"+
		"z\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u009b\3\2\2\2\u008c\u008d\b\5\1\2"+
		"\u008d\u008e\7\21\2\2\u008e\u008f\7\65\2\2\u008f\u0090\b\5\1\2\u0090\u0091"+
		"\5\f\7\2\u0091\u0092\5\60\31\2\u0092\u0099\3\2\2\2\u0093\u0095\5.\30\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u008c\3\2\2\2\u0098\u0094\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u008a\3\2\2\2\u009a\u0098\3\2\2\2\u009b\t\3\2\2\2"+
		"\u009c\u009d\5\36\20\2\u009d\u009e\7*\2\2\u009e\u00a0\3\2\2\2\u009f\u009c"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\5\36\20\2\u00a5\u00a1\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\13\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\5\n\6\2"+
		"\u00ac\u00ad\7%\2\2\u00ad\r\3\2\2\2\u00ae\u00af\7\65\2\2\u00af\u00b0\5"+
		"\f\7\2\u00b0\17\3\2\2\2\u00b1\u00b2\b\t\1\2\u00b2\u00b3\b\t\1\2\u00b3"+
		"\u00b4\7\r\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b6\7%\2\2\u00b6\u00be\5\60"+
		"\31\2\u00b7\u00b9\5.\30\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00cc"+
		"\5\62\32\2\u00c0\u00cc\58\35\2\u00c1\u00cc\5:\36\2\u00c2\u00cc\5\24\13"+
		"\2\u00c3\u00cc\5 \21\2\u00c4\u00cc\5\34\17\2\u00c5\u00cc\5\26\f\2\u00c6"+
		"\u00c7\5\16\b\2\u00c7\u00c8\b\n\1\2\u00c8\u00cc\3\2\2\2\u00c9\u00cc\5"+
		"$\23\2\u00ca\u00cc\5\"\22\2\u00cb\u00bf\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb"+
		"\u00c1\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c4\3\2"+
		"\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\23\3\2\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\7\37"+
		"\2\2\u00cf\u00d0\5\26\f\2\u00d0\25\3\2\2\2\u00d1\u00e3\5\30\r\2\u00d2"+
		"\u00d3\5\30\r\2\u00d3\u00d4\7\33\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00e3"+
		"\3\2\2\2\u00d6\u00d7\5\30\r\2\u00d7\u00d8\7\35\2\2\u00d8\u00d9\5\30\r"+
		"\2\u00d9\u00e3\3\2\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\7\32\2\2\u00dc"+
		"\u00dd\5\30\r\2\u00dd\u00e3\3\2\2\2\u00de\u00df\5\30\r\2\u00df\u00e0\7"+
		"\34\2\2\u00e0\u00e1\5\30\r\2\u00e1\u00e3\3\2\2\2\u00e2\u00d1\3\2\2\2\u00e2"+
		"\u00d2\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00de\3\2"+
		"\2\2\u00e3\27\3\2\2\2\u00e4\u00e8\5<\37\2\u00e5\u00e8\5> \2\u00e6\u00e8"+
		"\5\16\b\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e8\31\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec"+
		"\b\16\1\2\u00ec\u00ed\5\26\f\2\u00ed\33\3\2\2\2\u00ee\u00f2\b\17\1\2\u00ef"+
		"\u00f3\5D#\2\u00f0\u00f1\7\f\2\2\u00f1\u00f3\7\65\2\2\u00f2\u00ef\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\65\2\2\u00f5"+
		"\u00f6\b\17\1\2\u00f6\35\3\2\2\2\u00f7\u00f8\b\20\1\2\u00f8\u00f9\5F$"+
		"\2\u00f9\u00fa\7\65\2\2\u00fa\u00fb\b\20\1\2\u00fb\37\3\2\2\2\u00fc\u00fd"+
		"\7\n\2\2\u00fd\u00fe\b\21\1\2\u00fe\u00ff\7$\2\2\u00ff\u0100\5\26\f\2"+
		"\u0100\u0101\7%\2\2\u0101!\3\2\2\2\u0102\u0103\b\22\1\2\u0103\u0104\7"+
		"\5\2\2\u0104\u0105\7$\2\2\u0105\u0106\7\65\2\2\u0106\u0107\7%\2\2\u0107"+
		"#\3\2\2\2\u0108\u0109\b\23\1\2\u0109\u010a\7\6\2\2\u010a\u010b\7$\2\2"+
		"\u010b\u010c\7\65\2\2\u010c\u010d\7%\2\2\u010d%\3\2\2\2\u010e\u0111\5"+
		"\34\17\2\u010f\u0111\5(\25\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\'\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0115\u0116\5\34\17\2\u0116\u0117\5\f\7\2\u0117\u0118"+
		"\7!\2\2\u0118\u0119\7-\2\2\u0119\u011a\5*\26\2\u011a\u011b\7-\2\2\u011b"+
		"\u011c\7\"\2\2\u011c\u011d\7-\2\2\u011d)\3\2\2\2\u011e\u011f\7\31\2\2"+
		"\u011f\u0120\5\60\31\2\u0120\u0121\7\30\2\2\u0121\u0122\5\32\16\2\u0122"+
		"\u0133\3\2\2\2\u0123\u0124\7\31\2\2\u0124\u0125\5.\30\2\u0125\u0126\7"+
		"\30\2\2\u0126\u0127\5\32\16\2\u0127\u0133\3\2\2\2\u0128\u0129\7\31\2\2"+
		"\u0129\u012a\5\60\31\2\u012a\u012b\7\30\2\2\u012b\u012c\5,\27\2\u012c"+
		"\u0133\3\2\2\2\u012d\u012e\7\31\2\2\u012e\u012f\5.\30\2\u012f\u0130\7"+
		"\30\2\2\u0130\u0131\5,\27\2\u0131\u0133\3\2\2\2\u0132\u011e\3\2\2\2\u0132"+
		"\u0123\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u012d\3\2\2\2\u0133+\3\2\2\2"+
		"\u0134\u0136\5.\30\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\5\32\16\2\u013b-\3\2\2\2\u013c\u013d\7!\2\2\u013d\u0141\7-\2\2"+
		"\u013e\u0140\5\4\3\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0148\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\5\22\n\2\u0145\u0146\7#\2\2\u0146\u0149\3\2\2\2\u0147\u0149\5\60"+
		"\31\2\u0148\u0144\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0156\3\2\2\2\u014c\u014e\5\4"+
		"\3\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7-"+
		"\2\2\u0153\u0154\7\"\2\2\u0154\u0156\7-\2\2\u0155\u013c\3\2\2\2\u0155"+
		"\u014f\3\2\2\2\u0156/\3\2\2\2\u0157\u015b\7-\2\2\u0158\u015a\5\4\3\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0162\5\22\n\2\u015f"+
		"\u0161\5\4\3\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\7-\2\2\u0166\61\3\2\2\2\u0167\u0168\7\24\2\2\u0168\u0169\b\32\1"+
		"\2\u0169\u016c\7$\2\2\u016a\u016d\5\26\f\2\u016b\u016d\5\66\34\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7%"+
		"\2\2\u016f\u0170\5\60\31\2\u0170\u0192\3\2\2\2\u0171\u0172\7\24\2\2\u0172"+
		"\u0173\b\32\1\2\u0173\u0176\7$\2\2\u0174\u0177\5\26\f\2\u0175\u0177\5"+
		"\66\34\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\7%\2\2\u0179\u017a\5\60\31\2\u017a\u017b\5\64\33\2\u017b\u0192"+
		"\3\2\2\2\u017c\u017d\7\24\2\2\u017d\u017e\b\32\1\2\u017e\u0181\7$\2\2"+
		"\u017f\u0182\5\26\f\2\u0180\u0182\5\66\34\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7%\2\2\u0184\u0185\5.\30"+
		"\2\u0185\u0192\3\2\2\2\u0186\u0187\7\24\2\2\u0187\u0188\b\32\1\2\u0188"+
		"\u018b\7$\2\2\u0189\u018c\5\26\f\2\u018a\u018c\5\66\34\2\u018b\u0189\3"+
		"\2\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7%\2\2\u018e"+
		"\u018f\5.\30\2\u018f\u0190\5\64\33\2\u0190\u0192\3\2\2\2\u0191\u0167\3"+
		"\2\2\2\u0191\u0171\3\2\2\2\u0191\u017c\3\2\2\2\u0191\u0186\3\2\2\2\u0192"+
		"\63\3\2\2\2\u0193\u0194\7\26\2\2\u0194\u0195\b\33\1\2\u0195\u019a\5\60"+
		"\31\2\u0196\u0197\7\26\2\2\u0197\u0198\b\33\1\2\u0198\u019a\5.\30\2\u0199"+
		"\u0193\3\2\2\2\u0199\u0196\3\2\2\2\u019a\65\3\2\2\2\u019b\u019e\b\34\1"+
		"\2\u019c\u019f\5<\37\2\u019d\u019f\5> \2\u019e\u019c\3\2\2\2\u019e\u019d"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\t\3\2\2\u01a1\u01a4\b\34\1\2"+
		"\u01a2\u01a5\5<\37\2\u01a3\u01a5\5> \2\u01a4\u01a2\3\2\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\67\3\2\2\2\u01a6\u01a7\7\22\2\2\u01a7\u01a8\b\35\1\2\u01a8"+
		"\u01ab\7$\2\2\u01a9\u01ac\5\26\f\2\u01aa\u01ac\5\66\34\2\u01ab\u01a9\3"+
		"\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7%\2\2\u01ae"+
		"\u01af\5\60\31\2\u01af\u01bb\3\2\2\2\u01b0\u01b1\7\22\2\2\u01b1\u01b2"+
		"\b\35\1\2\u01b2\u01b5\7$\2\2\u01b3\u01b6\5\26\f\2\u01b4\u01b6\5\66\34"+
		"\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8"+
		"\7%\2\2\u01b8\u01b9\5.\30\2\u01b9\u01bb\3\2\2\2\u01ba\u01a6\3\2\2\2\u01ba"+
		"\u01b0\3\2\2\2\u01bb9\3\2\2\2\u01bc\u01bd\7\23\2\2\u01bd\u01be\b\36\1"+
		"\2\u01be\u01bf\5\60\31\2\u01bf\u01c0\7\22\2\2\u01c0\u01c3\7$\2\2\u01c1"+
		"\u01c4\5\26\f\2\u01c2\u01c4\5\66\34\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7%\2\2\u01c6\u01c7\7#\2\2\u01c7"+
		"\u01d5\3\2\2\2\u01c8\u01c9\7\23\2\2\u01c9\u01ca\b\36\1\2\u01ca\u01cb\5"+
		".\30\2\u01cb\u01cc\7\22\2\2\u01cc\u01cf\7$\2\2\u01cd\u01d0\5\26\f\2\u01ce"+
		"\u01d0\5\66\34\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3"+
		"\2\2\2\u01d1\u01d2\7%\2\2\u01d2\u01d3\7#\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01bc\3\2\2\2\u01d4\u01c8\3\2\2\2\u01d5;\3\2\2\2\u01d6\u01d7\7\65\2\2"+
		"\u01d7=\3\2\2\2\u01d8\u01d9\7\63\2\2\u01d9?\3\2\2\2\u01da\u01db\7\t\2"+
		"\2\u01db\u01dc\7)\2\2\u01dc\u01dd\5\n\6\2\u01dd\u01de\7\60\2\2\u01de\u01df"+
		"\5F$\2\u01dfA\3\2\2\2\u01e0\u01e1\7\20\2\2\u01e1\u01e2\7.\2\2\u01e2\u01e3"+
		"\7/\2\2\u01e3\u01e4\7.\2\2\u01e4\u01e5\5F$\2\u01e5C\3\2\2\2\u01e6\u01ed"+
		"\7\16\2\2\u01e7\u01ed\7\13\2\2\u01e8\u01ed\5B\"\2\u01e9\u01ed\5@!\2\u01ea"+
		"\u01ed\7\17\2\2\u01eb\u01ed\7\t\2\2\u01ec\u01e6\3\2\2\2\u01ec\u01e7\3"+
		"\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01edE\3\2\2\2\u01ee\u01f2\5D#\2\u01ef\u01f0\7\f\2\2\u01f0"+
		"\u01f2\7\65\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2G\3\2\2\2"+
		"\61KQW]cl\u0081\u0086\u008a\u0096\u0098\u009a\u00a1\u00a7\u00ba\u00bd"+
		"\u00cb\u00e2\u00e7\u00f2\u0110\u0112\u0132\u0137\u0141\u0148\u014a\u014f"+
		"\u0155\u015b\u0162\u016c\u0176\u0181\u018b\u0191\u0199\u019e\u01a4\u01ab"+
		"\u01b5\u01ba\u01c3\u01cf\u01d4\u01ec\u01f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}