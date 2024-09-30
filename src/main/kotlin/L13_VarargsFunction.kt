/*
VariableArgument or varargs are the functional parameters that can take any no of arguments(even 0) passed to
the function during a function call.

Varargs are nothing but similar to an array of specific data types. We can verify this by obtaining the kotlin class
reference or corresponding java class reference:-
vararg dam : String
println(dam::class.simpleName) // kotlin class reference
println(dam::class.java.simpleName) // java class reference

vararg removed the problem of creating multiple overload functions having same body but requiring different type or
no of parameters.Here we can create a single function that will accept any no of input parameters

 */

fun indianDams(vararg dams: String){
//println("indianDams: $dams") //prints the memory location of array object, if it was ArrayList then elements got printed
    for( i in dams){
        print("$i | ")
    }

    println()
    println("What is vararg dam type? ${dams::class.simpleName}" ) // kotlin
    println("What is vararg dam type? ${dams::class.java.simpleName}" ) // java
    println()

}

fun main() {

    //calling the f/n with different arguments
    indianDams() // 0 arg passed
    indianDams("Hirakud Dam") // 1 arg passed
    indianDams("Hirakud Dam", "Nagarjuna Sagar Dam") // 2 arg passed
    indianDams("Hirakud Dam", "Nagarjuna Sagar Dam", "Bhakra Nangal Dam","Sardar Sarovar Dam" ) // 4 arg passed

}