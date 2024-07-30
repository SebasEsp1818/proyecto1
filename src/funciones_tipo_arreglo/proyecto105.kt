package funciones_tipo_arreglo

fun cargar(){
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
}

fun imprime() {
 for(elemento in arreglo)
     println(elemento)
    }
fun main(){
val arre = IntArray(5)
cargar(arre)
imprimir(arre)


}
