package design.behavioral.command

class CloseVideoCommand(val courseVideo: CourseVideo) : Command {
    override fun execute() {
        courseVideo.closeVideo()
    }
}