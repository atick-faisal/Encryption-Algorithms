package sdes

object Config {
    val IP = listOf(2, 6, 3, 1, 4, 8, 5, 7)
    val EP = listOf(4, 1, 2, 3, 2, 3, 4, 1)
    val P10 = listOf(3, 5, 2, 7, 4, 10, 1, 9, 8, 6)
    val P8 = listOf(6, 3, 7, 4, 8, 5, 10, 9)
    val P4 = listOf(2, 4, 3, 1)
    val S0 = listOf(
            listOf(0b01, 0b00, 0b11, 0b10),
            listOf(0b11, 0b10, 0b01, 0b00),
            listOf(0b00, 0b10, 0b01, 0b11),
            listOf(0b11, 0b01, 0b11, 0b10)
    )
    val S1 = listOf(
            listOf(0b00, 0b01, 0b10, 0b11),
            listOf(0b10, 0b00, 0b01, 0b11),
            listOf(0b11, 0b00, 0b01, 0b00),
            listOf(0b10, 0b01, 0b00, 0b11)
    )
}