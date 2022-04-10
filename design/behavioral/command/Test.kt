package design.behavioral.command

fun main() {
    val courseVideo = CourseVideo("设计模式精讲")
    val closeVideoCommand = CloseVideoCommand(courseVideo)
    val openVideoCommand = OpenVideoCommand(courseVideo)

    Staff().apply {
        addCommand(openVideoCommand)
        addCommand(closeVideoCommand)
        executeCommand()
    }

}