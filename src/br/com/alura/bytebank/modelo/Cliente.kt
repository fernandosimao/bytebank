package br.com.alura.bytebank.modelo

class Cliente (
    val nome: String,
    val cpf: String,
    val endereco: Endereco = Endereco(),
    private val senha: Int
): Autenticavel {//br.com.alura.bytebank.modelo.Autenticavel não tem parentesis, ou seja, não tem construtor, logo é uma interface
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}