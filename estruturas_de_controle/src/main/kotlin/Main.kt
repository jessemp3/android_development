package Conceitos_basicos

import java.util.Queue
import kotlin.math.ln

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    whenStatement()
//    println(whenExpression(1))
//    forLoop()

//    whileAndDoLoop()
    ranges()

    fun max(a: Int, b: Int) = if (a > b) a else b // if expression
    println(max(2,3))
}


fun whenExpression(obj: Any): Any {
    val ressult = when (obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }
    return ressult
}


fun whenStatement() {
    val userRole: String = "Viewer"
    when (userRole) {
        "Viewer" -> println("User has read-only access")
        "Editor" -> println("User can edit content")
        else -> print("User role is not recognized")
    }
}


//for
fun forLoop() {
    val cakes = listOf("carrot", "chocolate", "vanilla")

    for (cake in cakes) {
        println("I like $cake")
    }
}


fun whileAndDoLoop(){
    fun eatACaked() = println("Eat a Cake")
    fun cakesBaked() = println("Bake a Cake")

    var cakesEaten = 0
    var cakesBaked = 0

    while(cakesEaten < 5){
        eatACaked()
        cakesEaten++
    }

    do{
        cakesBaked()
        cakesBaked++
    }while(cakesBaked < cakesEaten)
}

fun iterators(){

}

fun ranges() {
    for (i in 0..5) { // de 0 a 5
        println(i)
    }

    for (i in 0 until 5) { // de 0 a 4 , until serve pra dizer que n chega no 5
        println(i)
    }

    for (i in 2..10 step 2) { // de 2 a 10 de 2 em 2
        println(i)
    }

    for (i in 5 downTo 0) { // de 5 a 0
        println(i)
    }

    for (c in 'a'..'k') { // de a a k
        println(c)
    }
}

fun igualdade(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Shakespeare", "Hemingway", "Twain")

    println(authors == writers) // true (mesmo conteudo) // comparação estrutural
    println(authors === writers) // false (objetos diferentes , pois tem referencias de memorias
//diferentes  ) // comparação referencial
}

