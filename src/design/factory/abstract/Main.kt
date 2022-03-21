package design.factory.abstract


fun main() {

    JavaFactory().let {
        it.productArticle().product()
        it.productCourse().productionCourse()
    }
}