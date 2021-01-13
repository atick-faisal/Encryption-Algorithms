#include "caesar.h"

void encrypt_caesar(char* plain_text, char* cipher_text, int key) {
    int i = 0;
    while (plain_text[i] != 0) {
        int current_letter = toupper(plain_text[i]) - 65;
        int cipher_letter = ((current_letter + key) % 26) + 65;
        cipher_text[i] = (char ) cipher_letter;
        i++;
    }
    cipher_text[i]  = 0;
}