package design.behavioral.state

class PauseState : CourseVideoState() {
    override fun play() {
        courseVideoContext?.setState(CourseVideoContext.PLAY_STATE)
    }

    override fun stop() {
        courseVideoContext?.setState(CourseVideoContext.STOP_STATE)
    }

    override fun speed() {
        courseVideoContext?.setState(CourseVideoContext.SPEED_STATE)
    }

    override fun pause() {
        println("暂停播放课程视频状态")
    }

}