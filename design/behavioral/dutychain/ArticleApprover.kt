package design.behavioral.dutychain

class ArticleApprover:Approver() {
    override fun handle(course: Course) {
        if (course.article.isNotEmpty()) {
            println("${course.name}包含有手记")
            approver?.handle(course)
        } else {
            println("${course.name}不包含手记")
        }
    }
}