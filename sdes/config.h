#ifndef ENCRYPTION_ALGORITHMS_CONFIG_H
#define ENCRYPTION_ALGORITHMS_CONFIG_H

#include <ctype.h>
#include <string.h>

#define P4_LENGTH 4
#define P8_LENGTH 8
#define IP_LENGTH 8
#define EP_LENGTH 8
#define P10_LENGTH 10

const int P4[P4_LENGTH] = {2, 4, 3, 1};
const int P8[P8_LENGTH] = {6, 3, 7, 4, 8, 5, 10, 9};
const int IP[IP_LENGTH] = {2, 6, 3, 1, 4, 8, 5, 7};
const int EP[EP_LENGTH] = {4, 1, 2, 3, 2, 3, 4, 1};
const int P10[P10_LENGTH] = {3, 5, 2, 7, 4, 10, 1, 9, 8, 6};

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

#endif //ENCRYPTION_ALGORITHMS_CONFIG_H
