#ifndef ENCRYPTION_ALGORITHMS_SDES_UTIL_H
#define ENCRYPTION_ALGORITHMS_SDES_UTIL_H

int index_of(const int* arr, int element, size_t size);
void generate_inverse_ip(const int* ip, int* inverse_ip);
int initial_permutation(int x, const int* ip);
int inverse_initial_permutation(int x, const int* inverse_ip);
int switch_order(int x, size_t size);

#endif //ENCRYPTION_ALGORITHMS_SDES_UTIL_H
