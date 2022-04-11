package design.create.factory.abstract

interface Factory {
    fun productCourse(): ICourse

    fun productArticle(): IArticle

}

class JavaFactory : Factory {
    override fun productCourse(): ICourse {
        return JavaCourse()
    }

    override fun productArticle(): IArticle {
        return JavaArticle()
    }

}

class PythonFactory : Factory {
    override fun productCourse(): ICourse {
        return PythonCourse()
    }

    override fun productArticle(): IArticle {
        return PythonArticle()
    }

}