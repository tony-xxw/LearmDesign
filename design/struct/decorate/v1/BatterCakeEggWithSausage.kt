package design.struct.decorate.v1

class BatterCakeEggWithSausage : BatterCakeEgg() {

    override fun getDesc(): String {
        return super.getDesc() + " 加香肠"
    }

    override fun cost(): Int {
        return super.cost() + 2
    }
}