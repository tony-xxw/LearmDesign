package design.behavioral.iterator

class CourseManagerImp : CourseManager {
    private val list = mutableListOf<Course>()
    override fun addCourse(course: Course) {
        list.add(course)
    }

    override fun removeCourse(course: Course) {
        list.remove(course)
    }

    override fun obtainIterator(): CourseIterator {
        return CourseIteratorImp(list)
    }

}