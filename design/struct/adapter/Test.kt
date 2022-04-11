package design.struct.adapter

import design.struct.adapter.`class`.Adapter
import design.struct.adapter.`class`.ConcreteTarget

fun main() {
    val dc5 = PowerAdapter()
    dc5.outPutDC5V()

    //类适配
    val target = ConcreteTarget()
    target.request()

    val target1 = Adapter()
    target1.adapterRequest()

    val target2 = design.struct.adapter.obj.Adapter()
    target2.request()
}