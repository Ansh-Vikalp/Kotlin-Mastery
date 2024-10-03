package OOPM.Inheritance

open class Papa (val name: String, val age: Int){

    fun Papa_display(){
        println("name= $name, age= $age")
    }
}

class Child1 ( name: String,  age: Int, val entertainment: String) : Papa(name, age){

    fun Child1_display(){
        println("name= $name, age= $age, entertainment= $entertainment" )
    }
}

class Child2 ( name: String,  age: Int, val entertainment: String) : Papa(name, age){

    fun Child2_display(){
        println("name= $name, age= $age, entertainment= $entertainment" )
    }
}

fun main() {
    val c1= Child1("Rohan", 24, "Music")
    c1.Child1_display()
    c1.Papa_display()

    println()

    val c2= Child2("Sohan", 15, "Dance")
    c2.Child2_display()
    c2.Papa_display()
}

