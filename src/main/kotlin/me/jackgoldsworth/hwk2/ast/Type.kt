package me.jackgoldsworth.hwk2.ast

import me.jackgoldsworth.hwk2.ast.function.Parameter
import me.jackgoldsworth.hwk2.error.HwkSyntaxError
import me.jackgoldsworth.hwk2.parser.HwKParser
import java.util.stream.Collectors

enum class Type(val descriptor: String, val id: String) {
    INT("I", "Int"),
    STRING("Ljava/lang/String;", "String"),
    BOOL("Z", "Bool"),
    VOID("V", "Void");

    companion object {
        fun getTypeFromName(context: HwKParser.TypeContext?): Type {
            if (context == null) return VOID
            val type = context.text
            when (type) {
                INT.id -> return INT
                STRING.id -> return STRING
                BOOL.id -> return BOOL
            }
            throw HwkSyntaxError("There was an issue finding the type on line ${context.getStart().line} for: $type")
        }

        fun getTypeFromValue(value: String): Type {
            if (value.isEmpty()) return VOID
            else if (value == "false" || value == "true") return BOOL
            return if (value.toIntOrNull() === null) STRING else INT
        }

        fun getMethodDescription(params: List<Parameter>, returnType: Type): String {
            // This just puts () around the descriptors and concatenate the return descriptor.
            return params.stream().map { it.type.descriptor }.collect(
                Collectors.joining(
                    "",
                    "(",
                    ")"
                )
            ) + returnType.descriptor
        }
    }
}