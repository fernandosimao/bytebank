package br.com.alura.bytebank.modelo

//construtor primário dentro de br.com.alura.bytebank.modelo.Conta (). O construtor secundário pode ser incluido através de constructor()
abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) {

    //object declarations, um objeto que não tem classe mas tem um nome (que é opcional, se tirar fica implicito o nome "Companion")
    companion object Contador {/*companion: apesar da var total ser privado, e ser restrito ao escopo de Contador, com o uso de
    companion ele passa a ser acessível por sua companheira, ou seja, pelo restante da classe Conta. Ver init abaixo*/
        var total = 0
            private set //somente a classe pode alterar essa variavel
    }

    var saldo = 0.0
        protected set/*
         dessa forma somente o objeto pode manipular esse atributo, que é de fora tem que chamar função
         No caso do protecd, o atributo fica acessível para a classe e suas filhas*/


    init {
        total++

    }


//    fun setSaldo(valor: Double){
//      this.saldo = valor
//    }
//
//    fun getSaldo(): Double{
//        return this.saldo
//    }

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numeroConta = numero
//}

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }

    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false

    }

}