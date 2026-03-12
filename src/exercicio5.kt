fun main() {
    val numero = 5
    var resultado = 1

    for (i in 1..numero) {
        resultado = resultado * i
    }

    println("O fatorial de $numero é $resultado")
}
