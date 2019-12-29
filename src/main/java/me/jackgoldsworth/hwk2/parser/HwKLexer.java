// Generated from HwK.g4 by ANTLR 4.7.2
package me.jackgoldsworth.hwk2.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HwKLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, WS = 7, NUMBER = 8, ID = 9,
			OPERATION = 10, STRING = 11, ADD = 12, SUB = 13, MULT = 14, DIV = 15;
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[]{
				"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "NUMBER", "ID",
				"OPERATION", "STRING", "ADD", "SUB", "MULT", "DIV", "DIGIT", "HEX", "LETTER"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'@imp'", "'.'", "'print('", "')'", "'var'", "'='", null, null,
				null, null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, null, null, "WS", "NUMBER", "ID", "OPERATION",
				"STRING", "ADD", "SUB", "MULT", "DIV"
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


	public HwKLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "HwK.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21v\b\1\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5" +
					"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\b?\n\b\r\b\16\b@\3\b\3\b\3\t\3\t\6" +
					"\tG\n\t\r\t\16\tH\3\n\3\n\3\n\7\nN\n\n\f\n\16\nQ\13\n\3\13\3\13\3\13\3" +
					"\13\5\13W\n\13\3\f\3\f\7\f[\n\f\f\f\16\f^\13\f\3\f\3\f\3\r\3\r\3\16\3" +
					"\16\3\17\3\17\3\20\3\20\3\21\6\21k\n\21\r\21\16\21l\3\22\3\22\3\22\3\22" +
					"\5\22s\n\22\3\23\3\23\3\\\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13" +
					"\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\3\2\6\5\2\13\f\17\17\"\"\3" +
					"\2\62;\5\2\62;C\\c|\4\2C\\c|\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2" +
					"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2" +
					"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2" +
					"\2\37\3\2\2\2\3\'\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\65\3\2\2\2\13\67\3\2" +
					"\2\2\r;\3\2\2\2\17>\3\2\2\2\21F\3\2\2\2\23J\3\2\2\2\25V\3\2\2\2\27X\3" +
					"\2\2\2\31a\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!j\3\2\2\2#n\3\2" +
					"\2\2%t\3\2\2\2\'(\7B\2\2()\7k\2\2)*\7o\2\2*+\7r\2\2+\4\3\2\2\2,-\7\60" +
					"\2\2-\6\3\2\2\2./\7r\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7" +
					"v\2\2\63\64\7*\2\2\64\b\3\2\2\2\65\66\7+\2\2\66\n\3\2\2\2\678\7x\2\28" +
					"9\7c\2\29:\7t\2\2:\f\3\2\2\2;<\7?\2\2<\16\3\2\2\2=?\t\2\2\2>=\3\2\2\2" +
					"?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\b\2\2C\20\3\2\2\2DG\5!\21" +
					"\2EG\5#\22\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\22\3\2" +
					"\2\2JO\5%\23\2KN\5%\23\2LN\5!\21\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2" +
					"\2\2OP\3\2\2\2P\24\3\2\2\2QO\3\2\2\2RW\5\31\r\2SW\5\33\16\2TW\5\35\17" +
					"\2UW\5\37\20\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\26\3\2\2\2X\\" +
					"\7$\2\2Y[\13\2\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2\2\2" +
					"^\\\3\2\2\2_`\7$\2\2`\30\3\2\2\2ab\7-\2\2b\32\3\2\2\2cd\7/\2\2d\34\3\2" +
					"\2\2ef\7,\2\2f\36\3\2\2\2gh\7\61\2\2h \3\2\2\2ik\t\3\2\2ji\3\2\2\2kl\3" +
					"\2\2\2lj\3\2\2\2lm\3\2\2\2m\"\3\2\2\2no\7\62\2\2op\7z\2\2pr\3\2\2\2qs" +
					"\t\4\2\2rq\3\2\2\2s$\3\2\2\2tu\t\5\2\2u&\3\2\2\2\f\2@FHMOV\\lr\3\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}