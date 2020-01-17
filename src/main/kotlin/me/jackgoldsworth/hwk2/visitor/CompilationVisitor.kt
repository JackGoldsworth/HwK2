package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.CompilationUnit
import me.jackgoldsworth.hwk2.domain.scope.Scope
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class CompilationVisitor(private val fileName: String) : HwKBaseVisitor<CompilationUnit>() {

    override fun visitCompilationUnit(ctx: HwKParser.CompilationUnitContext): CompilationUnit {
        val scope = Scope()
        val functionVisitor = FunctionVisitor()
        val statementVisitor = StatementVisitor(scope)
        val statements = ctx.statement().map { it.accept(statementVisitor) }.toList()
        val functions = ctx.function().map { it.accept(functionVisitor) }.toList()
        return CompilationUnit(fileName, functions, statements, scope)
    }
}