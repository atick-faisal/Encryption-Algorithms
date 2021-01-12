package sdes

import kotlin.math.pow

class SubKey(private val key: Int) {

    private var intermediateKey = 0

    companion object {
        private val P10 = listOf(3, 5, 2, 7, 4, 10, 1, 9, 8, 6)
        private val P8 = listOf(6, 3, 7, 4, 8, 5, 10, 9)
    }

    private fun permutation10(x: Int): Int {
        var result = 0
        P10.forEachIndexed { index, p ->
            val currentBit = (x shr (10 - p)) and 1
            val shiftedX = currentBit shl (9 - index)
            result += shiftedX
        }
        return result
    }

    private fun permutation8(x: Int): Int {
        var result = 0
        P8.forEachIndexed { index, p ->
            val currentBit = (x shr (10 - p)) and 1
            val shiftedX = currentBit shl (7 - index)
            result += shiftedX
        }
        return result
    }

    private fun leftShift1(x: Int, numBits: Int = 5): Int {
        val mask = (2.0.pow(numBits)).toInt() - 1
        return ((x shl 1) or (x shr (numBits - 1))) and mask
    }

    private fun leftShift2(x: Int, numBits: Int = 5): Int {
        val mask = (2.0.pow(numBits)).toInt() - 1
        return ((x shl 2) or (x shr (numBits - 2))) and mask
    }

    fun getKey1(): Int {
        val p10 = permutation10(key)
        intermediateKey = p10
        val msb = intermediateKey shr 5
        val lsb = intermediateKey and 0b11111
        val ls1MSB = leftShift1(msb)
        val ls1LSB = leftShift1(lsb)
        intermediateKey = (ls1MSB shl 5) or ls1LSB
        return permutation8(intermediateKey)
    }
}