package funcoes.tipo_de_funcao

class MyStringCollection {
    infix fun add(s: String) { /*...*/ }
    infix fun Int.times(str: String) = str.repeat(this)

    fun infix(){
        println(2 times "Bye ") // prints "Bye Bye "
    }

//    fun build() {
//        this add "abc"   // Correct
//        add("abc")       // Correct
//        //add "abc"        // Incorrect: the receiver must be specified
//    }


}