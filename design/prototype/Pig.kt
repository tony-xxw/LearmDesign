package design.prototype

import java.util.*

class Pig constructor(var name: String, var brithday: Date) : Cloneable {

    public override fun clone(): Any {
        val pig = super.clone() as Pig

        //深克隆
        pig.brithday = pig.brithday.clone() as Date
        return pig
    }

    override fun toString(): String {
        return "Pig(name='$name', birthday=$brithday) ${super.toString()}"
    }


}