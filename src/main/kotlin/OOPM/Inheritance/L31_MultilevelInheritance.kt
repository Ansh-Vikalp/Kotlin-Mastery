package OOPM.Inheritance

//base class with primary constructor
open class A(var a: String, var b: Int){

    constructor(A_y: Int, A_x: String ) : this(A_x, A_y){
        println("Secondary constructor from class A")
    }

    fun displayA(){
        println("a= $a")
        println("b= $b")
    }
}
// No primary constructor of class A called
open class B :A {
    var c: Double
    //the child class must call the Parent's primary constructor either directly or through one of the parent's secondary constructors that ultimately calls the primary one.
    constructor(A_y: Int, A_x: String, B_z: Double ): super(A_y, A_x) {
        println("Secondary constructor from class B")
        this.c = B_z
    }

    fun dispalyB(){
        println("Class A a is: $a")
        println("Class A b is: $b")
        println("Class B c is: $c")

    }
}

class C : B {
    var e = false

    constructor(A_y: Int, A_x: String, B_z: Double): super(A_y, A_x, B_z){
        println("Secondary constructor from class C")
    }

    fun dispalyC(){
        println("Class A a is: $a")
        println("Class A b is: $b")
        println("Class B c is: $c")
        println("Class C e is: $e")
    }
}

fun main(){

    val ob1= C(7, "C-Class", 22.7)
    ob1.dispalyC()

    println()

    val ob2= B(89, "B-Class", 67.9)
    ob2.dispalyB()
}