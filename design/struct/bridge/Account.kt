package design.struct.bridge

interface Account {
    fun openAccount(): Account

    fun showAccountType()
}