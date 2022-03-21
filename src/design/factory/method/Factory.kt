package design.factory.method

interface Factory {
    fun productionFactory(): ICourse
}

class JavaFactory : Factory {
    override fun productionFactory(): ICourse {
        return JavaCourse()
    }
}

class PythonFactory : Factory {
    override fun productionFactory(): ICourse {
        return PythonCourse()
    }
}