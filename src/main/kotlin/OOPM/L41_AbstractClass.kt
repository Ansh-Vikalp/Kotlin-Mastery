package OOPM

/*
    An abstract class in Kotlin is a class that cannot be instantiated directly. It serves as a blueprint for other classes.
    The abstract class can have abstract methods (which do not have a body) and concrete methods (which do have an implementation).

    Purpose: Abstract classes are used when you want to provide some common functionality across multiple subclasses
    but leave the specific implementation of certain behaviors to the subclasses.

    If a class contains even a single abstract method then the class need to be marked as abstract itself
    If something is abstract it means it is incomplete and canot be used directely
    We can not create object of abstract class directely, however we can create reference of abstract class that points
    to any of its subclass that implements all of its abstract methods.
    Abstract classe can have concrete as well as abstract methods
    A abstract method can only be declared by abstract keyword but does not have any body.
    Generelly a subclass provide implementation of abstract class but if it does not the subclass also need to be marked as abstract.
    abstract class or abstract method needs to be implemented by subclass so by default they are open we need not to mark them open.
    But during implementation we have to use override keyword
    A class can also have abstract properties that can be overridden by subclass


 */

//A class containing even a single abstract method/property need to be declared abstract
abstract class Shape{
    protected open val name: String = "Shape" // it can have a general property with value that may or mayn't be overriden by its child
    protected abstract val area: Double // abstract property

    fun isClosed(){// concreate method
        println("This $name is closed.")
    }

    abstract fun calculateArea()    // abstract method (incomplete)
}


class Rectangle(val length: Int, val breadth: Int) : Shape(){
    override  val name = "Rectangle" //non-abstract property, but overridden
    public override val area= length * breadth * 1.0 // abstract

    override fun calculateArea() {  // overriding the abstract method
        println("Area of $name is: $area sq. m")
    }

}

class Square(val side: Int) : Shape(){
    override val name = "Square"
    override val area= side * side * 1.0

    override fun calculateArea() {
        println("Area of $name is: $area sq. m")
    }
}


class Circle(val radius: Int) : Shape(){

    override val name= "Circle"
    override  val area= Math.PI * radius * radius

    override fun calculateArea(){
        println("Area of $name is: $area sq. m")
    }

}

//class RandomSape : Shape() ERROR A subclass of abstract Shape must implement all abstract methods otherwise it need to be made abstract
abstract class RandomSape: Shape()

fun main() {
    //Abstract class Shape can't be initiated
    //val unidentified: Shape = Shape() //ERROR

    val shape: Shape = Rectangle(7, 5) // Reference variable is of type abstract, but object is of type concrete class
    shape.isClosed()
    shape.calculateArea()

    println()

    val shape2: Shape=  Square(3)
    shape2.isClosed()
    shape2.calculateArea()

    println()

    val shape3: Shape = Circle(7)
    shape3.isClosed()
    shape3.calculateArea()
}

