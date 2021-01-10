package substitution

import java.util.Random

class MonoAlphabetic(randomSeed: Long) {
    private val keyMap = (97..122).toMutableList()

    init {
        generateMapping(randomSeed)
    }

    private fun generateMapping(randomSeed: Long) {
        keyMap.shuffle(Random(randomSeed))
    }

    fun encipher(plainText: String): String {
        val lowerCaseText = plainText.toLowerCase()
        val inputStream = lowerCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt() - 97
            val newIndex = keyMap[oldIndex]
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }

    fun decipher(cipherText: String): String {
        val lowerCaseText = cipherText.toLowerCase()
        val inputStream = lowerCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt()
            val newIndex = keyMap.indexOf(oldIndex) + 97
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("").toUpperCase()
    }
}