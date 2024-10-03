package OOPM.Inheritance

/* Inheritance- Inheritance is used to borrow the properties and method from an existing class.
In other words, when one class acquires all the properties and action of another class.
The class that provides the properties and behaviours is Parent class/Base class/Super class.
The class that takes the properties and behaviours is Child Class/Derived Class/Sub Class.

When an object of child class is created then all the properties and behaviour are inherited by the child object
in addition it can have its exclusive or specialized members that is present in child class only.
Parent class object can access only parent members
Child class object can access parent as well as child class members

Like java, kotlin support following types of Inheritance-
a) Simple inheritance
b) MultiLevel Inheritance
c) Hierarchical Inheritance

Multiple inheritance is not supported due to ambiguity, but can be done through interface. Similarly, Hybrid inheritance
may not work if it includes multiple inheritance in any form.

Inheritance is also called as 'is-a-relationship'. Ex - Car is a vehicle, Bike is a vehicle

Note:- In contrast to java Kotlin me by default inheritance band karke rakha jata hai. matlab aap kisi bhi class ko ese hi
directely inherit nahi kar sakte.
jabki Java me esa nahi hota . java me by default inheritance on rahta. Hame usse expliciltely final keyword laga ke band karna parta.

To agar aapko kotlin me inheritance karna hai to open keyword ka parent class me use karna hoga

In Kotlin, classes and methods are final by default, which means they cannot be inherited or overridden.
To make a class inheritable, we use the open keyword.
Similarly, if you want a method or property in a class to be overridden by a subclass, you must mark it with open.

Syntax-

open class Parent{ // compiler will generate a default constructor
    var prop1: String = "default"

    fun display(){
        println("${prop1})
    }
}

class Child: Parent(){
    var prop2: Int = 9

    fun show(){
        println("${prop2}")
    }
}

 */


// Simple Inheritance - One Parent class one Child class

//to make Parent class inheritable we need to use open keyword
//The parent class may or may not contain primary constructor
//The parent class may or may not contain secondary constructor
open class Vehicle {
    var engine: String = "vehicle_engine"
    var tyres: String = "vehicle_tyres"

    fun getVehicle(){
        println("Engine: $engine")
        println("Tyres: $tyres")
    }

}

// Child class ([Child Primary constructor if wanted]): parent_class([primary constructor of parent if present])
/*
During inheritance, it is necessary that the parent class constructor is called first
If the parent class does not define any explicit primary or secondary constructor then compiler automatically creates a
new default 0 arg constructor for it. And when any Child class inherit such parent class it is must that it invoke default
constructor of the parent class by- : Parent_name () <- denotes a call to default constructor

The child class may or may not contain primary constructor in header

 */
class Car : Vehicle(){ // parent class default constructor Vehicle() called

    var music_system: String = "car_dolby_atmos"
    var lcd_display: String = "car_sonyX345"

    fun getCar(){
        println("Music: $music_system")
        println("Lcd: $lcd_display")
    }
}


fun main() {
   //parent class obj
    val pObj = Vehicle()
    println("Vehicle: ${pObj.engine}")
   // println("Car: ${pObj.music_system}")  Error can't access specialized properties of child class from parent object
    println()
    println()

    //child class object
    val cObj = Car()
    println("Car: ${cObj.engine}") // parent property got inherited by child
    cObj.getVehicle()
    println()
    println("Car: ${cObj.music_system}") // specialized property of child class
    cObj.getCar()
}

