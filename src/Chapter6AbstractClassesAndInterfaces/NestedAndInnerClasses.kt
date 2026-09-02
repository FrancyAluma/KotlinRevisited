package Chapter6AbstractClassesAndInterfaces

/*

A nested class is a class that's defined inside another class. This can de useful if you want to
provide the outer class with extra functionality that's outside its main purpose, or bring code
closer to where it's being used.

A nested class doesn't have access to an instance of the outer class , so it can't access its
members.

* */

class Outer {

    val x = "This is in the Outer class"

    class Nested {

        val y = "This is in the Nested Class"

        fun myFun() = "This is the Nested Function"

        /*
        Par contre ce code-ci :
        fun getX() = "Value of x is : $x" , ne va pas compile , because Nested can't see x as it's
        defined in the Outer class.
        * */
    }

    val myInner = Inner()

    inner class Inner {

        /*
        So on the opposite side , A inner class has access to an instance of the outer class , so it can access its
members.
        * */
        val yy = " This is the Inner class"
        fun myFunn() = "This is the Inner Function"
        fun getX () = "The value of x is: $x "
    }
}


fun main () {


    val nested = Outer.Nested()
    //val nested = Outer().Nested() : This line won't compile
    println(nested.y)
    println(nested.myFun())

    println("-----------------------------")

    val inner = Outer().Inner()
    println(inner.yy)
    println(inner.myFunn())
    println(inner.getX())

    println("-----------------------------------")

    val innerr = Outer().myInner

    println(innerr.yy)
}