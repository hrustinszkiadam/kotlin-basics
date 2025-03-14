fun main() {
    // Alap feladatok
    val alap = Alap()

    alap.elso()
    alap.masodik()
    alap.harmadik()
    alap.negyedik()
    alap.otodik()

    // Középhaladó feladatok
    val kozephalado = Kozephalado()

    // első
    println(kozephalado.elso(5, 10)) // 10

    // második
    val alice = kozephalado.Person("Alice", 25)
    alice.printInfo() // Név: Alice, Életkor: 25

    // harmadik
    println(kozephalado.harmadik(listOf(1, 3, 2, 5, 4))) // 5

    // negyedik
    println(kozephalado.negyedik("level")) // true

    // ötödik
    println(kozephalado.otodik("courage")) // 4

    // Haladó feladatok
    val halado = Halado()

    // első
    val book = halado.Book("A kis herceg", "Antoine de Saint-Exupéry")
    book.printInfo()

    // második
    val products = halado.Products(mutableListOf("alma", "körte", "szilva"))
    products.addProduct("narancs")
    products.removeProduct("körte")
    products.listProducts() // Termékek: alma, szilva, narancs,

    // harmadik
    println(halado.harmadik("A kotlin egy modern programozási nyelv")) // programozási

    // negyedik
    val counter = halado.Counter()
    counter.increment()
    counter.increment()
    counter.increment()
    counter.decrement()
    println(counter.getValue()) // 2

    // ötödik
    println(halado.otodik()) // [alma, körte, szilva] 1 sec után
}