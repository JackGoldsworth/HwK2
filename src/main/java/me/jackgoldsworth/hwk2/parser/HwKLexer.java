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
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, WS = 17,
			NUMBER = 18, ID = 19, STRING = 20, IMPORTNAME = 21;
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[]{
				"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
				"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "WS", "NUMBER",
				"ID", "STRING", "IMPORTNAME", "DIGIT", "HEX", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'@imp'", "'print('", "')'", "'var'", "'='", "'*'", "'/'", "'-'",
				"'+'", "'fn'", "'('", "'->'", "'{'", "'}'", "'ret'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, "WS", "NUMBER", "ID", "STRING", "IMPORTNAME"
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
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HwK.g4"; }

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
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0091\b\1\4\2" +
					"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
					"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
					"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
					"\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5" +
					"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3" +
					"\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22" +
					"\6\22c\n\22\r\22\16\22d\3\22\3\22\3\23\3\23\6\23k\n\23\r\23\16\23l\3\24" +
					"\3\24\3\24\7\24r\n\24\f\24\16\24u\13\24\3\25\3\25\7\25y\n\25\f\25\16\25" +
					"|\13\25\3\25\3\25\3\26\6\26\u0081\n\26\r\26\16\26\u0082\3\27\6\27\u0086" +
					"\n\27\r\27\16\27\u0087\3\30\3\30\3\30\3\30\5\30\u008e\n\30\3\31\3\31\3" +
					"z\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17" +
					"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\3\2\7\5\2\13\f\17\17" +
					"\"\"\5\2\61\61C\\c|\3\2\62;\5\2\62;C\\c|\4\2C\\c|\2\u0095\2\3\3\2\2\2" +
					"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2" +
					"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2" +
					"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2" +
					"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3\63\3\2\2\2\58\3\2\2\2\7?\3\2\2" +
					"\2\tA\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2" +
					"\2\25O\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2" +
					"\2\2!_\3\2\2\2#b\3\2\2\2%j\3\2\2\2\'n\3\2\2\2)v\3\2\2\2+\u0080\3\2\2\2" +
					"-\u0085\3\2\2\2/\u0089\3\2\2\2\61\u008f\3\2\2\2\63\64\7B\2\2\64\65\7k" +
					"\2\2\65\66\7o\2\2\66\67\7r\2\2\67\4\3\2\2\289\7r\2\29:\7t\2\2:;\7k\2\2" +
					";<\7p\2\2<=\7v\2\2=>\7*\2\2>\6\3\2\2\2?@\7+\2\2@\b\3\2\2\2AB\7x\2\2BC" +
					"\7c\2\2CD\7t\2\2D\n\3\2\2\2EF\7?\2\2F\f\3\2\2\2GH\7,\2\2H\16\3\2\2\2I" +
					"J\7\61\2\2J\20\3\2\2\2KL\7/\2\2L\22\3\2\2\2MN\7-\2\2N\24\3\2\2\2OP\7h" +
					"\2\2PQ\7p\2\2Q\26\3\2\2\2RS\7*\2\2S\30\3\2\2\2TU\7/\2\2UV\7@\2\2V\32\3" +
					"\2\2\2WX\7}\2\2X\34\3\2\2\2YZ\7\177\2\2Z\36\3\2\2\2[\\\7t\2\2\\]\7g\2" +
					"\2]^\7v\2\2^ \3\2\2\2_`\7<\2\2`\"\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2" +
					"\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\22\2\2g$\3\2\2\2hk\5-\27\2ik\5/\30" +
					"\2jh\3\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m&\3\2\2\2ns\5\61" +
					"\31\2or\5\61\31\2pr\5-\27\2qo\3\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st" +
					"\3\2\2\2t(\3\2\2\2us\3\2\2\2vz\7$\2\2wy\13\2\2\2xw\3\2\2\2y|\3\2\2\2z" +
					"{\3\2\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7$\2\2~*\3\2\2\2\177\u0081\t" +
					"\3\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082" +
					"\u0083\3\2\2\2\u0083,\3\2\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2" +
					"\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088.\3" +
					"\2\2\2\u0089\u008a\7\62\2\2\u008a\u008b\7z\2\2\u008b\u008d\3\2\2\2\u008c" +
					"\u008e\t\5\2\2\u008d\u008c\3\2\2\2\u008e\60\3\2\2\2\u008f\u0090\t\6\2" +
					"\2\u0090\62\3\2\2\2\r\2djlqsz\u0080\u0082\u0087\u008d\3\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}