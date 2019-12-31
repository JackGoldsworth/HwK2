package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.bytecode.instructions.StatementGenerator

interface Statement {

    fun accept(generator: StatementGenerator)
}