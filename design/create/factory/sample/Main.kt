package design.create.factory.sample


fun main() {

    /**
     * 简单工厂
     */
    val factory = SampleFactory()
    factory.productFactory("java")?.productionCourse()
    factory.productFactory(PythonCourse::class.java)?.productionCourse()
}