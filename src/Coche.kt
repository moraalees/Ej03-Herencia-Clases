package src

class Coche() : EncendidoApagado, Vehiculo{

    override var kilometrosHora = 0.0
        set(value){
            val valorFinal = field - value
            field = if (valorFinal < 0){
                0.0
            } else {
                valorFinal
            }

        }

    override var motorEncendido = false

    override fun encender() {
        println("El coche se ha encendido.")
    }

    override fun apagar() {
        println("El coche se ha apagado.")
    }

    override fun acelerar(valor: Int) {
        if (motorEncendido) {
            kilometrosHora += valor
        }
    }

    override fun frenar(valor: Int) {
        if (motorEncendido) {
            kilometrosHora -= valor
        }
    }


}