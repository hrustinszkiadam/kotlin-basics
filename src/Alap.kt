class Alap {
    fun elso() {
        print("Add meg a neved: ")
        var nev: String = readln()

        while (true) {
            if(nev.isNotEmpty()) break

            print("Próbáld újra: ")
            nev = readln()
        }

        println("Hello, $nev!")
    }

    fun masodik() {
        print("Adj meg egy számot: ")
        var szam: Int

        while (true) {
            try {
                szam = readln().toInt()
                break
            } catch (e: NumberFormatException) {
                print("Ez nem egy szám! Próbáld újra: ")
            }
        }

        if (szam % 2 == 0) {
            println("Páros")
        } else {
            println("Páratlan")
        }
    }
}