package design.behavioral.state

class PlayState : CourseVideoState() {
    override fun play() {
        println("正常播放课程视频")
    }

    override fun stop() {
        courseVideoContext?.setState(CourseVideoContext.STOP_STATE)
    }

    override fun speed() {
        courseVideoContext?.setState(CourseVideoContext.SPEED_STATE)
    }

    override fun pause() {
        courseVideoContext?.setState(CourseVideoContext.PAUSE_STATE)
    }

}