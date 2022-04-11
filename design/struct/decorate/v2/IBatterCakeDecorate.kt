package design.struct.decorate.v2

open class IBatterCakeDecorate(var batterCake: IBatterCake? = null) : IBatterCake {


    override fun getDesc(): String {
        return batterCake?.getDesc() ?: "错误煎饼"
    }

    override fun cost(): Int {
        return batterCake?.cost() ?: 0
    }
}