package design.behavioral.template

class FECourse(val needArticle: Boolean) : ACourse() {
    override fun packageCourse() {
        println("提供课程FE源代码")
        println("提供图片资源")
    }

    override fun needWriteArticle(): Boolean {
        return needArticle
    }

}