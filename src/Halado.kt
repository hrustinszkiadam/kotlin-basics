class Halado {
    // elso
    inner class Book(private val title: String, private val author: String) {
        fun printInfo() {
            println("Cím: $title, Szerző: $author")
        }
    }

    // masodik
    inner class Products(products: MutableList<String>? = null) {
        private val productList = products ?: mutableListOf()

        fun addProduct(product: String) {
            if(product.isEmpty()) {
                println("A termék neve nem lehet üres!")
                return
            }
            if(productList.contains(product)) {
                println("A(z) $product már szerepel a listában!")
                return
            }
            productList.add(product)
        }

        fun removeProduct(product: String) {
            if(product.isEmpty()) {
                println("A termék neve nem lehet üres!")
                return
            }
            if(!productList.contains(product)) {
                println("A(z) $product nem szerepel a listában!")
                return
            }
            productList.remove(product)
        }

        fun listProducts() {
            if(productList.isEmpty()) return
            print("Termékek: ")
            productList.forEach { print("$it, ") }
            println()
        }
    }
}