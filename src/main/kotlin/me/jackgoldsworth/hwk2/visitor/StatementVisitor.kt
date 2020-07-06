package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.ast.function.LocalVariable
import me.jackgoldsworth.hwk2.ast.function.ParameterCall
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import me.jackgoldsworth.hwk2.ast.statement.FunctionStatement
import me.jackgoldsworth.hwk2.ast.statement.PrintStatement
import me.jackgoldsworth.hwk2.ast.statement.Statement
import me.jackgoldsworth.hwk2.ast.statement.VariableStatement
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class StatementVisitor(private val scope: Scope) : HwKBaseVisitor<Statement>() {

    private val expVisitor = ExpressionVisitor(scope)

    override fun visitPrint(ctx: HwKParser.PrintContext): Statement {
        val expressionCtx = ctx.expression()
        val expression = expressionCtx.accept(expVisitor)
        return PrintStatement(expression)
    }

    override fun visitVariable(ctx: HwKParser.VariableContext): Statement {
        val varName = ctx.ID().text
        val expression = ctx.expression().accept(expVisitor)
        val statement = LocalVariable(expression.type, varName)
        scope.localVariables.add(statement)
        return VariableStatement(varName, expression)
    }

    override fun visitFunctionCall(ctx: HwKParser.FunctionCallContext): Statement {
        val name = ctx.ID().text
        val params = mutableListOf<ParameterCall>()
        ctx.funcArgs().expression().forEach {
            params.add(ParameterCall(it.accept(expVisitor)))
        }
        return FunctionStatement(
            name,
            params,
            scope.functions[name]?.returnType ?: error("Function $name could not be found.")
        )
    }
}