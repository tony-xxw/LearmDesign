package design.struct.flyweight

fun main() {
    val deparments = arrayOf("QA", "BD", "PM", "AH")

    for (i in 0..10) {
        EmployeeFactory().obtainEmployee(deparments[(Math.random() * deparments.size).toInt()]).report()
    }
}