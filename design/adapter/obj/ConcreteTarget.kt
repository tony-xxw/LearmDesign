package design.adapter.obj

class ConcreteTarget : Target {
    override fun request() {
        println("ConcreteTarget 目标方法")
    }

}