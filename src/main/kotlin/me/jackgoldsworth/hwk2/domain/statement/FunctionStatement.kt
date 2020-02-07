package me.jackgoldsworth.hwk2.domain.statement

import me.jackgoldsworth.hwk2.codegen.StatementGenerator
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.function.Parameter

class FunctionStatement(val name : String, val parameters: List<Parameter>, val type: Type) : Statement {

    override fun accept(generator: StatementGenerator) {
        generator.generate(this)
    }
}