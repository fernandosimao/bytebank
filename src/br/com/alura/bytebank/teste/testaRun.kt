package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal é $taxaMensal")

    Cliente(nome = "Fernando Simão", cpf = "09927014732", senha = 123456)
        .let { clienteNovo ->
            ContaPoupanca(clienteNovo, 1000)
        }.run {
            deposita(1000.0)
            saldo * taxaMensal

        }.let { rendimentoMensal ->
            println(rendimentoMensal)
        }
}



