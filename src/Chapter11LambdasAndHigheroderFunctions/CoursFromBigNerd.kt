package Chapter11LambdasAndHigheroderFunctions

fun  main () {

    val greetingFunction : () -> String = {

        val currentYear = 2026
        "Welcome to EttaVillage , Mayor! (copyright $currentYear) "
    }

    println(greetingFunction())

    val greetingFunction2 : (String) -> String = {

       // (a) playerName ->
        val currentYear = 2026
       // (a) "Welcome to EttaVillage , $playerName! (copyright $currentYear) "
        "Welcome to EttaVillage , $it! (copyright $currentYear) "
    }

    println(greetingFunction2("Njagi"))

    println("-------------------------------------------------")

    val greetingFunc : ( String , Int ) -> String = {

        playerName , numBuildings ->

        val currentYear = 2026
        println("Adding $numBuildings houses")
        "Welcome to EttaVillage , $playerName! (copyright $currentYear) "
    }

    println(greetingFunc("Gitari",4))

    println("------------------------HigherOrderFunction----------------------------")

    runSimulation()

}

fun runSimulation () {

    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Njagi"))

}

fun configureGreetingFunction() : (String) -> String {

    val structureType = "hospitals"

    var numBuildings = 5

    return { playerName : String ->

        val currentYear = 2026
        numBuildings +=1
        println("Adding $numBuildings $structureType")
        "Welcome to EttaVillage , $playerName! (copyright $currentYear)"
    }
}