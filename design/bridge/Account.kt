package design.bridge

interface Account {
    fun openAccount(): Account

    fun showAccountType()
}