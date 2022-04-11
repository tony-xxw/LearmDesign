package design.struct.bridge

class DepositAccount : Account {
    override fun openAccount(): Account {
        println("打开一个定期账号")
        return DepositAccount()
    }

    override fun showAccountType() {
        println("这是一个定期账号")
    }

}