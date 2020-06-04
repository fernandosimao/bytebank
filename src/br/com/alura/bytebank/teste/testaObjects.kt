package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

public fun testaObjects() {
    //object expression: um objeto que é criado sem nome e sem necessidade de se criar uma classe
    val fran = object : Autenticavel {

        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 123456

        override fun autentica(senha: Int): Boolean {
            return this.senha == senha
        }
    }

    //já os object declarations tem um nome. Ver sua implementação na classe Conta

    println(fran.autentica(123456))

    testaComportamentosConta()
    val enderecoFernando = Endereco(
        logradouro = "Rua Deputado Soares FIlho",
        numero = 286,
        cidade = "Rio de Janeiro",
        bairro = "Tijuca",
        estado = "RJ",
        cep = "20520202",
        complelento = "Ap 1005"
    )
    val fernando = Cliente(nome = "Fernando", cpf = "111.111.111-11", endereco = enderecoFernando, senha = 123456)
    val contaCorrente = ContaCorrente(titular = fernando, numeroConta = 23804)
    println("Total de contas criadas: ${Conta.total}")
}




