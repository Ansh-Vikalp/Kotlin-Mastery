fun main(){

/*
    Conditionals are used to make decision
    They control the flow of execution in a program
    Ex- if it Rains, I will take Umbrella with me

    various Conditions in Kotlin are-
    1) If
    2) If…Else
    3) If Else…If Else
    4) When…Else  (Similar to Switch)
*/

    // Simple if-else statement
    val age= 44
    if(age > 18){
        println("You can Vote.")
        println("It's Your right!")
    }else{
        println("You can't Vote.")
    }

    // if we want a single statement we can omit {}
    print("Enter your temperature: ")
    val fever= readln().toInt()
    if(fever >= 99)    println("You got fever, take rest")
    else    println("You are Healthy")

    //If- Else If- Else
    val num= 65
    if(num>0){
        println("$num is positive")
    }else if(num==0){
        println("$num is zero")
    }else{
        println("$num is negative")
    }

    //If expression- In kotlin if is an expression: it can return a value, so there is no need of ternary operator

    print("Enter 1st num: ")
    val a: Int= readln().toInt()
    print("Enter 2st num: ")
    val b: Int= readln().toInt()

    val max= if(a>b){
        a
    }else{  //You can also use `else if` in expressions
        b
    }

    println("Maximum num: $max")


    // Ranges are denoted by num1..num2 here num1 & num2 are included
    // Grade distribution using if expression-
    print("Enter Semester marks: ")
    val marks= readln().toInt()

    val grade: Char = if(marks in 91..100){ 'A' }
    else if(marks in 81..90){ 'B' }
    else if(marks in 71..80){ 'C' }
    else if(marks in 61..70){ 'D' }
    else{ 'F' }

    println("Your GRADE is: $grade")


//    Branches of an if expression can be blocks with print statements. In this case, the last expression is the value of a block:
    val date=7
    val day: String = if(date== 1){
        println ("Enjoy")
        "Sunday" //expression value if date==1
    }else if (date ==2) "Monday"
    else if (date==3) "Tuesday"
    else if (date==4) "Wednesday"
    else if (date==5) "Thrusday"
    else if (date==6) "Friday"
    else{
        println("Weekend!")
        "Saturday" //expression value if date==7
    }

    println("Today is: $day")

    // Simple When statement
    /* when defines a conditional expression with multiple branches. It is similar to the switch statement in C-like languages */

    val x= 1

    when(x){
        1-> println("One")
        2-> println("Two")
        3-> println("Three")
        4-> println("Four")
        5-> println("Five")
        6-> println("Six")
        7-> println("Seven")
        8-> println("Eight")
        else -> println("Zero")
    }

    //When Expression
    /* Like if when can also be used as expression with multiple condition branch.
    *  If it is used as an expression, the value of the first matching branch becomes the value of the overall expression
    * Each branch can be a block, and its value is the value of the last expression in the block.
    * The matching cases need not be a constant number it can be a range also
    */

    val percentage: Double = when(marks){
        in 91..100-> {
            println("\nExcellent")
            (marks/ 100.0) * 100.0
        }

        in 81..90-> {
            println("\nVery Good")
            (marks/ 100.0) * 100.0
        }

        in 71..80-> {
            println("\nGood")
            (marks/ 100.0) * 100.0
        }

        in 61..70-> {
            println("\nWork hard")
            (marks/ 100.0) * 100.0
        }

        else-> {
            println("\nFail")
            (marks/ 100.0) * 100.0
        }
    }

    println("PERCENTAGE: $percentage")


    // To define a common behavior for multiple cases, combine their conditions in a single line with a comma:
    val p= 1
    when (p) {
        0, 1 -> print("p == 0 or p == 1")
        else -> print("otherwise")
    }





}