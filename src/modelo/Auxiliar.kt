package modelo

class Auxiliar(//tirando o val das variaveis abaixo eles deixam de ser properties e passam a ser apenas parametros
    nome: String,
    cpf: String,
    salario: Double

) : Funcionario(nome = nome, salario = salario, cpf = cpf) {
    override fun bonificacao(): Double {
       return salario * 0.1
    }/* o ":" indica a herança. Usaremos o construtor ()
da classe mãe*/




}