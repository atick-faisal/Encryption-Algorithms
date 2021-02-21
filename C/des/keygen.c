#include "keygen.h"

static unsigned long permuted_choice_1(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < BITS_PC1; i++) {
        unsigned long current_bit = (x >> (64 - PC1[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (BITS_PC1 - (i + 1));
        result += shifted_bit;
    }
    return result;
}

static unsigned long permuted_choice_2(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < BITS_PC2; i++) {
        unsigned long current_bit = (x >> (BITS_PC1 - PC2[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (BITS_PC2 - (i + 1));
        result += shifted_bit;
    }
    return result;
}

static unsigned long left_shift(unsigned long x, int shift) {
    unsigned long mask = (1 << BITS_SHIFT) - 1UL;
    unsigned long msb = x >> BITS_SHIFT;
    unsigned long lsb = x & mask;
    unsigned long shifted_msb = ((msb << shift)
                                 | (msb >> (BITS_SHIFT - shift))) & mask;
    unsigned long shifted_lsb = ((lsb << shift)
                                 | (lsb >> (BITS_SHIFT - shift))) & mask;
    return ((shifted_msb << BITS_SHIFT) | shifted_lsb);
}

void generate_keys(unsigned long key, unsigned long *keys) {
    unsigned long temp = permuted_choice_1(key);
    for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
        temp = left_shift(temp, SHIFTS[i]);
        keys[i] = permuted_choice_2(temp);
    }
}