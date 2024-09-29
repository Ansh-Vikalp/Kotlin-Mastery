/* NAMED Argument
In Kotlin, named arguments allow you to specify the names of parameters when calling a function, rather than relying solely on their order.
This feature enhances code readability and flexibility, especially in functions with multiple parameters or optional parameters.
You can name one or more of a function's arguments when calling it.
This can be helpful when a function has many arguments with same data_types and it's difficult to associate a value with an argument, if it is marked as default especially if it's a boolean or null value.
When you use name parameter order doesn't matter
 */

//Consider the reformat() function, which has 4 arguments with default values.
fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    toUpperCase: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) {
    var result: String
    result = str.replace(' ',wordSeparator)
    if(normalizeCase){
        if(toUpperCase){
            result = str.toUpperCase()
        }
    }

    println(result+"\n")
}

fun main(){

    reformat("Hello world") // You can skip all of default arguments

    //In case you want to that to skip all default argument except upperCase(give it value false) then you can not do directly
    // by:- reformat("Hello world", false) in this case false is assigned to normalizedCase not toUpperCase and rest all or parameter will take default value
    // Here we need to use named parameters
    reformat("Beautiful Word",  toUpperCase = false, wordSeparator = '%')
    //order does not matter in named parameters
    reformat(wordSeparator = '_', str = "Beautiful Word Nice",  toUpperCase = false)

}


/* Unit-returning function
If a function does not return a value, its return type is Unit.
Unit is a type with only one value - Unit. This value does not need to be returned explicitly:
*/

fun printHello(name: String?): Unit { // Unit means Void
    if (name != null){

        println("Hello $name")
    }
    else{

        println("Hi there!")
    }

    // `return Unit` or `return` is optional
}
//The Unit return type declaration is also optional. The above code is equivalent to:

//fun printHello(name: String?) { ... }

