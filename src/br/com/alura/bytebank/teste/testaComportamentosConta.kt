package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutencicacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco
import java.lang.Exception

val alex = Cliente(
    nome = "Alex",
    cpf = "111.111.111-11",
    senha = 123456,
    endereco = Endereco(logradouro = "Rua Deputado Soares Filho")
)
val fran = Cliente(
    nome = "Fran",
    cpf = "123.123.123.-23",
    senha = 654321
)

fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(alex, 1855)
    contaAlex.deposita(2500.00)


    //testando o uso de labels no construtor
    val contaFran = ContaCorrente(numeroConta = 5699, titular = fran)
    contaFran.deposita(1500.00)

    println(contaAlex.titular.nome)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)
    println(contaAlex.titular.endereco.logradouro)

    println(contaFran.titular.nome)
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

    try {
        contaAlex.transfere(50.00, contaFran, 123456)
        println("Transferência bem sucedida")
    } catch (e: SaldoInsuficienteException){
        println("Não foi possível realizar a transferência pelo seguinte motivo: ${e.message}")
    } catch (e: FalhaAutencicacaoException){
        println("Não foi possível realizar a transferência pelo seguinte motivo: ${e.message}")
    }
    catch (e: Exception){
        println("Erro desconhecido")
    }


    println("Saldo Fran após recebimento de Alex ${contaFran.saldo}")
    println("Saldo Alex após transfeência para Fran ${contaAlex.saldo}")
}