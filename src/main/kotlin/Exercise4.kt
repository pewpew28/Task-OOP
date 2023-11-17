fun main() {
    val a = divide(8,6)
    print(a)
}
/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        0
    }
}

