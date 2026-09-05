package Chapitre1

fun main () {

    // Do Something (Statements)

    println("Pow")

    var y = 3

    y = y + 2

    println("The value of y is $y")

    val name = "Francy Aluma "
    println(name )

    println("---------------------------")

    // Do Something again and again (loops)


    // 1. While

    /*

    The syntax for while is relatively simple.So long as some condition is true, you do
    everything inside the loop block

    A "while loop" runs everything within its block so long as the conditional is true
     */

    var x = 3

    x = x * 10

    while (x > 20) {

        x = x-1

        print(("x is now $x"))
    }

    println("---------------------------")

    for (i in 1..5) {
        x = x+1
        println("x is maintenant $x")
    }

    println("---------------------------")

    if ( x == 20 ) {
        println("x must be 20")
    } else {
        println("x isn't 20")
    }

    if (name.equals("Jean"))
        println("$name strikes ")
    else println("$name is a good defender")

    println("---------------------------")

    // Simple Booelan Test

    /*
    < (less than)
    > (greater than)
   == (equality)
   <=(less than or equal to )
   >= (hreater than or equal to )
    * */

    var xx = 4

    while (xx > 3) {

        // The loop code will run as xx is greater than 3
        println(xx)

        xx  = xx-1
    }

    println("---------------------------")

    var z = 27

    while (z == 10) {

        // The loop code will not run as z is 27 , which is not equal to 10

        println(z)

        z = z-17
    }


    // "For" Loop : It runs over a range of values or items

      // 1. downTo

    for (bb in 15 downTo 10) println(bb)
    for (bw in 1.. 7 step 2 ) println(bw)



}