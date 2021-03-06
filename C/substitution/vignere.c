#include "substitution.h"
#include "vignere.h"

void encrypt_vignere(char *plain_text, char *cipher_text, char *key) {
    int i = 0;
    while (plain_text[i] != 0) {
        int current_index = toupper(plain_text[i]) - 65;
        int current_key = toupper(key[i % strlen(key)]) - 65;
        int cipher_letter = ((current_index + current_key) % 26) + 65;
        cipher_text[i] = (char) cipher_letter;
        i++;
    }
    cipher_text[i] = 0;
}

void decrypt_vignere(char *cipher_text, char *plain_text, char *key) {
    int i = 0;
    while (cipher_text[i] != 0) {
        int current_index = toupper(cipher_text[i]) - 65;
        int current_key = toupper(key[i % strlen(key)]) - 65;
        int plain_letter = ((current_index - current_key + 26) % 26) + 65;
        plain_text[i] = (char) plain_letter;
        i++;
    }
    plain_text[i] = 0;
}