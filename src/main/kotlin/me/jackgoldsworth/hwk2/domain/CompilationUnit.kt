package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.domain.function.Function
import me.jackgoldsworth.hwk2.domain.statement.Statement

data class CompilationUnit(
    val fileName: String,
    val functions: List<Function>,
    val statements: List<Statement>,
    val scope: Scope
)