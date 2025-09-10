package funcoes

fun apply() {
    val pessoa = Pessoa();
    val resultado = pessoa.apply {
        nome = "Maria"
        idade = 25
    }
    println("Resultado: $resultado")
    println("Pessoa: $pessoa")
}

data class Pessoa(var nome: String, var idade: Int){
    constructor(): this("", 0)
}
