package design.proxy

class OrderServiceImp : OrderService {
    lateinit var orderDao: OrderDao
    override fun saveOrder(order: Order): Int {
        orderDao = OrderDaoImp()
        println("Service层调用Dao层添加order")
        return orderDao.insertDao(order)
    }

}