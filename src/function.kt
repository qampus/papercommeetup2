fun main(args: Array<String>) {
    add()
    penambahan(4, 5)
    penambahan(6, 7)

    //sama aja 2*3
    println("Hasil perkalian adalah ${perkalian(10, 3)}")
}

//function tanpa parameter dan juga tanpa return
fun add() {
    println("Hahah")
}

//fuction dengan parameter tanpa return
fun penambahan(angka1: Int, angka2: Int) {
    println("$angka1 + $angka2 = ${angka1 + angka2}")
}

//with parameter and return
fun perkalian(angkaA: Int, angkaB: Int): Int {

    //rumus nya di tulis di sini
    var hasil = angkaA * angkaB
    return hasil
}
