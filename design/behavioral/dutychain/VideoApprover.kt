package design.behavioral.dutychain

class VideoApprover : Approver() {
    override fun handle(course: Course) {
        if (course.video.isNotEmpty()) {
            println("${course.name}包含有视频")
            approver?.handle(course)
        } else {
            println("${course.name}不包含视频")
        }
    }

}