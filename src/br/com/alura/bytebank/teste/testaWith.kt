package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaWith() {//com o uso do with, conseguimos fazer alguma computação com algum objeto
    with(Endereco()) {
        logradouro = "Rua Deputado Soares Filho"
        numero = 286
        bairro = "Tijuca"
        cidade = "Rio de Janeiro"
        estado = "SP"
        cep = "20540040"
        complelento = "AP 1005"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
}
