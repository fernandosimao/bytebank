package br.com.alura.bytebank.teste

fun testaLacos() {

    for (i in 1..5) {
        println(i)
    }
    for (i in 1 until 5) { //until - o último valor é excluído
        println(i)
    }
    for (i in 5 downTo 1) {
        println(i)
    }
    for (i in 5 downTo 1 step 2) {
        println(i)
    }

    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}