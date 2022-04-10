package design.behavioral.interpreter

class MultiInterpreter(val first: Interpreter, val second: Interpreter) : Interpreter {
    override fun interpret(): Int {
        return first.interpret() * second.interpret()
    }

    override fun toString(): String {
        return "*"
    }

}