package Chapter7DataClasses

data class Student (val firstName : String ,
    val lastName : String ,
    val house : String ,
    val year : Int = 1)

fun main () {

    val s1 = Student( "Ron","Weasley","Gryffondor" )
    val s2 = Student (lastName = "Malfoy",
        firstName = "Draco",
        year = 1 ,
        house = "Slytherin")

    val s3 = s1.copy(firstName = "Fred" , year = 3)
    val s4 = s3.copy(firstName = "George")


    val student = arrayOf(s1,s2,s3,s4)

    for (  (nom ,postnom ,maison, annee ) in student ) {

        println("$nom $postnom is in $maison year $annee")
    }

    println ("--------")

    for (s in student) {
        println( " ${s.firstName} ${s.lastName} is in ${s.house} year ${s.year} " )
    }
}