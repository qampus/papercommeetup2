fun main(args: Array<String>) {
    /* when itu sama dengan switch di C* */

    print("Silakan masukkan usia: ")

    var usia = readLine()!!.toInt()

    when (usia) {
        10 -> println("Usia 10")
        15 -> println("Usia 15")
        20 -> println("Usia 20")

        else -> {
            println("Tidak ada yang cocok")
        }
    }
}