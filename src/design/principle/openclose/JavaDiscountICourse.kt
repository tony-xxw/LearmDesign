package design.principle.openclose


class JavaDiscountICourse(private val iCourse: ICourse) {

    fun getDiscountPrice(discount: Double): Double = iCourse.obtainPrice() * discount
}