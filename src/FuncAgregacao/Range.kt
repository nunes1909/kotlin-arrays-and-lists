package FuncAgregacao

fun ranges(){
//    val serie: IntRange = 1.rangeTo(10)
//    for (s in serie) print(" $s")

//    for ( i in 0..100 step 2)
//        print(" $i")

//    for (n in 100 downTo 0 step 2 )
//        print(" $n")

    val intervalo = 337..868
    val numero = 300
    if (numero in intervalo){
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }
}