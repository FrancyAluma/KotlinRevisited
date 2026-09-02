package Chapter11LambdasAndHigheroderFunctions

/*

A function that uses a lambda as a parameter or return value is known as a higher-order function
 */

fun convert (
    x : Double ,
    converter : (Double) -> Double
) : Double {

    val result = converter(x)

    println ("$x is converted to $result ")

    return result

}

fun convertFive ( converter : (Int) -> Double ) : Double {

    val result = converter(5)

    println("5 is converted to $result")
    return result

}

fun getConversionLambda ( str : String ) : (Double) -> Double  {

    if (  str == "CentigradeToFahrenheit" ) {

        return { it* 1.8 + 32 }
    } else if (  str == "KgsToPounds" ) {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons ") {
        return { it / 2000.0  }
    } else {

        return {it}
    }
}

fun combine ( lambda1 : (Double) -> Double ,
              lambda2 : (Double) -> Double ) : (Double)-> Double {

    return { x : Double -> lambda2(lambda1(x))  }

}


fun main () {

    convert(20.0 ) { it * 1.8 + 32 }
    convertFive { it * 1.8 + 32 }
    println("-----------------------------------------")

    val pounds = getConversionLambda("KgsToPounds") (2.5)
    convert(20.0 , getConversionLambda("CentigradeToFahrenheit"))
    println("-----------------------------------------")

    val kgsToPounds = getConversionLambda("KgsToPounds")
    val poundsToUSTons = {  x : Double -> x / 2000.0 }

    val kgsToUSTons = combine(kgsToPounds,poundsToUSTons)

    val usTons = kgsToUSTons(1000.0)
    println(usTons) // 1.1023115

    println("-------------------------------------------")

    val value = 17.4
    println(("$value kgs is ${convert(value , kgsToUSTons)}  US tons"))
}