package design.behavioral.interpreter

fun main() {
    GeelyExpressionParser().apply {
        println(parse("6 100 11 + *"))
    }
}