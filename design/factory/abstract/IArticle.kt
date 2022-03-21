package design.factory.abstract

interface IArticle {
    fun product()
}

class JavaArticle : IArticle {
    override fun product() {
        println("Java文章")
    }
}

class PythonArticle : IArticle {
    override fun product() {
        println("python文章")
    }

}