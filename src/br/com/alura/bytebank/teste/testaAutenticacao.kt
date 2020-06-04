package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val fernando = Gerente(
        nome = "Fernando",
        cpf = "111.111.111-11",
        salario = 1000.00,
        senha = 12345
    )
    val raquel = Diretor(
        nome = "Raquel",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 54321,
        plr = 200.0
    )

    val henrique = Cliente(
        nome = "Henrique",
        cpf = "7171.7171.71-71",
        senha = 717171
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(fernando, 122345)
    sistemaInterno.entra(raquel, 54321)
    sistemaInterno.entra(henrique, 717172)
}