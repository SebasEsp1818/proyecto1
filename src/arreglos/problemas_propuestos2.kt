package arreglos

fun main() {
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val sumaArreglos = IntArray(4)

    // Cargar el primer arreglo
    for (i in arreglo1.indices) {
        print("Ingrese elemento para el primer arreglo:")
        arreglo1[i] = readln().toInt()
    }

    // Cargar el segundo arreglo
    for (i in arreglo2.indices) {
        print("Ingrese elemento para el segundo arreglo:")
        arreglo2[i] = readln().toInt()
    }

    // Sumar los arreglos
    for (i in arreglo1.indices) {
        sumaArreglos[i] = arreglo1[i] + arreglo2[i]
    }

    println("Resultado de la suma de los dos arreglos:")
    for (elemento in sumaArreglos) {
        println(elemento)
    }
