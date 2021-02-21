#include "config.h"
#include "sdes_util.h"
#include "subkey.h"
#include "sdes_feistel.h"
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

int decrypt_byte_sdes(int x, int key) {
    int key_1 = get_key_1(key);
    int key_2 = get_key_2(key);
    int ip = initial_permutation(x, IP);
    int stage_1 = apply_feistel(ip, key_2);
    int switched = switch_order(stage_1, 8);
    int stage_2 = apply_feistel(switched, key_1);
    int inverse_ip[8];
    generate_inverse_ip(IP, inverse_ip);
    return inverse_initial_permutation(stage_2, inverse_ip);
}

void encrypt_sdes(const char* plain_text, char* cipher_text, int key) {
    int i = 0;
    while (plain_text[i] != 0) {
        int current_letter = toupper(plain_text[i]);
        int cipher_letter = encrypt_byte_sdes(current_letter, key);
        cipher_text[i] = (char) cipher_letter;
        i++;
    }
    cipher_text[i] = 0;
}

void decrypt_sdes(const char* cipher_text, char* plain_text, int key) {
    int i = 0;
    while (cipher_text[i] != 0) {
        int current_letter = (int) cipher_text[i];
        int plain_letter = decrypt_byte_sdes(current_letter, key);
        plain_text[i] = (char) plain_letter;
        i++;
    }
    plain_text[i] = 0;
}
