package OOPM

/*
    In Kotlin Interface is a collection of abstract methods and properties, that define a common contract for classes that implement that interface.
    To declare an interface we use interface keyword
    It is a blueprint of a class. In other words it is group of related methods with an empty body.
    interface we can only way to achieve pure abstraction
    Just like an abstract class we can't initiate it. However, we can create reference to it that store object of child class that
    implements this interface.
    All the methods and properties in an interface are abstract by default. We need not declare them abstract.
    Interface also allow you to have some concrete method that have body just like default method in interface Java interface.
    When multiple classes implement the same interface, if there’s common behavior that doesn’t vary between classes,
    it makes sense to provide a default implementation in the interface.
    This prevents code duplication, as every class doesn't have to write the same implementation again.

    Unlike abstract class which can have both abstract & concrete methods and properties. Interface only allowed to have abstract
    and concrete(default) methods, it can't have any concrete properties.
    Means we can't give state or initialize a property in an interface.

    Generally a subclass provides implementation of all abstract methods and properties of interface. However, if not
    then the subclass itself need to made abstract or interface.

    Unlike abstract class There is no constructor for an interface.

    A class can implement multiple interfaces but can only extend or inherit one abstract class or a simple class.

    Although, multiple inheritance is not allowed in Kotlin, but we can achieve the same result with interfaces. Since in interface
    the body of method is provided in child class, which ensures only one copy of method exists.


 */


interface Camera{

    val focal_length: Int // By default, all methods and properties are abstract in interface
    val aperture: Double

    fun turnCameraOn() // abstract method

}

interface Tracking{
    // we can't give values to properties in interface. They can not have state.
//    val x_coordinate= 6

    //Although properties can't be made concrete but methods can be abstract as well as concrete (can have body)
    fun tracking(){ // default method
        println("Tracking by GPS coordinates")
    }

}

// A class can implement multiple interfaces
class SmartPhone: Camera, Tracking {

    override val focal_length = 10
    override val aperture: Double
        get() = 9.6 // we can provide values to override properties by using getter methods also, since whenever we access any property getter gets called.

    override fun turnCameraOn() {
        println("Press power button twice to turn On camera.")
    }

}

fun main() {

    val camera: Camera = SmartPhone()
    camera.turnCameraOn()
    println("Aperture: ${camera.aperture}")
    println("Focal Length: ${camera.focal_length}")


    println()

    val tracking: Tracking = SmartPhone()
    tracking.tracking()
//    tracking.turnCameraOn() ERROR can't access other methods bcz reference is of interface Tracking

}

