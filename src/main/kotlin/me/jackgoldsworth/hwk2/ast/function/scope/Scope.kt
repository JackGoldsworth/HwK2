package me.jackgoldsworth.hwk2.ast.function.scope

import me.jackgoldsworth.hwk2.ast.function.Function
import me.jackgoldsworth.hwk2.ast.function.LocalVariable

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