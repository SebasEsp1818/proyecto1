package Conceptos_POO

class Alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar() {
        print("Ingrese el nombre del alumno: ")
        nombre = readln().toInt()
        print("Ingrese la nota del alumno: ")
        nota = readln().toInt()
    }

    fun imprimir() {
        println("Nombre: $nombre")
        println("Nota: $nota")
    }

    fun esRegular() {
        if (nota >= 4) {
            println("El alumno $nombre está regular.")
        } else {
            println("El alumno $nombre no está regular.")
        }
    }
}

fun main() {
    val alumno1 = Alumno()
    val alumno2 = Alumno()

    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.esRegular()

    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.esRegular()
}