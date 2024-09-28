import org.w3c.dom.ranges.Range
import java.util.ArrayList as myList //alias for java.util.ArrayList
typealias Animals = HashSet<String>

fun main() {
    /* Hard Keywords: The following tokens are always interpreted as keywords and cannot be used as identifiers:  */

    //HEAD: as- is used for unsafe type casts.
    /*If the cast isn't possible, the compiler throws an exception. This is why it's called unsafe.*/
    val ob: Any = "Ramesh" // Any is Super Class of all classes in kotlin and is generic, here Any can take non-nullable vaule
    val stObj: String = ob as String
    println(stObj.length)

    /* In this example, if obi is null or diffrent data type other than string , the code below also throws an exception.
    * This is because null can't be cast to String, as String isn't nullable.
    */

    val obi: Any? = null // Any? takes nullable vaule and is  super class of all classes
    //val stObj2: String = obi as String // java.lang.NullPointerException: null cannot be cast to non-null type kotlin.String
    //println(stObj2)

    //To make the example work for possible null values, use a nullable type on the right-hand side of the cast:
    val stObj3: String? = obi as String? //String cant be null however ,  String? can be nullable so we cast our Any? to String?
    println(stObj3)


    //HEAD: as? - is used for safe type casting
    /*To avoid exceptions, use the safe cast operator as?, which returns null on failure.
    * Note:- Even we define obi casted as String in right, but use of as? make sure if the casting is not possible
    * return null instead of throwing exception */
    val stObj4: String? = obi as? String
    println(stObj4)

    //HEAD: as - specifies an alias for an import
    //see top line import statement there i have used an alias "myList" that can be used inplace of ArrayList.
    var evenNum: myList<Int> = myList<Int>()
    evenNum.add(2)
    evenNum.add(4)
    evenNum.add(6)
    println("evenNum ${evenNum}")
    println(evenNum::class.java.name)// so मेरा evenNum object ArrayList class का है

    /* HEAD: -> is specifies the object being iterated in a for loop.
            -> is used as an infix operator to check that a value belongs to a range, a collection, or another entity that defines a 'contains' method.
            -> is used in when expressions for the same purpose.
            -> jis object me mera iterator implement hai usme in use kar sakte hai
     */

    var ran = 4 until 7
    var num1= 6
    println(num1 in ran)
    println(88 !in ran)

    var series = 23.rangeTo(30)
    for (i in series){
        print("$i ")
    }
    println()

    for (ele in evenNum.indices){
        println(evenNum.get(ele))
    }

    /*HEAD: is checks that a value is of certain type.
          is used in when expressions for the same purpose */

    //Smart Cast

    var anomenous: Any = "anomenous"

    if(anomenous is String){
        println(anomenous.length)
    }else{
        println("Not a String")
    }

    val result = when (anomenous){
        is Int -> {
            anomenous +1
        }
        is String -> {
            anomenous.length
        }
        is IntArray -> {
            anomenous.sum()
        }
        else -> {
            "Nothing"
        }
    }
    println("Result: $result")

    //HEAD: typealias declares a type alias.
    //See top line of this file for tyalias declaration for HashSet

    var mySet: Animals = Animals()
    mySet.add("Rabbit")
    mySet.add("Giraffe")
    mySet.add("Lion")
    mySet.add("Rabbit")

    println(mySet)













}