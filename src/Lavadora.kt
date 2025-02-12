package src

class Lavadora(): EncendidoApagado {
    override fun encender() {
        println("La lavadora se ha encendido.")
    }

    override fun apagar() {
        println("La lavadora se ha apagado.")
    }
}