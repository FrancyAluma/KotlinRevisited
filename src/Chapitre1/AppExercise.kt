package Chapitre1

fun main () {

    println("--------------Exercice-------Voir livre page 22---------")

    /*
    L'exercise doit imprime "YabbaDabbaDo"
    */

    var x = 1

    while (x < 3) {

        print(if (x==1) "Yab" else "Dab" )

        print("ba")

        x = x+ 1

    }

    if (x==3)
        print ("Do")


    println("--------------------------")

    var y = 1

    while (
        y < 10
    ){
        if (y == 3 ) {
            println("Big $y")
        }

        y = y + 1

    }

    println("--------------------------")

    var a = 0

    var b = 0

     while (
         a < 5
     ) {

         if (b<5) {

             a = a + 1

            if ( b < 3 )  a = a -1
         }

         b = b+ 3
          print("$a$b")

         a = a + 1
     }

}