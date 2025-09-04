package orientacao_a_objetos

open class Dog {//se a classe está como open significa que ela pode ser herdada
    open fun sayHello(){
        println("Woof!")
    }
}

class Workshire: Dog (){
    override fun sayHello() { // override significa que o métod está sendo sobrescrito e pra isso o metodo que foi sobreescritp precisa ser open
        println("Yap!")
    }
}