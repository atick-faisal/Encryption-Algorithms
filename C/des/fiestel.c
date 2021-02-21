#include "fiestel.h"

static unsigned long expand_permutation(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < BITS_EP; i++) {
        unsigned long current_bit = (x >> (BITS_P - EP[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (BITS_EP - (i + 1));
        result += shifted_bit;
    }
    return result;
}

static unsigned long permutation(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < BITS_P; i++) {
        unsigned long current_bit = (x >> (BITS_P - P[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (BITS_P - (i + 1));
        result += shifted_bit;
    }
    return result;
}

static unsigned long get_s_value_at(unsigned long x, const int s_box[4][16]) {
    int row = (int) (((x & 0b100000) >> 4) | (x & 0b000001));
    int col = (int) ((x >> 1) & 0b001111);
    return (unsigned long) s_box[row][col];
}

static unsigned long apply_s_boxes(unsigned long x) {
    unsigned long result = 0UL;
    unsigned long mask = (1 << 6) - 1UL;
    for (int i = 1; i <= 8; i++) {
        unsigned long temp = (x >> ((8 - i) * 6)) & mask;
        unsigned long value = get_s_value_at(temp, S_BOXES[i - 1]);
        result = (result << 4) | value;
    }
    return result;
}

unsigned long apply_fiestel_des(unsigned long x, unsigned long key) {
    unsigned long msb = x >> 32;
    unsigned long lsb = x & 0xFFFFFFFFUL;
    unsigned long ep = expand_permutation(lsb);
    unsigned long temp1 = ep ^ key;
    unsigned long temp2 = apply_s_boxes(temp1);
    unsigned long p = permutation(temp2);
    unsigned long new_msb = msb ^ p;
    return (new_msb << 32) | lsb;
}