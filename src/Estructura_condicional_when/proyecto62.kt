package Estructura_condicional_when

fun main(){
    var total = 0
    for(i in 1..10){
        print("ingrese sueldo del operario:")
        var sueldo = readln().toInt()
        total += when {
            sueldo > 5000 -> {
                println("sueldo alto")
                sueldo
            }
            sueldo >2000 ->{
                println("Sueldo medio")
                0
            }
            else -> {
                println("Sueldo bajo")
                0
            }
        }
    }
    println("Gastos totales en sueldos altos :$total")
}