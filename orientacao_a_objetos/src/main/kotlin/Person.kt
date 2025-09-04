package orientacao_a_objetos

data class Person(val string: String, val i: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    println(p1.hashCode())
    println(p1.component1())
    println(p1.component2())

    return p1 == p2  // should be true
}