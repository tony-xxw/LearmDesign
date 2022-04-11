package design.struct.proxy

class OrderDaoImp : OrderDao {
    override fun insertDao(order: Order): Int {
        println("Dao层添加order成功")
        return 1
    }

}