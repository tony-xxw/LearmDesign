package design.principle.interfacesegregation


fun main() {
    Dog().apply {
        fly()
        eat()
        swim()
    }
    println()
    Bird().apply {
        fly()
        eat()
        swim()
    }
    println()

    DogImp().apply {
        eat()
        swim()
    }
    println()
    BirdImp().apply {
        eat()
        fly()
    }

}

interface IAnimalAction {
    fun fly()
    fun eat()
    fun swim()
}

class Dog : IAnimalAction {
    override fun fly() {

    }

    override fun eat() {
        println("吃饭")
    }

    override fun swim() {
        println("游泳")
    }
}

class Bird : IAnimalAction {
    override fun fly() {
        println("飞")
    }

    override fun eat() {
        println("吃饭")
    }

    override fun swim() {

    }
}

interface IFlyAnimalAction {
    fun fly()
}

interface ISwimAnimalAction {
    fun swim()
}

interface IEatAnimalAction {
    fun eat()
}

class DogImp : ISwimAnimalAction, IEatAnimalAction {
    override fun swim() {
        println("游泳")
    }

    override fun eat() {
        println("吃饭")
    }
}

class BirdImp : IEatAnimalAction, IFlyAnimalAction {
    override fun fly() {
        println("飞")
    }

    override fun eat() {
        println("吃饭")
    }

}