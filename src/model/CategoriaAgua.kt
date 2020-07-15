package model

class CategoriaAgua (name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>) :
                     Category(name, list, generalList){

    /**
     * CONSTRUCTOR SECUNDARIO - UNA VEZ INICIALIZADO EL CONSTRUCTOR PRIMARIO DE LA CLASE Y EL DE LA SUPER CLASE CATEGORY
     * ACÁ AGREGAMOS LOS PRODUCTOS DE LA CATEGORÍA AGUA
     */
    init {
        list.add(Ingrediente("Agua", "ml"))
        list.add(Ingrediente("Agua fría", "ml"))
        list.add(Ingrediente("Agua hirviendo", "ml"))
        list.add(Ingrediente("Agua del grifo", "ml"))
    }

    override fun ingredienteList() : Unit{
        return super.ingredienteList()
    }

    override fun toString(): String {
        return super.toString()
    }

}