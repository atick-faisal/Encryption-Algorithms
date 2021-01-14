#ifndef ENCRYPTION_ALGORITHMS_AUTOKEY_H
#define ENCRYPTION_ALGORITHMS_AUTOKEY_H

void generate_autokey(char* key, char* plain_text, char* autokey);
void encrypt_autokey(char* plain_text, char* cipher_text, char* key);
void decrypt_autokey(char* cipher_text, char* plain_text, const char* key);

#endif //ENCRYPTION_ALGORITHMS_AUTOKEY_H
