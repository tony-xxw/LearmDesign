package design.principle.demeter


fun main() {
    Boos().apply {
        //normal
        commandCheckNumber(TeamLeader())
        //demeter
        commandCheckNumberDemeter(TeamLeader())

    }
}

class Boos() {

    fun commandCheckNumber(teamLeader: TeamLeader) {
        val courses = mutableListOf<Course>()
        for (index in 0..20) {
            courses.add(Course())
        }
        teamLeader.checkNumberOfCourses(courses)
    }

    fun commandCheckNumberDemeter(teamLeader: TeamLeader) {
        teamLeader.checkNumberOfCourses()
    }
}

class TeamLeader() {

    fun checkNumberOfCourses(list: List<Course>) {
        println("课程数量 ${list.size}")
    }

    fun checkNumberOfCourses() {
        val courses = mutableListOf<Course>()
        for (index in 0..20) {
            courses.add(Course())
        }
        println("课程数量 ${courses.size}")
    }
}

class Course() {

}