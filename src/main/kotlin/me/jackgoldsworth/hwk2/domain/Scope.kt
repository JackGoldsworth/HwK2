package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.domain.function.LocalVariable

class Scope {

    val localVariables = ArrayList<LocalVariable>()

    fun getIndexOfLocalVariable(varName: String): Int? {
        return localVariables.indexOf(getLocalVariable(varName))
    }

    fun getLocalVariable(varName: String): LocalVariable? {
        return localVariables.first { it.name == varName }
    }
}