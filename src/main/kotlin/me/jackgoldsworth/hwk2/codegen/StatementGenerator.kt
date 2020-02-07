package me.jackgoldsworth.hwk2.codegen

import me.jackgoldsworth.hwk2.domain.scope.Scope
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.statement.FunctionStatement
import me.jackgoldsworth.hwk2.domain.statement.PrintStatement
import me.jackgoldsworth.hwk2.domain.statement.VariableStatement
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class StatementGenerator(
    private val methodVisitor: MethodVisitor,
    private val expressionGenerator: ExpressionGenerator,
    private val scope: Scope
) {

    fun generate(print: PrintStatement) {
        val expression = print.expression
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
        expression.accept(expressionGenerator)
        val type = expression.type
        methodVisitor.visitMethodInsn(
            Opcodes.INVOKEVIRTUAL,
            "java/io/PrintStream",
            "println",
            "(${type.descriptor})V",
            false
        )
    }

    fun generate(variable: VariableStatement) {
        val type = variable.expression.type
        val index = scope.getIndexOfLocalVariable(variable.varName)
            ?: throw IndexOutOfBoundsException("Variable ${variable.varName} index was not found!")
        variable.expression.accept(expressionGenerator) // Push the expression to the stack
        if (type == Type.STRING) { // Store the expression
            methodVisitor.visitVarInsn(Opcodes.ASTORE, index)
        } else {
            methodVisitor.visitVarInsn(Opcodes.ISTORE, index)
        }
    }

    fun generate(functionCall: FunctionStatement) {
        val description = Type.getMethodDescription(functionCall.parameters, functionCall.type)
        methodVisitor.visitMethodInsn(
            Opcodes.INVOKESTATIC,
            "example", // TODO: Make owner dynamic.
            functionCall.name,
            description,
            false
        )
    }
}