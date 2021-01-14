package transposition

class RowTransposition(key: String) {

    companion object {
        private const val PADDING = "XYZXYZXYZXYZXYZXYZ"
    }

    private val permutation = mutableListOf<Int>()
    private val inversePermutation = mutableListOf<Int>()
    private val keyLength = key.length

    init {
        generatePermutations(key)
    }

    private fun generatePermutations(key: String) {
        for (i in key.indices) {
            permutation.add(key[i].toInt() - 48)
        }
        for (i in 1..keyLength) {
            inversePermutation.add(permutation.indexOf(i) + 1)
        }
    }

    fun encipher(plainText: String): String {
        val paddingLength = keyLength - (plainText.length % keyLength)
        val upperCaseText = plainText.toUpperCase()+
                PADDING.slice(0 until paddingLength)
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()

        for (key in inversePermutation) {
            for (index in (key - 1) until inputStream.size step keyLength)
                outputStream.add(inputStream[index])
        }

        return outputStream.joinToString("")
    }

    fun decipher(cipherText: String): String {
        val stepSize = (cipherText.length / keyLength)
        val upperCaseText = cipherText.toUpperCase()
        val inputStream = upperCaseText.toCharArray()
        val outputStream = mutableListOf<Char>()

        for (i in 0 until stepSize)
            for (key in permutation)
                outputStream.add(inputStream[(key - 1) * stepSize + i])

        return outputStream.joinToString("")
    }
}