#include "fiestel.h"

#define BITS_EP 48
#define BITS_P 32

static const int EP[BITS_EP] = {
        32, 1, 2, 3, 4, 5, 4, 5,
        6, 7, 8, 9, 8, 9, 10, 11,
        12, 13, 12, 13, 14, 15, 16, 17,
        16, 17, 18, 19, 20, 21, 20, 21,
        22, 23, 24, 25, 24, 25, 26, 27,
        28, 29, 28, 29, 30, 31, 32, 1
};

static const int P[BITS_P] = {
        16, 7, 20, 21, 29, 12, 28,
        17, 1, 15, 23, 26, 5, 18,
        31, 10, 2, 8, 24, 14, 32,
        27, 3, 9, 19, 13, 30, 6,
        22, 11, 4, 25
};

static unsigned long expand_permutation(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < BITS_EP; i++) {
        unsigned long current_bit = (x >> (BITS_P - EP[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (BITS_EP - (i + 1));
        result += shifted_bit;
    }
    return result;
}