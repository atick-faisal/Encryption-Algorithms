#ifndef ENCRYPTION_ALGORITHMS_DES_H
#define ENCRYPTION_ALGORITHMS_DES_H

#include <stdlib.h>
#include "fiestel.h"
#include "keygen.h"
#include "des_util.h"

unsigned long encrypt_block_des(unsigned long block, unsigned long key);
unsigned long decrypt_block_des(unsigned long block, unsigned long key);

#endif //ENCRYPTION_ALGORITHMS_DES_H
