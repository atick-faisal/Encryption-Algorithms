package des

import des.Config.EP
import des.Config.P32

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
}