package model

class CategoriaCarne(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>):
                     Category(name, list, generalList){

    /**
     * CONSTRUCTOR SECUNDARIO - UNA VEZ INICIALIZADO EL CONSTRUCTOR PRIMARIO DE LA CLASE Y EL DE LA SUPER CLASE CATEGORY
     * ACÁ AGREGAMOS LOS PRODUCTOS DE LA CATEGORÍA CARNE
     */
    init {
        list.add(Ingrediente("Carne de pollo", "gramos"))
        list.add(Ingrediente("Costillas de cerdo", "gramos"))
        list.add(Ingrediente("Costillas de res", "gramos"))
        list.add(Ingrediente("Posta de cerdo", "gramos"))
        list.add(Ingrediente("Posta de res", "gramos"))
        list.add(Ingrediente("Filet de pescado", "gramos"))
        list.add(Ingrediente("Camarones", "gramos"))
    }

    override fun ingredienteList() :Unit{
        super.ingredienteList()
    }

    override fun toString(): String {
        return super.toString()
    }

}