package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.ast.function.scope.Import
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class ImportVisitor: HwKBaseVisitor<Import>() {

    override fun visitImports(ctx: HwKParser.ImportsContext): Import {
        return Import(ctx.text)
    }
}