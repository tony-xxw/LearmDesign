package design.behavioral.state

class CourseVideoContext {
    var courseVideoState: CourseVideoState? = null

    companion object {
        val PLAY_STATE = PlayState()
        val STOP_STATE = StopState()
        val PAUSE_STATE = PauseState()
        val SPEED_STATE = SpeedState()
    }

    fun setState(state: CourseVideoState) {
        courseVideoState = state
        courseVideoState?.setCourseContext(this)
    }

    fun play() {
        courseVideoState?.play()
    }

    fun stop() {
        courseVideoState?.stop()
    }

    fun speed() {
        courseVideoState?.speed()
    }

    fun pause() {
        courseVideoState?.pause()
    }

}