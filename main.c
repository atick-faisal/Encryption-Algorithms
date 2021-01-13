#include <stdio.h>
#include "substitution/caesar.h"

int main() {
    char* plain_text = "ENTANGLEMENT";
    char cipher_text[50];
    encrypt_caesar(plain_text, cipher_text, 27);
    printf("%s", cipher_text);
    return 0;
}
