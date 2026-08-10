package Chapitre2BasicTypesEtVariables

fun main () {

    /*val name = "Madrigal"
    var healthpoints = 89
    val isBlessed = true
    val isImmortal = false

    val auraVisible = isBlessed && healthpoints > 50 || isImmortal
    val auraColor =  if (auraVisible) "Green" else "None"
   println(auraColor)

    if ( healthpoints == 100 ) {

        println(name + "is in excellent condition")
    }
    else if (healthpoints in 90..99

        // it's called Range
        ) {
        println("$name has a few scratches ")

    }

    else if ( healthpoints >= 75 ) {

        if (
           isBlessed
        ) {
          println(name + " has some minor wounds but is healing quickly!")

        } else {
            println(name + "has some minor wounds")
        }
    }

    else if (healthpoints >= 15) {

        println(name + "looks pretty hurt")
    }
    else {
        println(name + " is in awful condition")
    } */

    println("-------------------------------------------------")
    // When Expressions

    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "keepers of the Mines"
        "gnome" -> "keepers of the Mines "
        "orc" -> "Free people of the rolling Hills"
        "human" -> "Free people of the rolling Hills"
        else -> "Ourra"
    }
    println(faction)

    println("-------------------------------------------------")

    val healthPoints = 89

    val name = "Cesco"

    val isBlessed = false

    val heathStatus = when (healthPoints ) {

        100 -> "is in excellent condition"
        in 90..99 -> "has a few scratches"
        in 75..89 -> if (!isBlessed) "has some minors injuries but is healing Quickly"
        else "has some minors wounds"
        in 15..74 -> "Looks pretty hurt"
        else -> "is in awful condition"
    }
    println(name+" "+heathStatus)

}