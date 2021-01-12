package sdes

class SubKey(private val key: Int) {

    companion object {
        private val P10 = listOf(3, 5, 2, 7, 4, 10, 1, 9, 8, 6)
        private val P8 = listOf(6, 3, 7, 4, 8, 5, 10, 9)
    }

    fun permutation10(x: Int): Int {
        var result = 0
        P10.forEachIndexed { index, p ->
            val currentBit = (x shr (10 - p)) and 1
            val shiftedX = currentBit shl (9 - index)
            result += shiftedX
        }
        return result
    }

    fun permutation8(x: Int): Int {
        var result = 0
        P8.forEachIndexed { index, p ->
            val currentBit = (x shr (10 - p)) and 1
            val shiftedX = currentBit shl (7 - index)
            result += shiftedX
        }
        return result
    }
}