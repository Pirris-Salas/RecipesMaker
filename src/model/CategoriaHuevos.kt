package model

class CategoriaHuevos(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>):
        Category(name, list, generalList){

    /**
     * CONSTRUCTOR SECUNDARIO - UNA VEZ INICIALIZADO EL CONSTRUCTOR PRIMARIO DE LA CLASE Y EL DE LA SUPER CLASE CATEGORY
     * ACÁ AGREGAMOS LOS PRODUCTOS DE LA CATEGORÍA HUEVOS
     */
    init {
        list.add(Ingrediente("Huevos de gallina", "unidad/es"))
        list.add(Ingrediente("Huevos de Pato", "unidad/es"))
        list.add(Ingrediente("Huevos de codorniz", "unidad/es"))
        list.add(Ingrediente("Huevos de avestruz", "unidad/es"))
        list.add(Ingrediente("Huevos de salmón", "unidad/es"))
        
    }

    override fun ingredienteList() :Unit{
        super.ingredienteList()
    }

    override fun toString(): String {
        return super.toString()
    }

}