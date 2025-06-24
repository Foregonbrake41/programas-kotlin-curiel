fun main(){
    var cal = 0.0
    for(i in 1..5){
        cal += getValidNumber("Ingresa la calificación $i:");
    }
    val prom = cal/5
    println("El promedio es: $prom")
}

fun getValidNumber(mensaje:String):Double{
    while(true){
        println(mensaje)
        val input = readln()
        try{
            return input.toDouble()
        }
        catch (e:NumberFormatException){
            println("Error: Ingresa un número válido\n\n\n\n\n\n")
        }
    }
}