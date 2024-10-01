package OOPM

/*  Class is a collection of similar types of object.
   It is a blueprint for creating objects
   They have properties and behavior
   It is a logical entity, matlab aap class ka use nahi karoge aap class se object banaogay or uska use karogay

   Object is a real world entity which can be touch or feel or used.
   It has properties, behavior and identity.
   With the help of these methods we can change the value of these properties

   Ex= paper par jo specification likha hai khana banane ka wo mera blueprint, class hota hai
   or jab aapne actual khana bna liya "Karahai Panner" to wo mera object hua.

 */

class Student{
    //properties
    /*
    after declaring properties it shows ERROR properties must be initialized or be abstract
    java me humlog ese declare kar sakte the without initializing but kotlin
    me agar property define kar rahe to use initialize karna hi karna must hai, ya to usse abstract bana do.
        To hum propety ko define karte wakt usse default value bata dege taki wo initialize ho jaye
        Now aab jab bhi hum koi nya object banayegay to usme properties ki default value automatically aa jayegi.
     */
    var id: Int = 0
    var name: String = ""
    var email: String = ""


    //methods
    fun getStudentDetail(){
        println("id= $id")
        println("name= $name")
        println("email= $email")
        println("--------------------------------\n")
    }

}

fun main() {
    //Creating objects
    val stud1: Student= Student()
    //the default value get printed
    stud1.getStudentDetail() // class method

    //we can also provide own value to these properties as well
    val stud2= Student()
    stud2.id= 67789
    stud2.name= "Lokesh Singh"
    stud2.email= "lokesh4@gmail.com"
    stud2.getStudentDetail()
}