import substitution.AutoKey
import substitution.Caesar
import substitution.MonoAlphabetic
import substitution.Vignere
import transposition.RailFence

fun main() {
    var plainText: String
    var cipherText: String

    println("-------------------- CAESAR CIPHER ----------------------")
    val caesar = Caesar(5)
    cipherText = caesar.encipher("hello")
    println("CIPHER TEXT : $cipherText")
    plainText = caesar.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("---------------- MONO-ALPHABETIC CIPHER ------------------")
    val monoAlphabetic = MonoAlphabetic(42)
    cipherText = monoAlphabetic.encipher("establishment")
    println("CIPHER TEXT : $cipherText")
    plainText = monoAlphabetic.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("-------------------- VIGNERE CIPHER ----------------------")
    val vignere = Vignere("deceptive")
    cipherText = vignere.encipher("wearediscoveredsaveyourself")
    println("CIPHER TEXT : $cipherText")
    plainText = vignere.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("-------------------- VIGNERE CIPHER ----------------------")
    val autoKey = AutoKey("deceptive")
    cipherText = autoKey.encipher("wearediscoveredsaveyourself")
    println("CIPHER TEXT : $cipherText")
    plainText = autoKey.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("-------------------- RAIL-FENCE CIPHER ----------------------")
    cipherText = RailFence.encipher("meetmeafterthetogaparty")
    println("CIPHER TEXT : $cipherText")
//    plainText = autoKey.decipher(cipherText)
//    println("PLAIN TEXT  : $plainText")
}