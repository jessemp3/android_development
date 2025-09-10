package funcoes


class confiraçacao(var host: String, var porta: Int)

fun with(){
    val conf = confiraçacao("localhost", 8080)

    with(conf){
        println("Host: $host")
        println("Porta: $porta")
    }

    println("Host: ${conf.host}")
    println("Porta: ${conf.porta}")
}
