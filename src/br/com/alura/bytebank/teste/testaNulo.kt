package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNulo() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    var logradouroNovo: String? = enderecoNulo?.bairro
    enderecoNulo?.let {
        println(it.logradouro.length)
    }

    var b: String? = "casa"
    b = null
    println(b?.length)
}
