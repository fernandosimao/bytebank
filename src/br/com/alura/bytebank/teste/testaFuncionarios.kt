package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Auxiliar
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {

    val gustavo = Auxiliar(
        nome = "Gustavo Fernandes",
        cpf = "777.777.777-77",
        salario = 7000.00

    )

    val alex = Gerente(
        nome = "Alex Felipe",
        cpf = "111.111.111-11",
        salario = 3000.00,
        senha = 12345
    )

    val fernando = Gerente(
        nome = "Fernando",
        cpf = "09927014732",
        salario = 10000.00,
        senha = 12345
    )
    val raquel = Diretor(
        nome = "Raquel",
        cpf = "125355255773",
        salario = 2000.00,
        senha = 22332233,
        plr = 200.00
    )

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(gustavo)
    calculadoraBonificacao.registra(raquel)
    calculadoraBonificacao.registra(fernando)
    calculadoraBonificacao.registra(alex)



    println("Nome do funcionário ${gustavo.nome}")
    println("CPF do funcionário ${gustavo.cpf}")
    println("Salário do funcionário ${gustavo.salario}")
    println("Bonificação do Funcionário: ${gustavo.bonificacao()}")

    println("Nome do funcionário ${alex.nome}")
    println("CPF do funcionário ${alex.cpf}")
    println("Salário do funcionário ${alex.salario}")
    println("Bonificação do Funcionário: ${alex.bonificacao()}")

    println("Nome do br.com.alura.bytebank.modelo.Gerente ${fernando.nome}")
    println("CPF do br.com.alura.bytebank.modelo.Gerente ${fernando.cpf}")
    println("Salário do br.com.alura.bytebank.modelo.Gerente ${fernando.salario}")
    println("Bonificação do br.com.alura.bytebank.modelo.Gerente: ${fernando.bonificacao()}")

    println("Nome do br.com.alura.bytebank.modelo.Diretor ${raquel.nome}")
    println("CPF do br.com.alura.bytebank.modelo.Diretor ${raquel.cpf}")
    println("Salário do br.com.alura.bytebank.modelo.Diretor ${raquel.salario}")
    println("Bonificação do br.com.alura.bytebank.modelo.Diretor: ${raquel.bonificacao()}")
    println("PLR do br.com.alura.bytebank.modelo.Diretor: ${raquel.plr}")

    println("O total de todas as bonificações pagas é de ${calculadoraBonificacao.total}")

}



