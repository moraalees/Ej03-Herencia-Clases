package src

interface Vehiculo {
    var motorEncendido: Boolean
    var kilometrosHora: Double


    fun acelerar(valor: Int)
    fun frenar(valor: Int)
}