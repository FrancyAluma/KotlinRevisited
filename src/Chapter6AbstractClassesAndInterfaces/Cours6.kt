package Chapter6AbstractClassesAndInterfaces

/*
1. abstract class
Declare a class as abstract to stop it from being instantiated cad on ne peut pas creer d'objects
de cette class la.

Et quand une class herite d'une abstract class et que a son tour , on a herite de lui ,ces petites
filles classes ont l'obligation de pouvoir override toutes les properties et functions de la grand
mere superclass au cas ou la mere ne les a override.
An Abstract can also have non-abstract properties or functions

2.interface
An interface lets you define common behavior OUTSIDE a superclass hierarchy
 */

interface Roamable {

    /* fun roam () {
         println("TRhe Roamable is roaming")

         // ceci est une function concrete dans une interface
     } */

    fun roam ()  // ceci est une function abstract dans une interface
}

abstract class Animal () : Roamable {

    abstract val image : String
    abstract val food : String
    abstract val habitat : String
    var hunger = 10

    abstract fun makeNoise ()

    abstract fun eat ()

    override fun roam () {

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


    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat () {

        println("The Hippo is eating $food")
    }

}


abstract class Canine : Animal () {

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

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
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

    println("------------------------------------")

    /*
    Parlons aussi de  "is" and "as" en meme temps
     */

    val animal: Animal = Wolf()

    if (animal is Wolf) {
      animal.eat()
    }

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()

        if (item is Animal) {

            item.eat()
        }
    }

}

