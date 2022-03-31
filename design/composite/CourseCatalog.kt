package design.composite

class CourseCatalog(val name: String, val level: Int) : CatalogComponent() {
    val items = mutableListOf<CatalogComponent>()

    override fun add(catalogComponent: CatalogComponent) {
        items.add(catalogComponent)
    }

    override fun remove(catalogComponent: CatalogComponent) {
        items.remove(catalogComponent)
    }

    override fun print() {
        println("目录: $name")
        items.forEach {
            level.let {
                for (i in 2..level) {
                    print("  ")
                }
            }
            it.print()
        }
    }
}