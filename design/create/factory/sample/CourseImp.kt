package design.create.factory.sample


class JavaCourse : ICourse() {
    override fun productionCourse() {
        println("Java课程")
    }
}

class PythonCourse : ICourse() {
    override fun productionCourse() {
        println("Python课程")
    }
}