class Alap {
    private fun getString(): String {
        print("Add meg a neved: ")
        var str: String = readln()

        while (true) {
            if(str.isNotEmpty()) break

            print("Próbáld újra: ")
            str = readln()
        }

        return str
    }

    private fun getInt(): Int {
        print("Adj meg egy egész számot: ")
        var num: Int

        while (true) {
            try {
                num = readln().toInt()
                break
            } catch (e: NumberFormatException) {
                print("Ez nem egy szám! Próbáld újra: ")
            }
        }

        return num
    }

    fun elso() {
        val nev: String = getString()
        println("Hello, $nev!")
    }

    fun masodik() {
        val szam: Int = getInt()

        if (szam % 2 == 0) {
            println("Páros")
        } else {
            println("Páratlan")
        }
    }

    fun harmadik() {
        val szam: Int = getInt()

        for (i in 1..szam) {
            print("$i ")
        }
        println()
    }

    fun negyedik() {
        val szam: Int = getInt()

        var sum = 0
        for (i in 1..szam) {
            sum += i
        }

        println(sum)
    }

    fun otodik() {
        val nevek = listOf("Józsi", "Pista", "Géza", "Béla", "Józsi", "Pista", "Géza", "Béla")
        for (nev in nevek) {
            println(nev)
        }
    }
}