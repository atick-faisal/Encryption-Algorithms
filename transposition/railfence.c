#include "transposition.h"
#include "railfence.h"

void encrypt_railfence(char* plain_text, char* cipher_text) {
    int message_length = (int) strlen(plain_text);
    int mid_point = (message_length % 2 == 0)?
            message_length / 2 : (message_length + 1) / 2;
    int i = 0;
    while (plain_text[i] != 0) {
        if (i % 2 == 0) {
            cipher_text[i / 2] = plain_text[i];
        } else {
            cipher_text[i / 2 + mid_point] = plain_text[i];
        }
        i++;
    }
    cipher_text[i] = 0;
}