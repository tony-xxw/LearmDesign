package design.proxy.dynamic

import design.proxy.Order
import design.proxy.OrderService
import design.proxy.OrderServiceImp

fun main() {
    val bind = OrderServiceDynamicProxy(OrderServiceImp()).bind()
    if (bind is OrderService) {
        bind.saveOrder(Order(1, "static"))
    }

}