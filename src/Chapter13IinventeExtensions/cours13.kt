package Chapter13IinventeExtensions

/*
Extensions let you add new functions and properties to an existing type without you having
to create a whole new subtype.
* */


// Defining an Extension

val String.numVowels
    get() = count { "aeiouy".contains(it) }


infix fun String?.printWithDefault(default : String) = print(this ?: default)

fun String.addEnthusiasm ( amount : Int = 3 ) = this + "!".repeat(amount)

// fun Any.easyPrint() = println(this)

/*fun Any.easyPrint() : Any {

    println(this)
    return  (this)
}*/

fun <T> T.easyPrint() : T {

    println(this)
    return  (this)


}


fun main () {

    println("Madrigal has left the building".addEnthusiasm())

    println("---------------------------------------------")
    "Madrigal has left the building".addEnthusiasm().easyPrint()
    42.easyPrint()

    println("---------------------------------------------")
    "Madrigal has left the building".easyPrint().addEnthusiasm().easyPrint()

    println("---------------------------------------------")
    "How many vowels".numVowels.easyPrint()

    println("---------------------------------------------")
    val nullableString : String? = null
    nullableString printWithDefault "Default string!"

    println("--------------------------------------------")
    null printWithDefault "Default string" // with
    null.printWithDefault (" Default string" ) // without infix



}