package OOPM.AccessModifier

/* Kotlin visibility modifiers or access modifier are used to control the visibility of a class, and its members
    (functions, properties, constructors, nested classes) These modifiers help in implementing encapsulation
    and defining the scope of these elements within the code.

    ==== private ====
    Visibility: Only within the declaring class or file.
    A private function, property or constructor can only be accessed within the class where it's defined.
    whereas A class marked as private can only be accessed by other classes or main f/n in the same file.

 */
                        //property 1
class Demo constructor(private var a: Int){

    //property 2
    private var b = "hello"
    //property 3
    private var c: Double

    init{
        c= 88.9
    }


    private fun showData(){
        //private properties are accessible within class
        println("a= $a")
        println("b= $b")
        println("c= $c")
    }

    fun display()
    {   // private fun showData() can be accessed within class
        showData()
    }

}

fun main() {
    val obj: Demo = Demo(7)
     // println(obj.a) Error Cannot access 'a': it is private in 'Demo'
    // obj.showData() Error Cannot access 'showData': it is private in 'Demo
    //public function is although accessible
    obj.display()
    println()

    //private class object
    val ob: Demo2 = Demo2(9, z= 8.7) // named argument
    ob.display()



}


// A private class is accessible in same file so if we try to access below class from main f/n in different file it will give error

private class Demo2 (
    private var x : Int,
    private var y: String = "foo",
    private var z: Double
){

    private fun showData(){
        //private properties are accessible within class
        println("x= $x")
        println("y= $y")
        println("z= $z")
    }

    fun display(){
        showData()
    }
}