#ifndef ENCRYPTION_ALGORITHMS_SDES_H
#define ENCRYPTION_ALGORITHMS_SDES_H

int encrypt_byte_sdes(int x, int key);
int decrypt_byte_sdes(int x, int key);
void encrypt_sdes(const char* plain_text, char* cipher_text, int key);
void decrypt_sdes(const char* cipher_text, char* plain_text, int key);

#endif //ENCRYPTION_ALGORITHMS_SDES_H
