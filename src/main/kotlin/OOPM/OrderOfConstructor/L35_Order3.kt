package OOPM.OrderOfConstructor

/*
    CASE-3
    If the parent class contains one primary and one secondary constructor:

    If the parent class has both a primary and a secondary constructor,
    the child class must call the primary constructor either directly in it's header
    or through one of the parent's secondary constructors that ultimately calls the primary one.
 */

open class Parent3(var pName: String ){

    var pIncome: Int= 0

    constructor(name: String, income: Int): this (name){
        this.pIncome = income
    }

    fun getDataParent(){
        println("parent name- $pName")
        println("$pName income- $pIncome")
    }


}

//calling parent primary constructor directly
class Child4(var cName: String, var cAge: Int, pName: String, pIncome: Int) : Parent3(pName){

    fun getDataChild(){
        getDataParent()
        println("child1 name- $cName")
        println("$cName age- $cAge")
    }
}

//calling through one of the parent's secondary constructors that ultimately calls the primary one
class Child5 : Parent3{

    var cName: String
    var cAge: Int

    constructor(cName: String, cAge: Int, ppName: String, ppIncome: Int) : super(ppName, ppIncome){
        this.cName = cName
        this.cAge = cAge
    }

    fun getDataChild(){
        getDataParent()
        println("child1 name- $cName")
        println("$cName age- $cAge")
    }
}

fun main() {
    val u= Child4("Sita", 25, "Rohan Kumar", 30000)
    u.getDataChild()
    println()
    val v= Child5("Mayur", 22, "Rohan Kumar", 30000)
    v.getDataChild()
}