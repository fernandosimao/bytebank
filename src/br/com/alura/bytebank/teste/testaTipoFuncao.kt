package br.com.alura.bytebank.teste

public fun testaFuncaoAnomima() {
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50// a função anônima é mais explícita que a função lambda, mas são muito parecidas
        }
        return salario + 100
    }

    println(calculaBonificacaoAnonima(1000.0))


    //inicialização da FunctionType através de uma função Anômina
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }


    println(minhaFuncaoAnonima(100, 200))
}

public fun testaFuncaoLambda() {
    //inicialização da FunctionType através de Lambda
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b

    }

    //inicialização da FunctionType através de Lambda, nesse caso um dos argumentos não precisou ser utilizado (_)
    //Lembre-se de que a última instrução da expressão lambda é o seu retorno.
    val minhaFuncaoLambda2: (Int, Int) -> Int = { _, b ->
        b + 10

    }

    val calculaBonificacao: (salario: Double) -> Double = lambdaaa@{ salario ->
        if (salario > 1000.0) {
            return@lambdaaa salario + 50 //no lambda retornamos sempre a última expressão, usando o @identificacao, podemos retornar esse ponto
        }
        salario + 100

    }
    println(calculaBonificacao(2000.0))

    println(minhaFuncaoLambda(30, 30))
    println(minhaFuncaoLambda2(100, 70))
}

fun testaFunctionTypeClasse() {
    //inicialização da FunctionType através de um objeto de classe
    val minhaFuncaoClass: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClass(20, 45))
}

fun testeFunctionTypeReferencia() {
    //inicialização  da FunctionType através de uma função
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10)) //colocar os parenteses pois a variável minhaFunção é do tipo função: functionType
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2
    }


}





