#include "config.h"
#include "subkey.h"

const int P8[P8_LENGTH] = {6, 3, 7, 4, 8, 5, 10, 9};
const int P10[P10_LENGTH] = {3, 5, 2, 7, 4, 10, 1, 9, 8, 6};

int permutation_p10(int x, const int* p10) {
    int result = 0;
    for (int i = 0; i < P10_LENGTH; i++) {
        int current_bit = x >> (P10_LENGTH - p10[i]) & 1;
        int shifted_bit = current_bit << (P10_LENGTH - (i + 1));
        result += shifted_bit;
    }
    return result;
}

int permutation_p8(int x, const int* p8) {
    int result = 0;
    for (int i = 0; i < P8_LENGTH; i++) {
        int current_bit = x >> (10 - p8[i]) & 1;
        int shifted_bit = current_bit << (P8_LENGTH - (i + 1));
        result += shifted_bit;
    }
    return result;
}

int circular_left_shift(int x, int amount, const int numBits) {
    int mask = (1 << numBits) - 1;
    return ((x << amount) | (x >> (numBits - amount))) & mask;
}

int get_key_1(int key) {
    int p10 = permutation_p10(key, P10);
    int msb = p10 >> 5;
    int lsb = p10 & ((1 << 5) - 1);
    int ls1_msb = circular_left_shift(msb, 1, 5);
    int ls1_lsb = circular_left_shift(lsb, 1, 5);
    int temp = (ls1_msb << 5) | ls1_lsb;
    return permutation_p8(temp, P8);
}

int get_key_2(int key) {
    int p10 = permutation_p10(key, P10);
    int msb = p10 >> 5;
    int lsb = p10 & ((1 << 5) - 1);
    int ls2_msb = circular_left_shift(msb, 3, 5);
    int ls2_lsb = circular_left_shift(lsb, 3, 5);
    int temp = (ls2_msb << 5) | ls2_lsb;
    return permutation_p8(temp, P8);
}