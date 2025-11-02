package com.example.yango

fun set(){
    val numbers = setOf(1,2,3,4)
    for (elements in numbers){
        print(elements)
    }
    val numbersBackward = setOf(4,3,2,1)
    print("Both sets are equal ${numbers==numbersBackward}")
}
fun main(){
    set()
}