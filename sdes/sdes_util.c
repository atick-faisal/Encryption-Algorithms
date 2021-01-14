#include "config.h"
#include "sdes_util.h"

int index_of(const int* arr, int element, size_t size) {
    for (size_t i = 0; i < size; i++) {
        if (arr[i] == element) return i;
    }
    return -1;
}

void generate_inverse_ip(int* ip, int* inverse_ip) {
    for (int i = 1; i <= IP_LENGTH; i++) {
        inverse_ip[i] = index_of(ip, i, IP_LENGTH);
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