package des


class DES(key: ULong) {

    private val roundKeys = RoundKey(key).generateKeys()

    fun encryptBlock(block: ULong): ULong {
        var intermediateBlock = initialPermutation(block)
        for (i in 0 until 16) {
            intermediateBlock = Fiestel.apply(intermediateBlock, roundKeys[i])
            if (i != 15) intermediateBlock = switch(intermediateBlock)
            println(
                    "ROUND %2d : %s   KEY %2d : %s"
                    .format(i,
                            intermediateBlock.toHexString(),
                            i,
                            roundKeys[i].toHexString())
            )
        }
        return inversePermutation(intermediateBlock)
    }
}