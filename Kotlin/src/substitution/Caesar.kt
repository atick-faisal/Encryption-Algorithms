package substitution

class Caesar(k: Int) {

    private val key = k % 26

    fun encipher(plainText: String): String {
        val upperCaseText = plainText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt() - 65
            val newIndex = ((oldIndex + key) % 26) + 65
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }

    fun decipher(cipherText: String): String {
        val upperCaseText = cipherText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt() - 65
            val newIndex = ((oldIndex - key + 26) % 26) + 65
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }
}