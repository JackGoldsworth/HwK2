package me.jackgoldsworth.hwk2.domain.function

import me.jackgoldsworth.hwk2.domain.Scope
import me.jackgoldsworth.hwk2.domain.Statement
import me.jackgoldsworth.hwk2.domain.Type
import java.util.*

data class Function(
    val name: String,
    val parameters: List<Parameter>,
    val returnType: Type,
    val scope: Scope,
    val statement: Queue<Statement>
)