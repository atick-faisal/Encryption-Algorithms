cmake_minimum_required(VERSION 3.17)
project(Encryption_Algorithms C)

set(CMAKE_C_STANDARD 99)

add_executable(Encryption_Algorithms main.c substitution/caesar.c substitution/caesar.h substitution/monoalphabetic.c substitution/monoalphabetic.h substitution/substitution.h substitution/vignere.c substitution/vignere.h)