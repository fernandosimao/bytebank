package modelo

import modelo.Autenticavel

class Cliente (
    val nome: String,
    val cpf: String,
    private val senha: Int
): Autenticavel {//modelo.Autenticavel não tem parentesis, ou seja, não tem construtor, logo é uma interface
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}