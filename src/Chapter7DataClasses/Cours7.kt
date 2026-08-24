package Chapter7DataClasses

/*
A data class is one that lets you create objects whose main purpose is to store data.

Il y a 4 functions ici qu'on va utiliser le plus : .equals() , .copy() , .hashCode() and .toString()
* */

data class Recipe (  val title : String ,
                     val mainIngredient : String ,
                     val isVegetarian : Boolean = false,
                     val difficulty : String = "Easy"
) {

    /*
    Every data class must have a primary constructor, which must define at least one
    parameter.
    Each parameter must be prefixed with val or var
    * */

}



class Mushroom ( val size : Int , val isMagic : Boolean) {

    constructor(isMagic_Param : Boolean) : this (0,isMagic_Param)

    // code that runs when the secondary constructor ius called
}

fun findRecipes (title : String = "",
                 ingredient :String ="",
                 isVegetarian: Boolean= false,
                 difficulty: String ="") : Array <Recipe> {

    // Code to find recipes

    val soupe = arrayOf(Recipe(title,ingredient,isVegetarian,difficulty))
  //  return soupe   ou ca peut se faire de la maniere suivante :

    return arrayOf(Recipe(title,ingredient,isVegetarian,difficulty))


}

fun addNumbers ( a : Int , b : Int ) : Int {

    return a+b
}

fun addNumbers ( a : Double , b : Double ) : Double {

    return a+b
}



fun main () {


    val r1 = Recipe("Thai Curry","Chicken")
    val r2 = Recipe(title= "Thai Curry", mainIngredient = "Chicken")
    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hash code : ${r1.hashCode()}")
    println("r2 hash code : ${r2.hashCode()}")
    println("r3 hash code : ${r3.hashCode()}")
    println("r1 toString : ${r1.toString()}")
    println("r1 == r2? ${r1 == r2} ")
    println("r1 === r2? ${r1 === r2} ")
    println("r1 == r3? ${r1 == r3} ")

    val (titre , princIngredient, vegetarien,difficulte) = r1
    println("title is $titre and vegertarian is $vegetarien")

    println("------------------------------------------")

    val m1 = Mushroom (6,false  )
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic} ")

    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and is isMagic is ${m2.isMagic}")

    println("------------------------------------------")

    println(addNumbers(2,5))
    println(addNumbers(1.6,7.3))


}
