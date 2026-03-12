//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("BatataQuente")
        } else if (i % 3 == 0) {
            println("Batata")
        } else if (i % 5 == 0) {
            println("Quente")
        } else {
            println(i)
        }
    }
}
