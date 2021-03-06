#include "transposition.h"
#include "railfence.h"

void encrypt_railfence(char* plain_text, char* cipher_text) {
    int message_length = (int) strlen(plain_text);
    int mid_point = (message_length % 2 == 0)?
            message_length / 2 : (message_length + 1) / 2;
    int i = 0;
    while (plain_text[i] != 0) {
        if (i % 2 == 0) {
            cipher_text[i / 2] = (char) toupper(plain_text[i]);
        } else {
            cipher_text[i / 2 + mid_point] = (char) toupper(plain_text[i]);
        }
        i++;
    }
    cipher_text[i] = 0;
}

void decrypt_railfence(char* cipher_text, char* plain_text) {
    int message_length = (int) strlen(cipher_text);
    int mid_point = (message_length % 2 == 0)?
                    message_length / 2 : (message_length + 1) / 2;
    int i = 0;
    while (cipher_text[i] != 0) {
        if (i < mid_point) {
            plain_text[i * 2] = (char) toupper(cipher_text[i]);
        } else {
            plain_text[i * 2 + 1] = (char) toupper(cipher_text[i]);
        }
        i++;
    }
    plain_text[i] = 0;
}