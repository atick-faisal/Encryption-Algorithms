#ifndef ENCRYPTION_ALGORITHMS_DES_H
#define ENCRYPTION_ALGORITHMS_DES_H

#include <stdlib.h>
#include "fiestel.h"
#include "keygen.h"
#include "util.h"

unsigned long encrypt_block_des(unsigned long block, unsigned long key);

#endif //ENCRYPTION_ALGORITHMS_DES_H
