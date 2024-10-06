package AdvanceConcepts

 /*
    data classes are the classes that holds data, In this class some functions are already defined for our use.

    Normal classes me bhi data store kar sakte by creating objects phir jinko hum getter and setter method se retrive bhi kar sakte.
    But data classes are specillly provided by Kotlin for this purpose. also data class kuch pre-build f/n provide karti hai,
    jinko pahle se hi override kiya rahta hamare use ke liye.

    When you declare a class as a data class, Kotlin automatically generates the following overridden methods:

    equals(): Compares two objects for equality based on the property values not references.
    hashCode(): Generates a hash code based on the property values.
    toString(): Returns a string representation of the object with its property values..
    copy(): Allows you to create a copy of an object, optionally changing some of its properties.

    Esa nahi hai ki ye sab method aap normal class me use nahi kar sakte, app kar sakte but output and behaviour aapko
    kuch or milega bcz, they have some different definition.
    Like if you call .toString() method over object of narmal class to wo class name followed by the memory address dega.
    class_name@HASHCODE

    But yahi sab methods data class ne ese override kar rakha hai ki aapko kuch useful output mile
    Like if you call .toString() method over object of data class then formatted output milega
    class_name(name=Ansh, age=25)

    If you want you can override these utility methods in body of your normal class as well to show return value that you want.
    override fun toString(): String{
            return "Mai nahi bataugan"
    }

    Rules of Data class-
    Primary constructor need to have at least one parameter.
    All primary constructor parameters need to marked as val or var (Means constructor can only contain one or more properties)
    Error- data class PasswordManager(username: String, password: String)
    Data class can't be made abstract, open, sealed or inner.
    Data class may only implement interfaces.
  */

data class PasswordManager(var username: String, val password: String){

    //We can create our own f/n also. WE can do anything as we can do in normal class.
    fun getDetail(){
        println("Username: $username\nPassword: $password\n")
    }

}


class Test{
    //Uses toString of Superclass Any
}

class NoteBook{

    override fun toString(): String {
        return "hat be laure"
    }
}


fun main() {

    val person1 = PasswordManager("avikalp511_","xer980537")
    println("Property1- ${person1.username}")
    person1.getDetail()

    println()

    //Overridden methods provided by data class
    // copy()- This will create the copy of object with same state.
    val person2= person1.copy()
    println("Copy Created...")
    person2.getDetail()

    //We can modify the property for this copy
    person2.username="shivam67Rana"
    person2.getDetail()

    //toString()- This maethod overriden to return the string repesentainon of object with state.
    println("Data Class > " + person1) // or, println(person1.toString()) //PasswordManager(username=avikalp511_, password=xer980537)


    //For a normal class it uses the default implementation from Any, which is based on the object's memory address.
    println("Normal Class > " + Test().toString()) //AdvanceConcepts.Test@448139f0
    //In case we can override these pre-build f/n for normal classes(toString, copy, hashcode, equals)
    println("After Overriding > "+ NoteBook())

    println()

    //hashcode()- returns a hash code based on the property values, so hash changes when property values are changed
    println("Data Class Hashcode > " + person1.hashCode())
    //Normal class hashcode is returned based on the object's memory address so when new object is created hash changes.
    println("Normal Class Hashcode > " + Test().hashCode())

    println()

    //equals()- returns two objects are equal or not based on the property values
    val person3= PasswordManager("avikalp511_","xer980537")
    println("Data Class equal > " + (person1 == person3))
    //Normal class equal two objects are equal or not based on refences are pointing to same address.
    val t1= Test()
    val t2= Test()
    val t3= t1
    println("Normal Class equal > " + (t1 == t2))
    println("Normal Class equal > " + (t1 == t3))

    println()
    println()

    /* Each property declared in the primary constructor of a data class has a corresponding componentN() function,
    where N is the index of the property. This enables destructuring declarations. */
    val (p_name, p_pass) = person2
    println("After Destructuring")
    println("\$p_name: $p_name")
    println("\$p_pass: $p_pass")



}



