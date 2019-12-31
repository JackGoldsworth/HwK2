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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, WS = 19, NUMBER = 20, ID = 21, STRING = 22;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
                "T__17", "WS", "NUMBER", "ID", "STRING", "DIGIT", "HEX", "LETTER"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'@imp'", "'.'", "'print('", "')'", "'var'", "'='", "'^'", "'*'",
                "'/'", "'-'", "'+'", "'fn'", "'('", "'->'", "'{'", "'}'", "':'", "','"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, "WS", "NUMBER", "ID", "STRING"
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0090\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3" +
                    "\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3" +
                    "\22\3\23\3\23\3\24\6\24g\n\24\r\24\16\24h\3\24\3\24\3\25\3\25\6\25o\n" +
                    "\25\r\25\16\25p\3\26\3\26\3\26\7\26v\n\26\f\26\16\26y\13\26\3\27\3\27" +
                    "\7\27}\n\27\f\27\16\27\u0080\13\27\3\27\3\27\3\30\6\30\u0085\n\30\r\30" +
                    "\16\30\u0086\3\31\3\31\3\31\3\31\5\31\u008d\n\31\3\32\3\32\3~\2\33\3\3" +
                    "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21" +
                    "!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\3\2\6\5\2\13\f\17\17\"\"\3" +
                    "\2\62;\5\2\62;C\\c|\4\2C\\c|\2\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2" +
                    "\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23" +
                    "\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2" +
                    "\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2" +
                    "\2\2\2+\3\2\2\2\2-\3\2\2\2\3\65\3\2\2\2\5:\3\2\2\2\7<\3\2\2\2\tC\3\2\2" +
                    "\2\13E\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2" +
                    "\2\2\27S\3\2\2\2\31U\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37]\3\2\2\2!_\3\2" +
                    "\2\2#a\3\2\2\2%c\3\2\2\2\'f\3\2\2\2)n\3\2\2\2+r\3\2\2\2-z\3\2\2\2/\u0084" +
                    "\3\2\2\2\61\u0088\3\2\2\2\63\u008e\3\2\2\2\65\66\7B\2\2\66\67\7k\2\2\67" +
                    "8\7o\2\289\7r\2\29\4\3\2\2\2:;\7\60\2\2;\6\3\2\2\2<=\7r\2\2=>\7t\2\2>" +
                    "?\7k\2\2?@\7p\2\2@A\7v\2\2AB\7*\2\2B\b\3\2\2\2CD\7+\2\2D\n\3\2\2\2EF\7" +
                    "x\2\2FG\7c\2\2GH\7t\2\2H\f\3\2\2\2IJ\7?\2\2J\16\3\2\2\2KL\7`\2\2L\20\3" +
                    "\2\2\2MN\7,\2\2N\22\3\2\2\2OP\7\61\2\2P\24\3\2\2\2QR\7/\2\2R\26\3\2\2" +
                    "\2ST\7-\2\2T\30\3\2\2\2UV\7h\2\2VW\7p\2\2W\32\3\2\2\2XY\7*\2\2Y\34\3\2" +
                    "\2\2Z[\7/\2\2[\\\7@\2\2\\\36\3\2\2\2]^\7}\2\2^ \3\2\2\2_`\7\177\2\2`\"" +
                    "\3\2\2\2ab\7<\2\2b$\3\2\2\2cd\7.\2\2d&\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3" +
                    "\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\24\2\2k(\3\2\2\2lo\5/\30\2mo" +
                    "\5\61\31\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q*\3\2\2\2" +
                    "rw\5\63\32\2sv\5\63\32\2tv\5/\30\2us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2" +
                    "\2\2wx\3\2\2\2x,\3\2\2\2yw\3\2\2\2z~\7$\2\2{}\13\2\2\2|{\3\2\2\2}\u0080" +
                    "\3\2\2\2~\177\3\2\2\2~|\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081" +
                    "\u0082\7$\2\2\u0082.\3\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085" +
                    "\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\60\3\2\2" +
                    "\2\u0088\u0089\7\62\2\2\u0089\u008a\7z\2\2\u008a\u008c\3\2\2\2\u008b\u008d" +
                    "\t\4\2\2\u008c\u008b\3\2\2\2\u008d\62\3\2\2\2\u008e\u008f\t\5\2\2\u008f" +
                    "\64\3\2\2\2\13\2hnpuw~\u0086\u008c\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}