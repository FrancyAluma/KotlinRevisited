package Chapter3Functions

fun main () {

    var pains = arrayOf(1,2,3,4)
    foo(pains[2],"Jules")

    println("------------------------------")
    printSum(5,6)
    val x = 20
    val y = 36
    printSum(x,y)

    println("-------------------------------")
    println(max(7,8))

    println("---------------------------")
    println(sommeb(1,2))
    println("---------------------------")

    val noms = arrayOf("Vini","Mbappe","Jude")
    updateArray(noms)
    println(noms[2])




}

fun updateArray ( optionsParam : Array<String> ) {

    optionsParam[2] = "Fred"

}


fun foo (param : Int , nom : String ) {

    println("l'eleve a eu $param pains  ")
    kombo(nom)

}

fun printSum (int1 : Int, int2 : Int) {

    val result = int1 + int2

    println("La somme de $int1 et $int2 est $result")
}

fun kombo ( nom : String) {

    println("Et son nom c'est $nom")
}

// Parlons un peu de la function "return"

fun max ( a : Int , b : Int  ) : Int  {

    val maxValue = if (a > b ) a else b
    return maxValue

}

// This is a single expression function
fun sommeb ( a : Int , b : Int )  = if (a<b) a else b