package design.behavioral.state

class StopState : CourseVideoState() {
    override fun play() {
        courseVideoContext?.setState(CourseVideoContext.PLAY_STATE)
    }

    override fun stop() {
        println("视频开始暂停")
    }

    override fun speed() {
        println("ERROR: 停止状态不能快进")
    }

    override fun pause() {
        println("ERROR: 停止状态不能暂停")
    }

}