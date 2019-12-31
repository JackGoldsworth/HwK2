package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.CompilationUnit
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class CompilationVisitor : HwKBaseVisitor<CompilationUnit>() {

    override fun visitCompilationUnit(ctx: HwKParser.CompilationUnitContext): CompilationUnit {
        val functionVisitor = FunctionVisitor()
        val functionsCtx = ctx.function()
        return super.visitCompilationUnit(ctx)
    }
}