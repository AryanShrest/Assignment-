package com.example.yango
//
//fun map(){
//    val countriesCapital = mapOf(
//        "Nepal" to "kathmandu",
//        "India" to " NewDelhi"
//    )
//    println("All keys: ${countriesCapital.keys}")
//    println("All Values: ${countriesCapital.values}")
//    println("Capital of Nepal: ${countriesCapital["Nepal"]}")
//}
//fun main(){
//val studentMarks= mapOf (
//    "ram" to 45,
//    "aryan" to 19,
//    "eva" to 20
//)
//println("Enter student name")
//    val input : String = readln().lowercase()
//    println(studentMarks[input])
//}

//fun main(){
//    val studentMarks = mutableMapOf(
//        "ram" to 45,
//        "aryan" to 19,
//        "sanvira" to 20
//    )
//    studentMarks["ram"] = 18
//    studentMarks.put("sanvi" ,20)
//    println("Enter the name of student")
//    val input= readln()
//    print(studentMarks[input])
//}

//Create a Dictionary app using mapOf() function where user will type a
//word and your program should return the meaning of that word

fun main(){
    val values= mutableMapOf(
        "Aryan" to "eva",
        "Manjil" to "nigam"
    )
    println("Enter word and find value")
    val input: String = readln()
    println(values[input])

}
