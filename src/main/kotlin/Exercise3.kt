fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini
    var result:String? = null
    val nilai = 50
    if (nilai >= 90){
        result = "Selamat! Anda Mendapat nilai A"
        result
    }else if (nilai>=80 && nilai <90){
        result = "Anda Mendapat nilai B"
        result
    }else if (nilai>=70 && nilai <80){
        result = "Anda Mendapat nilai C"
        result
    }else if (nilai>=60 && nilai <=69){
        result = "Anda Mendapat nilai D"
        result
    }else{
        result = "Anda Mendapat nilai E"
        result
    }
    print(result)
}