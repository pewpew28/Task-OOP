
fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    var number = mutableListOf<Int>()
    for (x in 1..100){
        if (x % 2 == 0){
            number.add(x)
        }
    }
    println(number)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini
    */
    var bulan = mutableMapOf<String,String>()
    bulan.put("jan","Januari")
    bulan.put("feb","Februari")
    bulan.put("mar","Maret")
    bulan.put("apr","April")
    bulan.put("mei","Mei")
    bulan.put("jun","Juni")
    bulan.put("jul","Juli")
    bulan.put("aug","Agustus")
    bulan.put("sep","September")
    bulan.put("okt","Oktober")
    bulan.put("nov","November")
    bulan.put("des","Desember")
    /**
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    // Buat di bawah sini

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    bulan.forEach{(key, value)->
        println("$key -> $value")

    }

}