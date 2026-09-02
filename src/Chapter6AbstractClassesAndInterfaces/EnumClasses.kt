package Chapter6AbstractClassesAndInterfaces

/*
 enum classes let you create a set of value that represent the only valid values for
 a variable
* */

enum class BandMember { JERRY , BOBBY , PHIL }

enum class BandMembres (

    val instrument : String
) {
                            Jerry ("lead guitar") {
                                override fun sings(): String = "plaintively"
                            },
    Bobby("rhythm guitar") {
        override fun sings(): String = "hoarsely"
    },
    Phil ("bass") ;

    open fun sings () = "occasionally"

}

fun main () {


    val selectBandMember : BandMember //  val selectBandMember : BandMember = BandMember.JERRY
    selectBandMember = BandMember.JERRY
    println(selectBandMember)

    println("-------------------------------")

    val selectionBandMembre : BandMembres
    selectionBandMembre = BandMembres.Bobby
    println(selectionBandMembre.instrument)
    println(selectionBandMembre.sings())



}