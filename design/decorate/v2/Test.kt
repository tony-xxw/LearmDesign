package design.decorate.v2


fun main() {
    var iBatterCake: IBatterCake

    iBatterCake = BatterCake()
    iBatterCake = BatterCakeEgg(iBatterCake)
    iBatterCake = BatterCakeEgg(iBatterCake)
    iBatterCake = BatterCakeSausage(iBatterCake)
    println(iBatterCake.getDesc() + "价格为 ${iBatterCake.cost()}")

}