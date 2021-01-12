package sdes

class SubKey(private val key: Int) {

    companion object {
        private val P10 = listOf(3, 5, 2, 7, 4, 10, 1, 9, 8, 6)
    }

    fun permutation10(x: Int): Int {
        var result = 0
        P10.forEachIndexed { index, p ->
            val shift = 10 - p
            val currentBit = (x and (1 shl shift)) shr shift
            val shiftedX = currentBit shl (9 - index)
            result += shiftedX
        }
        return result
    }
}