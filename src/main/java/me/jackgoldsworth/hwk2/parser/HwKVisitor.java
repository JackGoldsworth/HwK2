// Generated from HwK.g4 by ANTLR 4.7.2
package me.jackgoldsworth.hwk2.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HwKParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HwKVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HwKParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(HwKParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HwKParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(HwKParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HwKParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HwKParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HwKParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HwKParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HwKParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HwKParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HwKParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(HwKParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VAL}
	 * labeled alternative in {@link HwKParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitVAL(HwKParser.VALContext ctx);

    /**
     * Visit a parse tree produced by the {@code DIV}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDIV(HwKParser.DIVContext ctx);

    /**
     * Visit a parse tree produced by the {@code SUB}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSUB(HwKParser.SUBContext ctx);

    /**
     * Visit a parse tree produced by the {@code ADD}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitADD(HwKParser.ADDContext ctx);

    /**
     * Visit a parse tree produced by the {@code MULT}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMULT(HwKParser.MULTContext ctx);

    /**
     * Visit a parse tree produced by the {@code FUNC}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFUNC(HwKParser.FUNCContext ctx);

    /**
     * Visit a parse tree produced by the {@code VAR}
     * labeled alternative in {@link HwKParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVAR(HwKParser.VARContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#function}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunction(HwKParser.FunctionContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#ret}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRet(HwKParser.RetContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCall(HwKParser.FunctionCallContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValue(HwKParser.ValueContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#varReference}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarReference(HwKParser.VarReferenceContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#parameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameter(HwKParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HwKParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(HwKParser.FuncArgsContext ctx);
}