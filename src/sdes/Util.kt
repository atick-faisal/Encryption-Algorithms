package sdes

import sdes.Config.IP

fun generateInverseIP(ip: List<Int>): List<Int> {
    val inverseIp = mutableListOf<Int>()
    for (i in 1..ip.size)
        inverseIp.add(ip.indexOf(i) + 1)
    return inverseIp
}

fun initialPermutation(x: Int): Int {
    var result = 0
    IP.forEachIndexed { index, p ->
        val currentBit = (x shr (8 - p)) and 1
        val shiftedX = currentBit shl (7 - index)
        result += shiftedX
    }
    return result
}

fun inversePermutation(x: Int): Int {
    var result = 0
    val inverseIp = generateInverseIP(IP)
    inverseIp.forEachIndexed { index, p ->
        val currentBit = (x shr (8 - p)) and 1
        val shiftedX = currentBit shl (7 - index)
        result += shiftedX
    }
    return result
}

fun switch(x: Int): Int {
    val msb = x shr 4
    val lsb = x and 0b1111
    return ((lsb shl 4) or msb)
}