package sdes

object Fiestel {

    private val EP = listOf(4, 1, 2, 3, 2, 3, 4, 1)
    private val S0 = listOf(
            listOf(0b01, 0b00, 0b11, 0b10),
            listOf(0b11, 0b10, 0b01, 0b00),
            listOf(0b00, 0b10, 0b01, 0b11),
            listOf(0b11, 0b01, 0b11, 0b10)
    )
    private val S1 = listOf(
            listOf(0b00, 0b01, 0b10, 0b11),
            listOf(0b10, 0b00, 0b01, 0b11),
            listOf(0b11, 0b00, 0b01, 0b00),
            listOf(0b10, 0b01, 0b00, 0b11)
    )
    private val P4 = listOf(2, 4, 3, 1)

    private fun expandPermutation(x: Int): Int {
        var result = 0
        EP.forEachIndexed { index, p ->
            val currentBit = (x shr (4 - p)) and 1
            val shiftedX = currentBit shl (7 - index)
            result += shiftedX
        }
        return result
    }

    private fun permutation4(x: Int): Int {
        var result = 0
        P4.forEachIndexed { index, p ->
            val currentBit = (x shr (4 - p)) and 1
            val shiftedX = currentBit shl (3 - index)
            result += shiftedX
        }
        return result
    }

    private fun getSValueAt(x: Int, sBox: List<List<Int>>): Int {
        val row = ((x and 0b1000) shr 2) or (x and 0b0001)
        val col = (x shr 1) and 0b0011
        return sBox[row][col]
    }

    private fun applySBoxes(x: Int): Int {
        val msb = x shr 4
        val lsb = x and 0b1111
        val s0 = getSValueAt(msb, S0)
        val s1 = getSValueAt(lsb, S1)
        return ((s0 shl 2) or s1)
    }

    fun apply(x: Int, key: Int): Int {
        val msb = x shr 4
        val lsb = x and 0b1111
        val ep = expandPermutation(lsb)
        val temp1 = ep xor key
        val temp2 = applySBoxes(temp1)
        val p4 = permutation4(temp2)
        val newMSB = msb xor p4
        return (newMSB shl 4) + lsb
    }
}