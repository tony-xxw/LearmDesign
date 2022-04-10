package design.behavioral.mediator

class User(val name: String) {
    fun sendMessage(message: String) {
        StudyGroup.showMessage(this, message)
    }
}