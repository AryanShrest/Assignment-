package com.example.yango
//
//var numbers:Array<Int> = arrayOf(1,2,3)
//var alpha =arrayOf("a","b")
//fun main(){
//    println(numbers.contentToString())
//    println(alpha.contentToString())
//}
//
fun main (args:Array<String>){
    var age=arrayOf(1,2,3)
    println(age.contentToString())
    println("The First element is ".plus(age[0]))
    println("The second elememt is "+ age[2])

    var names=arrayOf("aryan","jenish","raj")
    names[0]="evanjelina"
    println(names.size)
    println(names.contentToString())
}
