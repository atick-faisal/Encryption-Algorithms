#include "config.h"
#include "sdes_util.h"


int index_of(const int* arr, int element, size_t size) {
    for (size_t i = 0; i < size; i++) {
        if (arr[i] == element) return i;
    }
    return -1;
}

void generate_inverse_ip(const int* ip, int* inverse_ip) {
    for (int i = 0; i < IP_LENGTH; i++) {
        inverse_ip[i] = index_of(ip, (i + 1), IP_LENGTH) + 1;
    }
}

int initial_permutation(int x, const int* ip) {
    int result = 0;
    for (int i = 0; i < IP_LENGTH; i++) {
        int current_bit = x >> (IP_LENGTH - ip[i]) & 1;
        int shifted_bit = current_bit << (IP_LENGTH - (i + 1));
        result += shifted_bit;
    }
    return result;
}

int inverse_initial_permutation(int x, const int* inverse_ip) {
    int result = 0;
    for (int i = 0; i < IP_LENGTH; i++) {
        int current_bit = x >> (IP_LENGTH - inverse_ip[i]) & 1;
        int shifted_bit = current_bit << (IP_LENGTH - (i + 1));
        result += shifted_bit;
    }
    return result;
}

int switch_order(int x, size_t size) {
    size_t shift_amount = size / 2;
    int msb = x >> (shift_amount);
    int lsb = x & ((1 << shift_amount) - 1);
    return (lsb << shift_amount) | msb;
}

void print_binary(int x, int size) {
    printf("0b");
    for (int i = size - 1; i >= 0; i--) {
        unsigned char bit = (x >> i) & 1;
        printf("%u", bit);
    }
    printf("\n");
}