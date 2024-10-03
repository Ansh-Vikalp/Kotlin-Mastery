package OOPM.OrderOfConstructor

/*
    CASE-2
    If the parent class contains one primary constructor:

    When a parent class has a primary constructor, the child class must call the parent’s primary constructor.
    This is done by using the constructor invocation syntax in the class declaration of child (Parent()).
    or, invoking parent constructor in secondary constructor of child class

 */

// Parent class with primary constructor
open class Parent2 constructor(var pname: String, var pincome: Int){

    fun getDataParent(){
        println("parent name- $pname")
        println("parent income- $pincome")
    }

}
//call in child class header
class Child2(var cName: String, var cAge: Int, pName: String, pIncome: Int) : Parent2(pName,pIncome){

    fun getDataChild(){
        getDataParent()
        println("child1 name- $cName")
        println("child1 age- $cAge")
    }
}



class Child3 : Parent2 {
    var cName: String
    var cAge: Int

    constructor( cName: String, cAge: Int, pName: String, pIncome: Int): super(pName,pIncome){
        //invoking parent constructor in secondary constructor of child class
        this.cName = cName
        this.cAge = cAge
    }
    fun getDataChild(){
        getDataParent()
        println("child2 name- $cName")
        println("child2 age- $cAge")
    }
}
fun main() {

    val cc= Child2("Geeta", 15, "RamDas", 70000)
    cc.getDataChild()

    println()

    val ccc= Child3("Ram", 25, "RamDas", 70000)
    ccc.getDataChild()
}

