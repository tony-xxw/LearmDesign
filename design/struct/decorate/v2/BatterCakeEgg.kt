package design.struct.decorate.v2

class BatterCakeEgg(batterCake: IBatterCake) : IBatterCakeDecorate(batterCake) {

    override fun getDesc(): String {
        return super.getDesc() + "加一个煎蛋"
    }

    override fun cost(): Int {
        return super.cost() + 1
    }
}