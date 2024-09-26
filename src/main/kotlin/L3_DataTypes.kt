fun main(){
    /* There are different Data types -
    Kotlin does not have any primitive data types, all are treated as objects/ Reference Data Types
    This means that you can call member functions and properties on any of these objects.
    However, some types, like numbers, characters, and booleans, have an optimized internal representation as primitive values at runtime by JVM

    These data types are classified as Number, Character, Boolean, String, Array, Custom data type
    |-> Number
            |-> Integer (Byte{1 byte}, Short{2 byte}, Int{4 byte} {default}, Long{8 byte} {l or L})
            |-> Floating Point
                    |-> Float (single precision, support up to 7 digits after decimal places) {4byte= 32bits} {f or F}
                    |-> Double (Double precision, support up to 16 digits after decimal places) {8byte= 64bits} {default}

    |-> Character (Char '') {2 byte as it support unicode characters '\u2345'}
    |-> Boolean (Boolean true/false)
    |-> String (enclosed in "")
    |-> Array ( val marks: Array<Int> = arrayOf(1,2,3,4,5)  or val marks = arrayOf(1,2,3,4,5) )
    |-> Custom/User-Defined (By Creating a class & its object)
            We can have a class with properties and method, and we can use that class Data Type by creating its object
    */

    /* Kotlin automatically infers the data type of variable, suitable for it with the smallest range enough starting from Int by its assigned value
    * Like:- var age= 67, here age will be of Int
    *        var name= "Ansh", here name will be of String
    * In case we want to explicitly define data type we can declare our variable as-
    *        var income: Long = 2234, here 2234 will become Long literal bcz variable datatype is Long
    *        var income2= 23L (l for long)
    */

    //Auto infred
    var a= 23
    var b= 22.4
    var c= 'k'
    var d= "Ansh"
    var choice= true

    //Explicit data type
    var data: Double= 1.0 //Explicitely given type is redundant here
    var smallData: Byte= 127
    var mediumData: Short= 255
    //For long, we can either use L or var height: Long = 234
    var height: Long = 234
    val height2= 23L;
    //For float, we can either use F or var pi: Float = 2.34F
    var pi= 3.14F
    var pi2:Float = 3.14F


    println("Values are:\n$a\n$b\n$c\n$pi\n$smallData\na+b= ${a+b}")
    println(d)
    println(choice)
    println("$data\n$mediumData\n$height"+ "\n"+ height2 +"\n" + pi2)

/*    ------------------------------------------------------------------------
    Also note variable type and literal type need to exact same we can create like this-No support for Automatic Widening Conversion
     var kk: Double= 27 Gives ERROR int can be implicitly converted to Double
    ------------------------------------------------------------------------
*/


    //Explicit type conversion (Widening Type)
    val intNum= 234
    val shortNum: Short= intNum.toShort()
    val longNum= intNum.toLong()

    val floatNum= 3.678F
    val intNum2= floatNum.toInt()
    val doubleNum= floatNum.toDouble()
    val stringNum= doubleNum.toString()

    println("intNum= $intNum")
    println("shortNum= $shortNum")
    println("longNum= $longNum")
    println("intNum2= $intNum2")
    println("stringNum= $stringNum")

 /*   In many cases, there is no need for explicit conversions because the type is inferred from the context,
    and arithmetical operations are overloaded for appropriate conversions, for example: */

    val l = 1L + 3 // Long + Int => Long (expression converted to higher data type)
    val ans= 2.45F + 34 + 6.0 // Float + Int + Double=> Double

    println("Expression answer \$ans = ${ans * 1}")


    // Array data Type-Collection of similar types of data at sequential location
    val marks= arrayOf(23, 40, 33, 70, 100)
    val activity: Array<String> = arrayOf("Cricket", "Programming", "Baseball", "Music")

    //Accessing Elements
    println("Student 1: "+marks[1])
    println("\$activity[2]= ${activity[2]}")
    activity[3]= "Dancing"
    println("\$activity[3]= ${activity[3]}")
    println()
    println()

    //Custom data type
    var obj1: Employee= Employee(5678,"Shyam", "Koichi")
    var obj2: Employee= Employee(1123,"Ram", "Lucknow")
    var obj3: Employee= Employee(9043,"Aman", "Patna")

    println("Employee ${obj1.id} ${obj1.name} ${obj1.address}")
    obj2.getData()
    obj3.getData()






}

class Employee(var id: Int, var name: String, var address: String){

    public fun getData(){
        println("id= $id | name= $name | address= $address")
    }
}