package Chapter6AbstractClassesAndInterfaces

/*
   A sealed class is like a souped-up version of an enum class. It lets you restrict your class
   hierarchy to a specific set of subtypes , each one of which can define its own properties.
    */

sealed class MessageType
class MessageSuccess ( var msg : String) : MessageType()
class MessageFailure(var msg : String , var e: Exception) : MessageType()

fun main () {


    val messageSuccess = MessageSuccess("Yay!")
    val messageSuccess2 = MessageSuccess("It worked!")
    val messageFailure = MessageFailure("Boo!", Exception("Gone wrong."))

    var myMessageType : MessageType = messageFailure

    val myMessage = when( myMessageType ) {

        is MessageSuccess -> myMessageType.msg
        is MessageFailure -> myMessageType.msg+ ""+ myMessageType.e.message
    }

    println(myMessage)
}