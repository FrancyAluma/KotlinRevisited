package Chapter4ClassesAndObjects

fun main () {

    val mesChiens = arrayOf("Chiwawa","Mixed","BergerAllemand")
    val choix = mesChiens [ (Math.random() * mesChiens.size).toInt() ]

    var moChien = Dog("chii",14,choix)
    moChien.name = "chee"
    moChien.bark()
    println( "${moChien.name} , ${moChien.breed} fait ${moChien.bark()} et c'est ${moChien.vet()}")

    println("----------------------------------")

    val songOne = Song("mayday", "Fally Ipupa")
    val songTwo = Song("Dulcinee","Koffi Olomide")

    songOne.play(240)
    songOne.stop()
    songTwo.play(470)

    println("----------------------------------")





}

class Dog ( var name : String , var weight : Int, val breed : String  ) {

    fun bark () : String  {
        val son =  if (weight < 20 ) "Yip" else "Woof!"
        return son
    }

    fun vet () = if (breed == "Chiwawa") "Notre Chien" else "Pas Notre Chien "
}

class Song ( val title : String , val artist : String ) {

    fun play ( sec : Int ){

        println("Playing the song $title by artist $artist , that has $sec secs")
    }
    fun stop() {

        println("Stopped title $title")
    }

}

class  DrumKit () {


}