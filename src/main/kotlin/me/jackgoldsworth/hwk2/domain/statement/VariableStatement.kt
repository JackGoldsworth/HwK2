package me.jackgoldsworth.hwk2.domain.statement

import me.jackgoldsworth.hwk2.bytecode.instructions.StatementGenerator
import me.jackgoldsworth.hwk2.domain.Statement

class VariableStatement : Statement {

    override fun accept(generator: StatementGenerator) {
        generator.generate(this)
    }
}