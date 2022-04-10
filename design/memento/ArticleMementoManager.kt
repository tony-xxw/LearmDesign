package design.memento

import java.util.*

class ArticleMementoManager {
    private val ARTICAL_MEMENTO_STATCK = Stack<ArticleMemento>()

    fun getMemento(): ArticleMemento = ARTICAL_MEMENTO_STATCK.pop()

    fun addMemento(articleMemento: ArticleMemento) {
        ARTICAL_MEMENTO_STATCK.push(articleMemento)
    }

}