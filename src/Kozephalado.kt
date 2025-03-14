class Kozephalado {
    fun elso(num1: Int, num2: Int): Int {
        return if (num1 > num2) num1 else num2
    }

    //masodik
    inner class Person(private val name: String, private val age: Int) {
        fun printInfo() {
            println("Név: $name, Életkor: $age")
        }
    }

    fun harmadik(numbers: List<Int>): Int {
        return numbers.max()
    }
}