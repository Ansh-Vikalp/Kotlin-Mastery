fun main(){
    /* IntelliJ IDEA Community Edition 2024.2.2
    Operators are used to perform operation or tasks on an operand
    c :operand  = :operator   a :operand    + : operator     b :operand
    These operand can be either variable or value
    Types of Operator-
    1) Arithmetic Operator (+, -, *, /, %)
    2) Assignment Operator (=, +=, -=, *=, /=, %=)
    3) Unary Operator (++, --, +5, -6, !(expr), ~(negate)(perform 2's compliment))
    4) Relational/Comparison Operator (==, <, >, <=, >=, !=)
    5) Logical Operator (&&, ||, !)
    6) Bitwise Operator
            and(bits) – bitwise AND
            or(bits) – bitwise OR
            xor(bits) – bitwise XOR
            inv() – bitwise inversion
    7) Shift Operator
             shl(bits) – signed shift left x2^n
            shr(bits) – signed shift right /2^n
            ushr(bits) – unsigned shift right

    Note- Since all variables are just objects in Kotlin. There is equivalent method for these operators that we can call
    over operand. These, functions can also be overridden to change their behaviour, thus to achieve operator Overloading.
    Ex- x.plus(y) x.minus(y) x.rangeTo(9) etc...

     */

    //Arithmetic Operator
    var x= 20
    var y= 30

    println(x+y)
    println(x-y)
    println(x*y)
    println(x/y)
    println(x%y)
    var z= x.plus(y) - y.minus(x) //Use of f/n over objects
    println(z)
    var t= x.rangeTo(100)
    println(t)
    var u= x.rangeUntil(100)
    println(u)
    println()

    //Assignment operator
    x+= y
    println(x)
    x-= y
    println(x)
    x*= y
    println(x)
    x/= y
    println(x)
    println()

    //Unary operator
    println(x++)
    println(--x)
    println(-y)
    println(+y)
    println(x.inc())
    println()

    //Relational operator
    println(x>y)
    println(x<=y)
    println(x==y)
    println(x!=y)
    println()

    //Logical operator
    var temp1=4.rangeTo(7)
    var temp2= 88
    println( (temp2 in temp1) && temp2 > 0) // => false
    println( (temp2 !in temp1) && temp2 > 0) // => true
    println( (temp2 in temp1) || temp2 > 0) // => true
    println(!true)
    println()


    //Bitwise operator
    var g1= 2
    var g2= 3
    println("g1 and g2= ${g1 and g2}")
    println("g1 or g2= ${g1 or g2}")
    println("g1 xor g2= ${g1 xor g2}")
    println("~g1= ${g1.inv()}")
    println()

    //Binary Shift operator

    println("left-shift by 1= ${g1 shl 1}")
    println("right-shift by 1= ${g1 shr 1}")
    println("unsigned-right-shift by 1= ${g1 ushr 1}")
    println()




}