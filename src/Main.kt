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

    println("\n-------------------- CAESAR CIPHER ----------------------")
    val caesar = Caesar(5)
    cipherText = caesar.encipher("hello")
    println("CIPHER TEXT : $cipherText")
    plainText = caesar.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("\n---------------- MONO-ALPHABETIC CIPHER ------------------")
    val monoAlphabetic = MonoAlphabetic(42)
    cipherText = monoAlphabetic.encipher("establishment")
    println("CIPHER TEXT : $cipherText")
    plainText = monoAlphabetic.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("\n-------------------- VIGNERE CIPHER ----------------------")
    val vignere = Vignere("deceptive")
    cipherText = vignere.encipher("wearediscoveredsaveyourself")
    println("CIPHER TEXT : $cipherText")
    plainText = vignere.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("\n-------------------- VIGNERE CIPHER ----------------------")
    val autoKey = AutoKey("deceptive")
    cipherText = autoKey.encipher("wearediscoveredsaveyourself")
    println("CIPHER TEXT : $cipherText")
    plainText = autoKey.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("\n-------------------- RAIL-FENCE CIPHER ----------------------")
    cipherText = RailFence.encipher("meetmeafterthetogaparty")
    println("CIPHER TEXT : $cipherText")
    plainText = RailFence.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("\n----------------- ROW-TRANSPOSITION CIPHER ------------------")
    val rowTransposition = RowTransposition("4312567")
    cipherText = rowTransposition.encipher("attackpostponeduntiltwoam")
    println("CIPHER TEXT : $cipherText")
    plainText = rowTransposition.decipher(cipherText)
    println("PLAIN TEXT  : $plainText")

    println("\n------------------- SDES ENCRYPTION --------------------")
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

    println("\n--------------------------- DES ENCRYPTION -----------------------------")
    val plainTextBock = 0x12_34_56_AB_CD_13_25_36UL
    val keyDES = 0xAA_BB_09_18_27_36_CC_DDUL
    println("\nENCRYPTION :\n")
    println("PLAIN TEXT BLOCK : ${plainTextBock.toHexString()}")
    println("KEY              : ${keyDES.toHexString()}\n")
    val des = DES(keyDES)
    cipherText = des.encryptBlock(plainTextBock)
    println("\nCIPHER TEXT BLOCK : ${cipherText.toHexString()}\n")
    println("\nDECRYPTION :\n")
    plainText = des.decryptBlock(cipherText)
    println("\nPLAIN TEXT BLOCK  : ${plainText.toHexString()}\n")
}