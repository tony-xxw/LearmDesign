package design.struct.bridge

class ICBCBank(account: Account) : Bank(account) {
    override fun openAccount(): Account {
        println("打开中国工商银行账号")
        account.openAccount()
        return account
    }

}