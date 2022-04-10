package design.behavioral.command

class Staff {

    val list = mutableListOf<Command>()

    fun addCommand(command: Command) {
        list.add(command)
    }

    fun executeCommand() {
        list.forEach { it.execute() }
        list.clear()
    }
}