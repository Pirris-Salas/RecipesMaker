fun main() {

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
         * Filtro para verificar si la cadena valor viene vacía o no
         * Si no está vacía continúa con la validación
         */
        if (valor != ""){

            /**
             * Convierte la variable valor a entero mediante el operador elvis, no sin antes de asegurarnos que la cadena
             * valor no venga vacía
             */
            val respuesta = valor!!.toInt() ?: valor!!.toInt()

            when (respuesta) {
                in 1..1 -> println("Procederemos a crear una receta")
                in 2..2 -> print("Veamos si recuerdo ¿dónde guardé las recetas? ;)")
                in 3..3 -> println("Ha sido un placer. Hasta luego!!")
                else -> print("Número incorrecto, favor revisar los números disponibles")
            }}
        /**
         * Si la cadena viene vacía, se le asigna el valor de 0 y se regresa al inicio mediante el label @volver
         * */
        else {
            valor = "0"
            println("Por favor, presione un número")
            continue@volver

        }


    }while (valor?.toInt() != 3)



}