package design.iterator

class CourseIteratorImp(val list: List<Course>) : CourseIterator {
    var position = 0
    override fun hasNext(): Boolean = position < list.size

    override fun nextCourse(): Course {
        val course = list[position]
        position++
        return course
    }

}