#include "config.h"
#include "sdes_feistel.h"

const int EP[EP_LENGTH] = {4, 1, 2, 3, 2, 3, 4, 1};
const int P4[P4_LENGTH] = {2, 4, 3, 1};

const int S0[4][4] = {
        {0b01, 0b00, 0b11, 0b10},
        {0b11, 0b10, 0b01, 0b00},
        {0b00, 0b10, 0b01, 0b11},
        {0b11, 0b01, 0b11, 0b10}
};

const int S1[4][4] = {
        {0b00, 0b01, 0b10, 0b11},
        {0b10, 0b00, 0b01, 0b11},
        {0b11, 0b00, 0b01, 0b00},
        {0b10, 0b01, 0b00, 0b11}
};

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

int apply_s_boxes(int x) {
    int msb = x >> 4;
    int lsb = x & ((1 << 4) - 1);
    int s0 = get_s_box_value(msb, S0);
    int s1 = get_s_box_value(lsb, S1);
    return (s0 << 2) | s1;
}

int apply_feistel(int x, int key) {
    int msb = x >> 4;
    int lsb = x & ((1 << 4) - 1);
    int ep = expand_permutation(lsb, EP);
    int temp1 = ep ^ key;
    int temp2 = apply_s_boxes(temp1);
    int p4 = permutation_p4(temp2, P4);
    int new_msb = msb ^ p4;
    return (new_msb << 4) | lsb;
}