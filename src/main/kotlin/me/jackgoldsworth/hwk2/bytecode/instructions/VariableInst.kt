package me.jackgoldsworth.hwk2.bytecode.instructions

import me.jackgoldsworth.hwk2.domain.Variable
import me.jackgoldsworth.hwk2.parser.HwKLexer
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class VariableInst(private val variable: Variable) : Instruction {

    override fun apply(visitor: MethodVisitor) {
        when (variable.type) {
            HwKLexer.NUMBER -> {
                val value = Integer.valueOf(variable.textVal)
                visitor.visitIntInsn(Opcodes.BIPUSH, value)
                visitor.visitVarInsn(Opcodes.ISTORE, variable.index)
            }
            HwKLexer.STRING -> {
                visitor.visitLdcInsn(variable.textVal)
                visitor.visitVarInsn(Opcodes.ASTORE, variable.index)
            }
            HwKLexer.ID -> {
                if (variable.otherVar!!.type == HwKLexer.STRING) {
                    visitor.visitVarInsn(Opcodes.ALOAD, variable.otherVar.index)
                    visitor.visitVarInsn(Opcodes.ASTORE, variable.index)
                } else if (variable.otherVar.type == HwKLexer.NUMBER) {
                    visitor.visitVarInsn(Opcodes.ILOAD, variable.otherVar.index)
//                    visitor.visitIntInsn(Opcodes.BIPUSH, 5) Temporary code to stop optimizations.
//                    visitor.visitInsn(Opcodes.IMUL)
                    visitor.visitVarInsn(Opcodes.ISTORE, variable.index)
                }
            }
        }
    }
}