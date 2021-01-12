package des

import des.Config.EP
import des.Config.P32
import des.Config.SBOXES
import sdes.Config
import sdes.Fiestel
import kotlin.math.pow

object Fiestel {
    private fun expandPermutation(x: ULong): ULong {
        var result = 0UL
        EP.forEachIndexed { index, p ->
            val currentBit = (x shr (32 - p)) and 1UL
            val shiftedX = currentBit shl (47 - index)
            result += shiftedX
        }
        return result
    }

    private fun permutation32(x: ULong): ULong {
        var result = 0UL
        P32.forEachIndexed { index, p ->
            val currentBit = (x shr (4 - p)) and 1UL
            val shiftedX = currentBit shl (3 - index)
            result += shiftedX
        }
        return result
    }

    private fun getSValueAt(x: Int, sBox: Array<IntArray>): ULong {
        val row = ((x and 0b100000) shr 2) or (x and 0b000001)
        val col = (x shr 1) and 0b011110
        return sBox[row][col].toULong()
    }

    private fun applySBoxes(x: ULong): ULong {
        var result = 0UL
        val mask: ULong = (2.0.pow(6)).toULong() - 1UL
        for (i in 1..8) {
            val temp = (x shr ((8 - i) * 6)) and mask
            val value = getSValueAt(temp.toInt(), SBOXES[i - 1])
            result = (result shl ((i - 1) * 6)) or value
        }
        return result
    }
}