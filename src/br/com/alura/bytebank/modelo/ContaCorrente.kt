package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.2
       if(this.saldo >= valorComTaxa){
           this.saldo -= valorComTaxa
       }
    }
}