package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

val fernando = Cliente(nome = "Fernando", cpf = "1717171717-17", senha = 171717)
val raquel = Cliente(nome = "Raquel", cpf = "12312312312", senha = 123123)

fun testaContaDiferentes() {
    val contaCorrente = ContaCorrente(titular = fernando, numeroConta = 23804)
    val contaPoupanca = ContaPoupanca(titular = raquel, numeroConta = 37810)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("O saldo da conta corrente de ${contaCorrente.titular} é ${contaCorrente.saldo}")
    println("O saldo da conta poupança de ${contaPoupanca.titular} é ${contaPoupanca.saldo}")
}