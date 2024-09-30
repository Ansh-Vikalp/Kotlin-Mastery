/*
Kotlin functions are the first class which means they can be stored in variables, passed as an argument, or returned
from another function

HIGHER ORDER FUNCTION
The function that takes another function(mostly lambda) as parameter or return another function from their body is called
Higher order functions.
This allows you to pass around behavior (i.e., functions) rather than just values, enabling functional programming concepts in Kotlin.

Syntax-
Higher order functions that take lamda parameters but return Unit
fun highOrder(a: Int, b: String, lam5: (String, String) -> String ){

    //body
    some println() and calculations

    //calling same lamda function with two String arguments
    lam5("Ansh", "Vikalp")

}
-------------------------------------------------------------------------
Higher order functions that take lamda parameters also return lambda
fun highOrder(a: Int, b: String, lam5: (String, String) -> String ): (String, String) -> String
{

    //body
    some println() and calculations

    //returning same lamda function with two String arguments
    return lam5("Ansh", "Vikalp")   (String, String) -> String

}
 */

// Example 1: Higher-Order Function Taking a lambda Function as a Parameter of type () -> Unit TNRN

fun sumTwoNumbers(
    num1: Int,
    num2: Int,
    callBack: () -> Unit  // yaha callBack ek variable ka name hai jiska type function type hai   () -> Unit
    //Function type matlab wo lamda function kis type ka argument le raha or kya return kar raha hai
    // callBack sirf ek Holder hai jo f/n ko store kar raha bas, condn ye hai wo f/n takes nothing return nothing
){

    println("Sum is ${num1 + num2}")
    //sum karne ke bad ye ek dusra function call karega jo iske argument me aa raha ho
    callBack()

}

// Example 2: Higher-Order Function Taking a lambda Function as a Parameter of type (String) -> Unit TSRN

fun mulTwoNumbers(
    num1: Int,
    num2: Int,
    callBack: (String) -> Unit  // yaha callBack ek variable ka name hai jiska type function type hai   (String) -> Unit
// Aab aapko yaha jo f/n pass karna hai wo ek argument bhi le raha hoga
){

    println("Mul is ${num1 * num2}")
    //mul karne ke bad ye ek dusra function call karega jo iske argument me aa raha ho
    callBack("Done")

}


fun mulTwoNumbers2(
    num1: Int,
    num2: Int,
    callBack: (carpenter: String) -> Unit  // yaha callBack ek variable ka name hai jiska type function type hai   (String) -> Unit
// Aab aapko yaha jo f/n pass karna hai wo ek argument bhi le raha hoga
){

    println("Mul2 is ${num1 * num2}")
    //mul karne ke bad ye ek dusra function call karega jo iske argument me aa raha ho
    callBack("carpenter")

}


// Example 3: Higher-Order Function Taking a lambda Function as a Parameter of type () -> Int TNRS
fun divTwoNumber(
    x: Int,
    y: Int,
    callBack: () -> Int
){
    println("div is ${x/y}")

    var myTest= callBack()
    println("callBack is ${myTest}")
}

//Example 4: Higher-Order Function Taking a lambda Function as a Parameter of type (Int, String) -> Int TSRS
fun cubeOfNumber(x: Int,
         callBack: (Int, String) -> Int){

    println("Cube of $x")
    println(callBack(x, "pamper"))


}


//Example 5: Higher-Order Function Taking a lambda Function as a Parameter and returning same lambda Function of type (Double) -> Unit
fun greeting(o: Int, callBack: (Double) -> Unit): (Double) -> Unit{
    //returning a lambda function that takes Double and returns Unit
    //Note callBack(66.7) is equivalent to calling a lambda function that returns Unit, but we have to return a lambda function not O/P of lambda function
    //So don't use callBack(66.7) here
    return callBack
}



// Why to use Higher-Order Function
fun performUnknownOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    println("Performing random operation on $a and $b depending on body of lambda function provided as parameter!")
    //calling lambda function provided as parameter that performs
    // any operation depending on body of lambda function
    return operation(a, b)
}


//######################################################################################################################

fun main() {
    //Example-1
    //Way-1 Passing variable name that stores lambda function to High Order f/n
    var lam1 : () -> Unit = {
        println("I am lambda call Back function")
    }
    sumTwoNumbers(12, 13, lam1)
    println()

    //Way-2  When lambda function is last parameter of High Order f/n it can define beneath the call itself
    sumTwoNumbers(11, 22){
        println("I am lambda call Back function")
    }
    println()

    //Example-2
    mulTwoNumbers(2, 3){
        msg: String -> println(msg)
    }

    mulTwoNumbers2(6,5) {
        //agar high order function se  hi lambda ka parameter ka value acess karna hai to it use karegey
        println(it)

    }
    println()

    //Example 3
    divTwoNumber(6, 3){
        677 // this lambda return 677
    }
    println()

    //Example 4
    cubeOfNumber(5){
        x: Int, z: String -> x*x*x

    }
    println()

    //Example 5
    val temp: (Double) -> Unit = greeting(77, ){k: Double -> println("Hurray! You have understood Higher Order functions.") }
    temp(66.7)
    println()

    //Demonstration
    val unkonwnResult1= performUnknownOperation(69, 89 ){// In this case Higher order lamda perform '+'
        x: Int, y: Int ->
        println("addition")
        x+y
    }
    println(unkonwnResult1)
    println()

    val unkonwnResult2= performUnknownOperation(69, 89 ){// In this case Higher order lamda perform '*'
            x: Int, y: Int ->
        println("multiplication")
        x*y
    }
    println(unkonwnResult2)
    println()

}