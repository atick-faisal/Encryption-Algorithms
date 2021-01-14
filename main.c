#include <stdio.h>
#include "substitution/caesar.h"
#include "substitution/monoalphabetic.h"
#include "substitution/vignere.h"
#include "substitution/autokey.h"
#include "transposition/railfence.h"
#include "transposition/rowtransposition.h"
#include "sdes/sdes_util.h"

void print_binary(int x, int size) {
    printf("0b");
    for (int i = size - 1; i >= 0; i--) {
        unsigned char bit = (x >> i) & 1;
        printf("%u", bit);
    }
    printf("\n");
}

int main() {
    printf("\n--------------------- CAESAR CIPHER ----------------------\n");
    char plain_text_caesar[] = "ENTANGLEMENT";
    char cipher_text_caesar[50];
    int key = 3;
    printf("PLAIN TEXT : %s\nKEY        : %d\n", plain_text_caesar, key);
    encrypt_caesar(plain_text_caesar, cipher_text_caesar, key);
    printf("ENCRYPTION -> CIPHER TEXT : %s\n", cipher_text_caesar);
    decrypt_caesar(cipher_text_caesar, plain_text_caesar, key);
    printf("DECRYPTION -> PLAIN TEXT  : %s\n", plain_text_caesar);

    printf("\n----------------- MONO ALPHABETIC CIPHER ---------------\n");
    char plain_text_mono[] = "ESTABLISHMENT";
    char cipher_text_mono[50];
    char key_map[] = "QWERTYUIOPASDFGHJKLZXCVBNM";
    printf("PLAIN TEXT : %s\nKEY        : %s\n", plain_text_mono, key_map);
    encrypt_mono_alphabetic(plain_text_mono, cipher_text_mono, key_map);
    printf("ENCRYPTION -> CIPHER TEXT : %s\n", cipher_text_mono);
    decrypt_mono_alphabetic(cipher_text_mono, plain_text_mono, key_map);
    printf("DECRYPTION -> PLAIN TEXT  : %s\n", plain_text_mono);

    printf("\n------------------- VIGNERE CIPHER -------------------\n");
    char plain_text_vignere[] = "WEAREDISCOVEREDSAVEYOURSELF";
    char cipher_text_vignere[50];
    char key_vignere[] = "deceptive";
    printf("PLAIN TEXT : %s\nKEY        : %s\n", plain_text_vignere, key_vignere);
    encrypt_vignere(plain_text_vignere, cipher_text_vignere, key_vignere);
    printf("ENCRYPTION -> CIPHER TEXT : %s\n", cipher_text_vignere);
    decrypt_vignere(cipher_text_vignere, plain_text_vignere, key_vignere);
    printf("DECRYPTION -> PLAIN TEXT  : %s\n", plain_text_vignere);

    printf("\n------------------- AUTOKEY CIPHER -------------------\n");
    char plain_text_autokey[] = "WEAREDISCOVEREDSAVEYOURSELF";
    char cipher_text_autokey[50];
    char primary_key[] = "deceptive";
    char key_autokey[50];
    generate_autokey(primary_key, plain_text_autokey, key_autokey);
    printf("PLAIN TEXT : %s\nKEY        : %s\n", plain_text_autokey, key_autokey);
    encrypt_autokey(plain_text_autokey, cipher_text_autokey, key_autokey);
    printf("ENCRYPTION -> CIPHER TEXT : %s\n", cipher_text_autokey);
    decrypt_autokey(cipher_text_autokey, plain_text_autokey, key_autokey);
    printf("DECRYPTION -> PLAIN TEXT  : %s\n", plain_text_autokey);

    printf("\n------------------- RAIL FENCE CIPHER -------------------\n");
    char plain_text_railfence[] = "CRYPTOGRAPHY";
    char cipher_text_railfence[50];
    printf("PLAIN TEXT : %s\n", plain_text_railfence);
    encrypt_railfence(plain_text_railfence, cipher_text_railfence);
    printf("ENCRYPTION -> CIPHER TEXT : %s\n", cipher_text_railfence);
    decrypt_railfence(cipher_text_railfence, plain_text_railfence);
    printf("DECRYPTION -> PLAIN TEXT  : %s\n", plain_text_railfence);

    printf("\n--------------- ROW TRANSPOSITION CIPHER ---------------\n");
    char plain_text_rt[] = "ATTACKPOSTPONEDUNTILTWOAM";
    char cipher_text_rt[50];
    char key_rt[] = "4312567";
    printf("PLAIN TEXT : %s\nKEY        : %s\n", plain_text_rt, key_rt);
    encrypt_rowtransposition(plain_text_rt, cipher_text_rt, key_rt);
    printf("ENCRYPTION -> CIPHER TEXT : %s\n", cipher_text_rt);
    decrypt_rowtransposition(cipher_text_rt, plain_text_rt, key_rt);
    printf("DECRYPTION -> PLAIN TEXT  : %s\n", plain_text_rt);

    return 0;
}
