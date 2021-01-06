package monoalphabetic

class Caesar(k: Int) {

    private val key = k % 26

    fun encipher(plainText: String): String {
        val lowerCaseText = plainText.toLowerCase()
        val inputStream = lowerCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        for (letter in inputStream) {
            val oldIndex = letter.toInt()
            val newIndex = (oldIndex + key) % 122
            outputStream.add(newIndex.toChar())
        }
        return outputStream.joinToString("")
    }
}