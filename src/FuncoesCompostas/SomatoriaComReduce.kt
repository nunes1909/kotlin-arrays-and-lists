package FuncoesCompostas

import java.math.BigDecimal
import java.math.RoundingMode

fun operacoesCompostas() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "8000.00", "12000.00", "7500.90")
    println("- Salarios: ${salarios.contentToString()}")

    val salariosComAumento = calculaAumentoComMap(*salarios)
    println("-- Soma dos salários com aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial = salariosComAumento.somatoria()
    println("--- Gasto inicial inicial: $gastoInicial")

    val gastoAcumulado = calculaGastoAcumulado(
        6,
        gastoInicial = gastoInicial,
        salarios = salariosComAumento
    )
    println("---- Gasto dos meses acumulados: $gastoAcumulado")

    // Ordenação padrao do sorted é crescente
    val tresMaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
    println("----- Os três maiores salários são: ${tresMaioresSalarios.contentToString()}")
    println("------ Média dos três maiores salários: ${tresMaioresSalarios.media()}")

    val tresMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
    println("------- Os três menores salarios são: ${tresMenoresSalarios.contentToString()}")
    println("-------- A média dos tres menores salários é: ${tresMenoresSalarios.media()}")

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

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}

fun calculaGastoAcumulado(meses: Int, gastoInicial: BigDecimal, salarios: Array<BigDecimal>): BigDecimal {
    val meses = meses.toBigDecimal()
    return salarios.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
}
