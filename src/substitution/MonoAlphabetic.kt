package substitution

import java.util.Random

class MonoAlphabetic(randomSeed: Long) {

    private val keyMap = (65..90).toMutableList()

    init {
        generateMapping(randomSeed)
    }

    private fun generateMapping(randomSeed: Long) {
        keyMap.shuffle(Random(randomSeed))
    }

    fun getKeyMap(): String {
        val alphabet = (65..90).map { i -> i.toChar() }
        val mapping = keyMap.map { i -> i.toChar() }
        return "\n\t\t\t\t$alphabet\n\t\t\t\t$mapping\n"
    }

    fun encipher(plainText: String): String {
        val upperCaseText = plainText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt() - 65
            val newIndex = keyMap[oldIndex]
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }

    fun decipher(cipherText: String): String {
        val upperCaseText = cipherText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt()
            val newIndex = keyMap.indexOf(oldIndex) + 65
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }
}