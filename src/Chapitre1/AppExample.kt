package Chapitre1

fun main () {

    var x = 1
    println("before the loop, x = $x")

    while (x < 4 ) {
         println("In the loop , x = $x")
        x = x+1
    }

    println("After the loop , x = $x")

    println("---------------------------------")

    val z = 3

    val y = 1

    if (z > y) {

        println("z est superieur a y")
    } else {
        println("z n'est pas superieur a y")
    }
     println("This is line runds no matter what ")

    println("--------if as an 'expression'---------------------")


    /*
    Et quand on utilise "if" as an expression , ca doit etre suivi de "else"
    */

    println( if(z>y) "z is greater than y " else "z n'est pas superieur a y" )

}