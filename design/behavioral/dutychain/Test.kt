package design.behavioral.dutychain

fun main() {
    val course = Course("设计模式精讲", "设计模式精讲手记", "设计模式精讲视频")
    val articleApprover = ArticleApprover()
    val videoApprover = VideoApprover()
    articleApprover.setNextApprover(videoApprover)
    articleApprover.handle(course )

}