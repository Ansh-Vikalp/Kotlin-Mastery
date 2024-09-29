/* lambda functions (also known as lambdas) are a way to define anonymous functions, meaning functions that do not have a name.
   They are useful for scenarios where you need to pass a function as a parameter, or to write concise and flexible code.
   We can store these functions(normal/lambda) into some variable , call these lambda using those variables, and then use it
   for different purposes like-
   🧨 passing lambda as an argument to a function
   🧨 returning lambda as a value from a function

   Syntax-
   val lambdaName: (InputType) -> ReturnType = { argument: InputType -> body }
   (InputType) -> ReturnType is optional as it automatically inferred by the Kotlin compiler

   Input parameters: Defined before the -> symbol.
    Function body: Defined after the -> symbol.
    Return type: Inferred by Kotlin, or can be explicitly stated.
    [ val lambdaName: (InputType) -> ReturnType ]

 */

fun main(){
    // Let's create a lambda function

    //fun type:- Take Nothing Return Nothing    () -> Unit
    var l1= { // storing a lambda function
        println("I am lambda l1 function")
    }

    //calling lambda function:- can be called by variable_name([arguments to pass if any])
    l1()
    println()

    //fun type:- Take Something Return Nothing    (String) -> Unit
    var l2= {
        name: String -> println("I am lambda l2 function $name")
        //param          body
    }
    //calling lambda function
    l2("Ansh") // we need to pass value as argument to lambda that takes string type
    println()


    //fun type:- Take Nothing Return Something      () -> String
    var l3: () -> String = {
        "I am lambda l3 function" // no need of return keyword , automatically the last statement will be returned
    }
    println(l3())
    println()

    //fun type:- Take SomeThing Return SomeThing    (Int, Int) -> Int
    var l4: (Int, Int) -> Int = {
        x: Int, y: Int ->
        x+y // this return x+y from body of type Int
    }
    //calling lambda function
    var result: Int= l4(4,3)
    println("sum= $result")
    println()

    /* If your lambda needs multiple statements, you can use curly braces {} and the return keyword is optional.
     The last expression in the lambda is automatically returned Example is below: */
    var l5: (Int, Int) -> Int = {
        a: Int, b: Int ->
        var ans= a*b
        println("Multiplying...")
        ans
    }
    //calling lambda function with multiple statements in body
    println(l5(4,5))
    println()

}