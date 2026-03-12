class Pessoa(val nome: String, val idade: Int, val cidade: String) {
    fun mostrarFrase() {
        println("$nome tem $idade anos e mora em $cidade.")
    }
}

fun main() {
    val maria = Pessoa("Maria", 25, "São Paulo")
    maria.mostrarFrase()
}
