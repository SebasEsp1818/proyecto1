package arreglos

fun main (){
val sueldos: IntArray
sueldos = IntArray(size =:5)
//cargadesuselemtospotteclado
for (i in 0..4){
    print("Ingrese sueldo:")
    sueldos[i] = readln().toInt()
    }
//impresion de sus elementos
for(i in 0..4){
println(sueldos[i])
}





}