package design.behavioral.iterator

interface CourseIterator {
    fun hasNext(): Boolean
    fun nextCourse(): Course
}