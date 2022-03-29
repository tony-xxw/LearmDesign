package design.decorate.v2

class BatterCakeSausage(batterCake: IBatterCake) : IBatterCakeDecorate(batterCake) {

    override fun getDesc(): String {
        return super.getDesc() + "加一个根香肠"
    }

    override fun cost(): Int {
        return super.cost() + 2
    }
}