package funciones_con_unica_expresion

fun Perimetro(lado: Int) = lado * 4

fun main(){
    print("Ingrese el lado del cuadrado:")
    val lado = readln().toInt()
    println("El perimetro es de ${Perimetro(lado)} ")
}