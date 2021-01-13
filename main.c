#include <stdio.h>
#include "substitution/caesar.h"

int main() {
    printf("\n--------------------- CAESAR CIPHER ----------------------\n");
    char plain_text[] = "ENTANGLEMENT";
    char cipher_text[50];
    int key = 3;
    printf("PLAIN TEXT : %s\nKEY        : %d\n", plain_text, key);
    encrypt_caesar(plain_text, cipher_text, key);
    printf("ENCRYPTION -> CIPHER TEXT : %s\n", cipher_text);
    decrypt_caesar(cipher_text, plain_text, key);
    printf("DECRYPTION -> PLAIN TEXT  : %s\n", plain_text);

    return 0;
}
