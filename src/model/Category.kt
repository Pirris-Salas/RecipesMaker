package model

import java.lang.NumberFormatException

abstract class Category(var name: String, var list: MutableList<Ingrediente>, var generalList: MutableList<Ingrediente>){

    open fun ingredienteList() :Unit{
        var finished = false //Variable para terminar el ciclo sin importar la categoría
        do { //ciclo para recorrer la lista de ingredientes al menos una vez
            var aux: Int = 0 // Indice del array
            for (ing in this.list){
                println("${aux+1}. ${ing.name}")
                aux++
            }
            println("""
                
                       Ingrese el número acorde al ingrediente de la lista.
                       Presione 0 si desea regresar al menú principal.
                    """.trimIndent())

            //capturando los datos del usuario
            var auxUserRes: Int?
            try {
                auxUserRes = readLine()?.toInt()
            }catch (e: NumberFormatException){
                auxUserRes = -11
            }

            var userRes = auxUserRes!!
            if (userRes > 0){
                generalList.add(list.get(userRes-1)) //añadiendo la respuesta del usuario al array general de la receta
            }else if (userRes <= 0){
                finished = true
                break
            }
            //Declarando la respuesta del usuario a la cantidad del ingrediente seleccionado y ver si
            // el usuario quiere cambiar la unidad de medida por default del objeto
            println("""
                       Ahora debemos asignar una cantidad al ingrediente.
                       La unidad de medida del ${list.get(userRes-1)}, unidad de medida: ${list.get(userRes-1).unidadMedida}.
                       Si desea cambiar la unidad de medida, favor escribir cambiar.
                       De lo contrario, favor asignar la cantidad en ${list.get(userRes-1).unidadMedida}.
                       
                    """.trimIndent())
           var userResCantidad = readLine()

            if (userResCantidad?.toLowerCase().equals("cambiar")){
                println("Ingrese la unidad de medida deseada") //Capturando la nueva unidad de medida
                var unidadMedidaDeseada = readLine()
                list.get(userRes-1).unidadMedida = unidadMedidaDeseada!! // Se reemplaza la unidad de medida a través de
                //el método get hacia el array y se iguala a la unidad digitada por el usuario
            }

            var finishedUM = false //variable para comprobar si el ciclo do while de cambiar la unidad de medida termine
            if (userResCantidad?.toLowerCase().equals("cambiar")){
                println("""
                    
                       Ahora necesitamos saber la cantidad necesaria del ingrediente.
                       La unidad de medida del ${list.get(userRes-1)}, unidad de medida: ${list.get(userRes-1).unidadMedida}.
                    """.trimIndent())
                userResCantidad = readLine()
            }
            do {
                try{
                    list.get(userRes-1).cantidad = userResCantidad?.toInt()!! //intentando declarar la cantidad
                }catch (e: NumberFormatException){
                    println("Unidad de medida incorrecta. Ha ocurrido un error")
                    //si el usuario ingresa cualquier otro string que salte un mensaje de error,
                    // haciendolo por el ciclo que tenga que ingresar la unidad nuevamente
                }
            }while (finishedUM) //verificación del ciclo mediante un True o un False

            //mensaje para que el usuario sepa que ingresó y cuanto
            println("""
Ingrediente: ${list.get(userRes-1).cantidad} ${list.get(userRes-1).unidadMedida} de ${list.get(userRes-1).name} ingresado
¿Desea terminar de añadir ingredientes de esta categoría? (si/no)
            """.trimIndent())
            var userResFinish = readLine()
            if (userResFinish?.toLowerCase().equals("si")){
                finished = true}
            else if (userResFinish?.toLowerCase().equals("no")){
                finished = false
                finished = false //verificación si se desea continuar o salir de una categoría
            }
        }while (!finished)
    }

    override fun toString(): String {
        return "La categoría seleccionada es: $name"
    }

}