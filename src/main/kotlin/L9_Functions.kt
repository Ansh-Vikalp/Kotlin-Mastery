/*
Functions are used to perform some special tasks.
These are the set of statements, written to do some special task.
A function has name, return type, parameters and modifiers
We create these functions, to avoid repeating in our code.
For example- if we are calculating average of two numbers
then storing its result in a variable every time .then the line of code in our pgm increases, and it will be difficult to
remember which variable used where in pgm. To avoid this we can create a new function average that, calculate average of
two no and returns result. This f/n then can be called multiple times when we are calculating average of two numbers.

A function can be called from body of another function
main() function serve as entry point for execution of a program file.

 Syntax:- fun [function_name] ([parameters]): return_type {
            //Body or Logic to perform

            return value
         }

 */
//------------------------------- Function Definition --------------------------------
//Take Nothing Return Nothing
fun greetMorning(){
    println("Hello, good morning!")
}

//Take something Return nothing
fun greetAfternoon(person: String){ // Note person is a variable of type String, यहाॅं var या val कि जरृरत नहिं हैं लेकिन इसका data type define करना must है।
    //person var ya val hoga ye depend karega ki call karte wakt argument mutable hai ya immutable.
    println("Hello, $person good afternoon!")
}

//Take nothing Return something
fun greetEvening(): String {

    return "Hello, good evening!"
}

//Take something Return something
fun greetNight(person: String): String {

    return "Hello, $person good night!"
}

//Multiple paramerters are separated by ,
fun pintu(money: Int, item: String): Int {
    val remaining_money= money - 15
    println("Pintu bought $item for cost 15")

    return remaining_money
}


//Default parameters to function
 /* Function parameters can have default values, which are used when you skip the corresponding argument. This reduces the number of overloads:
Overriding methods always use the base method's default parameter values. */
fun multiply(a: Int, b: Int = 4): Int {// here default value of a is 5 and b is 4

    return a * b
}
/* Note that in case you have overloaded function as above which contains two parameters-
a - not default
b - default
and another overload fn with single parameter then calling multiply(7) will call f/n with single parameter
because it exactly matches the number of arguments you are passing (1 argument)
Uncomment below f/n to see changes */
//fun multiply(a: Int): Int{
//
//    return a
//}


fun main() {

//------------------------------- Function Calling --------------------------------
    //function can be called its name and arguments
    greetMorning()
    println()
    greetAfternoon("Ansh Vikalp")
    println()
    val msg= greetEvening()
    println(msg+"\n")
    val msg2= greetNight("Ansh Vikalp")
    println(msg2+"\n")

    val money_left= pintu(30, "Samaosa")
    println("left money is $money_left")

    println()
    println("Multiplication of 7 and default= ${multiply(7)}")
    println()

    


}