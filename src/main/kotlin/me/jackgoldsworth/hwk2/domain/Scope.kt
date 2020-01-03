package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.domain.statement.VariableStatement

class Scope {

    val localVariables = ArrayList<VariableStatement>()

    fun getIndexOfLocalVariable(varName: String): Int? {
        return localVariables.indexOf(getLocalVariable(varName))
    }

    fun getLocalVariable(varName: String): VariableStatement? {
        return localVariables.first { it.varName == varName }
    }
}