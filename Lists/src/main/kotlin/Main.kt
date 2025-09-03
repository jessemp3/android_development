package Conceitos_basicos

fun main() {
//    lists()
//    conjuntos()
//    mapas()
//    filters()
//    simpleMap()
    flatMap()
}

fun lists(){
    val systemUsers : MutableList<Int> = mutableListOf(1,2,3,4,5)
    val sudoers : List<Int> = systemUsers // uma copia de leitura da lista original(systemUsers)

    fun addSystemUser(newUser: Int){
        systemUsers.add(newUser)
    }

    fun getSystemSudoers(): List<Int>{
        return sudoers
    }

    addSystemUser(4)
    print("Sudoers: ${getSystemSudoers().size}")
    getSystemSudoers().forEach{
        i -> print("User : $i ")
    }

    //getSystemSudoers().add(6); // erro de compilação, pois sudoers é uma lista de leitura
}

fun conjuntos(){ // set
    val set1: MutableSet<String> = mutableSetOf("one", "two", "three")
    val set2 = setOf(set1)

    fun anIssueAlreadyExists(issue: String){
        set1.add("four")
        return print(set2)
    }
}

fun mapas(){
    val points : Int = 15
    val passAccounts : MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100 , 3 to 100)
    val passReport: Map<Int, Int> = passAccounts

    fun updatePassAccount(userId: Int){
        if(passAccounts.containsKey(userId)){
            print("atualizando pontos do usuario $userId \n")
            passAccounts[userId] = passAccounts.getValue(userId) + points
        }else{
            print("não existe conta para o usuario $userId \n")
        }
    }

    fun report(){
        print("Relatorio de pontos \n")
        passReport.forEach{ (userId, points) ->
            print("Usuario $userId tem $points pontos \n")
        }
    }

    report()
    updatePassAccount(1)
    updatePassAccount(1)
    updatePassAccount(4)
    report()
}

fun filters (){
    val numbers: List<Int> = listOf(1,-2,3,4,5,0,-3,-4)

    val positivos = numbers.filter{it > 0} // it é uma anotação do lambda para encurtar o código
    val negativos = numbers.filter { x -> x <= 0 }


    print("Positivos: $positivos \n")
    print("Negativos: $negativos \n")
}

fun simpleMap(){
    val numbers: List<Int> = listOf(1,2,3,4,5)

    val doubled = numbers.map { it * 2 }
    val tripled = numbers.map { it * 3 }

    print("Doubled: $doubled \n")
    print("Tripled: $tripled \n")
}

fun flatMap(){
    val fruitMaps = listOf("apple", "banana", "kiwi")
    val vegetableMaps = listOf("carrot", "broccoli", "asparagus")
    val cart = listOf(fruitMaps, vegetableMaps)
    val flapmap = cart.flatMap{it}
    val map = cart.map{it}

    print("FlatMap: $flapmap \n")
    print("Map: $map \n")
}