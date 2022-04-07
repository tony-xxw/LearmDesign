package design.proxy

interface OrderDao {
    fun insertDao(order: Order):Int
}