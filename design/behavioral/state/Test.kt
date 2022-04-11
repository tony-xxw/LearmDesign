package design.behavioral.state

fun main() {
    val courseVideoContext = CourseVideoContext()
    courseVideoContext.setState(PlayState())

    println("当前状态: ${courseVideoContext.courseVideoState?.javaClass?.simpleName}")

    courseVideoContext.pause()

    println("当前状态: ${courseVideoContext.courseVideoState?.javaClass?.simpleName}")

    courseVideoContext.speed()

    println("当前状态: ${courseVideoContext.courseVideoState?.javaClass?.simpleName}")

    courseVideoContext.stop()

    println("当前状态: ${courseVideoContext.courseVideoState?.javaClass?.simpleName}")

    courseVideoContext.speed()
}