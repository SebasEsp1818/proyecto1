package POO_Llamada_metodos

class Hijos {

    val edades = IntArray(5)

    // Método para cargar las edades desde el teclado
    fun cargar() {
        println("Ingrese las edades de 5 personas:")
        for (i in edades.indices) {
            print("Edad ${i + 1}: ")
            edades[i] = readLine()!!.toInt()
        }
        imprimirMayorEdad()
        imprimirPromedioEdades()
    }

    // Método para imprimir la mayor edad
     fun imprimirMayorEdad() {
        val mayorEdad = edades.maxOrNull() ?: 0
        println("La mayor edad es: $mayorEdad")
    }

    // Método para imprimir el promedio de edades
    private fun imprimirPromedioEdades() {
        val promedio = if (edades.isNotEmpty()) {
            edades.sum().toDouble() / edades.size
        } else {
            0.0
        }
        println("El promedio de las edades es: $promedio")
    }
}

fun main() {
    val hijos = Hijos()
    hijos.cargar()
}