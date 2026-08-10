package Chapter3Functions

fun main () {

    doSomething("HIM",2)
    println("-----------------------")

    val jeux = arrayOf(1,2,3,4)
    maxValue(jeux)

    println("-----------------------")

    // Looping in an Array

    val mesEnfants = arrayOf("Francy","Steph","Georges")

    for ( e in mesEnfants ) println("$e est enfant de Maman Pauline")
    println("-------------------------")
    for (c in mesEnfants.indices ) println("Index $c has item ${mesEnfants[c]}")
    println("-------------------------")

    for ( (index , item) in mesEnfants.withIndex() ) {
        println("L'index $index est pour le nom $item")
    }


}


fun doSomething ( msg : String , i : Int  ) {

    if (i > 0 ) {

        var x = 0

        while (x < i) {

            println(msg)
            x = x+1
        }

    }

}

fun maxValue ( jeux : Array<Int> ) : Int {


    var max = jeux[0]
    var x = 1
    while ( x < jeux.size ) {

        var item = jeux[x]

        max = if (max >= item ) max else item
    x = x+1

    }
    return max
}