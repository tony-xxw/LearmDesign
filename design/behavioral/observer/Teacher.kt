package design.behavioral.observer

import java.util.*

class Teacher(val name: String) : Observer {
    override fun update(o: Observable, arg: Any) {
        val course = o as Course
        val question = arg as Question
        println("$name 老师的 ${course.name}课程接收到到一个 ${question.userName}提交的问题: ${question.questionContent}")
    }

}