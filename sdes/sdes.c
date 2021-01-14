#include "config.h"
#include "sdes_util.h"
#include "subkey.h"
#include "feistel.h"
#include "sdes.h"

const int IP[] = {2, 6, 3, 1, 4, 8, 5, 7};

int encrypt_byte_sdes(int x, int key) {
    int key_1 = get_key_1(key);
    int key_2 = get_key_2(key);
    int ip = initial_permutation(x, IP);
    int stage_1 = apply_feistel(ip, key_1);
    int switched = switch_order(stage_1, 8);
    int stage_2 = apply_feistel(switched, key_2);
    int inverse_ip[8];
    generate_inverse_ip(IP, inverse_ip);
    return inverse_initial_permutation(stage_2, inverse_ip);
}
