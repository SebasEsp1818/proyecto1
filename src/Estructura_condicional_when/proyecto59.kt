package Estructura_condicional_when
fun main () {
    print("Ingrese cordenada x del punto:")
    val x = readln().toInt()
    print("Ingrese cordenada y del punto:")
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println("Primer cuadrante")
        x < 0 && y > 0 -> println("Segundo cuadrante")
        x < 0 && y < 0 -> println("Tercer  cuadrante")
        x > 0 && y < 0 -> println("Primer cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}
