package me.jackgoldsworth.hwk2.domain.statement

import me.jackgoldsworth.hwk2.bytecode.StatementGenerator
import me.jackgoldsworth.hwk2.domain.Statement
import me.jackgoldsworth.hwk2.domain.expression.Expression

class PrintStatement(val expression: Expression) : Statement {

    override fun accept(generator: StatementGenerator) {
        generator.generate(this)
    }
}