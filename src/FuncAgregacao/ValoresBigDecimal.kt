package FuncAgregacao

import java.math.BigDecimal
import java.math.RoundingMode

fun valoresBigDecimal() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "8000.00")
    println(salarios.contentToString())

    val salariosComAumento = calculaAumentoComMap(*salarios)
    println(salariosComAumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}

fun calculaAumentoComMap(vararg valores: BigDecimal): Array<BigDecimal> {
    val aumento = "1.1".toBigDecimal()
    return valores.map { salario ->
        if (salario <= "5000".toBigDecimal()) {
            salario + "500".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()
}