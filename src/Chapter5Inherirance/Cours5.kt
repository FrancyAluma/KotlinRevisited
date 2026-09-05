package Chapter5Inherirance

 open class Animal () {

    open val image = ""
    open val food = ""
    open val habitat = ""
     var hunger = 10

     open fun makeNoise () {

         println("The Animal is making Noise")
     }

     open fun eat () {

         println("The Animal is eating")
     }

     open fun roam () {

         println("The Animal is roaming")
     }

     fun sleep () {

         println("The Animal is sleeping")
     }
}


class Hippo : Animal() {

    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    init {
        hunger = 15
        println("La faim de l'Hippo est de $hunger")
    }


    override fun makeNoise() {
        super.makeNoise()
        println("Grunt! Grunt!")
    }

    override fun eat () {

        println("The Hippo is eating $food")
    }

}


open class Canine : Animal () {

    override fun roam() {
        println("The Canine is Roaming")
    }
}

class Wolf : Canine () {

    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl")
    }

    override fun eat () {

        println("The Wolf is eating $food")
    }
}

class Vet () {

    fun giveShot(animal : Animal) {
        // code to do something medical
        animal.makeNoise()
    }
}


fun main (  ) {

    val animals = arrayOf(Hippo(), Wolf () )

    for (item in animals) {
        item.roam()
        item.eat()
    }


    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)

}

