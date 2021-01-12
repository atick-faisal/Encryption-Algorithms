package des

import des.Config.IP
import sdes.Config

fun generateInverseIP(ip: IntArray): IntArray {
    val inverseIp = IntArray(64)
    for (i in 1..ip.size)
        inverseIp[i - 1] = (ip.indexOf(i) + 1)
    return inverseIp
}

fun initialPermutation(x: ULong): ULong {
    var result = 0UL
    IP.forEachIndexed { index, p ->
        val currentBit = (x shr (64 - p)) and 1UL
        val shiftedX = currentBit shl (63 - index)
        result += shiftedX
    }
    return result
}

fun inversePermutation(x: ULong): ULong {
    var result = 0UL
    val inverseIp = generateInverseIP(IP)
    inverseIp.forEachIndexed { index, p ->
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

fun ULong.toHexString(): String {
    var result = ""
    for (i in 1..8) {
        val octet = (this shr (8 - i)) and 0xFF_FFUL
        result += Integer.toHexString(octet.toInt())
    }
    return result
}