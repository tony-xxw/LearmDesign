package design.struct.bridge

abstract class Bank(val account: Account) {

    abstract fun openAccount(): Account
}