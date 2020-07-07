package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHighOrderFunction() {
    soma(1, 6).let {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234) {
        println("Realizada a autenticação")
    }

    // ou podemos explicitar o terceiro elemento de .entra com seu label, o autenticado
    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizada a autenticação")
    })
}

//higher order function - Função que recebe outra como argumento
fun soma(a: Int, b: Int, resultado: (Int)-> Unit){
    println("Soma sendo efetuada")
    resultado(a + b)
    println("Soma efetuada")
}

//higher order function - Função que recebe outra como argumento
fun teste(teste: Int, bloco: () -> Unit) {

}