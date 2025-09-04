package orientacao_a_objetos

open class HerancaComArgumento(val nome:String, val origin:String) {
    fun sayHello(){
        println("Hello from $origin, I'm $nome")
    }
}

class Asiatic(name:String): HerancaComArgumento(name, "Asia")