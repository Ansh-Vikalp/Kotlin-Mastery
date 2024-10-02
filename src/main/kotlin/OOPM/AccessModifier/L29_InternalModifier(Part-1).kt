package OOPM.AccessModifier

/*
    === internal ===
    Visibility: Only within the same module.
    A Kotlin module can be a single project, a library, or a group of files compiled together.
    Any internal element is accessible only within the same module and not from other modules.

    The internal modifier restrict the visibility of member to the same module. A module is a set of Kotlin files compiled together.

    Package and modules are different terms
    A module can contain multiple packages
 */

// File: L29_InternalModifier(Part-1).kt (within the same module)
/* The below internal class and its internal members can only be accessed by any other files that present in same module
    See its use in L29_InternalModifier(Part-2) in OOPS package that is part of same module
 */
internal class InternalClass() {
    internal var internalVariable: Int = 40
    init{
        print("internalVariable= ")
    }

    internal fun internalFunction() {
        println("This is an internal function")
    }
}



// File: AnotherModule.kt (in a different module)
// Cannot access InternalClass or its members, as it's in a different module
