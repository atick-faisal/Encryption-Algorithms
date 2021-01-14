#ifndef ENCRYPTION_ALGORITHMS_MONOALPHABETIC_H
#define ENCRYPTION_ALGORITHMS_MONOALPHABETIC_H

void encrypt_mono_alphabetic(char* plain_text, char* cipher_text, const char* key_map);
void decrypt_mono_alphabetic(char* cipher_text, char* plain_text, const char* key_map);

#endif //ENCRYPTION_ALGORITHMS_MONOALPHABETIC_H
