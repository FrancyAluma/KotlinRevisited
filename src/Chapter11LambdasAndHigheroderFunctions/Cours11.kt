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


    println("------------------------HigherOrderFunction----------------------------")

    val greetingFunction = { playerName : String , numBuildings : Int ->

        val currentYear = 2026
        println("Adding $numBuildings houses")
        "Welcome to EttaVillage , $playerName! (copyright $currentYear) "
    }




    runSimulation("Njagi" , :: printConstructionCost) { playerName , numBuildings ->

        val currentYear = 2026
        println("Adding $numBuildings houses")
        "Welcome to EttaVillage , $playerName! (copyright $currentYear) "
    }


}

fun runSimulation (playerName : String,
                          costPrinter : (Int)-> Unit,
                          greetingFunction : ( String , Int) -> String  ) {

    val numBuildings = (1..3).shuffled().last() // randomly select 1,2 or 3
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))

}

fun printConstructionCost (numBuilding : Int) {

    val cost = 500
    println("construction cost : ${cost * numBuilding}")
}