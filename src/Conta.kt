//construtor primário dentro de Conta (). O construtor secundário pode ser incluido através de constructor()
abstract class Conta(val titular: String, val numeroConta: Int) {
    var saldo = 0.0
        protected set/*
         dessa forma somente o objeto pode manipular esse atributo, que é de fora tem que chamar função
         No caso do protecd, o atributo fica acessível para a classe e suas filhas*/


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