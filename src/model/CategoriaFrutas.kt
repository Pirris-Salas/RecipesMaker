package model

class CategoriaFrutas(name: String, list: MutableList<Ingrediente>, generalList: MutableList<Ingrediente>):
        Category(name, list, generalList){

    /**
     * CONSTRUCTOR SECUNDARIO - UNA VEZ INICIALIZADO EL CONSTRUCTOR PRIMARIO DE LA CLASE Y EL DE LA SUPER CLASE CATEGORY
     * ACÁ AGREGAMOS LOS PRODUCTOS DE LA CATEGORÍA FRUTAS
     */
    init {
        list.add(Ingrediente("Papaya", "gramos"))
        list.add(Ingrediente("Limon", "gramos"))
        list.add(Ingrediente("Banana", "gramos"))
        list.add(Ingrediente("Melón", "gramos"))
        list.add(Ingrediente("Sandía", "gramos"))
        list.add(Ingrediente("Pitaya", "gramos"))
        list.add(Ingrediente("Manzana", "gramos"))
    }

    override fun ingredienteList() :Unit{
        super.ingredienteList()
    }

    override fun toString(): String {
        return super.toString()
    }

}