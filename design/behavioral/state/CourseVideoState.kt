package design.behavioral.state

abstract class CourseVideoState() {
    protected var courseVideoContext: CourseVideoContext? = null

    fun setCourseContext(context: CourseVideoContext) {
        courseVideoContext = context
    }

    abstract fun play()
    abstract fun stop()
    abstract fun speed()
    abstract fun pause()
}