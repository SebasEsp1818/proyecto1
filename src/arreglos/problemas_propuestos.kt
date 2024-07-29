package arreglos

fun main (){
    //Problema1

    val arreglo = IntArray(8)

    // Cargar el arreglo
    for (i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }

    var acumuladoTotal = 0
    var acumuladoMayores36 = 0
    var cantidadMayores50 = 0

    // Analizar el arreglo
    for (elemento in arreglo) {
        acumuladoTotal += elemento
        if (elemento > 36) {
            acumuladoMayores36 += elemento
        }
        if (elemento > 50) {
            cantidadMayores50++
        }
    }

    println("Valor acumulado de todos los elementos: $acumuladoTotal")
    println("Valor acumulado de los elementos mayores a 36: $acumuladoMayores36")
    println("Cantidad de valores mayores a 50: $cantidadMayores50")
}



}


















}