package Chapter11LambdasAndHigheroderFunctions

fun main () {

    val addFive = { x : Int -> x +5 } // ou comme ca : (Int) -> Int  = { x  -> x + 5  }

    val addTwo : (Int) -> Int = { it + 2 }

    val age : (Int) -> String = { "Cet enfant a $it ans"  }
    val presentationEnfant = age(15)
    println(presentationEnfant) // println(age(15))


    val addition : (Int,Int) -> Int = { x,y -> x*y }
    val result = addition(8,9)
    println("le resultat de l'addition est ${result} ")

    val jeuxDouble = { a : Double , b : Double -> "la division donne : ${a/b}"  }
    println(jeuxDouble(25.0,5.0))
    val greeting : () -> String = { "Hello Hallo" }
    println(greeting())

    var essay : () -> Unit = { println("Je suis un Unit") }
    essay()
    essay = { println(4+5) }
    essay()





}