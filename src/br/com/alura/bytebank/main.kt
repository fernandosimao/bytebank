package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {


    val endereco = Endereco(logradouro = "Rua Deputado Soares Filho", cep = "20540040")
    val enderecoNovo = Endereco(cep = "20540040", logradouro = "Rua Deputado Soares Filho")

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())


    println(endereco.toString())


}


