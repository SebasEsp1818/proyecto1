package funciones_con_unica_expresion

fun superficie(lado1: Int, lado2: Int) = lado1 * lado2

fun main() {
    print("Ingrese el lado de la superficie del rectangulo 1:")
    val lado1 = readln().toInt()
    print("Ingrese el lado de la superficie del rectangulo 1:")
    val lado2 = readln().toInt()
    print("Ingrese el lado de la superficie del rectangulo 2:")
    val lado3 = readln().toInt()
    print("Ingrese el lado de la superficie del rectangulo 2:")
    val lado4 = readln().toInt()
    if (Retornarsuperficie(lado1,lado2) > Retornarsuperficie(lado3, lado4))
        println("El rectangulo 1 tiene mayor superficie")
    else
        println("El rectangulo 2 tiene mayor superficie")

}