class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Usuário logou com sucesso no sistema")
        } else {
            println("Usuário ou senha incorretos")
        }

    }


}