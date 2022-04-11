package design.behavioral.visitor

class Visitor : IVisitor {
    override fun visitor(freeCourse: FreeCourse) {
        println("课程名称: ${freeCourse.name}")
    }

    override fun visitor(codingCourse: CodingCourse) {
        println("课程名称: ${codingCourse.name}， 课程价格: ${codingCourse.price}")
    }

}