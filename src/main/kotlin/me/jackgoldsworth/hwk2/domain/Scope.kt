package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.domain.statement.VariableStatement
import java.util.*

class Scope(val localVariables: Queue<VariableStatement>)