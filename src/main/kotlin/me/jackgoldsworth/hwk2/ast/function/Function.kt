package me.jackgoldsworth.hwk2.ast.function

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.expression.Expression
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import me.jackgoldsworth.hwk2.ast.statement.Statement
import me.jackgoldsworth.hwk2.backend.FunctionGenerator

class Function(
    val name: String,
    val parameters: List<Parameter>,
    val returnType: Type,
    val scope: Scope,
    val statement: List<Statement>,
    val expression: Expression?,
    val description: String
) {

    fun accept(generator: FunctionGenerator) {
        generator.generate(this)
    }
}