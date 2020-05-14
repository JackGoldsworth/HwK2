package me.jackgoldsworth.hwk2.ast.statement

import me.jackgoldsworth.hwk2.backend.StatementGenerator

interface Statement {

    fun accept(generator: StatementGenerator)
}