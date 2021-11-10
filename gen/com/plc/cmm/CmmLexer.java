// Generated from /home/mohadeseh/Desktop/UT/Compiler/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WHILE=3, STRUCT=4, APPEND=5, SIZE=6, TRUE=7, FALSE=8, 
		FPTR=9, DISPLAY=10, STRING=11, MAIN=12, INT=13, BOOL=14, LIST=15, VOID=16, 
		DO=17, IF=18, ENDIF=19, ELSE=20, RETURN=21, GET=22, BEGIN=23, END=24, 
		SET=25, NAMING_CONVENTION=26, SUM=27, PRODUCT=28, ARROW=29, SUBTRACT=30, 
		DIVIDE=31, EQUAL=32, ASSIGN=33, NOT_EQUAL=34, SEMICOLON=35, LPAREN=36, 
		RPAREN=37, UNDERLINE=38, GREATER=39, SMALLER=40, COMMA=41, GREATER_AND_EQUAL=42, 
		SMALLER_AND_EQUAL=43, NEW_LINE=44, SHARPSIGN=45, DOT=46, TAB=47, LBRACKET=48, 
		RBRACKET=49, INTEGER=50, ALPHABET=51, Whitespace=52, Linebreak=53;
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
			"SUM", "PRODUCT", "ARROW", "SUBTRACT", "DIVIDE", "EQUAL", "ASSIGN", "NOT_EQUAL", 
			"SEMICOLON", "LPAREN", "RPAREN", "UNDERLINE", "GREATER", "SMALLER", "COMMA", 
			"GREATER_AND_EQUAL", "SMALLER_AND_EQUAL", "NEW_LINE", "SHARPSIGN", "DOT", 
			"TAB", "LBRACKET", "RBRACKET", "INTEGER", "ALPHABET", "Whitespace", "Linebreak"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'*/'", "'while'", "'struct'", "'append'", "'size'", "'true'", 
			"'false'", "'fptr'", "'display'", "'string'", "'main'", "'int'", "'bool'", 
			"'list'", "'void'", "'do'", "'if'", "'endif'", "'else'", "'return'", 
			"'get'", "'begin'", "'end'", "'set'", null, "'+'", "'*'", "'->'", "'-'", 
			"'/'", "'=='", "'='", "'!='", "';'", "'('", "')'", "'_'", "'>'", "'<'", 
			"','", null, null, "'\n'", "'#'", "'.'", "'\t'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WHILE", "STRUCT", "APPEND", "SIZE", "TRUE", "FALSE", 
			"FPTR", "DISPLAY", "STRING", "MAIN", "INT", "BOOL", "LIST", "VOID", "DO", 
			"IF", "ENDIF", "ELSE", "RETURN", "GET", "BEGIN", "END", "SET", "NAMING_CONVENTION", 
			"SUM", "PRODUCT", "ARROW", "SUBTRACT", "DIVIDE", "EQUAL", "ASSIGN", "NOT_EQUAL", 
			"SEMICOLON", "LPAREN", "RPAREN", "UNDERLINE", "GREATER", "SMALLER", "COMMA", 
			"GREATER_AND_EQUAL", "SMALLER_AND_EQUAL", "NEW_LINE", "SHARPSIGN", "DOT", 
			"TAB", "LBRACKET", "RBRACKET", "INTEGER", "ALPHABET", "Whitespace", "Linebreak"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0145\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\7\33\u00f0"+
		"\n\33\f\33\16\33\u00f3\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3+\3+\5+\u011a\n+\3,\3,\3,\3,\5,\u0120\n,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\7\63\u0130\n\63\f\63\16"+
		"\63\u0133\13\63\3\64\6\64\u0136\n\64\r\64\16\64\u0137\3\65\6\65\u013b"+
		"\n\65\r\65\16\65\u013c\3\65\5\65\u0140\n\65\3\65\3\65\3\66\3\66\2\2\67"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67\3\2"+
		"\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\2\u014b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\3m\3\2\2\2\5p\3\2\2\2\7s\3\2\2\2\ty\3\2\2\2\13\u0080\3\2\2\2\r\u0087"+
		"\3\2\2\2\17\u008c\3\2\2\2\21\u0091\3\2\2\2\23\u0097\3\2\2\2\25\u009c\3"+
		"\2\2\2\27\u00a4\3\2\2\2\31\u00ab\3\2\2\2\33\u00b0\3\2\2\2\35\u00b4\3\2"+
		"\2\2\37\u00b9\3\2\2\2!\u00be\3\2\2\2#\u00c3\3\2\2\2%\u00c6\3\2\2\2\'\u00c9"+
		"\3\2\2\2)\u00cf\3\2\2\2+\u00d4\3\2\2\2-\u00db\3\2\2\2/\u00df\3\2\2\2\61"+
		"\u00e5\3\2\2\2\63\u00e9\3\2\2\2\65\u00ed\3\2\2\2\67\u00f4\3\2\2\29\u00f6"+
		"\3\2\2\2;\u00f8\3\2\2\2=\u00fb\3\2\2\2?\u00fd\3\2\2\2A\u00ff\3\2\2\2C"+
		"\u0102\3\2\2\2E\u0104\3\2\2\2G\u0107\3\2\2\2I\u0109\3\2\2\2K\u010b\3\2"+
		"\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2\2\2S\u0113\3\2\2\2U\u0119"+
		"\3\2\2\2W\u011f\3\2\2\2Y\u0121\3\2\2\2[\u0123\3\2\2\2]\u0125\3\2\2\2_"+
		"\u0127\3\2\2\2a\u0129\3\2\2\2c\u012b\3\2\2\2e\u012d\3\2\2\2g\u0135\3\2"+
		"\2\2i\u013f\3\2\2\2k\u0143\3\2\2\2mn\7\61\2\2no\7,\2\2o\4\3\2\2\2pq\7"+
		",\2\2qr\7\61\2\2r\6\3\2\2\2st\7y\2\2tu\7j\2\2uv\7k\2\2vw\7n\2\2wx\7g\2"+
		"\2x\b\3\2\2\2yz\7u\2\2z{\7v\2\2{|\7t\2\2|}\7w\2\2}~\7e\2\2~\177\7v\2\2"+
		"\177\n\3\2\2\2\u0080\u0081\7c\2\2\u0081\u0082\7r\2\2\u0082\u0083\7r\2"+
		"\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\f\3"+
		"\2\2\2\u0087\u0088\7u\2\2\u0088\u0089\7k\2\2\u0089\u008a\7|\2\2\u008a"+
		"\u008b\7g\2\2\u008b\16\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7w\2\2\u008f\u0090\7g\2\2\u0090\20\3\2\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2"+
		"\u0096\22\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7r\2\2\u0099\u009a\7"+
		"v\2\2\u009a\u009b\7t\2\2\u009b\24\3\2\2\2\u009c\u009d\7f\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7n\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7{\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2"+
		"\u00a9\u00aa\7i\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7"+
		"c\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\32\3\2\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\34\3\2\2\2\u00b4\u00b5"+
		"\7d\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\36\3\2\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd \3\2\2\2\u00be\u00bf\7x\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c1\7k\2\2\u00c1\u00c2\7f\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4"+
		"\u00c5\7q\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7h\2\2\u00c8"+
		"&\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7f\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7h\2\2\u00ce(\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3*\3\2\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7w\2\2"+
		"\u00d8\u00d9\7t\2\2\u00d9\u00da\7p\2\2\u00da,\3\2\2\2\u00db\u00dc\7i\2"+
		"\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7v\2\2\u00de.\3\2\2\2\u00df\u00e0\7"+
		"d\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7i\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4"+
		"\7p\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8"+
		"\7f\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec"+
		"\7v\2\2\u00ec\64\3\2\2\2\u00ed\u00f1\t\2\2\2\u00ee\u00f0\t\3\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\66\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7-\2\2\u00f58\3"+
		"\2\2\2\u00f6\u00f7\7,\2\2\u00f7:\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9\u00fa"+
		"\7@\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7"+
		"\61\2\2\u00fe@\3\2\2\2\u00ff\u0100\7?\2\2\u0100\u0101\7?\2\2\u0101B\3"+
		"\2\2\2\u0102\u0103\7?\2\2\u0103D\3\2\2\2\u0104\u0105\7#\2\2\u0105\u0106"+
		"\7?\2\2\u0106F\3\2\2\2\u0107\u0108\7=\2\2\u0108H\3\2\2\2\u0109\u010a\7"+
		"*\2\2\u010aJ\3\2\2\2\u010b\u010c\7+\2\2\u010cL\3\2\2\2\u010d\u010e\7a"+
		"\2\2\u010eN\3\2\2\2\u010f\u0110\7@\2\2\u0110P\3\2\2\2\u0111\u0112\7>\2"+
		"\2\u0112R\3\2\2\2\u0113\u0114\7.\2\2\u0114T\3\2\2\2\u0115\u0116\7@\2\2"+
		"\u0116\u011a\7?\2\2\u0117\u0118\7?\2\2\u0118\u011a\7@\2\2\u0119\u0115"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u011aV\3\2\2\2\u011b\u011c\7>\2\2\u011c\u0120"+
		"\7?\2\2\u011d\u011e\7?\2\2\u011e\u0120\7>\2\2\u011f\u011b\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120X\3\2\2\2\u0121\u0122\7\f\2\2\u0122Z\3\2\2\2\u0123"+
		"\u0124\7%\2\2\u0124\\\3\2\2\2\u0125\u0126\7\60\2\2\u0126^\3\2\2\2\u0127"+
		"\u0128\7\13\2\2\u0128`\3\2\2\2\u0129\u012a\7]\2\2\u012ab\3\2\2\2\u012b"+
		"\u012c\7_\2\2\u012cd\3\2\2\2\u012d\u0131\t\4\2\2\u012e\u0130\t\4\2\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132f\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\t\5\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"h\3\2\2\2\u0139\u013b\t\6\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u0140"+
		"\5k\66\2\u013f\u013a\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\b\65\2\2\u0142j\3\2\2\2\u0143\u0144\t\7\2\2\u0144l\3\2\2\2\13\2"+
		"\u00f1\u0119\u011f\u0131\u0135\u0137\u013c\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}