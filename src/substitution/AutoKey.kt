package substitution

class AutoKey(key: String) {
    private val keyUpperCase = key.toUpperCase()

    fun encipher(plainText: String): String {
        val upperCaseText = plainText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        val autoKey = keyUpperCase + upperCaseText.slice(
                0 until (upperCaseText.length - keyUpperCase.length)
        )
        inputStream.forEachIndexed { index, letter ->
            val oldIndex = letter.toInt() - 65
            val currentKey = autoKey[index].toInt() - 65
            val newIndex = ((oldIndex + currentKey) % 26) + 65
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("").toUpperCase()
    }
}