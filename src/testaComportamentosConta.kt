fun testaComportamentosConta() {
    val contaAlex = ContaCorrente("Alex Felipe", 1855)
    contaAlex.deposita(2500.00)


    //testando o uso de labels no construtor
    val contaFran = ContaCorrente(numeroConta = 5699, titular = "Fran de Oliveira")
    contaFran.deposita(1500.00)

    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)

    contaAlex.deposita(5000.00)
    contaFran.deposita(3000.00)

    println("Novo Saldo Alex: ${contaAlex.saldo} ")
    println("Novo Saldo Fran: ${contaFran.saldo} ")

    println("Testando saque na conta do Alex")
    contaAlex.saca(7000.00)
    println("Saldo Alex após saque: ${contaAlex.saldo} ")

    println("Testando saque na conta da Fran")
    contaFran.saca(4000.00)
    println("Saldo Fran após saque: ${contaFran.saldo} ")

    println("Testando transferência da conta do Alex para conta da Fran")
    contaAlex.transfere(500.00, contaFran)
    println("Saldo Fran após recebimento de Alex ${contaFran.saldo}")
    println("Saldo Alex após transfeência para Fran ${contaAlex.saldo}")
}