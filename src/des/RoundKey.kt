package des

import des.Config.PC1
import des.Config.PC2

class RoundKey(private val key: Int) {

    fun permutedChoice1(x: ULong): ULong {
        var result = 0UL
        PC1.forEachIndexed { index, p ->
            val currentBit = (x shr (64 - p)) and 1UL
            val shiftedX = (currentBit shl (55 - index))
            result += shiftedX
        }
        return result
    }

    fun permutedChoice2(x: ULong): ULong {
        var result = 0UL
        PC2.forEachIndexed { index, p ->
            val currentBit = (x shr (56 - p)) and 1UL
            val shiftedX = (currentBit shl (55 - index))
            result += shiftedX
        }
        return result
    }
}