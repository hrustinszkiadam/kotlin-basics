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
}