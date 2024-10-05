package OOPM

/*
    Dynamic method dispatch in Kotlin refers to the mechanism by which a call to an overridden method is resolved at runtime, rather than at compile time.
    It is the foundation of runtime polymorphism, which allows methods to behave differently
    based on the actual object that is instantiated, even if the reference variable is of a superclass type.
    This behavior is also known as late binding or dynamic binding.

    A superclass reference can hold its child class object but reverse is not true.
    And when in such case any override method called the decision to call which version of the method is resolved at runtime based on the object being created.
    Hence, it is called as dynamic method dispatch

    Also, you cannot directly call specialized methods or members that are only present in a subclass (or child class)
    using a reference of the superclass, even if the object being referred to is of the subclass.
    This is because a superclass reference only has knowledge of the members (methods and properties) that are defined in the superclass.
    It does not have access to any specialized methods or properties that are unique to the subclass.

    Let's say parent has the following method
    open val property= 89
    -> method1()
    -> open method2()
    Child has-
    override val property= 77
    -> method1() //inherited directly
    -> override method2()
    -> method3() //specialized method

    Then- val obj: SuperClass = Child()
    obj.method1() // allowed as it is present in parent class
    obj.method2() // overridden method called by dynamic method dispatch
    obj.method3() // not allowed as it is not present in parent class
    println("obj.property")// allowed as it is present in parent class

 */


open class Animal2 {
    open val sound: String = "general"

    open fun sound() {
        println("The animal makes a $sound")
    }
}

class Lion : Animal2() {
    override val sound: String = "roars"

    override fun sound() {
        println("The lion $sound")
    }

    //specialized method
    fun hunts(){
        println("The lion hunts")
    }
}

class Elephant : Animal2() {
    override val sound: String = "trumpets"

    override fun sound() {
        println("The elephant $sound")
    }

    //specialized method
    fun drinks(){
        println("The elephant drinks water")
    }
}

//outside function
fun makeAnimalSound(animal: Animal2) {
    animal.sound()  // This line will dynamically call the correct method based on the object type
}

fun main() {
    val lion: Animal2 = Lion()          // Reference variable is of type Animal, but object is of type Lion
    val elephant: Animal2 = Elephant()  // Reference variable is of type Animal, but object is of type Elephant
    val anomenous: Animal2 = Animal2()

    makeAnimalSound(lion)      // lion object passed at runtime
    makeAnimalSound(elephant)  // elephant object passed at runtime
    makeAnimalSound(anomenous) // anomenous object passed at runtime

    println()

    // lion.hunts() ERROR can't call any special method because reference is of super class.
    // elephant.hunts() ERROR can't call any special method because reference is of super class.
    //super class reference has idea about its own method and properties defined in its own body
}


