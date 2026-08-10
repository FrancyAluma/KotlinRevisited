package Chapter3Functions

fun main () {

    val nombres = arrayOf(3,4,7)
    var x  = 2

    var y = nombres[x]

    var somo = 4

    while ( x < y ) {

        somo = somo - 1
        if ( somo == 1 ) {

            println("Ouias")

        } else println("Ca va")



        x = x +1


    }

    println("-----------------------------------------")

    var isThere = false

    var pump = 5

    while (!isThere) {

        pump = pump -1

        if (pump == 0){
            isThere = true
            println("C'est la fin")
        } else print("Parlons ")

         if(!isThere) println("Avancons")

    }

    println("-----------------------------------------")


    println(iDentite("Elvis","kabwe",12))

}

fun iDentite ( nom : String , postnom : String , age : Int ) : String {

    val presention = "Je suis $nom $postnom et j'ai $age ans"
    return presention

}