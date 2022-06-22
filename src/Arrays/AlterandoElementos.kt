fun alterandoElementos() {
    val salarios: DoubleArray = doubleArrayOf(
        1500.50,
        2300.0,
        4500.0,
        6750.80,
        10000.0
    )
    println("Salarios antes do aumento: ${salarios.contentToString()}")

    val aumento = 1.1
//    var indice = 0
//    for (salario in salarios){
//        salarios[indice] = salario * aumento
//        indice++
//    }
//    println("Salarios depois do aumento: ${salarios.contentToString()}")

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println("Salarios depois do aumento: ${salarios.contentToString()}")

    salarios.forEachIndexed { indice, salario ->
        salarios[indice] = salario * aumento
    }
    println("Salarios depois do aumento: ${salarios.contentToString()}")
}
