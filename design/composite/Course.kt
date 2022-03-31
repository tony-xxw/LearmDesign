package design.composite

class Course(val name: String, val price: Double) : CatalogComponent() {

    override fun getName(catalogComponent: CatalogComponent): String {
        return name
    }

    override fun print() {
        println("course: name $name price: $price")
    }

    override fun getPrice(catalogComponent: CatalogComponent): Double {
        return price
    }


}