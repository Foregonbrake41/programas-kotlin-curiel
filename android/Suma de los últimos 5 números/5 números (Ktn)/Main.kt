fun main(){
    for (i in 1..5){
        getValidNumber("Ingresa el número $i:")
        //jijiji 
    }
    var suma = 0.0
    for (i in 6..10){
        val input = getValidNumber("Ingresa el número $i:")
        suma += input;
    }
    
    println("La suma de los últimos 5 números es: $suma")
}

fun getValidNumber(mensaje:String):Double{
    while(true){
        println(mensaje)
        val input = readln()
        try{
            return input.toDouble()
        }
        catch (e:NumberFormatException){
            println("Error: Ingresa un número válido\n\n")
        }
    }
}