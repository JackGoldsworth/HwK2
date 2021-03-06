package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.ast.CompilationUnit
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class CompilationVisitor(private val fileName: String) : HwKBaseVisitor<CompilationUnit>() {

    override fun visitCompilationUnit(ctx: HwKParser.CompilationUnitContext): CompilationUnit {
        val scope = Scope()
        val functionVisitor = FunctionVisitor(scope)
        val statementVisitor = StatementVisitor(scope)
        val functions = ctx.function().map { it.accept(functionVisitor) }.toList()
        val statements = ctx.statement().map { it.accept(statementVisitor) }.toList()
        return CompilationUnit(fileName, functions, statements, scope)
    }
}