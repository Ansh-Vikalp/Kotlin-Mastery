package OOPM.AccessModifier

/*
    === protected ===
    Visibility: Within the same class or its subclasses.
    A protected element can be accessed within the class and by inheriting (derived) classes, but not from outside.
    It is commonly used in inheritance scenarios.
 */

open class ParentClass {
    protected var protectedVariable: Int = 30  // Accessible in subclasses

    protected fun protectedFunction() {
        println("This is a protected function")
    }
}

class ChildClass : ParentClass() {
    fun accessProtected() {
        println(protectedVariable)  // Accessible in subclass
        protectedFunction()  // Accessible in subclass
    }
}

fun main() {
    val child = ChildClass()
    child.accessProtected()  // Accessing the protected members
    // child.protectedVariable -> Not accessible outside the class or subclass
    // child.protectedFunction() -> Not accessible outside the parent class or subclass
}
