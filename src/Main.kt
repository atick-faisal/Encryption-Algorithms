import sdes.Fiestel
import sdes.SubKey
import substitution.AutoKey
import substitution.Caesar
import substitution.MonoAlphabetic
import substitution.Vignere
import transposition.RailFence
import transposition.RowTransposition

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
    plainText = RailFence.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("----------------- ROW-TRANSPOSITION CIPHER ------------------")
    val rowTransposition = RowTransposition("4312567")
    cipherText = rowTransposition.encipher("attackpostponeduntiltwoam")
    println("CIPHER TEXT : $cipherText")
    plainText = rowTransposition.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    ////////////////////////////////////////////////////////////////////////
    val y = Fiestel.expandPermutation(0b1001)
    print(Integer.toBinaryString(y))
}