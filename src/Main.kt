import substitution.MonoAlphabetic
import substitution.PolyAlphabetic

fun main() {


//    val caesar = Caesar(5)
//    val cipherText = caesar.encipher("AbXy")
//    println(cipherText)
//    val plainText = caesar.decipher(cipherText)
//    println(plainText)

    val monoAlphabetic = MonoAlphabetic(42)
    var cipherText = monoAlphabetic.encipher("establishment")
    println(cipherText)
    var plainText = monoAlphabetic.decipher(cipherText)
    println(plainText)

    val polyAlphabetic = PolyAlphabetic("deceptive")
    cipherText = polyAlphabetic.encipher("wearediscoveredsaveyourself")
    println(cipherText)
}