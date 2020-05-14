package me.jackgoldsworth.hwk2.ast.function

import me.jackgoldsworth.hwk2.ast.Type

data class LocalVariable(val type: Type, val name: String)