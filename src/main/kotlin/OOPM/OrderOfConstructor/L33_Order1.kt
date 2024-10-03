package OOPM.OrderOfConstructor

/*
    Now we will see the order in which constructor got called starting from parent class to its child class

    Here we will try to  mix all possible when parent class may or may not have primariy constructor or secondary constructor ,
    even more what will happen when no constructor explicit defined in parent

    Whenever an object of a child class is created the base class constructor always called first followed by the child class constructor

    If the base class does not contain any constructor the compiler will automatically create default one with no parameters

    CASE-1
    If the parent class does not contain any constructor:

    In Kotlin, if the parent class has no primary or secondary constructors defined,
    it means the class is using the default constructor (implicitly provided).
    In this case, you do not need to call any constructor explicitly in the child class
 */

open class Parent{
    // No explicit constructors
    var p1="parent"
}

class Child : Parent(){// we called a default constructor of parent
    var c1= "child"

    fun getData(){
        println("From parent- $p1")
        println("From Child- $c1")
    }
}

fun main() {
    val child= Child()
    child.getData()
}