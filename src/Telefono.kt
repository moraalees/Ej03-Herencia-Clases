package src

class Telefono(
    val marca: String = "Desconocido",
    val modelo: String = "Desconocido"
) : EncendidoApagado, DispositivoElectronico {

    override fun encender() {
        println("El teléfono se ha encendido.")
    }

    override fun apagar() {
        println("El teléfono se ha apagado.")
    }

    override fun reiniciar() {
        println("El teléfono se está reiniciando...")
    }
}