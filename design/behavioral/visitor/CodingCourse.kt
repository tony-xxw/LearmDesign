package design.behavioral.visitor

class CodingCourse(val price: Int) : Course() {

    override fun accept(visitor: IVisitor) {
        visitor.visitor(this)
    }

}