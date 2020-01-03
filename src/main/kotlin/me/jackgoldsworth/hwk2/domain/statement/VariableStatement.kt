package me.jackgoldsworth.hwk2.domain.statement

import me.jackgoldsworth.hwk2.bytecode.StatementGenerator
import me.jackgoldsworth.hwk2.domain.expression.Expression

class VariableStatement(val varName: String, val expression: Expression) :
    Statement {

    override fun accept(generator: StatementGenerator) {
        generator.generate(this)
    }
}