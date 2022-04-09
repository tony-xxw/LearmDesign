package design.iterator

interface CourseIterator {
    fun hasNext(): Boolean
    fun nextCourse(): Course
}