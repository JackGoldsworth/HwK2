package me.jackgoldsworth.hwk2.ast

import me.jackgoldsworth.hwk2.ast.function.Function
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import me.jackgoldsworth.hwk2.ast.statement.Statement

data class CompilationUnit(
    val fileName: String,
    val functions: List<Function>,
    val statements: List<Statement>,
    val scope: Scope
)