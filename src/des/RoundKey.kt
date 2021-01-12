package des

import des.Config.PC1
import des.Config.PC2
import des.Config.SHIFTS
import kotlin.math.pow

class RoundKey(private val key: ULong) {

    private fun permutedChoice1(x: ULong): ULong {
        var result = 0UL
        PC1.forEachIndexed { index, p ->
            val currentBit = (x shr (64 - p)) and 1UL
            val shiftedX = (currentBit shl (55 - index))
            result += shiftedX
        }
        return result
    }

    private fun permutedChoice2(x: ULong): ULong {
        var result = 0UL
        PC2.forEachIndexed { index, p ->
            val currentBit = (x shr (56 - p)) and 1UL
            val shiftedX = (currentBit shl (47 - index))
            result += shiftedX
        }
        return result
    }

    private fun leftShift(x: ULong, shift: Int, numBits: Int = 28): ULong {
        val mask: ULong = (2.0.pow(numBits)).toULong() - 1UL
        val msb = x shr 28
        val lsb = x and 0b1111_11111111_11111111_11111111UL
        val shiftedMSB = ((msb shl shift) or (msb shr (numBits - shift))) and mask
        val shiftedLSB = ((lsb shl shift) or (lsb shr (numBits - shift))) and mask
        return ((shiftedMSB shl 28) or shiftedLSB)
    }

    fun generateKeys(round: Int = 16): List<ULong> {
        val keys = MutableList(round) { 0UL }
        var temp = permutedChoice1(key)
        for (i in 0 until round) {
            temp = leftShift(temp, SHIFTS[i])
            keys[i] = permutedChoice2(temp)
        }
        return keys
    }
}