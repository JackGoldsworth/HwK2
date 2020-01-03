package me.jackgoldsworth.hwk2.domain.statement

import me.jackgoldsworth.hwk2.bytecode.StatementGenerator

interface Statement {

    fun accept(generator: StatementGenerator)
}