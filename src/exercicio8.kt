class ContaBancaria(val nomeTitular: String, saldoInicial: Double) {
    private var saldo = saldoInicial

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Saldo insuficiente para sacar R$ $valor")
        }
    }

    fun verSaldo() {
        println("Saldo atual de $nomeTitular: R$ $saldo")
    }
}