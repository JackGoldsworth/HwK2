package me.jackgoldsworth.hwk2.domain.statement

import me.jackgoldsworth.hwk2.codegen.StatementGenerator

interface Statement {

    fun accept(generator: StatementGenerator)
}