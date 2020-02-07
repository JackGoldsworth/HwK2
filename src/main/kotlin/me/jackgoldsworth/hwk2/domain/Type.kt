package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.domain.function.Parameter
import me.jackgoldsworth.hwk2.parser.HwKParser
import java.util.stream.Collectors

enum class Type(val descriptor: String) {
    INT("I"),
    STRING("Ljava/lang/String;"),
    VOID("V");

    companion object {
        fun getTypeFromName(context: HwKParser.TypeContext?): Type {
            if (context == null) return VOID
            val typeName = context.text
            if (typeName == "java/lang/String") return STRING
            return valueOf(typeName.toUpperCase())
        }

        fun getTypeFromValue(value: String): Type {
            if (value.isEmpty()) return VOID
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