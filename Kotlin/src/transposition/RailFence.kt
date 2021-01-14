package transposition

import java.lang.IndexOutOfBoundsException

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

    fun decipher(cipherText: String): String {
        val cipherLength = cipherText.length
        val upperCaseText = cipherText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()
        val midPoint = when (cipherLength % 2) {
            0 -> (cipherLength) / 2
            else -> (cipherLength + 1) / 2
        }
        for (index in 0 until midPoint) {
            try {
                outputStream.add(inputStream[index])
                outputStream.add(inputStream[index + midPoint])
            } catch (e: IndexOutOfBoundsException) {
                // Ignore
            }
        }
        return outputStream.joinToString("")
    }
}