package br.com.alura.bytebank.modelo

class Gerente(//tirando o val das variaveis abaixo eles deixam de ser properties e passam a ser apenas parametros
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    salario = salario,
    cpf = cpf,
    senha = senha
) {/* o ":" indica a herança/implementação de interface. Usaremos o construtor ()
da classe mãe. Na verdade se após o : Tiver  algo sem parenteses ele é uma interface*/

    override fun bonificacao(): Double {
        return salario
    }



}