package design.proxy

interface OrderService {

    fun saveOrder(order: Order):Int
}