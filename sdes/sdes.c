//
// Created by andromeda on 1/14/21.
//

#include "config.h"
#include "sdes.h"

const int P4[P4_LENGTH] = {2, 4, 3, 1};
const int P8[P8_LENGTH] = {6, 3, 7, 4, 8, 5, 10, 9};
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
