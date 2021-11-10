// Generated from /home/tapsi/codes/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.1
package com.plc.cmm;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WHILE=3, STRUCT=4, APPEND=5, SIZE=6, TRUE=7, FALSE=8, 
		FPTR=9, DISPLAY=10, STRING=11, MAIN=12, INT=13, BOOL=14, LIST=15, VOID=16, 
		DO=17, IF=18, ENDIF=19, ELSE=20, RETURN=21, GET=22, BEGIN=23, END=24, 
		SET=25, NAMING_CONVENTION=26, LPAREN=27, RPAREN=28, DOT=29, LBRACKET=30, 
		RBRACKET=31, TILDA=32, PRODUCT=33, DIVIDE=34, SUM=35, SUBTRACT=36, GREATER=37, 
		SMALLER=38, EQUAL=39, AND=40, OR=41, ASSIGN=42, COMMA=43, ARROW=44, NOT_EQUAL=45, 
		SEMICOLON=46, UNDERLINE=47, GREATER_AND_EQUAL=48, SMALLER_AND_EQUAL=49, 
		NEW_LINE=50, SHARPSIGN=51, TAB=52, INTEGER=53, ALPHABET=54, Whitespace=55, 
		Linebreak=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WHILE", "STRUCT", "APPEND", "SIZE", "TRUE", "FALSE", 
			"FPTR", "DISPLAY", "STRING", "MAIN", "INT", "BOOL", "LIST", "VOID", "DO", 
			"IF", "ENDIF", "ELSE", "RETURN", "GET", "BEGIN", "END", "SET", "NAMING_CONVENTION", 
			"LPAREN", "RPAREN", "DOT", "LBRACKET", "RBRACKET", "TILDA", "PRODUCT", 
			"DIVIDE", "SUM", "SUBTRACT", "GREATER", "SMALLER", "EQUAL", "AND", "OR", 
			"ASSIGN", "COMMA", "ARROW", "NOT_EQUAL", "SEMICOLON", "UNDERLINE", "GREATER_AND_EQUAL", 
			"SMALLER_AND_EQUAL", "NEW_LINE", "SHARPSIGN", "TAB", "INTEGER", "ALPHABET", 
			"Whitespace", "Linebreak"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'*/'", "'while'", "'struct'", "'append'", "'size'", "'true'", 
			"'false'", "'fptr'", "'display'", "'string'", "'main'", "'int'", "'bool'", 
			"'list'", "'void'", "'do'", "'if'", "'endif'", "'else'", "'return'", 
			"'get'", "'begin'", "'end'", "'set'", null, "'('", "')'", "'.'", "'['", 
			"']'", "'~'", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'=='", "'&'", 
			"'|'", "'='", "','", "'->'", "'!='", "';'", "'_'", null, null, "'\n'", 
			"'#'", "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WHILE", "STRUCT", "APPEND", "SIZE", "TRUE", "FALSE", 
			"FPTR", "DISPLAY", "STRING", "MAIN", "INT", "BOOL", "LIST", "VOID", "DO", 
			"IF", "ENDIF", "ELSE", "RETURN", "GET", "BEGIN", "END", "SET", "NAMING_CONVENTION", 
			"LPAREN", "RPAREN", "DOT", "LBRACKET", "RBRACKET", "TILDA", "PRODUCT", 
			"DIVIDE", "SUM", "SUBTRACT", "GREATER", "SMALLER", "EQUAL", "AND", "OR", 
			"ASSIGN", "COMMA", "ARROW", "NOT_EQUAL", "SEMICOLON", "UNDERLINE", "GREATER_AND_EQUAL", 
			"SMALLER_AND_EQUAL", "NEW_LINE", "SHARPSIGN", "TAB", "INTEGER", "ALPHABET", 
			"Whitespace", "Linebreak"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\7\33\u00f6\n\33\f\33\16\33\u00f9\13\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\5\61\u012c\n\61\3\62\3\62\3\62\3\62\5\62\u0132\n\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\7\66\u013c\n\66\f\66\16\66\u013f"+
		"\13\66\3\67\6\67\u0142\n\67\r\67\16\67\u0143\38\68\u0147\n8\r8\168\u0148"+
		"\38\58\u014c\n8\38\38\39\69\u0151\n9\r9\169\u0152\2\2:\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\b\5\2C\\"+
		"aac|\6\2\62;C\\aac|\3\2\62;\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2\u015b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5v\3\2\2\2\7y\3\2\2\2\t\177\3\2\2"+
		"\2\13\u0086\3\2\2\2\r\u008d\3\2\2\2\17\u0092\3\2\2\2\21\u0097\3\2\2\2"+
		"\23\u009d\3\2\2\2\25\u00a2\3\2\2\2\27\u00aa\3\2\2\2\31\u00b1\3\2\2\2\33"+
		"\u00b6\3\2\2\2\35\u00ba\3\2\2\2\37\u00bf\3\2\2\2!\u00c4\3\2\2\2#\u00c9"+
		"\3\2\2\2%\u00cc\3\2\2\2\'\u00cf\3\2\2\2)\u00d5\3\2\2\2+\u00da\3\2\2\2"+
		"-\u00e1\3\2\2\2/\u00e5\3\2\2\2\61\u00eb\3\2\2\2\63\u00ef\3\2\2\2\65\u00f3"+
		"\3\2\2\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0100\3\2\2\2"+
		"?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E\u0108\3\2\2\2G\u010a\3"+
		"\2\2\2I\u010c\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2\2\2Q\u0115"+
		"\3\2\2\2S\u0117\3\2\2\2U\u0119\3\2\2\2W\u011b\3\2\2\2Y\u011d\3\2\2\2["+
		"\u0120\3\2\2\2]\u0123\3\2\2\2_\u0125\3\2\2\2a\u012b\3\2\2\2c\u0131\3\2"+
		"\2\2e\u0133\3\2\2\2g\u0135\3\2\2\2i\u0137\3\2\2\2k\u0139\3\2\2\2m\u0141"+
		"\3\2\2\2o\u014b\3\2\2\2q\u0150\3\2\2\2st\7\61\2\2tu\7,\2\2u\4\3\2\2\2"+
		"vw\7,\2\2wx\7\61\2\2x\6\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~"+
		"\7g\2\2~\b\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t"+
		"\2\2\u0082\u0083\7w\2\2\u0083\u0084\7e\2\2\u0084\u0085\7v\2\2\u0085\n"+
		"\3\2\2\2\u0086\u0087\7c\2\2\u0087\u0088\7r\2\2\u0088\u0089\7r\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c\f\3\2\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7k\2\2\u008f\u0090\7|\2\2\u0090\u0091\7g\2\2"+
		"\u0091\16\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7"+
		"w\2\2\u0095\u0096\7g\2\2\u0096\20\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c"+
		"\22\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\u00a1\7t\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\u00a9\7{\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7"+
		"v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0"+
		"\7i\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7p\2\2\u00b8\u00b9\7v\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7n\2\2\u00be\36\3\2\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		" \3\2\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7f\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"$\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7h\2\2\u00ce&\3\2\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7h\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7n\2\2\u00d7"+
		"\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9*\3\2\2\2\u00da\u00db\7t\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7t\2\2"+
		"\u00df\u00e0\7p\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7i\2\2\u00e2\u00e3\7g\2"+
		"\2\u00e3\u00e4\7v\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7"+
		"g\2\2\u00e7\u00e8\7i\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\60"+
		"\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7f\2\2\u00ee"+
		"\62\3\2\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\64\3\2\2\2\u00f3\u00f7\t\2\2\2\u00f4\u00f6\t\3\2\2\u00f5\u00f4\3\2\2"+
		"\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\66"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7*\2\2\u00fb8\3\2\2\2\u00fc\u00fd"+
		"\7+\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7\60\2\2\u00ff<\3\2\2\2\u0100\u0101"+
		"\7]\2\2\u0101>\3\2\2\2\u0102\u0103\7_\2\2\u0103@\3\2\2\2\u0104\u0105\7"+
		"\u0080\2\2\u0105B\3\2\2\2\u0106\u0107\7,\2\2\u0107D\3\2\2\2\u0108\u0109"+
		"\7\61\2\2\u0109F\3\2\2\2\u010a\u010b\7-\2\2\u010bH\3\2\2\2\u010c\u010d"+
		"\7/\2\2\u010dJ\3\2\2\2\u010e\u010f\7@\2\2\u010fL\3\2\2\2\u0110\u0111\7"+
		">\2\2\u0111N\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7?\2\2\u0114P\3\2"+
		"\2\2\u0115\u0116\7(\2\2\u0116R\3\2\2\2\u0117\u0118\7~\2\2\u0118T\3\2\2"+
		"\2\u0119\u011a\7?\2\2\u011aV\3\2\2\2\u011b\u011c\7.\2\2\u011cX\3\2\2\2"+
		"\u011d\u011e\7/\2\2\u011e\u011f\7@\2\2\u011fZ\3\2\2\2\u0120\u0121\7#\2"+
		"\2\u0121\u0122\7?\2\2\u0122\\\3\2\2\2\u0123\u0124\7=\2\2\u0124^\3\2\2"+
		"\2\u0125\u0126\7a\2\2\u0126`\3\2\2\2\u0127\u0128\7@\2\2\u0128\u012c\7"+
		"?\2\2\u0129\u012a\7?\2\2\u012a\u012c\7@\2\2\u012b\u0127\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012cb\3\2\2\2\u012d\u012e\7>\2\2\u012e\u0132\7?\2\2\u012f"+
		"\u0130\7?\2\2\u0130\u0132\7>\2\2\u0131\u012d\3\2\2\2\u0131\u012f\3\2\2"+
		"\2\u0132d\3\2\2\2\u0133\u0134\7\f\2\2\u0134f\3\2\2\2\u0135\u0136\7%\2"+
		"\2\u0136h\3\2\2\2\u0137\u0138\7\13\2\2\u0138j\3\2\2\2\u0139\u013d\t\4"+
		"\2\2\u013a\u013c\t\4\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013el\3\2\2\2\u013f\u013d\3\2\2\2"+
		"\u0140\u0142\t\5\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144n\3\2\2\2\u0145\u0147\t\6\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u014c\5q9\2\u014b\u0146\3\2\2\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b8\2\2\u014ep\3\2\2\2\u014f\u0151"+
		"\t\7\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153r\3\2\2\2\f\2\u00f7\u012b\u0131\u013d\u0141\u0143"+
		"\u0148\u014b\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}