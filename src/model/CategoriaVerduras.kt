package model

class CategoriaVerduras(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>):
        Category(name, list, generalList){

    /**
     * CONSTRUCTOR SECUNDARIO - UNA VEZ INICIALIZADO EL CONSTRUCTOR PRIMARIO DE LA CLASE Y EL DE LA SUPER CLASE CATEGORY
     * ACÁ AGREGAMOS LOS PRODUCTOS DE LA CATEGORÍA VERDURAS
     */
    init {
        list.add(Ingrediente("Arroz", "gramos"))
        list.add(Ingrediente("Frijoles", "gramos"))
        list.add(Ingrediente("Papa", "gramos"))
        list.add(Ingrediente("Platano", "gramos"))
        list.add(Ingrediente("Berenjena", "gramos"))
        list.add(Ingrediente("Culantro", "gramos"))
        list.add(Ingrediente("Chile", "gramos"))
        list.add(Ingrediente("Cebolla", "gramos"))
        list.add(Ingrediente("Brocoli", "gramos"))
        list.add(Ingrediente("Coliflor", "gramos"))
        list.add(Ingrediente("Zanahoria", "gramos"))
    }

    override fun ingredienteList() :Unit{
        super.ingredienteList()
    }

    override fun toString(): String {
        return super.toString()
    }

}