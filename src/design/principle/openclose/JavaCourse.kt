package design.principle.openclose


open class JavaCourse(val id: Int, val name: String, val price: Double) : ICourse {

    override fun obtainId(): Int = id

    override fun obtainName(): String = name

    override fun obtainPrice(): Double = price

}