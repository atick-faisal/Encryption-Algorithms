#ifndef ENCRYPTION_ALGORITHMS_UTIL_H
#define ENCRYPTION_ALGORITHMS_UTIL_H

#include <stdlib.h>

unsigned long initial_permutation_des(unsigned long x);
unsigned long inverse_permutation_des(unsigned long x);
unsigned long switch_halves_des(unsigned long x);

#endif //ENCRYPTION_ALGORITHMS_UTIL_H
