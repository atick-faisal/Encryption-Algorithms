package sdes

class SDES(key: Int) {

    private val subKey = SubKey(key)

    fun encipher(x: Int): Int {
        val key1 = subKey.getKey1()
        val key2 = subKey.getKey2()
        val ip = initialPermutation(x)
        val stage1 = Fiestel.apply(ip, key1)
        val switched = switch(stage1)
        val stage2 = Fiestel.apply(switched, key2)
        return inversePermutation(stage2)
    }
}