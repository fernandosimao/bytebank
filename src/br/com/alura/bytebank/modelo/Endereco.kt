package br.com.alura.bytebank.modelo

class Endereco (

    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complelento: String = ""
)
{
    override fun toString(): String {
        return """Endereco:
|logradouro='$logradouro', 
|numero=$numero, 
|bairro='$bairro', 
|cidade='$cidade', 
|estado='$estado', 
|cep='$cep', 
|complelento='$complelento')""".trimMargin()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (complelento != other.complelento) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complelento.hashCode()
        return result
    }

    fun completo(): String {
       return """
           $logradouro - $numero - $bairro
           $cidade - $estado - $cep
           $complelento
            
        """.trimIndent()
    }


}

