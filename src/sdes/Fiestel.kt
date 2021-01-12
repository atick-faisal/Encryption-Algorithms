package sdes

object Fiestel {

    private val EP = listOf(4, 1, 2, 3, 2, 3, 4, 1)

    fun expandPermutation(x: Int): Int {
        var result = 0
        EP.forEachIndexed { index, p ->
            val currentBit = (x shr (4 - p)) and 1
            val shiftedX = currentBit shl (7 - index)
            result += shiftedX
        }
        return result
    }
}