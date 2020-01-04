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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, WS = 19, NUMBER = 20, ID = 21, STRING = 22;
    public static final int
            RULE_compilationUnit = 0, RULE_imports = 1, RULE_type = 2, RULE_print = 3,
            RULE_statement = 4, RULE_variable = 5, RULE_expression = 6, RULE_function = 7,
            RULE_value = 8, RULE_varReference = 9, RULE_parameter = 10;

    private static String[] makeRuleNames() {
        return new String[]{
                "compilationUnit", "imports", "type", "print", "statement", "variable",
                "expression", "function", "value", "varReference", "parameter"
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

        public List<FunctionContext> function() {
            return getRuleContexts(FunctionContext.class);
        }

        public FunctionContext function(int i) {
            return getRuleContext(FunctionContext.class, i);
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
                setState(26);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11))) != 0)) {
                    {
                        setState(24);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__0:
                            case T__2:
                            case T__4: {
                                setState(22);
                                statement();
                            }
                            break;
                            case T__11: {
                                setState(23);
                                function();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(28);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(29);
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
                setState(31);
                match(T__0);
                setState(32);
                match(ID);
                setState(37);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__1) {
                    {
                        {
                            setState(33);
                            match(T__1);
                            setState(34);
                            match(ID);
                        }
                    }
                    setState(39);
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
                setState(40);
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
                setState(42);
                match(T__2);
                setState(43);
                expression(0);
                setState(44);
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
            setState(49);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__4:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(46);
                    variable();
                }
                break;
                case T__2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(47);
                    print();
                }
                break;
                case T__0:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(48);
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
                setState(51);
                match(T__4);
                setState(52);
                match(ID);
                setState(53);
                match(T__5);
                setState(54);
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

    public static class VALContext extends ExpressionContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public VALContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterVAL(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitVAL(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitVAL(this);
            else return visitor.visitChildren(this);
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
        public VarReferenceContext varReference() {
            return getRuleContext(VarReferenceContext.class, 0);
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
                setState(59);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case ID: {
                        _localctx = new VARContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(57);
                        varReference();
                    }
                    break;
                    case NUMBER:
                    case STRING: {
                        _localctx = new VALContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(58);
                        value();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(78);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(76);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                                case 1: {
                                    _localctx = new EXPContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(61);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(62);
                                    match(T__6);
                                    setState(63);
                                    expression(6);
                                }
                                break;
                                case 2: {
                                    _localctx = new MULTContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(64);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(65);
                                    match(T__7);
                                    setState(66);
                                    expression(5);
                                }
                                break;
                                case 3: {
                                    _localctx = new DIVContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(67);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(68);
                                    match(T__8);
                                    setState(69);
                                    expression(4);
                                }
                                break;
                                case 4: {
                                    _localctx = new SUBContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(70);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(71);
                                    match(T__9);
                                    setState(72);
                                    expression(3);
                                }
                                break;
                                case 5: {
                                    _localctx = new ADDContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(73);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(74);
                                    match(T__10);
                                    setState(75);
                                    expression(2);
                                }
                                break;
                            }
                        }
                    }
                    setState(80);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
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

    public static class FunctionContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public List<ParameterContext> parameter() {
            return getRuleContexts(ParameterContext.class);
        }

        public ParameterContext parameter(int i) {
            return getRuleContext(ParameterContext.class, i);
        }

        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public List<VariableContext> variable() {
            return getRuleContexts(VariableContext.class);
        }

        public VariableContext variable(int i) {
            return getRuleContext(VariableContext.class, i);
        }

        public List<PrintContext> print() {
            return getRuleContexts(PrintContext.class);
        }

        public PrintContext print(int i) {
            return getRuleContext(PrintContext.class, i);
        }

        public FunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitFunction(this);
            else return visitor.visitChildren(this);
        }
    }

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                match(T__11);
                setState(82);
                match(ID);
                setState(83);
                match(T__12);
                setState(87);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ID) {
                    {
                        {
                            setState(84);
                            parameter();
                        }
                    }
                    setState(89);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(90);
                match(T__3);
                setState(91);
                match(T__13);
                setState(95);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ID) {
                    {
                        {
                            setState(92);
                            type();
                        }
                    }
                    setState(97);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(98);
                match(T__14);
                setState(103);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2 || _la == T__4) {
                    {
                        setState(101);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__4: {
                                setState(99);
                                variable();
                            }
                            break;
                            case T__2: {
                                setState(100);
                                print();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(105);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(106);
                match(T__15);
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
        enterRule(_localctx, 16, RULE_value);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(109);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(108);
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
                    setState(111);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
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

    public static class VarReferenceContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public VarReferenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varReference;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterVarReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitVarReference(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitVarReference(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VarReferenceContext varReference() throws RecognitionException {
        VarReferenceContext _localctx = new VarReferenceContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_varReference);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
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

    public static class ParameterContext extends ParserRuleContext {
        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public ParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParameterContext parameter() throws RecognitionException {
        ParameterContext _localctx = new ParameterContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_parameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(115);
                type();
                setState(116);
                match(T__16);
                setState(117);
                match(ID);
                setState(121);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__17) {
                    {
                        {
                            setState(118);
                            match(T__17);
                        }
                    }
                    setState(123);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\177\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3" +
                    "\3\7\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\64" +
                    "\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b>\n\b\3\b\3\b\3\b\3\b\3\b\3\b" +
                    "\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3\t\3\t\3" +
                    "\t\3\t\7\tX\n\t\f\t\16\t[\13\t\3\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\3\t" +
                    "\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\3\n\6\np\n\n\r\n\16\nq\3\13\3" +
                    "\13\3\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\2\3\16\r\2\4\6\b\n\f\16" +
                    "\20\22\24\26\2\3\4\2\26\26\30\30\2\u0084\2\34\3\2\2\2\4!\3\2\2\2\6*\3" +
                    "\2\2\2\b,\3\2\2\2\n\63\3\2\2\2\f\65\3\2\2\2\16=\3\2\2\2\20S\3\2\2\2\22" +
                    "o\3\2\2\2\24s\3\2\2\2\26u\3\2\2\2\30\33\5\n\6\2\31\33\5\20\t\2\32\30\3" +
                    "\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3" +
                    "\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\7\3\2\2\"\'\7\27\2\2#$" +
                    "\7\4\2\2$&\7\27\2\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2" +
                    "\2)\'\3\2\2\2*+\7\27\2\2+\7\3\2\2\2,-\7\5\2\2-.\5\16\b\2./\7\6\2\2/\t" +
                    "\3\2\2\2\60\64\5\f\7\2\61\64\5\b\5\2\62\64\5\4\3\2\63\60\3\2\2\2\63\61" +
                    "\3\2\2\2\63\62\3\2\2\2\64\13\3\2\2\2\65\66\7\7\2\2\66\67\7\27\2\2\678" +
                    "\7\b\2\289\5\16\b\29\r\3\2\2\2:;\b\b\1\2;>\5\24\13\2<>\5\22\n\2=:\3\2" +
                    "\2\2=<\3\2\2\2>P\3\2\2\2?@\f\7\2\2@A\7\t\2\2AO\5\16\b\bBC\f\6\2\2CD\7" +
                    "\n\2\2DO\5\16\b\7EF\f\5\2\2FG\7\13\2\2GO\5\16\b\6HI\f\4\2\2IJ\7\f\2\2" +
                    "JO\5\16\b\5KL\f\3\2\2LM\7\r\2\2MO\5\16\b\4N?\3\2\2\2NB\3\2\2\2NE\3\2\2" +
                    "\2NH\3\2\2\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\17\3\2\2\2RP\3\2" +
                    "\2\2ST\7\16\2\2TU\7\27\2\2UY\7\17\2\2VX\5\26\f\2WV\3\2\2\2X[\3\2\2\2Y" +
                    "W\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\6\2\2]a\7\20\2\2^`\5\6\4" +
                    "\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2di\7\21" +
                    "\2\2eh\5\f\7\2fh\5\b\5\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2" +
                    "\2\2jl\3\2\2\2ki\3\2\2\2lm\7\22\2\2m\21\3\2\2\2np\t\2\2\2on\3\2\2\2pq" +
                    "\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\23\3\2\2\2st\7\27\2\2t\25\3\2\2\2uv\5\6" +
                    "\4\2vw\7\23\2\2w{\7\27\2\2xz\7\24\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|" +
                    "\3\2\2\2|\27\3\2\2\2}{\3\2\2\2\17\32\34\'\63=NPYagiq{";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}