package design.struct.proxy.static

import design.struct.proxy.Order
import design.struct.proxy.OrderService
import design.struct.proxy.OrderServiceImp

class OrderServiceStaticProxy {
    lateinit var orderService: OrderService

    fun saveOrder(order: Order): Int {
        orderService = OrderServiceImp()
        beforeMethod()
        println("静态代理分配到 ${order.userId % 2}处理数据")
        afterMethod()
        return orderService.saveOrder(order)
    }

    fun beforeMethod() {
        println("静态代理 before code")
    }

    fun afterMethod() {
        println("静态代理 after code")
    }
}