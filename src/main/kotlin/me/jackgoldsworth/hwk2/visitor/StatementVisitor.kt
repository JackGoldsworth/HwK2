package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.function.Function
import me.jackgoldsworth.hwk2.domain.scope.Scope
import me.jackgoldsworth.hwk2.domain.function.LocalVariable
import me.jackgoldsworth.hwk2.domain.function.Parameter
import me.jackgoldsworth.hwk2.domain.statement.*
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser
import java.lang.Error

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
        return FunctionStatement(name, listOf(), scope.functions[name]?.returnType ?: error("Function $name could not be found."))
    }
}