package model

class CategoriaCereal(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>):
        Category(name, list, generalList){

    /**
     * CONSTRUCTOR SECUNDARIO - UNA VEZ INICIALIZADO EL CONSTRUCTOR PRIMARIO DE LA CLASE Y EL DE LA SUPER CLASE CATEGORY
     * ACÁ AGREGAMOS LOS PRODUCTOS DE LA CATEGORÍA CEREAL
     */
    init {
        list.add(Ingrediente("Arroz", "gramos"))
        list.add(Ingrediente("Lentejas", "gramos"))
        list.add(Ingrediente("Garbanzos", "gramos"))
        list.add(Ingrediente("Avenas", "gramos"))
        list.add(Ingrediente("Maíz", "gramos"))

    }

    override fun ingredienteList() :Unit{
        super.ingredienteList()
    }

    override fun toString(): String {
        return super.toString()
    }

}