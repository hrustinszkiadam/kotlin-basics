fun main() {
    val alap = Alap()
    alap.elso()
    alap.masodik()
    alap.harmadik()
    alap.negyedik()
    alap.otodik()

    val kozephalado = Kozephalado()
    println(kozephalado.elso(5, 10)) // 10
    val alice = kozephalado.Person("Alice", 25)
    alice.printInfo() // Név: Alice, Életkor: 25
    println(kozephalado.harmadik(listOf(1, 3, 2, 5, 4))) // 5
    println(kozephalado.negyedik("level")) // true
    println(kozephalado.otodik("courage")) // 4

    val halado = Halado()
    val book = halado.Book("A kis herceg", "Antoine de Saint-Exupéry")
    book.printInfo()
}