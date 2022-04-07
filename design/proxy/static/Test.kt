package design.proxy.static

import design.proxy.Order

fun main() {
    OrderServiceStaticProxy().apply {
        saveOrder(Order(1, "static"))
    }
}