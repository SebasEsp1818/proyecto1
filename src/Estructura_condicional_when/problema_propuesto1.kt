package Estructura_condicional_when

fun main (){
    //Se ingresa por teclado un valor entero,mostrar una leyenda por pantalla que
    //indique si el numero es positivo, nulo o negativo.
    print("Ingrese un valor:")
    val num = readln().toInt()
when {
    num > 0 -> println("El valor es positivo")
    num < 0 -> println("El valor es negativo")
    else -> println("El valor es nulo")
    }
}