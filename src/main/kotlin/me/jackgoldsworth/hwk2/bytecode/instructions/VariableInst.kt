package me.jackgoldsworth.hwk2.bytecode.instructions

import me.jackgoldsworth.hwk2.domain.Variable
import me.jackgoldsworth.hwk2.parser.HwKLexer
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class VariableInst(private val variable: Variable) : Instruction, Opcodes {

    override fun apply(visitor: MethodVisitor) {
        val type = variable.type
        if (type == HwKLexer.NUMBER) {
            val value = Integer.valueOf(variable.textVal)
            visitor.visitIntInsn(Opcodes.BIPUSH, value)
            visitor.visitVarInsn(Opcodes.ISTORE, variable.index)
        } else if (type == HwKLexer.STRING) {
            visitor.visitLdcInsn(variable.textVal)
            visitor.visitVarInsn(Opcodes.ASTORE, variable.index)
        }
    }
}