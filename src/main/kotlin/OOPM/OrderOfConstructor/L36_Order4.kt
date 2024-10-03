package OOPM.OrderOfConstructor

/*
    CASE-4
    If the parent class contains only a secondary constructor:

    If the parent class has only a secondary constructor,
    the child class must call this secondary constructor explicitly,
    since there is no primary constructor to rely on.
 */

// Parent class with secondary constructor
open class Parent4{

    var pName: String
    var pIncome: Int= 0

    constructor(name: String, income: Int){
        this.pName = name
        this.pIncome = income
    }

    fun getDataParent(){
        println("parent name- $pName")
        println("$pName income- $pIncome")
    }


}

//calling parent primary constructor directly
class Child6 : Parent4{
    var cName: String= ""
    var cAge: Int = 0

    constructor(pName: String, pIncome: Int, cName: String, cAge: Int) : super(pName, pIncome){
        this.cName = cName
        this.cAge = cAge
    }
    fun getDataChild(){
        getDataParent()
        println("child name- $cName")
        println("$cName age- $cAge")
    }
}

fun main() {
    val g = Child6("Shiwanshu Kumar Singh", 80000, "Ansh Vikalp", 23)
    g.getDataChild()
}

/*
    In summary:

    If no constructors are defined in the parent class, you don't need to call any explicitly.
    If a primary constructor exists, it must be called by the child class in header.
    If both primary and secondary constructors exist, then in any way child need to call primary constructor (directly OR secondary constructor of parent class)
    If a secondary constructor is the only constructor, the child must call it explicitly.

 */