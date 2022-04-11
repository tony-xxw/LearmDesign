package design.struct.proxy.dynamic

import design.struct.proxy.Order
import design.struct.proxy.OrderService
import design.struct.proxy.OrderServiceImp

fun main() {
    val bind = OrderServiceDynamicProxy(OrderServiceImp()).bind()
    if (bind is OrderService) {
        bind.saveOrder(Order(1, "static"))
    }

}