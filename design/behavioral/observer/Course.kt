package design.behavioral.observer

import java.util.*


class Course(val name: String) : Observable() {

    fun produceQuestion(question: Question) {
        println(question.userName + "在" + name + "提出" + question.questionContent)
        setChanged()
        notifyObservers(question)
    }

}
