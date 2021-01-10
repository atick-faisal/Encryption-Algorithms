package substitution

class Vignere(key: String) {

    private val keyUpperCase = key.toUpperCase()

    fun encipher(plainText: String): String {
        val lowerCaseText = plainText.toUpperCase()
        val inputStream = lowerCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        inputStream.forEachIndexed { index, letter ->
            val oldIndex = letter.toInt() - 65
            val currentKey = keyUpperCase[(index % keyUpperCase.length)].toInt() - 65
            val newIndex = ((oldIndex + currentKey) % 26) + 65
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("").toUpperCase()
    }

    fun decipher(cipherText: String): String {
        val lowerCaseText = cipherText.toUpperCase()
        val inputStream = lowerCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        inputStream.forEachIndexed { index, letter ->
            val oldIndex = letter.toInt() - 65
            val currentKey = keyUpperCase[(index % keyUpperCase.length)].toInt() - 65
            val newIndex = ((oldIndex - currentKey + 26) % 26) + 65
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }
}