package funciones_con_retorno
fun retornarPromedio(v1: Int, v2: Int, v3: Int): Int {
    val prom = (v1 + v2 + v3) / 3
    return prom
}

fun main() {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("INgrese segundo valor:")
    val valor2 = readln().toInt()
    print("INgrese tercer valor:")
    val valor3 = readln().toInt()
    println("El valor promedio es: ${retornarPromedio(valor1, valor2, valor3)}")

}
