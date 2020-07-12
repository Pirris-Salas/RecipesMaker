import java.lang.NumberFormatException

fun main() {

    /**
     * ACÁ EMPEZAMOS CON EL RETO 2
     * Agregamos Un doWhile para las opciones 1 y 2 dentro de When, es decir agregamos bucles anidados
     * Agregamos 2 menu, cada uno para las opciones 1 y 2 respectivamente
     * Agregamos un método de validación para capturar cadenas vacías, números fuera del margen de opciones y letras
     */


    volver@do {
        println("\n\n:: Bienvenido a Recipe Maker ::")
        println()
        println("Presiona el número acorde a lo que desea realizar")
        println("***")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")

        var valor: String? = readLine() // Toma el valor que digita o no el cliente, valor entero

            /**
             * Acá agregamos un ciclo dentro de otro ciclo, apoyado de diferentes funciones. Entre ellas están
             * @makeRecipe Función asignada si el cliente presiona la tecla 1
             * @viewRecipe Funcion asignada si el cliente presiona la tecla 2
             * Para cada uno de estos ciclos se les asignó una tecla de salida o retorno al menu principal
             */
            when (fielvalidation(valor)) {

                //AGREGAR RECETAS
                in 1..1 -> do {
                    println(makeRecipe())
                    var value: String? = readLine()
                    when(fielvalidation(value)){
                        else -> println("Sitio en construcción, favor digitar el número 0 para regresar al menú principal")
                    }
                }while (fielvalidation(value) != 0)

                //VER RECETAS
                in 2..2 -> do {
                    print(viewRecipe())
                    val value: String? = readLine()
                    when(fielvalidation(value)){
                        else -> println("Sitio en construcción, favor digitar el número 0 para regresar al menú principal")
                    }
                }while (fielvalidation(value) != 0)

                //SALIR
                in 3..3 -> println("Ha sido un placer. Hasta luego!!")

                //MENSAJE DE VALIDACIÓN
                else -> print("¡Número incorrecto! Favor revisar los números disponibles")
            }


    }while (fielvalidation(valor) != 3)


}

/**
 * Esta función es para mostrar las opciones disponibles si el parametro que se digita en el menu principal es 1
 * Hacer receta
 * @return Párrafo menú
 */
fun makeRecipe(): String{

    val menuOpciones = """
     -------------------------------------------------------   
        *** Hagamos la receta ***
        
     Selecciona por categoría el ingrediente que buscas
     
     1. Agua
     2. Leche
     3. Carne
     4. Verduras
     5. Frutas
     6.Cereal
     7. Huevos
     8. Aceites
     9. Regresar al menú principal
     -------------------------------------------------------   
    """.trimIndent()

    return menuOpciones
}


/**
 * Esta función es para mostrar las opciones disponibles si el parametro que se digita en el menu principal es 2
 * Ver receta
 * @return mensaje, ver receta
 */
fun viewRecipe() : String{

    val mensaje = """
        -------------------------
        | Mis recetas!!          |
        | Sitio en construcción  |
        -------------------------
        Digite 0 para volver al menu principal
    """.trimIndent()

    return mensaje
}

/**
 * Esta funcion es para validar los datos del usuario mediante la obtención de la cadena readline() y la eventual
 * conversión a número entero
 * En caso de que la consola arroje una excepción, la función retorna el número 1000
 * @param
 */
fun fielvalidation (value: String?): Int?{

    var retorno: Int? = null

    try {
      retorno = value?.toInt()
    }catch (e: NumberFormatException){
        retorno = 1000
    }
    return retorno
}