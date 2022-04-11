package design.struct.decorate.v1


fun main() {
    val batterCake = BatterCake()
    println(batterCake.getDesc() + " 销售价格: ${batterCake.cost()}")

    val batterCakeEgg = BatterCakeEgg()
    println(batterCakeEgg.getDesc() + " 销售价格: ${batterCakeEgg.cost()}")

    val batterCakeEggWithSausage = BatterCakeEggWithSausage()
    println(batterCakeEggWithSausage.getDesc() + " 销售价格: ${batterCakeEggWithSausage.cost()}")
}