package top.maplex.arim.tools.variablecalculator.impl

import top.maplex.arim.tools.variablecalculator.Node

data class DivisionNode(
    val left: Node,
    val right: Node
) : Node {
    override fun evaluate(variableMap: Map<String, Double>): Double {
        val rightValue = right.evaluate(variableMap)
        if (rightValue == 0.0) {
            throw ArithmeticException("Division by zero")
        }
        return left.evaluate(variableMap) / rightValue
    }
}
