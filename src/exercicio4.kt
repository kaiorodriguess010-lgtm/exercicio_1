fun main() {
    val idades = listOf(10, 18, 20, 15, 30)
    val maiores = idades.filter { it >= 18 }
    val media = maiores.average()
    println("A média é: $media")
}

