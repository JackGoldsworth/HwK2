package me.jackgoldsworth.hwk2.backend

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import me.jackgoldsworth.hwk2.ast.statement.FunctionStatement
import me.jackgoldsworth.hwk2.ast.statement.PrintStatement
import me.jackgoldsworth.hwk2.ast.statement.VariableStatement
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
        functionCall.accept(expressionGenerator)
    }
}