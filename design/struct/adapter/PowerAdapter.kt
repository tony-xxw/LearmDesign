package design.struct.adapter

class PowerAdapter : DC5 {
    val accAC220 = AC220()
    override fun outPutDC5V(): Int {
        val outPutAc220v = accAC220.outPutAc220v()
        println("电压器 转化")
        val dcValue = outPutAc220v / 44
        println("输出电流 $dcValue")
        return dcValue

    }
}