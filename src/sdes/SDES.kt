package sdes

import java.nio.charset.StandardCharsets

class SDES(key: Int, mode: Modes = Modes.ECB, initialVector: Int? = null) {

    private val subKey = SubKey(key)
    private val key1 = subKey.getKey1()
    private val key2 = subKey.getKey2()

    fun encryptByte(x: Int): Int {
        val ip = initialPermutation(x)
        val stage1 = Fiestel.apply(ip, key1)
        val switched = switch(stage1)
        val stage2 = Fiestel.apply(switched, key2)
        return inversePermutation(stage2)
    }

    fun decryptByte(x: Int): Int {
        val ip = initialPermutation(x)
        val stage1 = Fiestel.apply(ip, key2)
        val switched = switch(stage1)
        val stage2 = Fiestel.apply(switched, key1)
        return inversePermutation(stage2)
    }

    fun encrypt(plainText: String): String {
        val upperCaseText = plainText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val encryptedByte = encryptByte(letter.toInt())
            outputStream.add(encryptedByte.toChar())
        }
        return outputStream.joinToString("")
    }

    fun decrypt(cipherText: String): String {
        val inputStream = cipherText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val decryptedByte = decryptByte(letter.toInt())
            val ascii = decryptedByte and 127
            outputStream.add(ascii.toChar())
        }
        return outputStream.joinToString("")
    }
}