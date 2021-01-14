import des.*
import sdes.SDES
import substitution.AutoKey
import substitution.Caesar
import substitution.MonoAlphabetic
import substitution.Vignere
import transposition.RailFence
import transposition.RowTransposition

fun main() {
    var key: Any?
    var plainText: Any?
    var cipherText: Any?

    println("\n-------------------- CAESAR CIPHER ----------------------")
    plainText = "CRYPTOGRAPHY"
    key = 3
    println("\nPLAIN TEXT : $plainText")
    println("KEY        : $key")
    val caesar = Caesar(key)
    cipherText = caesar.encipher(plainText)
    println("ENCRYPTION -> CIPHER TEXT : $cipherText")
    plainText = caesar.decipher(cipherText)
    println("DECRYPTION -> PLAIN TEXT  : $plainText")

    println("\n---------------- MONO-ALPHABETIC CIPHER ------------------")
    val monoAlphabetic = MonoAlphabetic(42L)
    plainText = "ESTABLISHMENT"
    key = monoAlphabetic.getKeyMap()
    println("\nPLAIN TEXT   : $plainText")
    println("KEY MAP      : $key")
    cipherText = monoAlphabetic.encipher(plainText)
    println("ENCRYPTION -> CIPHER TEXT : $cipherText")
    plainText = monoAlphabetic.decipher(cipherText)
    println("DECRYPTION -> PLAIN TEXT  : $plainText")

    println("\n-------------------- VIGNERE CIPHER ----------------------")
    plainText = "WEAREDISCOVEREDSAVEYOURSELF"
    key = "DECEPTIVE"
    println("\nPLAIN TEXT : $plainText")
    println("KEY        : $key")
    val vignere = Vignere(key)
    cipherText = vignere.encipher(plainText)
    println("ENCRYPTION -> CIPHER TEXT : $cipherText")
    plainText = vignere.decipher(cipherText)
    println("DECRYPTION -> PLAIN TEXT  : $plainText")

    println("\n-------------------- AUTOKEY CIPHER ----------------------")
    plainText = "WEAREDISCOVEREDSAVEYOURSELF"
    key = "DECEPTIVE"
    println("\nPLAIN TEXT : $plainText")
    println("KEY        : $key")
    val autoKey = AutoKey(key)
    cipherText = autoKey.encipher(plainText)
    println("ENCRYPTION -> CIPHER TEXT : $cipherText")
    plainText = autoKey.decipher(cipherText)
    println("DECRYPTION -> PLAIN TEXT  : $plainText")

    println("\n-------------------- RAIL-FENCE CIPHER ----------------------")
    plainText = "MEETMEAFTERTHETOGAPARTY"
    println("\nPLAIN TEXT : $plainText")
    cipherText = RailFence.encipher(plainText)
    println("ENCRYPTION -> CIPHER TEXT : $cipherText")
    plainText = RailFence.decipher(cipherText)
    println("DECRYPTION -> PLAIN TEXT  : $plainText")

    println("\n----------------- ROW-TRANSPOSITION CIPHER ------------------")
    plainText = "ATTACKPOSTPONEDUNTILTWOAM"
    key = "4312567"
    println("\nPLAIN TEXT : $plainText")
    println("KEY        : $key")
    val rowTransposition = RowTransposition(key)
    cipherText = rowTransposition.encipher(plainText)
    println("ENCRYPTION -> CIPHER TEXT : $cipherText")
    plainText = rowTransposition.decipher(cipherText)
    println("DECRYPTION -> PLAIN TEXT  : $plainText")

    println("\n------------------- SDES ENCRYPTION --------------------")
    plainText = 0b01110010
    key = 0b1010000010
    println("\nPLAIN TEXT : 0b${Integer.toBinaryString(plainText)}")
    println("KEY        : 0b${Integer.toBinaryString(key)}")
    val sdes = SDES(key)
    cipherText = sdes.encryptByte(0b01110010)
    println("ENCRYPTION -> CIPHER BYTE : 0b${Integer.toBinaryString(cipherText)}")
    plainText = sdes.decryptByte(cipherText)
    println("DECRYPTION -> PLAIN BYTE  : 0b${Integer.toBinaryString(plainText)}")
    plainText = "ENTANGLEMENT"
    key = 0b1010000010
    println("\nPLAIN TEXT : $plainText")
    println("KEY        : 0b${Integer.toBinaryString(key)}")
    cipherText = sdes.encrypt(plainText)
    println("ENCRYPTION -> CIPHER TEXT : $cipherText")
    plainText = sdes.decrypt(cipherText)
    println("DECRYPTION -> PLAIN TEXT  : $plainText")

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