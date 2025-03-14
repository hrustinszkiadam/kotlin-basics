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
}