package orientacao_a_objetos

open class HerancaContrutor(val origin: String) {
    fun sayHello(){
        println("Hello from $origin")
    }
}

class SiberianTiger: HerancaContrutor("Siberia")