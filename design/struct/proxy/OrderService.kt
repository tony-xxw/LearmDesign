package design.struct.proxy

interface OrderService {

    fun saveOrder(order: Order):Int
}