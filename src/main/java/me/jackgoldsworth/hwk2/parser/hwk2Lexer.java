// Generated from hwk2.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hwk2Lexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, WHITESPACE = 5, NUMBER = 6, ID = 7, STRING = 8;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nO\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3" +
                    "\6\3\6\3\6\3\7\3\7\6\7-\n\7\r\7\16\7.\3\b\3\b\3\b\7\b\64\n\b\f\b\16\b" +
                    "\67\13\b\3\t\3\t\3\t\7\t<\n\t\f\t\16\t?\13\t\3\t\3\t\3\n\6\nD\n\n\r\n" +
                    "\16\nE\3\13\3\13\3\13\3\13\5\13L\n\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13" +
                    "\7\r\b\17\t\21\n\23\2\25\2\27\2\3\2\5\3\2\62;\5\2\62;C\\c|\4\2C\\c|\2" +
                    "R\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2" +
                    "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\31\3\2\2\2\5\36\3\2\2\2\7 \3\2\2\2\t" +
                    "$\3\2\2\2\13&\3\2\2\2\r,\3\2\2\2\17\60\3\2\2\2\218\3\2\2\2\23C\3\2\2\2" +
                    "\25G\3\2\2\2\27M\3\2\2\2\31\32\7B\2\2\32\33\7k\2\2\33\34\7o\2\2\34\35" +
                    "\7r\2\2\35\4\3\2\2\2\36\37\7\60\2\2\37\6\3\2\2\2 !\7x\2\2!\"\7c\2\2\"" +
                    "#\7t\2\2#\b\3\2\2\2$%\7?\2\2%\n\3\2\2\2&\'\7\"\2\2\'(\3\2\2\2()\b\6\2" +
                    "\2)\f\3\2\2\2*-\5\23\n\2+-\5\25\13\2,*\3\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3" +
                    "\2\2\2./\3\2\2\2/\16\3\2\2\2\60\65\5\27\f\2\61\64\5\27\f\2\62\64\5\23" +
                    "\n\2\63\61\3\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2" +
                    "\2\2\66\20\3\2\2\2\67\65\3\2\2\28=\7$\2\29<\5\27\f\2:<\5\23\n\2;9\3\2" +
                    "\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7$" +
                    "\2\2A\22\3\2\2\2BD\t\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\24" +
                    "\3\2\2\2GH\7\62\2\2HI\7z\2\2IK\3\2\2\2JL\t\3\2\2KJ\3\2\2\2L\26\3\2\2\2" +
                    "MN\t\4\2\2N\30\3\2\2\2\13\2,.\63\65;=EK\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public hwk2Lexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "WHITESPACE", "NUMBER", "ID", "STRING",
                "DIGIT", "HEX", "LETTER"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'@imp'", "'.'", "'var'", "'='", "' '"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, "WHITESPACE", "NUMBER", "ID", "STRING"
        };
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
    public String getGrammarFileName() {
        return "hwk2.g4";
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
}