package design.behavioral.memento

fun main() {
    val articleMementoManager = ArticleMementoManager()
    val article = Article("设计模式A", "笔记A", "图片A")
    var articleMemento = article.saveToMemento()
    articleMementoManager.addMemento(articleMemento)

    println("标题 ${article.title} 内容: ${article.content} 图片: ${article.imgs}")
    println("手记完整信息: $article")

    println("修改手记内容start")
    article.apply {
        title = "设计模式B"
        content = "笔记B"
        imgs = "图片B"
    }
    println("修改手记内容end")
    println("手记完整内容: $article")
    articleMemento = article.saveToMemento()
    articleMementoManager.addMemento(articleMemento)

    article.apply {
        title = "设计模式C"
        content = "笔记C"
        imgs = "图片C"
    }

    println("回退start")
    println("回退栈1次")
    articleMemento = articleMementoManager.getMemento()
    article.undoFromMemento(articleMemento)

    println("回退栈2次")
    articleMemento = articleMementoManager.getMemento()
    article.undoFromMemento(articleMemento)

    println("回退end")
    println("手记完整内容: $article")

}