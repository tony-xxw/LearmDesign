package design.prototype

import java.util.*


fun main() {
    //基本用法
    val mail = Mail()
    mail.content = "初始化模板"
    println("mail new $mail")
    for (i in 0..10) {
        val cloneMail = mail.clone() as Mail
        cloneMail.name = "姓名 $i"
        cloneMail.address = "姓名 $i @qq.com"
        cloneMail.content = "恭喜你 中奖了"
        MailUtils.sendMail(cloneMail)
        println("mail clone $cloneMail")
    }
    MailUtils.saveOriginMail(mail)


    println()
    println()
    println()
    println()
    //深克隆 浅克隆
    val birthDay = Date(0L)
    val pig = Pig("佩奇", birthDay)
    val pig1 = pig.clone()
    println(pig)
    println(pig1)

    pig.brithday.time = 6666666666666666666L
    println("--------------------------")

    println(pig)
    println(pig1)
}