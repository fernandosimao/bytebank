package br.com.alura.bytebank

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaAny
import br.com.alura.bytebank.teste.testaAutenticacao
import br.com.alura.bytebank.teste.testaComportamentosConta
import br.com.alura.bytebank.teste.testaExpressao

fun main() {
    testaExpressao()

    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    var logradouroNovo: String? = enderecoNulo?.bairro
    enderecoNulo?.let {
        println(it.logradouro.length)
    }

    var b: String? = "casa"
    b = null
    println(b?.length)
}








