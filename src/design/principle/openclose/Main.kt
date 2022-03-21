package design.principle.openclose


fun main() {

    val course = JavaCourse(10, "kotlin", 299.0)
    println("课程id: ${course.obtainId()}, 课程name: ${course.obtainName()}, 课程price: ${course.obtainPrice()}")
    // 现在课程优惠,需要打折
    val disCountCourse = JavaDiscountICourse(course)
    println(
        "课程id: ${course.obtainId()}, 课程name: ${course.obtainName()}, 课程price: ${course.obtainPrice()} ," +
                " 折扣价格: ${disCountCourse.getDiscountPrice(0.8)}"
    )

}