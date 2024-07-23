package parametros
fun identifica(clave1: String, clave2: String) {
    if (clave1 == clave2)
        println("Cleves elemento")
    else
        print("Claves distintas")

}


fun main() {
    print("Ingrese la primer clave:")
    val clave1 = readln()
    print("Ingrese la segunda clave:")
    val clave2 = readln()
    identifica(clave1, clave2)
    }
