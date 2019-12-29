package me.jackgoldsworth.hwk2

import me.jackgoldsworth.hwk2.bytecode.instructions.Instruction
import me.jackgoldsworth.hwk2.bytecode.instructions.PrintInst
import me.jackgoldsworth.hwk2.bytecode.instructions.VariableInst
import me.jackgoldsworth.hwk2.domain.Variable
import me.jackgoldsworth.hwk2.parser.HwKBaseListener
import me.jackgoldsworth.hwk2.parser.HwKParser
import java.util.*

class HwKTreeWalkListener : HwKBaseListener() {

    val instructions = ArrayDeque<Instruction>()
    private val variables = mutableMapOf<String, Variable>()

    override fun exitVariable(ctx: HwKParser.VariableContext) {
        val value = ctx.value()
        val textValue = ctx.ID().text
        val variable = Variable(
            variables.size,
            ctx.value().getStart().type,
            value.text
        )
        variables[textValue] = variable
        instructions.add(VariableInst(variable))
    }

    override fun exitPrint(ctx: HwKParser.PrintContext) {
        val id = ctx.ID()
        if (variables.containsKey(id.text)) {
            val variable = variables[id.text]!!
            instructions.add(PrintInst(variable))
            return
        }
        throw RuntimeException("The variable ${id.text} was not found!")
    }
}