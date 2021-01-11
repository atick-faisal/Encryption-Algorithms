package transposition

object RailFence {

    fun encipher(plainText: String): String {
        val upperCaseText = plainText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream1 = mutableListOf<Char>()
        val outputStream2 = mutableListOf<Char>()
        inputStream.forEachIndexed { index, c ->
            if ((index % 2) == 0) outputStream1.add(c)
            else outputStream2.add(c)
        }
        val outputStream = outputStream1 + outputStream2
        return outputStream.joinToString("")
    }

}