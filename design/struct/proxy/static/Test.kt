package design.struct.proxy.static

import design.struct.proxy.Order

fun main() {
    OrderServiceStaticProxy().apply {
        saveOrder(Order(1, "static"))
    }
}