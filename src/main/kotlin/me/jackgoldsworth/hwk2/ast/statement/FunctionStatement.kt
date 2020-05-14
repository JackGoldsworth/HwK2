package me.jackgoldsworth.hwk2.ast.statement

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.expression.Expression
import me.jackgoldsworth.hwk2.ast.function.ParameterCall
import me.jackgoldsworth.hwk2.backend.ExpressionGenerator
import me.jackgoldsworth.hwk2.backend.StatementGenerator

class FunctionStatement(val name: String, val parameters: List<ParameterCall>, type: Type) : Statement,
    Expression(type) {

    override fun accept(generator: StatementGenerator) {
        generator.generate(this)
    }

    override fun accept(generator: ExpressionGenerator) {
        generator.generate(this)
    }
}