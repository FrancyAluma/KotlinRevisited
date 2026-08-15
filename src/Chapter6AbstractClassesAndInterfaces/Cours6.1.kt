package Chapter6AbstractClassesAndInterfaces

import com.sun.tools.javac.main.Option

/*
Une class peut heriter de 2 interfaces ou une interface et une classe mais jamais de 2 classes
* */

interface A {
    fun myfunction ()
    {
        println("From A")
    }

}

interface B {

    fun myFunction () {

        println("From B")
    }
}

interface C  {
    fun myFunction ()
}

open class Jeux () {

    fun video () {
    println("Playing Video Game")
    }
}


class Player () : Jeux() ,A,B {

}


class Bro () : A ,B , C{

    override fun myfunction() {
        super<A>.myfunction()
        super<B>.myFunction()
    }

    override fun myFunction() {
        println("Je viens du C")
    }
}


fun main () {

    val player = Player()
    player.myFunction()
    player.myFunction()
    player.video()
    println("--------------------------")


}