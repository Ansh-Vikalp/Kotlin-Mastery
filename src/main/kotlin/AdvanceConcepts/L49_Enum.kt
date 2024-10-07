package AdvanceConcepts

/*
    Enum class ki help se kuch constant value hai uske ke corresponding object create kar sakte hai.

    enum class (short for enumerated type) is used to represent a fixed set of constants values.
    It is useful when you need a predefined list of values that are known at compile-time.
    Each constant in an enum is an object, and enum classes can have properties, methods, and implement interfaces.

    When you define an enum class, the compiler creates exactly one instance for each enum constant.
    These instances are created when the class is loaded,

   Enums represent a closed set of known values.
   Since these values are predefined (like NORTH, SOUTH, etc.), they don't need to be instantiated multiple times.
   All references to Direction.NORTH will point to the same, immutable object.

   When you use Direction.NORTH, you're not creating a new object. Instead, you're accessing an existing, pre-made static-like instance.

   You can't create any more new objects of enum class like normal class Like- val ob= Direction.NORTH
   This is restricted by compiler, as it would defeat the purpose of enums, which is to have a fixed, limited set of constant values.

   So we can also conclude that no object can explicitly be created you can't call constructor for enum class.
   However, you can call these constructors in these constants values as they are objects.
   Enum classes can have properties and methods like a regular class.

   Syntax -
   enum Directions(val degree: Int){
    //Fixed number of Objects of enum class
    NORTH(0), // Primary constructor can be called for these constants, but not externally.
    EAST(90), // ye obj hai to esme constrctor ki parameter to pass karni hi hogi na.
    SOUTH(180),
    WEST(270);

   //Enum can also have methods
        fun description(){
            println( "Direction $name with angle $degrees degrees" )
        }
    }

    main(){

        val direction = Direction.EAST // object can be accessed like static members
        direction.description()


 */


enum class Direction(val degree: Int) {
    //enum are fixed set of constants values that are converted to objects by compiler.
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    //enum class can have methods
    fun getDirection(){
        println("Sailing towards Direction \"$name\" with \"$degree°\" angle.")
    }
}


fun main() {

    // Referencing to pre-build objects
    val d1= Direction.NORTH
    println(d1.degree)
    d1.getDirection()
    println("From " + d1 :: class.simpleName + " class")

//    val ob= Direction() ERROR enum type can't be initiated.

    print("Enter direction to sail: ")
    val inp= readln().toString()

     when(inp){
        "North" -> Direction.NORTH.getDirection()
        "East" -> Direction.EAST.getDirection()
        "South" -> Direction.SOUTH.getDirection()
        "West" -> Direction.WEST.getDirection()
    }
}

