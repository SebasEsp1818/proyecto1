fun main() {
/*
 print("ngrese la primera nota")
    val nota1: Int = readln().toInt()
print("Ingrese la segunda nota:")
    val nota2: Int = readln().toInt()
val nota3: Int = readln().toInt()

val promedio = (nota1 + nota2 + nota3) / 3
if (promedio >= 7)
    print("Promocionado")
else
if (promedio >= 4 )
print("Regular")
else
    print("Reprobado")
*/
/*
  print("ngrese la primera nota")
    val nota1: Int = readln().toInt()
print("Ingrese la segunda nota:")
    val nota2: Int = readln().toInt()
val nota3: Int = readln().toInt()

val promedio = (nota1 + nota2 + nota3) / 3
val estado = if(promedio >= 7) "Promocionado"
else if (promedio >= 4) "Regular"else "Reprobado
print("Estado del alumno $estado")
*/
    /*
    print("Ingrese un numero:")
    val num1: Int = readln().toInt()
    print("Ingrese un segundo numero:")
    val num2: Int = readln().toInt()
    print("Ingrese un tercer numero")
    val num3: Int = readln().toInt()
    if (num1 > num2)
    if(num1  > num3)
    println("El numero mayor es : "  + num1)
else if(num3  > num2)
print("El  numero mayor es :" + num3)
    else if(num1  > num2)
print("El numero mayor es :" + num3)
*/
    print("Ingrese cantidad de total de preguntas:")
    val cantidad1 =  readln().toInt()
    print("Ingrese cantidad de pregunats contestadas correctamente:")
    val cantidad2 = readln().toInt()
    val promedio  : Float = cantidad2/cantidad1.toFloat()
    if (promedio >= 0.9)
        print ("Nivel máximo")
    if(promedio >= 0.75 && promedio < 0.9)
        print("Nivel medio")
    if(promedio >= 0.50 && promedio< 0.75)
        print("Nivel regular")
    else
        print("Fuera de nivel")



}
