package OOPM.AccessModifier

/* ==== public ====
    Visibility: Everywhere (the entire project).
    Default modifier for all classes, functions, and properties in Kotlin, meaning that if you don't explicitly declare a modifier, it will be public.
    Any public element is accessible from anywhere in the project.
    You can either specify public keyword or not it is same

    The public modifier make a class or its member including inner classes visible to entire world


 */

// If no keyword is used means class is public also primary constructor is public
class Demo3(name: String, id: String, address: String){
    //public properties
    var  dName = name
    var dId: String
    var dAddress = address

     init {
         println("init block called")
         this.dId = "$id-tcs"
     }
    //If the class has a primary constructor, all secondary constructors must either directly or indirectly delegate to it using the this() keyword.
    constructor(name: String, id: String) :this(name, id, "unknown"){
        println("secondary constructor called")
    }

    //public function
    public fun showData(){
        println("Emp Name= $dName")
        println("Emp Id= $dId")
        println("Emp Address= $dAddress")
        println()
    }


}

fun main() {
    //Initializing using primary constructor
    val e1= Demo3("Harry", "f567", "superCorridor")
    println(e1.dId) // properties can be accessed all over the project bcz it is public
    println(e1.dName)
    e1.showData()

    //Initializing using secondary constructor
    val e2= Demo3("Emily", "xc788")
    e2.showData() // public function called

}