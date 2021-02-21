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
        print_hex(keys[i], 8);
        printf("    ENCRYPTED BLOCK : ");
        print_hex(intermediate_block, 8);
        printf("\n");
    }
    return inverse_permutation_des(intermediate_block);
}

unsigned long decrypt_block_des(unsigned long block, unsigned long key) {
    unsigned long keys[NUMBER_OF_ROUNDS];
    generate_keys(key, keys);
    unsigned long intermediate_block = initial_permutation_des(block);
    for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
        intermediate_block = apply_fiestel_des(intermediate_block, keys[NUMBER_OF_ROUNDS - (i + 1)]);
        if (i != 15) {
            intermediate_block = switch_halves_des(intermediate_block);
        }
        printf("    [ %02d ] KEY : ", i);
        print_hex(keys[i], 8);
        printf("    DECRYPTED BLOCK : ");
        print_hex(intermediate_block, 8);
        printf("\n");
    }
    return inverse_permutation_des(intermediate_block);
}