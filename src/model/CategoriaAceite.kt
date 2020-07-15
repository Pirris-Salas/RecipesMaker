package model

class CategoriaAceite(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>):
        Category(name, list, generalList){

    /**
     * CONSTRUCTOR SECUNDARIO - UNA VEZ INICIALIZADO EL CONSTRUCTOR PRIMARIO DE LA CLASE Y EL DE LA SUPER CLASE CATEGORY
     * ACÁ AGREGAMOS LOS PRODUCTOS DE LA CATEGORÍA ACEITES
     */
    init {
        list.add(Ingrediente("Aceite de maíz", "ml"))
        list.add(Ingrediente("Aceite de girasol", "ml"))
        list.add(Ingrediente("Aceite de oliva", "ml"))
        list.add(Ingrediente("Aceite de linaza", "ml"))
    }

    override fun ingredienteList(): Unit {
        return super.ingredienteList()
    }

    override fun toString(): String {
        return super.toString()
    }
}