package me.jackgoldsworth.hwk2.domain.function

import me.jackgoldsworth.hwk2.domain.Type

data class ParameterCall(val name: String?, val value: String?, val type: Type, val varReference: Boolean)