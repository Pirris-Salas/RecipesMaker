package model

class CategoriaLeche(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>):
        Category(name, list, generalList){

    /**
     * CONSTRUCTOR SECUNDARIO - UNA VEZ INICIALIZADO EL CONSTRUCTOR PRIMARIO DE LA CLASE Y EL DE LA SUPER CLASE CATEGORY
     * ACÁ AGREGAMOS LOS PRODUCTOS DE LA CATEGORÍA LECHE
     */
    init {
        list.add(Ingrediente("Leche de vaca descremada", "ml"))
        list.add(Ingrediente("Leche evaporada", "ml"))
        list.add(Ingrediente("Leche condensada", "ml"))
        list.add(Ingrediente("Leche de cabra", "ml"))
        list.add(Ingrediente("Yogurt", "ml"))
        list.add(Ingrediente("Mantequilla", "gramos"))
        list.add(Ingrediente("Queso", "gramos"))
    }

    override fun ingredienteList(): Unit {
        return super.ingredienteList()
    }

    override fun toString(): String {
        return super.toString()
    }
}