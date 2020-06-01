package modelo

class Diretor(//tirando o val das variaveis abaixo eles deixam de ser properties e passam a ser apenas parametros
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    salario = salario,
    cpf = cpf,
    senha = senha
) {

    override fun bonificacao(): Double {
        return salario + plr
    }


}