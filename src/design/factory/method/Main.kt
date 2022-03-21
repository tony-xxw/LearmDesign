package design.factory.method


fun main() {
    PythonFactory().let {
        it.productionFactory()
    }
}