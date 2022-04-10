package design.behavioral.iterator

interface CourseManager {
    fun addCourse(course: Course)
    fun removeCourse(course: Course)
    fun obtainIterator(): CourseIterator
}