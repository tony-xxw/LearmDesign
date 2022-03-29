package design.decorate.v1

open class BatterCakeEgg : BatterCake() {

    override fun getDesc(): String {
        return super.getDesc() + "加鸡蛋"
    }

    override fun cost(): Int {
        return super.cost() + 1
    }
}