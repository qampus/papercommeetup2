class Mobil(merek: String, warna: String, tahun: Int) {

    protected var merek: String? = null
    var warna: String? = null
    var tahun: Int? = null

    //untuk inisialisasi dan pas parameter
    init {
        this.merek = merek
        this.warna = warna
        this.tahun = tahun

    }
    //get merek
    fun getMrk(): String? {
        return this.merek
    }

    //setter set mrk

    fun setMrk(merek: String){
        this.merek = merek
    }



}

fun main(args: Array<String>) {
    //konstruktor

    var mobilku = Mobil("Honda", "Putih", 2012)

    mobilku.setMrk("Test")

    println("Merek mobilku adalah ${mobilku.getMrk()}")
    println("Warna mobilku adalah ${mobilku.warna}")
    println("Tahun mobilku adalah ${mobilku.tahun}")

}