package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutencicacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import java.lang.NumberFormatException

//construtor primário dentro de br.com.alura.bytebank.modelo.Conta (). O construtor secundário pode ser incluido através de constructor()
abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) : Autenticavel by titular{ /*padrão chamado delegation sem ter que rescrever a função: delegamos para o autentica de titular
    a responsabilidade do autentica, assim não temos que implementar a classe abstrata autentica aqui dentro. Se fosse aqui
    dentro teríamos o seguinte´, usando o mesmo padrão delagation
    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }*/

    //object declarations, um objeto que não tem classe mas tem um nome (que é opcional, se tirar fica implicito o nome "Companion")
    companion object Contador {
        /*companion: apesar da var total ser privado, e ser restrito ao escopo de Contador, com o uso de
            companion ele passa a ser acessível por sua companheira, ou seja, pelo restante da classe Conta. Ver init abaixo*/
        var total = 0
            private set //somente a classe pode alterar essa variavel
    }

    var saldo = 0.0
        protected set/*
         dessa forma somente o objeto pode manipular esse atributo, que é de fora tem que chamar função
         No caso do protecd, o atributo fica acessível para a classe e suas filhas*/


    init {//toda vez que eu chamar essa classe, na implementação de um objeto, incremento a var total, de Contador
        total++

    }



//    fun setSaldo(valor: Double){
//      this.saldo = valor
//    }
//
//    fun getSaldo(): Double{
//        return this.saldo
//    }



    fun deposita(valor: Double) {//apesar da classe ser abastrata, posso ter métodos concretos
        if (valor > 0) {
            this.saldo += valor
        }

    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente. Saldo da conta: $saldo. Valor do saque: $valor" )
        }
        this.saldo -= valor
        destino.deposita(valor)

        if(!this.autentica(senha)){
            throw FalhaAutencicacaoException("Falha na autenticação. Senha inválida")
        }
        //throw NumberFormatException()


    }

}