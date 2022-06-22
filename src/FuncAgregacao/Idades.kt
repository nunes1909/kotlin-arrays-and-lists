package FuncAgregacao

fun idades(){
    val idades: IntArray = intArrayOf(10, 14, 32, 24, 37, 45, 62)

    // Pega valor maximo
    val idadeMaxima = idades.maxOrNull()
    println(idadeMaxima)

    // Pega valor minimo
    val idadeMinima = idades.minOrNull()
    println(idadeMinima)

    // Pega media
    val mediaIdades = idades.average()
    println(mediaIdades)

    // Verificação em todos
    val todosMaioresIdade = idades.all {
        it >= 18
    }
    println("Todos são maiores de idade? $todosMaioresIdade")

    // Verificação se pelo menos um
    val alguemMaiorIdade = idades.any {
        it >= 18
    }
    println("Alguem é maior de idade? $alguemMaiorIdade")

    // Filtra e busca os valores filtrados
    val getMaiores = idades.filter {
        it >= 18
    }
    println("Os maiores de idade são: $getMaiores")

    // Busca um valor específico
    val getIdade = idades.find {
        it == 24
    }
    println("Existe alguem com 24? $getIdade")
}