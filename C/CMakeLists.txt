cmake_minimum_required(VERSION 3.17)
project(Encryption_Algorithms C)

set(CMAKE_C_STANDARD 99)

add_executable(Encryption_Algorithms main.c substitution/caesar.c substitution/caesar.h substitution/monoalphabetic.c substitution/monoalphabetic.h substitution/substitution.h substitution/vignere.c substitution/vignere.h substitution/autokey.c substitution/autokey.h transposition/railfence.c transposition/railfence.h transposition/transposition.h transposition/rowtransposition.c transposition/rowtransposition.h sdes/config.h sdes/sdes_util.c sdes/sdes_util.h sdes/feistel.c sdes/feistel.h sdes/sdes.c sdes/sdes.h sdes/subkey.c sdes/subkey.h des/util.c des/util.h des/keygen.c des/keygen.h des/fiestel.c des/fiestel.h des/des.c des/des.h)