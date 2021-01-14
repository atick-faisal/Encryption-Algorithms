#ifndef ENCRYPTION_ALGORITHMS_CONFIG_H
#define ENCRYPTION_ALGORITHMS_CONFIG_H

const int P4[] = {2, 4, 3, 1};
const int P8[] = {6, 3, 7, 4, 8, 5, 10, 9};
const int IP[] = {2, 6, 3, 1, 4, 8, 5, 7};
const int EP[] = {4, 1, 2, 3, 2, 3, 4, 1};
const int P10[] = {3, 5, 2, 7, 4, 10, 1, 9, 8, 6};

const int S0[][] = {
        {0b01, 0b00, 0b11, 0b10},
        {0b11, 0b10, 0b01, 0b00},
        {0b00, 0b10, 0b01, 0b11},
        {0b11, 0b01, 0b11, 0b10}
};

const int S1[][] = {
        {0b00, 0b01, 0b10, 0b11},
        {0b10, 0b00, 0b01, 0b11},
        {0b11, 0b00, 0b01, 0b00},
        {0b10, 0b01, 0b00, 0b11}
};

#endif //ENCRYPTION_ALGORITHMS_CONFIG_H
