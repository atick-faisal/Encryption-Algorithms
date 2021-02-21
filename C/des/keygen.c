#include "keygen.h"

#define NUMBER_OF_ROUNDS 16
#define BITS_PC1 56
#define BITS_PC2 48
#define BITS_SHIFT 28

static const int PC1[BITS_PC1] = {
        57, 49, 41, 33, 25,
        17, 9, 1, 58, 50, 42, 34, 26,
        18, 10, 2, 59, 51, 43, 35, 27,
        19, 11, 3, 60, 52, 44, 36, 63,
        55, 47, 39, 31, 23, 15, 7, 62,
        54, 46, 38, 30, 22, 14, 6, 61,
        53, 45, 37, 29, 21, 13, 5, 28,
        20, 12, 4
};

static const int PC2[BITS_PC2] = {
        14, 17, 11, 24, 1, 5, 3,
        28, 15, 6, 21, 10, 23, 19, 12,
        4, 26, 8, 16, 7, 27, 20, 13, 2,
        41, 52, 31, 37, 47, 55, 30, 40,
        51, 45, 33, 48, 44, 49, 39, 56,
        34, 53, 46, 42, 50, 36, 29, 32
};

static const int SHIFTS[NUMBER_OF_ROUNDS] = {
        1, 1, 2, 2, 2, 2, 2, 2,
        1, 2, 2, 2, 2, 2, 2, 1
};

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