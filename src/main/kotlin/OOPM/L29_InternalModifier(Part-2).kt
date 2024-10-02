package OOPM

//we are in different package so we need to import the class of our desired package to use it
import OOPM.AccessModifier.InternalClass

/* Here we are trying to access some member and class itself that is declared as internal but are
    part of same module */

// File: L29_InternalModifier(Part-2).kt (within the same module)
fun main() {
    val obj = InternalClass()
    println(obj.internalVariable)  // Accessible within the module
    obj.internalFunction()  // Accessible within the module
}
//see part-1 in AccessModifier package for more details