package Chapitre2BasicTypesEtVariables

fun main () {

    /*
    You can think of an array as being like a tray of cups , wher each item
    in the array is a variable
     */
    val myArray = arrayOf(1,"fhjdj",8)
    println(myArray[1])
    println(myArray.size)

    println (Math.random())
    println("----------------------------------")

    val wordArray1 = arrayOf("24/7" , "multi-tier", "B-to-B","dynamic","pervasive")
    val wordArray2 = arrayOf("empowered" , "leveraged", "aligned","targeted")
    val wordArray3 = arrayOf("Process", "paradigm","solution","portal","vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1 ).toInt()
    val rand2 = (Math.random() * arraySize2 ).toInt()
    val rand3 = (Math.random() * arraySize3 ).toInt()

    val Slogan = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]} "

    println("Le Slogan de notre societe est : $Slogan")

    println("----------------------------------")

    var x = 42
    var value = "Value of x is $x"

    var monArray = arrayOf(1,2,3)
    var arraySize = "monArray has ${monArray.size} items"

    var result = "monArray is ${ if (monArray.size > 10) "large" else "small" }"

    println("----------------------------------")

    var bobArray = arrayOf(1,2,3,4)
    bobArray = arrayOf(7,8)
    for (a in bobArray) {
        println(a)
    }


    val bibArray = arrayOf(4,7,9)
    bibArray[1] = 10
}