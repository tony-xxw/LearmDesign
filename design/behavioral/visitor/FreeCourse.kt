package design.behavioral.visitor


class FreeCourse :Course(){
    override fun accept(visitor: IVisitor) {
        visitor.visitor(this)
    }

}