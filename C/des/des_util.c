#include "des_util.h"

unsigned long initial_permutation_des(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < BITS_IP; i++) {
        unsigned long current_bit = (x >> (BITS_IP - IP[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (BITS_IP - (i + 1));
        result += shifted_bit;
    }
    return result;
}

unsigned long inverse_permutation_des(unsigned long x) {
    unsigned long result = 0UL;
    for (int i = 0; i < BITS_IP; i++) {
        unsigned long current_bit = (x >> (BITS_IP - INV_IP[i])) & 1UL;
        unsigned long shifted_bit = current_bit << (BITS_IP - (i + 1));
        result += shifted_bit;
    }
    return result;
}

unsigned long switch_halves_des(unsigned long x) {
    unsigned long msb = x >> 32;
    unsigned long lsb = x & 0xFFFFFFFFUL;
    return ((lsb << 32) | msb);
}

void print_hex(unsigned long x, int num_bytes) {
    for (int i = 1; i <= num_bytes; i++) {
        unsigned long octet = (x >> ((num_bytes - i) * num_bytes)) & 0xFFUL;
        printf("%02lX ", octet);
    }
}