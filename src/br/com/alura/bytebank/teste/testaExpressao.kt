package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val teste = "a"
    val a: Int? = try {
        Integer.parseInt(teste)
    } catch (e: NumberFormatException) {
        null
    }
    val valorComTaxa: Double? = if (a != null) {
        a + 0.1
    } else {
        0.0
    }
    println("parseInt de teste deu: $a")
    println("valor com a taxa: $valorComTaxa")
}