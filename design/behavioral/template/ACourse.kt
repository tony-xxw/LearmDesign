package design.behavioral.template

abstract class ACourse {

    fun makeCourse() {
        makePPT()
        makeVideo()
        if (needWriteArticle()) writeArticle()
        packageCourse()
    }

    private fun makePPT() {
        println("开始制作PPT")
    }

    private fun makeVideo() {
        println("开始制作Video")
    }

    private fun writeArticle() {
        println("开始写笔记")
    }

    protected open fun needWriteArticle(): Boolean = false

    abstract fun packageCourse()
}