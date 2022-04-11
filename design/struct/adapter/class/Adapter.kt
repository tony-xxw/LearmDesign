package design.struct.adapter.`class`

class Adapter : Adaptee(), Target {
    override fun request() {
        super.adapterRequest()
    }

}