package design.prototype


class Mail constructor(
        var content: String? = "", var address: String = "", var name: String? = "") : Cloneable {

    public override fun clone(): Any {
        println("clone any")
        return super.clone()
    }

    override fun toString(): String {
        return super.toString()
    }

}


class MailUtils {

    companion object {
        fun sendMail(mail: Mail) {
            println("向${mail.name}同学,邮件地址: ${mail.address},邮件内容: ${mail.content}")
        }

        fun saveOriginMail(mail: Mail) {
            println("存储原始mai,origin ${mail.content}")
        }
    }
}