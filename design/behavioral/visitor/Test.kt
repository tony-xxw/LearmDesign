package design.behavioral.visitor

fun main() {
    val freeCourse = FreeCourse()
    freeCourse.name = "免费课程"

    val codingCourse = CodingCourse(10)
    codingCourse.name = "实战课程"

    mutableListOf<Course>().apply {
        add(freeCourse)
        add(codingCourse)
    }.forEach {
        it.accept(Visitor())
    }
}