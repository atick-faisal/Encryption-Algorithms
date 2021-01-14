#include "transposition.h"
#include "rowtransposition.h"

void generate_permutations(char* key, int* p, int* ip) {
    int key_length = (int) strlen(key);
    for (int i = 0; i < key_length; i++) {
        p[i] = key[i] - 48;
        ip[i] = (int) (strchr(key, i + 49) - key) + 1;
    }
}

void apply_padding(char* plain_text, size_t final_length) {
    int i;
    char temp[50];
    size_t text_length = strlen(plain_text);
    char padding[] = "XYZXYZXYZXYZXYZ";
    for (i = 0; i < final_length; i++) {
        if (i < text_length) {
            temp[i] = plain_text[i];
        } else {
            temp[i] = padding[i - text_length];
        }
    }
    temp[i] = 0;
    strcpy(plain_text, temp);
}

void encrypt_rowtransposition(char* plain_text, char* cipher_text, char* key) {
    size_t message_length = strlen(plain_text);
    size_t key_length = strlen(key);
    size_t final_length = message_length + key_length - (message_length % key_length);
    apply_padding(plain_text, final_length);
    int p[key_length];
    int ip[key_length];
    generate_permutations(key, p, ip);

    int index = 0;

    for (int i = 0; i < key_length; i++) {
        for (int j = ip[i] - 1; j < final_length; j+=key_length) {
            cipher_text[index] = plain_text[j];
            index++;
        }
    }

    cipher_text[final_length] = 0;
}

void decrypt_rowtransposition(char* cipher_text, char* plain_text, char* key) {
    size_t message_length = strlen(cipher_text);
    size_t key_length = strlen(key);
    size_t step_size = message_length / key_length;
    int p[key_length];
    int ip[key_length];
    generate_permutations(key, p, ip);

    int index = 0;

    for (int i = 0; i < step_size; i++) {
        for (int j = 0; j < key_length; j++) {
            plain_text[index] = cipher_text[(p[j] - 1) * step_size + i];
            index++;
        }
    }

    plain_text[message_length] = 0;
}
