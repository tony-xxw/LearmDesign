package design.behavioral.interpreter

import java.util.*

class GeelyExpressionParser {
    private val stack = Stack<Interpreter>()

    fun parse(str: String): Int {
        str.split(" ").forEach {
            if (!OperatorUtil.isOperator(it)) {
                val numberInterpreter = NumberInterpreter(it.toInt())
                stack.push(numberInterpreter)
                println("入栈 ${numberInterpreter.number}")
            } else {
                val first = stack.pop()
                val second = stack.pop()
                println("出栈 ${first.interpret()} 和 ${second.interpret()}")
                val expressionObject = OperatorUtil.getExpressionObject(first, second, it)
                println("应用运算符: ${expressionObject}")
                val result = expressionObject.interpret()
                val resultExpression = NumberInterpreter(result)
                stack.push(resultExpression)
                println("阶段结果入栈: ${resultExpression.interpret()}")
            }
        }
        return stack.pop().interpret()
    }
}