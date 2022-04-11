package design.struct.proxy

interface OrderDao {
    fun insertDao(order: Order):Int
}