package design.adapter

import design.adapter.`class`.Adapter
import design.adapter.`class`.ConcreteTarget
import java.awt.event.ComponentAdapter

fun main() {
    val dc5 = PowerAdapter()
    dc5.outPutDC5V()

    //类适配
    val target = ConcreteTarget()
    target.request()

    val target1 = Adapter()
    target1.adapterRequest()

    val target2 = design.adapter.obj.Adapter()
    target2.request()
}