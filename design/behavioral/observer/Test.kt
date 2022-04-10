package design.behavioral.observer

fun main() {
    val course = Course("Java设计模式")
    val teacher = Teacher("Alpha")

    course.addObserver(teacher)
    val question = Question("Geely", "主函数如何编写")
    course.produceQuestion(question)
}