package funciones_con_retorno
fun retornarPerimetro(ladop: Int): Int {
    val peri = ladop + ladop + ladop + ladop
    return peri
}
fun main() {
    print("Ingrese el valor del lado del cuadrado:")
    val lado = readln().toInt()
    val perimetro = retornarPerimetro(lado)
    println("La superficie del cuadrado es $perimetro")
}
