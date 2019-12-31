package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.domain.expression.VariableReference
import java.util.*

class Scope(val localVariables: Queue<VariableReference>) {
}