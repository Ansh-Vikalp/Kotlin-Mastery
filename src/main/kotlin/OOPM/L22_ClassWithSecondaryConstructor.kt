package OOPM

/* ======================================== SECONDARY CONSTRUCTOR  =====================================================
    Kotlin may have one or more secondary constructors. Secondary constructor allows initialization of variables and allow
    to provide some logic to the class as well. They must be prefixed with constructor keyword.
     In primary constructor we can only initialize or declare properties, for extra complex logic we need to mention it in init block
     But in secondary constructor we can do both in same constructor
     Primary constructor is present in class header, but secondary constructor defined in class body

     We want to create multiple secondary constructor to achieve constructor overloading
      For this we need to have multiple constructor of same class but different parameters, either in their type or no. or order

      A class can have only one Primary constructor and majorly they are used to initialize properties.

      A secondary constructor is an alternative constructor that can be defined within the class body, allowing additional ways to instantiate a class.
       Secondary constructors are useful if:
        You need to perform more complex initialization logic.
        You want to offer multiple ways to instantiate the class with different sets of parameters. (Overloading)
        The primary constructor is insufficient for certain scenarios.


 */

class Car{
    //properties:- accessible all over class and packages
    var model: String = "anom3x245"
    var color: String
    var averageSpeed: Int // can be initialized by complex logic so we can use secondary construct
    var price: Double

    //secondary constructor
    constructor(carM: String, carCol: String, carDistance: Int, carTime: Int, price: Double){
        println("Car")
        model = carM
        color = carCol
        this.price = price
        averageSpeed = (carDistance / carTime) -3 // complex initialization logic
    }
    // In case the parameter name and Instance property name is same then we can refer them by this keyword
    /*
        this.model= model
        this.color= color
        this. averageSpeed= (carDistance / carTime) -3
     */

    //Overloading through chaining
    //calling constrctor with 5 parameters
    constructor(carM: String, carCol: String, carDistance: Int, carTime: Int): this(carM, carCol, carDistance, carTime, 0.0){
        model = carM
        color = carCol
        averageSpeed = (carDistance / carTime) -3

    }

    //calling constructor with 4 parameters
    constructor(carM: String, carCol: String): this(carM, carCol, 9, 1){
        model = carM
        color = carCol
    }

    fun getDetail(){
        println("Model:- $model")
        println("Color:- $color")
        println("Speed:- $averageSpeed km/hr")
        println("Price:- $price Lakh")
        println()
    }

}

fun main() {

    val hundai: Car = Car("hundai_x4320","White", 23340,100, 99.8)
    hundai.getDetail()

    val volvo: Car = Car("volvo_y789","Blue",  339856,120)
    volvo.getDetail()

    val tesla: Car = Car("tesla_b7099","Grey")
    tesla.getDetail()

}
