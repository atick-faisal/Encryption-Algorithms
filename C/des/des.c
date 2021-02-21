#include "des.h"

unsigned long encrypt_block_des(unsigned long block, unsigned long key) {
    unsigned long keys[NUMBER_OF_ROUNDS];
    generate_keys(key, keys);
    unsigned long intermediate_block = initial_permutation_des(block);
    for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
        intermediate_block = apply_fiestel_des(intermediate_block, keys[i]);
        if (i != 15) {
            intermediate_block = switch_halves_des(intermediate_block);
        }
        printf("    [ %02d ] KEY : ", i);
        print_hex(keys[i]);
        printf("    CIPHER BLOCK : ");
        print_hex(intermediate_block);
        printf("\n");
    }
    return inverse_permutation_des(intermediate_block);
}