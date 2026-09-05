package Chapter3Functions

fun main () {


    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice,gameChoice)



}

fun getGameChoice (optionsParam : Array<String>) = optionsParam[
    (Math.random() * optionsParam.size ).toInt()
]

fun getUserChoice ( optionsParam : Array<String> ) : String  {

    var isValidChoice = false
    var userChoice = ""

    // Loop until the user enters a valid choice

    while (
        !isValidChoice

        // Keep looping until isValidChoice is true
    ) {

        // Ask the user for their choice
        print("Please enter one of the following:")
        for (item in optionsParam) print (" $item")
        println(":")

        // Read the user input
        val userInput = readLine()

        //Validate the user input

        if (userInput != null && userInput in optionsParam) {

            isValidChoice = true

            userChoice = userInput

        }

        if (!isValidChoice) println("You must enter a valid choice")

    }
    return userChoice



}

fun printResult ( userChoice: String , gameChoice : String ) {

    val result : String

    //figure out the result

    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice== "Rock"  && gameChoice == "Scissors") ||
        (userChoice == "Scissors" && gameChoice == "Paper" )  ||
        ( userChoice == "Paper" && gameChoice == "Rock" ) ) result = "Bro, You have won"

    else result = " You lost Bro "

    // Print the result

    println("You chose $userChoice and I chose $gameChoice , result : $result")


}