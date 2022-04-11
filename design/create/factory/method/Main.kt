package design.create.factory.method


fun main() {
    PythonFactory().let {
        it.productionFactory()
    }
}