package design.behavioral.mediator

import java.util.*

class StudyGroup {
    companion object {
        fun showMessage(user: User, message: String) {
            println("${Date()} [ ${user.name}]: $message")
        }
    }
}