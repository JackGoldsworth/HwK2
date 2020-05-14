package me.jackgoldsworth.hwk2.ast.function

import me.jackgoldsworth.hwk2.ast.Type

data class ParameterCall(val name: String?, val value: String?, val type: Type, val varReference: Boolean)