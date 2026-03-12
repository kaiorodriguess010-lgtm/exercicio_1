class Produto(val nome: String, val preco: Double)

fun main() {
    val produtos = listOf(
        Produto("Caderno", 15.0),
        Produto("Celular", 1500.0),
        Produto("Lápis", 2.0)
    )

    // Busca o item com o maior preço
    val maisCaro = produtos.maxByOrNull { it.preco }
    println("O produto mais caro é: ${maisCaro?.nome}")
}