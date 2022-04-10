package design.behavioral.interpreter

class OperatorUtil {

    companion object {
        fun isOperator(operator: String): Boolean {
            return operator == "*" || operator == "+"
        }

        fun getExpressionObject(first: Interpreter, second: Interpreter, symbol: String): Interpreter {
            return when (symbol) {
                "+" -> AddInterpreter(first, second)
                else -> MultiInterpreter(first, second)
            }
        }
    }
}