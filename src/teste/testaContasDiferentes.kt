package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContaDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Fernando", numeroConta = 23804)
    val contaPoupanca = ContaPoupanca(titular = "Raquel", numeroConta = 37810)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("O saldo da conta corrente de ${contaCorrente.titular} é ${contaCorrente.saldo}")
    println("O saldo da conta poupança de ${contaPoupanca.titular} é ${contaPoupanca.saldo}")
}