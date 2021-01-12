import des.*
import sdes.SDES
import substitution.AutoKey
import substitution.Caesar
import substitution.MonoAlphabetic
import substitution.Vignere
import transposition.RailFence
import transposition.RowTransposition

fun main() {
    var plainText: Any?
    var cipherText: Any?

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

    println("------------------- SDES ENCRYPTION --------------------")
    val sdes = SDES(0b1010000010)
    cipherText = sdes.encryptByte(0b01110010)
    println("CIPHER BYTE : ${Integer.toBinaryString(cipherText)}")
    plainText = sdes.decryptByte(cipherText)
    println("PLAIN BYTE  : ${Integer.toBinaryString(plainText)}")
    ////////////////////////////////////////////////////////////////////
    cipherText = sdes.encrypt("entanglement")
    println("CIPHER TEXT : $cipherText")
    plainText = sdes.decrypt(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("------------------- DES ENCRYPTION --------------------")
    val des = DES(0xAA_BB_09_18_27_36_CC_DDUL)
    cipherText = des.encryptBlock(0x12_34_56_AB_CD_13_25_36UL)
    println("CIPHER BYTE : $cipherText")
//    plainText = sdes.decryptByte(cipherText)
//    println("PLAIN BYTE  : ${Integer.toBinaryString(plainText)}")


    val r = RoundKey(0xAA_BB_09_18_27_36_CC_DDUL)
    val keys = r.generateKeys()
    println(keys)
}