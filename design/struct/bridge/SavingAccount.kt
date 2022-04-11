package design.struct.bridge

class SavingAccount : Account {
    override fun openAccount(): Account {
        println("打开一个活期账号")
        return SavingAccount()
    }

    override fun showAccountType() {
        println("这是一个活期账号")
    }

}