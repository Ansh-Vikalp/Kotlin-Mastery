package AdvanceConcepts

/*
    Enum me hamne no of objects par restriction lagaya tha. Ki enum class Direction ke object
    only following ho sakte hai or koi new object create nahi kar sakte. Also each object has their fixed state/ property values that can't be changed.

    But sealed class ke help se hum object ke type par restriction lagate hai ki koi bhi new object banega wo bas esi following type me fall karega.
    Bhare aap us type ke kitne bhi object ban lo. Example agar mera parent class ek sealed class hai Ball then useke sublcass jo inherit kar rahe hai-
    RedBall, GreenBall, BlueBall uneme me se hi kisi ek ka object bana sakte or koi naya type ka object nahi bana sakte.
    Also RedBall type ka hum multiple object bana sakte each of which can have diffrent sate.
    So sealed class can be said as extension of enum.

   Sealed class is a class that restricts class Hierarchy.
   It states- object data types that have only fixed set of possible types (subclasses).
   This is particularly useful when you want to represent a limited number of possibilities and ensure that all the cases are handled.
   Sealed class is used when the object have one of the types from limited set, but cannot have any other type.
   Enum classes represent a fixed set of values with fixed state, whereas sealed classes can represent a fixed set of classes with varying state and behavior

    We can define our child class of sealed classes either inside its body or outside as well.

    All subclasses of a sealed class must be declared in the same file where sealed class is declared.
    A sealed class is abstract by itself, and you can't initiate an object from it.
    You can not create a non-private constructor their constructor are protected by default So a child class can call them but other class can not.

 */

sealed class Ball // has protected constructor for children

//Restricted Type-1 subclass
class RedBall(val tone: String): Ball(){

}

//Restricted Type-2 subclass
class BlueBall(val tone: String): Ball(){

}

//Restricted Type-3 subclass
class GreenBall(val tone: String): Ball(){

}

fun displayBall(value: Ball){

    /* We don't require else condition in when bcz at compilation it is known that value can take only one of declared subclass of sealed class
    * And, we have covered all possibilities */
    when(value){
        is RedBall -> println("This is red ball of shade ${value.tone} shade.")
        is GreenBall -> println("This is green ball of shade ${value.tone} shade.")
        is BlueBall -> println("This is blue ball of shade ${value.tone} shade.")
    }
}
fun main() {
    // val ob= Ball() ERROR Sealed class is abstract and thus can't be initiated

    /* Now we vcan create any no of object of child classes with different state,
        but object can only be one among ReadBall, GreenBall and BlueBall */

    val ball1 = RedBall("Cherry")
    val ball2 = RedBall("Wine")

    val ball3 = GreenBall("Lime")
    val ball4 = BlueBall("Ultramarine")

    /* Let's create a a displayBall() function that will display the ball of any subtype
        depending on object being passed */
    println()
    displayBall(ball1)
    println()
    displayBall(ball4)
    println()
    displayBall(ball2)


}