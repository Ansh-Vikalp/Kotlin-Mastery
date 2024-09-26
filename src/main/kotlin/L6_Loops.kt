fun main(){

    /* Loops are used when we need to execute a block of code repetitively.
        Kotlin has following loop as most of programming languages:-
        1) while loop (Entry Control)
        2) do..while loop (Exit Control)
        3) for loop (Entry Control)
     */

    // while loop
    /* The while loop loops through a block of code as long as a specified condition is true */

    var i: Int
    i=0

    while(i<=10){
        println("i= $i")
        i++ // i= i+1
    }
    println("While Loop exit\n")

    //do..while loop
    /* This loop will execute the code block once, before checking if the condition is true,
     then it will repeat the loop as long as the condition is true.*/
    i= 10
    do{
        println("i= $i")
        i--
    }while(i>=0)
    println("do While Loop exit\n")

    //for loop
    /* The Kotlin for loop is used to iterate a part of the program several times.
     If the number of iteration is fixed, it is recommended to use for loop.
     Unlike Java and other programming languages, there is no traditional for loop in Kotlin.
     for loop is used to loop through arrays, ranges, and other things that contains a countable number of values
     */

    // for loop in range
    for( j in 1..10){ // 1 & 10 are included in the range
        println("Itr: $j")  //There is no need to do increment in body or define a var j before loop
    }
    println("For Loop1 exit\n")

    //for loop until
    for(k in 5 until 9){ // 5 is included but 9 is excluded
        println("Itr: $k")
    }
    println()

    // Another way to exclude is by 5..<9
    for(k in 5..<9){ // 5 is included but 9 is excluded
        println("Itr: $k")
    }
    println("For Loop2 exit\n")

    //Reversed for loop
    for(z in 7 downTo 5){
        println("z= $z")
    }
    println("For Loop3 exit\n")

    //Using steps of increment
    for(odd in 3..9 step 3){
        println("Odd: $odd")
    }
    println("For Loop4 exit\n")


    //Using steps and reverse iteration
    for(odd in 9 downTo 3 step 3){
        println("Odd: $odd")
    }
    println("For Loop5 exit\n")

    //Travesing elements in array
    val arr: Array<String> = arrayOf("Hockey", "Programming", "Music", "Carom")

    for (activity in arr){
        println(activity)
    }
    println("For Loop6 exit\n")

    //'arr' is an object so we can reverse it by calling f/n over it
    for (activity in arr.reversed()){
        println(activity)
    }
    println("For Loop7 exit\n")


    //If you want to iterate through an array or a list with an index, you can do it this way:
    val array= arrayOf(33.4, 66.7, 88.8, 99.9)
    for (l in array.indices) {
        println(array[l])
    }
    println("For Loop8 exit\n")

    // using break, continue, return is also allowed:
    for(o in 1..9){
        if(o%2 !=0){
            continue
        }else{
            println("Even= $o")
        }
    }
    println("For Loop9 exit\n")





}