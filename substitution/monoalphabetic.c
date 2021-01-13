#include "substitution.h"
#include "monoalphabetic.h"

void encrypt_mono_alphabetic(char* plain_text, char* cipher_text, const char* key_map) {
    int i = 0;
    while (plain_text[i] != 0) {
        int current_index = toupper(plain_text[i]) - 65;
        char cipher_letter = key_map[current_index];
        cipher_text[i] = cipher_letter;
        i++;
    }
    cipher_text[i]  = 0;
}