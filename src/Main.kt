import substitution.MonoAlphabetic

fun main() {
//    val caesar = Caesar(5)
//    val cipherText = caesar.encipher("AbXy")
//    println(cipherText)
//    val plainText = caesar.decipher(cipherText)
//    println(plainText)

    val monoAlphabetic = MonoAlphabetic(42)
    val cipherText = monoAlphabetic.encipher("establishment")
    println(cipherText)
    val plainText = monoAlphabetic.decipher(cipherText)
    println(plainText)
}