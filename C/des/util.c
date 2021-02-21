#include "util.h"

unsigned long initial_permutation_des(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < 64; i++) {
        unsigned long current_bit = (x >> (64 - IP[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (63 - i);
        result += shifted_bit;
    }
    return result;
}

unsigned long inverse_permutation_des(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < 64; i++) {
        unsigned long current_bit = (x >> (64 - INV_IP[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (63 - i);
        result += shifted_bit;
    }
    return result;
}

unsigned long switch_halves_des(unsigned long x) {
    unsigned long msb = x >> 32;
    unsigned long lsb = x & 0xFFFFFFFFUL;
    return ((lsb << 32) | msb);
}

void print_hex(unsigned long x) {
    for (int i = 1; i <= 8; i++) {
        unsigned long octet = (x >> ((8 - i) * 8)) & 0xFFUL;
        printf("%02lX ", octet);
    }
}