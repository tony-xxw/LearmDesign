package design.behavioral.command

class OpenVideoCommand(val courseVideo: CourseVideo) : Command {
    override fun execute() {
        courseVideo.openVideo()
    }

}