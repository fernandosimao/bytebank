package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaScopeFunctions() {
    //pegar as informações do endereço e os apresentar em maíúsculo
    Endereco(logradouro = "Rua Deputado Soares Filho", numero = 286)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println) //::dessa forma o println recebe a saída do bloco anterior e faz seu processamento


    //Filtrar e imprimir os endereços que têm complemento de uma lista de endereços
    listOf(Endereco(complelento = "Ap 1005"), Endereco(), Endereco(complelento = "Ap 507"))
        .filter { endereco -> endereco.complelento.isNotEmpty() }
        .let(::println)


}