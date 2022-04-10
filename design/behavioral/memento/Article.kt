package design.behavioral.memento

data class Article(var title: String, var content: String, var imgs: String) {

    fun saveToMemento(): ArticleMemento = ArticleMemento(title, content, imgs)

    fun undoFromMemento(articleMemento: ArticleMemento) {
        title = articleMemento.title
        content = articleMemento.content
        imgs = articleMemento.imgs
    }
}