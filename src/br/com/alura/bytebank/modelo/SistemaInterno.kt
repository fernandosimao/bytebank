package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: ()->Unit = {}){
        if(admin.autentica(senha)){
            println("Usuário logou com sucesso no sistema")
            autenticado()
        } else {
            println("Usuário ou senha incorretos")
        }

    }


}