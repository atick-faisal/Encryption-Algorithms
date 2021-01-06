import monoalphabetic.Caesar

fun main() {
    val caesar = Caesar(29)
    val cipherText = caesar.encipher("abcd")
    print(cipherText)
}