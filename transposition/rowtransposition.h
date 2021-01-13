//
// Created by andromeda on 1/13/21.
//

#ifndef ENCRYPTION_ALGORITHMS_ROWTRANSPOSITION_H
#define ENCRYPTION_ALGORITHMS_ROWTRANSPOSITION_H

void generate_permutations(char* key, int* p, int* ip);
void apply_padding(char* plain_text, size_t final_length);
void encrypt_rowtransposition(char* plain_text, char* cipher_text, char* key);
void decrypt_rowtransposition(char* cipher_text, char* plain_text, char* key);

#endif //ENCRYPTION_ALGORITHMS_ROWTRANSPOSITION_H
