package com.example.yango

//fun main(){
//    val numbers : List<String> = listOf("one","two","three")
//    println("Numbers of elements: ${numbers.size}")
//    println("Third element: ${numbers.get(2)}")
//    println("numbers ${numbers[1]}")
//    print("index of element \"two\": ${numbers.indexOf("two")}")
//}

fun main(){
    val lst = listOf("one","two","three")
    println("Mutuable List")
    for (i in lst.indices){
        println(lst[i])
    }
    var list=listOf("Aryan","Evanjelina")
   list=listOf("Raj","anish","sanvi")
    print(list)

    var collection : MutableList<String> = mutableListOf("Hari","bahadur")
    collection.add("shrestha")
    println(collection)

}