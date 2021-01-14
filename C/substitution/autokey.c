#include "substitution.h"
#include "autokey.h"

void generate_autokey(char* key, char* plain_text, char* autokey) {
    int i = 0;
    unsigned int key_length = strlen(key);
    while (i < (strlen(plain_text))) {
        if (i < key_length) {
            autokey[i] = (char) toupper(key[i]);
        } else {
            autokey[i] = plain_text[i - key_length];
        }
        i++;
    }
    autokey[i] = 0;
}

void encrypt_autokey(char* plain_text, char* cipher_text, char* key) {
    char autokey[strlen(plain_text) + 1];
    generate_autokey(key, plain_text, autokey);
    int i = 0;
    while (plain_text[i] != 0) {
        int current_letter = toupper(plain_text[i]) - 65;
        int current_key = (int) autokey[i] - 65;
        int cipher_letter = ((current_letter + current_key) % 26) + 65;
        cipher_text[i] = (char) cipher_letter;
        i++;
    }
    cipher_text[i]  = 0;
}

void decrypt_autokey(char* cipher_text, char* plain_text, const char* key) {
    int i = 0;
    while (cipher_text[i] != 0) {
        int current_letter = toupper(cipher_text[i]) - 65;
        int current_key = (int) key[i] - 65;
        int cipher_letter = ((current_letter - current_key + 26) % 26) + 65;
        plain_text[i] = (char) cipher_letter;
        i++;
    }
    plain_text[i]  = 0;
}