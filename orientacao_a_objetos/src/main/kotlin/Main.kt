package orientacao_a_objetos

fun main() {
//    val dog: Dog = Dog()
//    val workshire: Dog = Workshire()
//    dog.sayHello()
//    workshire.sayHello()
//
//    val tiger: HerancaContrutor = SiberianTiger()
//    tiger.sayHello()
//
//    val asiatic: HerancaComArgumento = Asiatic("rufo")
//    asiatic.sayHello()

//    val people = getPeople()
//    println(people)
//    println(comparePeople())

    val state = State.ON
    val message = when(state){
        State.ON -> "The state is ON"
        State.OFF -> "The state is OFF"
    }
    println(message)
}