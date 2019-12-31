package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.domain.function.Function

data class CompilationUnit(val fileName: String, val functions: List<Function>, val statements: List<Statement>)