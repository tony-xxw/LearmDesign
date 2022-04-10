package design.behavioral.interpreter

class NumberInterpreter(val number: Int) : Interpreter {
    override fun interpret(): Int {
        return number
    }
}