package design.struct.adapter.obj

class Adapter : Target {
    val adaptee = Adaptee()
    override fun request() {
        adaptee.adapterRequest()
    }

}