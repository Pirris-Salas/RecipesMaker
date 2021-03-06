package model

open class Ingrediente(var name: String, var unidadMedida: String){

    var cantidad: Int = 0
    set(value){
        if (value <= 0)
            field = 1
        else{
            field = value
        }
    }

    override fun toString(): String {
        return "ingrediente selecionado es: $name y la cantidad seleccionada es de $cantidad $unidadMedida"
    }
}