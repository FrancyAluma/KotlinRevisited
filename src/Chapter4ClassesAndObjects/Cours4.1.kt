package Chapter4ClassesAndObjects

class Mbwa (  var name: String ,
             weight_param: Int ,
             breed_param : String
){


    init {

        println("Dog $name has  been created")

        /*
        If you need to initialize a property to something more complex than a simple expression,
        or if there is extra code you want to run when each object is created, you can use one or
        more initializer blocks.
         */
    }

    var activities = arrayOf("Walks")
    var breed = breed_param.uppercase()
    /*
    Defining Properties in the main body of the class gives you a lot more flexibility
    than adding them to the constructor , as it means that you no longer have to initialize
    each one with a parameter value.
     */

    init {
        println("it is from this breed $breed")
    }

    /* // getters and setters
    if you want to tweak a property's return value  or validate a value before it gets
    assigned to a property,you can write your own getters and setters.
    Writing custom getters and setters lets you protect your property values,and they give you
    more control over what values are returned or assigned
    */

    var weight = weight_param

        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs : Double
        get() = weight / 2.2


    fun bark () {

        println( if (weight < 20) "Yip" else "Woof!" )
    }

}

fun main () {
    var bb = arrayOf(1,2,3)
    val b :Int
    b = bb[0]
    println("--------------------------")
    val myDog = Mbwa("Fido",70,"Mixed")
    myDog.bark()
    myDog.weight = 0 // va donner le previous value of weight
    myDog.weight = -1
    println("The weight in kgs in ${myDog.weightInKgs}")

    println("--------------------------")
    myDog.activities = arrayOf("Walks" , "Fetching Balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }

    println("--------------------------")
    val dogs = arrayOf(Mbwa("kelpie",20,"Westie"), Mbwa("Ripper",
        10,"Poodle") )

    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight} ")

}