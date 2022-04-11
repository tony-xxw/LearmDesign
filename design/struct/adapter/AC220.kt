package design.struct.adapter

class AC220 {

    fun outPutAc220v(): Int {
        val value = 220
        println("输出交流电 $value V")
        return value
    }
}