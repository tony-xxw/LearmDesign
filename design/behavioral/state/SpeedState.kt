package design.behavioral.state

class SpeedState : CourseVideoState() {
    override fun play() {
        courseVideoContext?.setState(CourseVideoContext.PLAY_STATE)
    }

    override fun stop() {
        courseVideoContext?.setState(CourseVideoContext.STOP_STATE)
    }

    override fun speed() {
        println("快进播放课程视频状态")
    }

    override fun pause() {
        courseVideoContext?.setState(CourseVideoContext.PAUSE_STATE)
    }

}