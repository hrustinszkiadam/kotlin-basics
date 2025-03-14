class Halado {
    // elso
    inner class Book(private val title: String, private val author: String) {
        fun printInfo() {
            println("Cím: $title, Szerző: $author")
        }
    }
}