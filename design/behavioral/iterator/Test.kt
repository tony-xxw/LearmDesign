package design.behavioral.iterator

fun main() {

    CourseManagerImp().apply {
        addCourse(Course("java"))
        addCourse(Course("kotlin"))
        addCourse(Course("fe"))
        addCourse(Course("go"))
        addCourse(Course("python"))
    }.let {
        it.obtainIterator().apply {
            while (hasNext()) {
                println(nextCourse().name )
            }
        }
    }
}