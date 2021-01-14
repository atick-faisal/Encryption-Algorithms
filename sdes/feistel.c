#include "config.h"
#include "feistel.h"

int expand_permutation(int x, const int* ep) {
    int result = 0;
    for (int i = 0; i < EP_LENGTH; i++) {
        int current_bit = x >> (4 - ep[i]) & 1;
        int shifted_bit = current_bit << (EP_LENGTH - (i + 1));
        result += shifted_bit;
    }
    return result;
}

int permutation_p4(int x, const int* p4) {
    int result = 0;
    for (int i = 0; i < P4_LENGTH; i++) {
        int current_bit = x >> (P4_LENGTH - p4[i]) & 1;
        int shifted_bit = current_bit << (P4_LENGTH - (i + 1));
        result += shifted_bit;
    }
    return result;
}

int get_s_box_value(int x, const int s_box[4][4]) {
    int row = ((x >> 2) & 2) | (x & 1);
    int col = ((x & 6) >> 1);
    return s_box[row][col];
}