package OOPM

/* =================================================== PRIMARY CONSTRUCTOR =============================================
Pichle lesson mai humne sikha ki agar hame class ki property define karni hai to use default value se kuch initialize bhi karna hoga
Ye isliye important hai kyuki jab class ka object create hota hai to default constructor se comiple automatically object ko
memory deta lekin uski property ki kya value hogi usse nahi pata so hume batana parta ki object ki property me
sab initial default value dalo so initialization is must when thre is no primary constructor made by you

Lekin jab hum koi ek constructor bana dete to compiler ko pata chal jata ki object ki property ye sab hone wali hai
to chahe uski default value do ya na do wo automatically apne corresponding default value se initialize ho jata.

Now hum ye chahte hai ye jo initialization hai usi vakt apne aap sari properties object ke pas chali jaye, bad
me hame set na karna pare.

*/
/*
    Constructor are like member function that automatically get invoked when object of the class is created, they
    initialize the data member of object.
    The primary constructor is declared in class header and initializes the object with default or given values at runtime.

    The primary constructor initializes a class instance and its properties in the class header.
    The class header can't contain any runnable code.
    If you want to run some code during object creation, use initializer blocks inside the class body.


    If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:

    class Person(firstName: String) { /*...*/ }
 */

class Employee constructor( //Primary Constructor
    var Eid: Int,   // Providing default value is optional to these properties
    var Ename: String,
    var Eemail: String= "abcinfotech@yahoo.com"
){
    //to execute some statements along with primary constructor we use init block
    init {
        println("Creating object")
    }
    // the initializer blocks are executed in the same order as they appear in the class body
    init{
        println("setting properties values...")
    }




    //The above properties is accessible in class body
    fun getEmployeeDetail(){
        println("Eid= $Eid")
        println("Ename= $Ename")
        println("Eemail= $Eemail")
        print("----------------------------------------------\n")
    }
}

fun main (){

    val emp1= Employee(7890, "Shashi Kumar")// third param is default value
    emp1.getEmployeeDetail()
    println(emp1.Eid) //these are properties even though they are defined in constructor because use of val keyword
                                        //constructor call
    val emp2= Employee(8956,"Sakshi Raina", "sakshi899@yahoo.com")
    emp2.getEmployeeDetail()

}





