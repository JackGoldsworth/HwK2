package me.jackgoldsworth.hwk2.domain.statement

import me.jackgoldsworth.hwk2.codegen.ExpressionGenerator
import me.jackgoldsworth.hwk2.codegen.StatementGenerator
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Expression
import me.jackgoldsworth.hwk2.domain.function.ParameterCall

class FunctionStatement(val name: String, val parameters: List<ParameterCall>, type: Type) : Statement,
    Expression(type) {

    override fun accept(generator: StatementGenerator) {
        generator.generate(this)
    }

    override fun accept(generator: ExpressionGenerator) {
        generator.generate(this)
    }
}