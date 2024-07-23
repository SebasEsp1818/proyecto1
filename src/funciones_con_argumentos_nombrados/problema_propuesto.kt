package funciones_con_argumentos_nombrados

fun tabla(numero: Int, terminos: Int = 10) {
    for (i in 1..terminos) {
        println("$numero x $i = ${numero * i}")
    }
}

fun main() {
    tabla(numero = 3, terminos = 10)
}