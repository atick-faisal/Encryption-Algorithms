package substitution

class PolyAlphabetic(private val key: String) {
    fun encipher(plainText: String): String {
        val lowerCaseText = plainText.toLowerCase()
        val inputStream = lowerCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        inputStream.forEachIndexed { index, letter ->
            val oldIndex = letter.toInt() - 97
            val currentKey = key[(index % key.length)].toInt() - 97
            val newIndex = ((oldIndex + currentKey) % 26) + 97
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }
}