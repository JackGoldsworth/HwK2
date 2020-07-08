// Generated from HwK.g4 by ANTLR 4.7.2
package me.jackgoldsworth.hwk2.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HwKParser}.
 */
public interface HwKListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HwKParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(HwKParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HwKParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(HwKParser.CompilationUnitContext ctx);
	/**
     * Enter a parse tree produced by {@link HwKParser#imports}.
     * @param ctx the parse tree
     */
    void enterImports(HwKParser.ImportsContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#imports}.
     *
     * @param ctx the parse tree
     */
    void exitImports(HwKParser.ImportsContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(HwKParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(HwKParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code VAL}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterVAL(HwKParser.VALContext ctx);

    /**
     * Exit a parse tree produced by the {@code VAL}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitVAL(HwKParser.VALContext ctx);

    /**
     * Enter a parse tree produced by the {@code DIV}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterDIV(HwKParser.DIVContext ctx);

    /**
     * Exit a parse tree produced by the {@code DIV}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitDIV(HwKParser.DIVContext ctx);

    /**
     * Enter a parse tree produced by the {@code SUB}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterSUB(HwKParser.SUBContext ctx);

    /**
     * Exit a parse tree produced by the {@code SUB}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitSUB(HwKParser.SUBContext ctx);

    /**
     * Enter a parse tree produced by the {@code ADD}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterADD(HwKParser.ADDContext ctx);

    /**
     * Exit a parse tree produced by the {@code ADD}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitADD(HwKParser.ADDContext ctx);

    /**
     * Enter a parse tree produced by the {@code OR}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterOR(HwKParser.ORContext ctx);

    /**
     * Exit a parse tree produced by the {@code OR}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitOR(HwKParser.ORContext ctx);

    /**
     * Enter a parse tree produced by the {@code EQUALS}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterEQUALS(HwKParser.EQUALSContext ctx);

    /**
     * Exit a parse tree produced by the {@code EQUALS}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitEQUALS(HwKParser.EQUALSContext ctx);

    /**
     * Enter a parse tree produced by the {@code MULT}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterMULT(HwKParser.MULTContext ctx);

    /**
     * Exit a parse tree produced by the {@code MULT}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitMULT(HwKParser.MULTContext ctx);

    /**
     * Enter a parse tree produced by the {@code FUNC}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterFUNC(HwKParser.FUNCContext ctx);

    /**
     * Exit a parse tree produced by the {@code FUNC}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitFUNC(HwKParser.FUNCContext ctx);

    /**
     * Enter a parse tree produced by the {@code VAR}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterVAR(HwKParser.VARContext ctx);

    /**
     * Exit a parse tree produced by the {@code VAR}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitVAR(HwKParser.VARContext ctx);

    /**
     * Enter a parse tree produced by the {@code GREATER_THAN}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterGREATER_THAN(HwKParser.GREATER_THANContext ctx);

    /**
     * Exit a parse tree produced by the {@code GREATER_THAN}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitGREATER_THAN(HwKParser.GREATER_THANContext ctx);

    /**
     * Enter a parse tree produced by the {@code AND}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterAND(HwKParser.ANDContext ctx);

    /**
     * Exit a parse tree produced by the {@code AND}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitAND(HwKParser.ANDContext ctx);

    /**
     * Enter a parse tree produced by the {@code LESS_THAN}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterLESS_THAN(HwKParser.LESS_THANContext ctx);

    /**
     * Exit a parse tree produced by the {@code LESS_THAN}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitLESS_THAN(HwKParser.LESS_THANContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#print}.
     *
     * @param ctx the parse tree
     */
    void enterPrint(HwKParser.PrintContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#print}.
     *
     * @param ctx the parse tree
     */
    void exitPrint(HwKParser.PrintContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfStatement(HwKParser.IfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfStatement(HwKParser.IfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#function}.
     *
     * @param ctx the parse tree
     */
    void enterFunction(HwKParser.FunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#function}.
     *
     * @param ctx the parse tree
     */
    void exitFunction(HwKParser.FunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionCall(HwKParser.FunctionCallContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionCall(HwKParser.FunctionCallContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#parameter}.
     *
     * @param ctx the parse tree
     */
    void enterParameter(HwKParser.ParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#parameter}.
     *
     * @param ctx the parse tree
     */
    void exitParameter(HwKParser.ParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#funcArgs}.
     *
     * @param ctx the parse tree
     */
    void enterFuncArgs(HwKParser.FuncArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#funcArgs}.
     *
     * @param ctx the parse tree
     */
    void exitFuncArgs(HwKParser.FuncArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#ret}.
     *
     * @param ctx the parse tree
     */
    void enterRet(HwKParser.RetContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#ret}.
     *
     * @param ctx the parse tree
     */
    void exitRet(HwKParser.RetContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#variable}.
     *
     * @param ctx the parse tree
     */
    void enterVariable(HwKParser.VariableContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#variable}.
     *
     * @param ctx the parse tree
     */
    void exitVariable(HwKParser.VariableContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#value}.
     *
     * @param ctx the parse tree
     */
    void enterValue(HwKParser.ValueContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#value}.
     *
     * @param ctx the parse tree
     */
    void exitValue(HwKParser.ValueContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#varReference}.
     *
     * @param ctx the parse tree
     */
    void enterVarReference(HwKParser.VarReferenceContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#varReference}.
     *
     * @param ctx the parse tree
     */
    void exitVarReference(HwKParser.VarReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(HwKParser.TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(HwKParser.TypeContext ctx);
}