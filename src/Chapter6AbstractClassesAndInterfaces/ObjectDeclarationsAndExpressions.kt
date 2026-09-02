package Chapter6AbstractClassesAndInterfaces

/*

An object declaration defines a class declaration and creates an instance of it in a single
statement.

An object expression is an expression that creates an anonymous object on the fly with no
predefined type.
* */

object DuckManager {

   val allDucks = mutableListOf<Duck>()

    fun herdDucks () {

        // code to herd the Ducks
    }
}

class Duck {

    object DuckFactory {

        fun create () : Duck = Duck()
    }

    companion object {

        fun creeons () : Duck = Duck()
    }
}

fun main () {

    DuckManager.herdDucks()
    println("-------------------------------")

    val newDuck = Duck.DuckFactory.create()
    val nouveauDuck = Duck.creeons()

}