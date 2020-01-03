package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.CompilationUnit
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class CompilationVisitor : HwKBaseVisitor<CompilationUnit>() {

    override fun visitCompilationUnit(ctx: HwKParser.CompilationUnitContext): CompilationUnit {
        val functionVisitor = FunctionVisitor()
        val statementVisitor = StatementVisitor()
        val statements = ctx.statement().map { it.accept(statementVisitor) }.toList()
        val functions = ctx.function().map { it.accept(functionVisitor) }.toList()
        return CompilationUnit("temp", functions, statements)
    }
}