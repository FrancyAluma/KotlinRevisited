package Chapitre2BasicTypesEtVariables

fun main () {


    val hobbits = arrayOf("Frodo","Sam","Merry","Pippin")
    var x = 0

    while (x < 4) {

        println("${hobbits[x]} is a good hobbit name")

        x = x + 1
    }

    println("-----------------------------------------")

    val firemen = arrayOf("Pugh","Pugh","Barney McGrew","Cuthbert","Dibble","Grub")
    var firemanNo = 0

    while (
        firemanNo < 6
    ) {

        println("Fireman name $firemanNo is ${firemen[firemanNo]} ")

        firemanNo = firemanNo + 1
    }


    println("-----------------------------------------")

    val index = arrayOf(1,3,4,2)
    val fruit = arrayOf("Apple","Banana","Cherry","Blueberry","Pomegranate")
    var a = 0
    var b : Int
    while (a < 4) {

        b = index [a]
        println("Fruit = ${fruit[b]}")

        a = a + 1

    }

}