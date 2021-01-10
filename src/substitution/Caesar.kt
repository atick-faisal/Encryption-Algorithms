package substitution

class Caesar(k: Int) {

    private val key = k % 26

    fun encipher(plainText: String): String {
        val lowerCaseText = plainText.toUpperCase()
        val inputStream = lowerCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt() - 65
            val newIndex = ((oldIndex + key) % 26) + 65
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }

    fun decipher(cipherText: String): String {
        val lowerCaseText = cipherText.toUpperCase()
        val inputStream = lowerCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt() - 65
            val newIndex = ((oldIndex - key + 26) % 26) + 65
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }
}