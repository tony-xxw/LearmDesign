package design.proxy.static

import design.proxy.Order
import design.proxy.OrderService
import design.proxy.OrderServiceImp

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