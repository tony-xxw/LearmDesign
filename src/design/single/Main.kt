package design.single

import sun.jvm.hotspot.oops.Instance
import java.io.*
import java.lang.Exception


fun main() {

//    lazy()
//    hunger()
//    println("test")
    attack()
}

fun attack() {
    try {
        val instance = HungerSingletonPattern.getInstance()
        val oos = ObjectOutputStream(FileOutputStream("singleton_file"))
        oos.writeObject(instance)

        val file = File("singleton_file")
        val ois = ObjectInputStream(FileInputStream(file))
        val readObject = ois.readObject() as HungerSingletonPattern

        println("old: $instance  new: $readObject")
        println(instance == readObject)

    } catch (e: Exception) {
        println(e.message)
    }


}

fun hunger() {
//    val instance = HungerSingletonPattern.getInstance()
    Thread(T()).start()
    Thread(T()).start()
}

fun lazy() {
    Thread(T()).start()
    Thread(T()).start()
}


class T : Runnable {
    override fun run() {
//        LazySingletonPattern.getInstance().apply {
//            println(this)
//        }
//        LazySingletonPattern.synchronizeInstance().apply {
//            println(this)
//        }
//        LazySingletonPattern.doubleCheckInstance().apply {
//            println(this)
//        }
        HungerSingletonPattern.getInstance().apply {
            println(this)
        }
    }
}