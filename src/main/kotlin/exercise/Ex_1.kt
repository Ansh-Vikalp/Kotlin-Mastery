package exercise

import kotlin.math.sqrt

// This cover L1-L6

/*
* TODO: WAP to take a num from user and count the digit.
* TODO: WAP to take a num from user and reverse it.
* TODO: WAP to take a num from user and find the sum of cube of each digit of the num.
* TODO: WAP to take a num and check whether it is prime or not.
*/

fun countDigit(num: Int){
    var temp= num
    var sum=0
    var reverse=0
    var count=0
    while(temp>0){
        val rem= temp % 10
        sum += Math.pow(rem.toDouble(), 3.0).toInt()
        reverse= reverse * 10 + rem
        count++
        temp /= 10

    }

    println("Digit Count: $count")
    println("Reversed Num: $reverse")
    println("Sum of Cubes: $sum")

}

fun isPrime(num : Int) : Boolean{
    var flag= true
    for(i in 2..sqrt(num.toDouble()).toInt()){
        if(num % i ==0) {
            flag= false
            break
        }
    }

    return flag

}
fun main(){

    print("Enter a num: ")
    var num: Int= readln().toInt()

    //We need not use var or val in f/n parameter its type automatically becomes based on type of actual argument passed to f/n from main
    //Ex- fun meet(g){} or fun meet(op: Int){}
    //syntax- fun name (arg : data-Type): Rt_Type{ //body }
    countDigit(num)

    if(isPrime(num)){
        println("$num is Prime")
    }else{
        println("$num is not Prime")
    }




}