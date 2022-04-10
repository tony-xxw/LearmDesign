package design.behavioral.command

class CourseVideo(val name: String) {

    fun openVideo() {
        println("$name 开放视频")
    }

    fun closeVideo() {
        println("$name 关闭视频")
    }
}