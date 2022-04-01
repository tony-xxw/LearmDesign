package design.bridge

fun main() {
    val abcBank = ABCBank(DepositAccount())
    abcBank.openAccount().showAccountType()
    println()
    val abcBank1 = ABCBank(SavingAccount())
    abcBank1.openAccount().showAccountType()
    println()
    val icbcBank = ICBCBank(DepositAccount())
    icbcBank.openAccount().showAccountType()
    println()
    val icbcBank1 = ICBCBank(SavingAccount())
    icbcBank1.openAccount().showAccountType()

}