package design.behavioral.visitor

abstract class Course {
    lateinit var name: String

    abstract fun accept(visitor: IVisitor)
}