package design.bridge

class ABCBank(account: Account) : Bank(account) {


    override fun openAccount(): Account {
        println("打开中国农业银行账号")
        account.openAccount()
        return account
    }

}