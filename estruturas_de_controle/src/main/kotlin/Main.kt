package Conceitos_basicos

import java.util.Queue

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    whenStatement()
    println(whenExpression(1))
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