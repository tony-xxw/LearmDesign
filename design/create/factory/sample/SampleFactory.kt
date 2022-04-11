package design.create.factory.sample


class SampleFactory {

    fun productFactory(name: String): ICourse? = when (name) {
        "java" -> JavaCourse()
        "python" -> PythonCourse()
        else -> null
    }


    fun productFactory(cla: Class<*>): ICourse? = when (cla) {
        JavaCourse::class.java -> Class.forName(cla.name).newInstance() as ICourse
        PythonCourse::class.java -> Class.forName(cla.name).newInstance() as ICourse
        else -> null
    }


}