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

    fun negyedik(text: String): Boolean {
        return text.reversed() == text
    }

    fun otodik(text: String): Int {
        val vowels = "aeiou"
        return text.count { vowels.contains(it) }
    }
}