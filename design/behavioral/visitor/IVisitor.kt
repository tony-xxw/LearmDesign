package design.behavioral.visitor

interface IVisitor {
    fun visitor(freeCourse: FreeCourse)
    fun visitor(codingCourse: CodingCourse)
}