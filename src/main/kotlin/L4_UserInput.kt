fun main(){

/*
    readln() and readLine() is used to take user's input from standard input stream
    these function takes input in form of string
    we need to convert them into other data types if needed
    These func read whole line until '\n' or EOF reached
*/

    print("Enter your age: ")
    val age= readln() //throws a RuntimeException
    val age2: Int= age.toInt() // Explicit conversion String => Int
    println("Age is: $age")
    println("Age to move: ${age2 - age2 +2}")

//    readLine() returns null if the input stream is redirected to a file and the end of file has been reached.
//    readlnOrNull()


}