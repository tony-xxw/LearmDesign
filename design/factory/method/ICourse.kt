package design.factory.method



interface ICourse {
    fun productionCourse()
}

class JavaCourse : ICourse {
    override fun productionCourse() {
        println("Java课程")
    }
}

class PythonCourse : ICourse {
    override fun productionCourse() {
        println("Python课程")
    }
}