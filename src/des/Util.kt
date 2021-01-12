package des

import des.Config.IP

fun initialPermutation(x: ULong): ULong {
    var result = 0UL
    IP.forEachIndexed { index, p ->
        val currentBit = (x shr (64 - p)) and 1UL
        val shiftedX = currentBit shl (63 - index)
        result += shiftedX
    }
    return result
}

fun switch(x: ULong): ULong {
    val msb = x shr 32
    val lsb = x and 0xFF_FF_FF_FFUL
    return ((lsb shl 32) or msb)
}