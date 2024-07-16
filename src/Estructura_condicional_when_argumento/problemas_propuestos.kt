package Estructura_condicional_when_argumento

fun main(){
   var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    var cant4 = 0
    for(i in 1..10){
        print("Ingrese la cantidad de hijos")
        val valor = readln().toInt()
        when (valor){
            0 -> cant1++
            1 -> cant2++
            2 -> cant3++
            else -> cant4++

            }
    }
    println("padres con 0 hijos: $cant1")
    println("padres con 1 hijos: $cant2")
    println("padres con 3 hijos: $cant3")
    println("padres con mas de 2 hijos: $cant4")
}