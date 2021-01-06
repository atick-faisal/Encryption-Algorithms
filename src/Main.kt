import monoalphabetic.Caesar

fun main() {
    val caesar = Caesar(29)
    val cipherText = caesar.encipher("wxab")
    print(cipherText)
    val plainText = caesar.decipher(cipherText)
    print(plainText)
}