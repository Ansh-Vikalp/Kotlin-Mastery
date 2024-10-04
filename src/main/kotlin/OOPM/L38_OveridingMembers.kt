package OOPM

/*
    If the child class implements the same member(meathod/property) present in parent class again, it is known as overriding.
    It differs from meathod overloading by the fact that meathod overloading takes place in the same class with diffrent method signatures.
    But meathod overriding occurs in case of inheritance where the meathod have exactely same signatures but different body.

    signature = meathod_name + number_of_parameter, their type and order + return_type_of_method

    overriding refers to the ability to provide a specific implementation of a method that is already defined in a superclass.
    When you override a method in a subclass,
    the subclass version of the method replaces the superclass version when called on an instance of the subclass.

    "Redefining a method of superclass in its subclass"

    Unlike java, Kotlin supports both meathod and property overriding. But by default all methods and properties of a class, even a class itself
    is declared final in kotlin. which means
    final class -> can't be inherited
    final method -> can't be overridden but is inherited
    final property -> can't be overridden but is inherited

    No, No, No... I know you might be thinking final propery in java means it is constant and its value can't be changed. But in Kotlin we
    have val keyword for that . So don't get confused

    To perform overriding firstly we need to mark our parent class open so that it can be inherited.
    Once child class extend parent class all the members except for private got copied into the body of child.
    But as said we can't override these meathods for now since by default they are final
    To allow overriding, the method or property in the superclass must be marked with the open keyword.
    Now we can override thse members using override keyword to indicate that you are overriding an existing method.
 */

open class Animal(var sound: String){
    open var animal_name: String= "Animal" // open property that have generic value

     fun getSound(){// final method only inherited but not overrides
        println("$animal_name makes sound $sound")
    }

    open fun getLegs(){ //assuming that general animal has 4 legs if not this f/n can be overridden to any child class
        println("$animal_name has 4 legs")
    }



}

class Dog(type:String, d_sound: String) : Animal(d_sound){
    override var animal_name: String= type // overriding the property to more specialized animal_name

    //fun getSound(){} is inherited exactly
    //open fun getLegs(){} can be overridden, but we are not doing anything for this sub-class

}

class Bird(type:String, b_sound: String) : Animal(b_sound){

    override var animal_name: String = type // overriding the property to more specialized animal_name so that general "Animal" not get printed by f/n getSound()

    //fun getSound(){} is inherited exactly
    //since bird has 2 leg we can override getLeg()
    override fun getLegs(){
        println("$animal_name has 2 legs")
    }
}



fun main() {
    //Parent
    val animal = Animal("generic")
    animal.getSound()
    animal.getLegs()

    println()

    //Child
    val goldenRetriever = Dog("goldenRetriever", "Bark")
    goldenRetriever.getSound()
    goldenRetriever.getLegs()

    println()

    //Child
    val flamingo = Bird("flamingo", "Grunting ")
    flamingo.getSound()
    flamingo.getLegs()
}