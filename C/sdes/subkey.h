#ifndef ENCRYPTION_ALGORITHMS_SUBKEY_H
#define ENCRYPTION_ALGORITHMS_SUBKEY_H

int permutation_p10(int x, const int* p10);
int permutation_p8(int x, const int* p8);
int circular_left_shift(int x, int amount, int numBits);
int get_key_1(int key);
int get_key_2(int key);

#endif //ENCRYPTION_ALGORITHMS_SUBKEY_H
