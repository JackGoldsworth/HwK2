package me.jackgoldsworth.hwk2.domain.scope

import me.jackgoldsworth.hwk2.domain.function.Function
import me.jackgoldsworth.hwk2.domain.function.LocalVariable

class Scope {

    val localVariables = ArrayList<LocalVariable>()
    val functions = HashMap<String, Function>()

    fun getIndexOfLocalVariable(varName: String): Int? {
        return localVariables.indexOf(getLocalVariable(varName))
    }

    fun getLocalVariable(varName: String): LocalVariable? {
        return localVariables.firstOrNull { it.name == varName }
    }
}