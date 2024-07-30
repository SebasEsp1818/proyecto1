package arreglos
import kotlin.ramdom.Ramdom
fun main (){
    val arreglo1:IntArray
    arreglo1 = IntArray(size = 4)
    var arreglo2 = IntArray(size = 4 )
    val arregloSuma = IntArray(size = 4)

    var verArreglo1 ="Arreglo1: "
    var verArreglo2 ="Arreglo2: "
    var verArregloSuma = "ArregloSumado: "
    for (i in 0..arreglo.size - 1){

        arreglo1[i] = Ramdom.nextInt(from:0,until:10)
        arreglo2[i] = Ramdom.nextInt(from:0,until:10)
        arregloSuma[i] = arreglo1[i] + arreglo2[i]

        verArreglo1 += if (i ==arreglo1.lastIndex)
            arreglo1[i] else arreglo1[i].toString() + ","
            verArregloSuma += if (i == arregloSuma.lastIndex)
                arregloSuma[i] else arregloSuma[i].toString()
    }
}