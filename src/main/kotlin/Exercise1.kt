/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var frontname:String = "Revangga"
    var backname:String = " Prakusya"
    var fullname:String = frontname+backname
    var age:Int = 20
    var a:Boolean = false


    println("My name is $fullname\n" +
            "My Age is $age\n" +
            "My Status is " +
            "${if (a == false){
                val status = "Single"
                status 
            }else{
                val status = "Menikah"
                status 
            }}\n ")
}



/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val result = "Group Id : $groupId\nMember Group : $groupMember\nSession : $session"
    println(result)
    return result
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMember = listOf<String>("Bestran Antony Hutabarat","Muhammad Hasyim","Revangga Prakusya Damanik","Andika Risky Faizatama","Widya Ayu Lestari"
        ,"Alan Jaman Masaid","M.Taufik Hidayat","I Made Surya","Cherlin Vinandhita","Ahmad Arya Perdana","Halena Diyana Sedar")
    return groupMember
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Fatih","Raihan")
    val countOfGroup = arrayOf<String>("Bestran Antony Hutabarat","Muhammad Hasyim","Revangga Prakusya Damanik","Andika Risky Faizatama","Widya Ayu Lestari"
        ,"Alan Jaman Masaid","M.Taufik Hidayat","I Made Surya","Cherlin Vinandhita","Ahmad Arya Perdana","Halena Diyana Sedar")
    val mentorsize = mentor.size
    val groupsize = countOfGroup.size
    val total = mentorsize + groupsize
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember (Include Mentor)")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Celestial", myTeam(), "Afternoon")

}