package Chapter8NullsAndExceptions

fun myFunction (str : String) {

    try {

        val x = str.toInt()
        println(x)
    } catch ( e : NumberFormatException) {

        println("Bummer")
    }

    println("MyFunction has ended ")

}

fun setWorkRatePercentage (x : Int) {

    if (x !in 0..100 ) {
        throw IllegalArgumentException ("Percentage not in range 0..100 : $x")
    }
}

fun main () {

    myFunction("7")
    myFunction("Yes")
    setWorkRatePercentage(110)

}