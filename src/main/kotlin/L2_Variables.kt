fun main(){
/* Notes
    variables are the container to store Values
    Kotlin variables refer to the memory location
    values inside variable can be changed or reused
*/
    var name= "Ansh Vikalp" // var value can be changed (mutable)
    val id= 5134 // val value can't be changed (immutable)
    // id =6789 ERROR can't be changed

//  STRING CONCATENATION
    println("Employee: "+ name + ":" + id)
    name="Vansh utsav"

//    String template interpolation- works Just like linux. Ex- "This is ${varible}"
    println("Employee: $name:$id")




//  STRING TEMPLATE
   /* $variable:
    Use this when you want to simply insert the value of a variable into a string.
    It's the most concise and common way to reference variables in string templates.
    Kotlin*/

    println("Hello, $name!")

    /*${variable}:
    Use this when you need to perform more complex operations within the string template, such as:
    Accessing properties of an object: println("Name: ${person.name}")
    Calling functions: println("Length: ${name.length}")
    Using expressions: println("Result: ${x + y}")
    It's also necessary when you want to embed a variable name within a larger string: println("The value of \$name is $name")
    Kotlin*/

    val number = 42
    val x=9
    val y=10
    println("Length: ${name.length}")
    println("Sum of $x + $y= ${x + y}")
    println("The square of $number is ${number * number}") // Output: The square of 4
    println("The value of \$name is $name") //To escape a variable name






}

