package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.scope.Scope
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.function.Function
import me.jackgoldsworth.hwk2.domain.function.LocalVariable
import me.jackgoldsworth.hwk2.domain.function.Parameter
import me.jackgoldsworth.hwk2.domain.statement.Statement
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser
import java.util.stream.Collectors

class FunctionVisitor : HwKBaseVisitor<Function>() {

    val scope = Scope()

    override fun visitFunction(ctx: HwKParser.FunctionContext): Function {
        val name = ctx.ID().text
        val parameters = getParameters(ctx.parameter())
        val statements = getStatements(ctx.statement())
        val returnType = Type.getTypeFromName(ctx.type())
        return Function(name, parameters, returnType, scope, statements)
    }

    private fun getParameters(ctx: List<HwKParser.ParameterContext>): List<Parameter> {
        return ctx.stream().map { Parameter(Type.getTypeFromName(it.type()), it.text) }.peek {
            scope.localVariables.add(
                LocalVariable(it.type, it.name)
            )
        }.collect(Collectors.toList())
    }

    private fun getStatements(ctx: List<HwKParser.StatementContext>): List<Statement> {
        val statementVisitor = StatementVisitor(scope)
        return ctx.map { it.accept(statementVisitor) }
    }
}