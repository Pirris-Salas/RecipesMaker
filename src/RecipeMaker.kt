import model.*
import java.lang.NumberFormatException


fun main() {

    /**
     * ACÁ EMPEZAMOS CON EL RETO 4
     * Utilizamos vectores llamados MutableList, uno para listas de ingredientes y otro para listas de recetas
     * asignamos validaciones mediante try and catch
     *
     */

    var exit = 1
    var selectedIngList: MutableList<Ingrediente> = mutableListOf()
    var recetasList: MutableList<Receta> = mutableListOf()
    var aguaList: MutableList<Ingrediente> = mutableListOf()
    var aceiteList: MutableList<Ingrediente> = mutableListOf()
    var lacteosList: MutableList<Ingrediente> = mutableListOf()
    var carnesList: MutableList<Ingrediente> = mutableListOf()
    var verdurasList: MutableList<Ingrediente> = mutableListOf()
    var frutasList: MutableList<Ingrediente> = mutableListOf()
    var cerealList:MutableList<Ingrediente> = mutableListOf()
    var huevosList: MutableList<Ingrediente> = mutableListOf()

    volver@do {
        println("""
            
            |:: Bienvenido a Recipe Maker ::                   |
            |--------------------------------------------------|
            |Presiona el número acorde a lo que desea realizar |
            |++++++++++++++++++++++++++++++++++++++++++++++++++|
            | 1. Hacer una receta.                             |
            | 2. Ver mis recetas.                              |
            | 3. Salir                                         |
            
        """.trimIndent())

        var valor: String? = readLine() // Toma el valor que digita o no el cliente, valor entero

            /**
             * Acá agregamos un ciclo dentro de otro ciclo, apoyado de diferentes funciones. Entre ellas están
             * @makeRecipe Función asignada si el cliente presiona la tecla 1
             * @viewRecipe Funcion asignada si el cliente presiona la tecla 2
             * Para cada uno de estos ciclos se les asignó una tecla de salida o retorno al menu principal
             */
            when (fielvalidation(valor)) {

                //AGREGAR RECETAS
                in 1..1 ->
                    ingredientes@ do {
                        println(makeRecipe())
                        var value: String? = readLine()

                        when (fielvalidation(value)) {

                            1 -> CategoriaAgua("Agua", aguaList, selectedIngList).ingredienteList()
                            2 -> CategoriaLeche("Leche", lacteosList, selectedIngList).ingredienteList()
                            3 -> CategoriaCarne("Carne", carnesList, selectedIngList).ingredienteList()
                            4 -> CategoriaVerduras("Verduras", verdurasList, selectedIngList).ingredienteList()
                            5 -> CategoriaFrutas("Frutas", frutasList, selectedIngList).ingredienteList()
                            6 -> CategoriaCereal("Cereal", cerealList, selectedIngList).ingredienteList()
                            7 -> CategoriaHuevos("Huevos", huevosList, selectedIngList).ingredienteList()
                            8 -> CategoriaAceite("Aceites", aceiteList, selectedIngList).ingredienteList()
                            0 -> {
                                println("""
                        
                        Antes de finalizar, ¿qué nombre le quieres dar a esta receta?
                    """.trimIndent())
                                var recipeName: String? = readLine().toString()
                                recetasList.add(Receta(recipeName!!, selectedIngList))
                                println("""
                        
                        Receta ingresada de manera exitosa!
                    """.trimIndent())
                                selectedIngList.clear()

                                continue@volver}
                            else -> println("Número incorrecto, favor seleccionar un número de la lista")
                        }

                    } while (fielvalidation(value) != 0)


                //VER RECETAS
                in 2..2 -> {
                    if (recetasList.isEmpty()){
                        println("""
                            
                            |-------------------------------------------------------   
                            |              *** Mis Recetas ***
                            |
                            | Ingresa nuevamente cuando hayas ingresado una receta
                            |-------------------------------------------------------
                            
                            
                        """.trimIndent())
                    }else{
                        if (recetasList.size > 1){
                            println("""
                            
                            |-------------------------------------------------------   
                            |              *** Mis Recetas ***
                            |
                            | Selecciona la receta que te gustaría acceder
                            |-------------------------------------------------------
                            
                            
                        """.trimIndent())

                        var aux = 1
                        again@for (recipe in recetasList){
                            println("$aux. ${recipe.name}")
                            aux++
                        }
                        var userResponse: Int?
                        try {
                            userResponse = readLine()?.toInt()
                        }catch (e: NumberFormatException){
                            userResponse = 1
                        }
                            if (userResponse!! <= recetasList.size.minus(recetasList.size.plus(1))){
                                println("Has ingresado una receta que no existe, te redirigiremos a la ultima receta" +
                                        "disponible")
                                println("${recetasList.last().name}")
                                print("${recetasList.last().read()}")
                            }
                            if (userResponse -1 !!>= recetasList.size && userResponse <= recetasList.size) {

                                println("A continuación su receta:")
                                println("${recetasList.last().name}")
                                print("${recetasList.last().read()}")
                            }
                            if (userResponse == 0 || userResponse > recetasList.size) {

                                println("Número incorrecto, no aparece entre las recetas disponibles." +
                                        "Favor inténtelo de nuevo")

                            }
                            else{
                                println("La receta seleccionada es: ${recetasList.get(userResponse-1).name}")
                                println("${recetasList.get(userResponse-1).read()}")
                            }
                    }else{
                            println("""

                            |-------------------------------------------------------   
                            |              *** Mis Recetas ***
                            |
                            | Solo has accedido 1 receta, te redirigiremos a ella
                            |-------------------------------------------------------

                            """.trimIndent())
                            println("${recetasList.last().name}")
                            println("${recetasList.last().read()}")

                            println("${recetasList.size.minus(recetasList.size.plus(1))}")
                        }





                    }

                }
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
    var userRes: Int? = -1

    val menuOpciones = """
        
     -------------------------------------------------------   
        *** Hagamos la receta ***
        
     Selecciona el número acorde a la categoría que buscas
     
     1. Agua
     2. Leche
     3. Carne
     4. Verduras
     5. Frutas
     6. Cereal
     7. Huevos
     8. Aceites
     0. Regresar al menú principal
     -------------------------------------------------------   
     
    """.trimIndent()

    return menuOpciones
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