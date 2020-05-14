package me.jackgoldsworth.hwk2.ast.statement

import me.jackgoldsworth.hwk2.ast.expression.Expression
import me.jackgoldsworth.hwk2.backend.StatementGenerator

class PrintStatement(val expression: Expression) :
    Statement {

    override fun accept(generator: StatementGenerator) {
        generator.generate(this)
    }
}