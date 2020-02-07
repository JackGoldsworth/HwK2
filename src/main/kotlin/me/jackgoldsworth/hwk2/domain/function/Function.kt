package me.jackgoldsworth.hwk2.domain.function

import me.jackgoldsworth.hwk2.codegen.FunctionGenerator
import me.jackgoldsworth.hwk2.codegen.StatementGenerator
import me.jackgoldsworth.hwk2.domain.scope.Scope
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.statement.Statement

class Function(
    val name: String,
    val parameters: List<Parameter>,
    val returnType: Type,
    val scope: Scope,
    val statement: List<Statement>
) {

    fun accept(generator: FunctionGenerator) {
        generator.generate(this)
    }
}