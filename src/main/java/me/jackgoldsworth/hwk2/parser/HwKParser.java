// Generated from HwK.g4 by ANTLR 4.7.2
package me.jackgoldsworth.hwk2.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HwKParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, WS = 12, NUMBER = 13, ID = 14, STRING = 15;
    public static final int
            RULE_compilationUnit = 0, RULE_imports = 1, RULE_type = 2, RULE_print = 3,
            RULE_statement = 4, RULE_variable = 5, RULE_expression = 6, RULE_value = 7;

    private static String[] makeRuleNames() {
        return new String[]{
                "compilationUnit", "imports", "type", "print", "statement", "variable",
                "expression", "value"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'@imp'", "'.'", "'print('", "')'", "'var'", "'='", "'^'", "'*'",
                "'/'", "'-'", "'+'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                "WS", "NUMBER", "ID", "STRING"
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
    public ATN getATN() {
        return _ATN;
    }

    public HwKParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class CompilationUnitContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(HwKParser.EOF, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compilationUnit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterCompilationUnit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitCompilationUnit(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitCompilationUnit(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_compilationUnit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(19);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4))) != 0)) {
                    {
                        {
                            setState(16);
                            statement();
                        }
                    }
                    setState(21);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(22);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ImportsContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(HwKParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(HwKParser.ID, i);
        }

        public ImportsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_imports;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterImports(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitImports(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitImports(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ImportsContext imports() throws RecognitionException {
        ImportsContext _localctx = new ImportsContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_imports);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(24);
                match(T__0);
                setState(25);
                match(ID);
                setState(30);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__1) {
                    {
                        {
                            setState(26);
                            match(T__1);
                            setState(27);
                            match(ID);
                        }
                    }
                    setState(32);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(33);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrintContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public PrintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_print;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterPrint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitPrint(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitPrint(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PrintContext print() throws RecognitionException {
        PrintContext _localctx = new PrintContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_print);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(35);
                match(T__2);
                setState(36);
                expression(0);
                setState(37);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public VariableContext variable() {
            return getRuleContext(VariableContext.class, 0);
        }

        public PrintContext print() {
            return getRuleContext(PrintContext.class, 0);
        }

        public ImportsContext imports() {
            return getRuleContext(ImportsContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_statement);
        try {
            setState(42);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__4:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(39);
                    variable();
                }
                break;
                case T__2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(40);
                    print();
                }
                break;
                case T__0:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(41);
                    imports();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public VariableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterVariable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitVariable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitVariable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableContext variable() throws RecognitionException {
        VariableContext _localctx = new VariableContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_variable);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(44);
                match(T__4);
                setState(45);
                match(ID);
                setState(46);
                match(T__5);
                setState(47);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        public ExpressionContext() {
        }

        public void copyFrom(ExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class DIVContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public DIVContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterDIV(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitDIV(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitDIV(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SUBContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public SUBContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterSUB(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitSUB(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitSUB(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ADDContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ADDContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterADD(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitADD(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitADD(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MULTContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public MULTContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterMULT(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitMULT(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitMULT(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VARContext extends ExpressionContext {
        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public VARContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterVAR(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitVAR(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitVAR(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VALUEContext extends ExpressionContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public VALUEContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterVALUE(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitVALUE(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitVALUE(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EXPContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public EXPContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterEXP(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitEXP(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitEXP(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 12;
        enterRecursionRule(_localctx, 12, RULE_expression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(52);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case ID: {
                        _localctx = new VARContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(50);
                        match(ID);
                    }
                    break;
                    case NUMBER:
                    case STRING: {
                        _localctx = new VALUEContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(51);
                        value();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(71);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(69);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                                case 1: {
                                    _localctx = new EXPContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(54);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(55);
                                    match(T__6);
                                    setState(56);
                                    expression(6);
                                }
                                break;
                                case 2: {
                                    _localctx = new MULTContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(57);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(58);
                                    match(T__7);
                                    setState(59);
                                    expression(5);
                                }
                                break;
                                case 3: {
                                    _localctx = new DIVContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(60);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(61);
                                    match(T__8);
                                    setState(62);
                                    expression(4);
                                }
                                break;
                                case 4: {
                                    _localctx = new SUBContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(63);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(64);
                                    match(T__9);
                                    setState(65);
                                    expression(3);
                                }
                                break;
                                case 5: {
                                    _localctx = new ADDContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(66);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(67);
                                    match(T__10);
                                    setState(68);
                                    expression(2);
                                }
                                break;
                            }
                        }
                    }
                    setState(73);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ValueContext extends ParserRuleContext {
        public List<TerminalNode> NUMBER() {
            return getTokens(HwKParser.NUMBER);
        }

        public TerminalNode NUMBER(int i) {
            return getToken(HwKParser.NUMBER, i);
        }

        public List<TerminalNode> STRING() {
            return getTokens(HwKParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(HwKParser.STRING, i);
        }

        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ValueContext value() throws RecognitionException {
        ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_value);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(75);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(74);
                                _la = _input.LA(1);
                                if (!(_la == NUMBER || _la == STRING)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(77);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 6:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 5);
            case 1:
                return precpred(_ctx, 4);
            case 2:
                return precpred(_ctx, 3);
            case 3:
                return precpred(_ctx, 2);
            case 4:
                return precpred(_ctx, 1);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21R\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2" +
                    "\16\2\27\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3" +
                    "\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6-\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3" +
                    "\b\5\b\67\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b" +
                    "\3\b\7\bH\n\b\f\b\16\bK\13\b\3\t\6\tN\n\t\r\t\16\tO\3\t\2\3\16\n\2\4\6" +
                    "\b\n\f\16\20\2\3\4\2\17\17\21\21\2T\2\25\3\2\2\2\4\32\3\2\2\2\6#\3\2\2" +
                    "\2\b%\3\2\2\2\n,\3\2\2\2\f.\3\2\2\2\16\66\3\2\2\2\20M\3\2\2\2\22\24\5" +
                    "\n\6\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3" +
                    "\2\2\2\27\25\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\33\7\3\2\2\33 \7\20" +
                    "\2\2\34\35\7\4\2\2\35\37\7\20\2\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2" +
                    "\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#$\7\20\2\2$\7\3\2\2\2%&\7\5\2\2&\'" +
                    "\5\16\b\2\'(\7\6\2\2(\t\3\2\2\2)-\5\f\7\2*-\5\b\5\2+-\5\4\3\2,)\3\2\2" +
                    "\2,*\3\2\2\2,+\3\2\2\2-\13\3\2\2\2./\7\7\2\2/\60\7\20\2\2\60\61\7\b\2" +
                    "\2\61\62\5\16\b\2\62\r\3\2\2\2\63\64\b\b\1\2\64\67\7\20\2\2\65\67\5\20" +
                    "\t\2\66\63\3\2\2\2\66\65\3\2\2\2\67I\3\2\2\289\f\7\2\29:\7\t\2\2:H\5\16" +
                    "\b\b;<\f\6\2\2<=\7\n\2\2=H\5\16\b\7>?\f\5\2\2?@\7\13\2\2@H\5\16\b\6AB" +
                    "\f\4\2\2BC\7\f\2\2CH\5\16\b\5DE\f\3\2\2EF\7\r\2\2FH\5\16\b\4G8\3\2\2\2" +
                    "G;\3\2\2\2G>\3\2\2\2GA\3\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2" +
                    "J\17\3\2\2\2KI\3\2\2\2LN\t\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2" +
                    "\2P\21\3\2\2\2\t\25 ,\66GIO";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}