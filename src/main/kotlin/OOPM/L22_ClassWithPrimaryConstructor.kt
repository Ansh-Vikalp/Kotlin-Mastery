package OOPM

class Tree ( //Primary constructor
    name: String, //parameter
    origin: String //parameter

){
    //properties are initialized by constructor parameters
    val TName: String = name
    var TOrigin: String = origin
    var TSmell: String

    init {
        TSmell="default_good" // using init block we can even initalize class property
    }
    fun getDescription(){
        println("$TName :: $TOrigin :: $TSmell")
    }

}

fun main() {
    //Initialize Object
    val o1 = Tree("Gulmohar", "Kerala")
    o1.getDescription()

    val o2 = Tree("Neem", "Bihar")
    o2.TSmell= "no smell" //changing default initialized value
    o2.getDescription()
}
