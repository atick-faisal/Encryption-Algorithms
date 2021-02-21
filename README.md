# Encryption Algorithms <img src="https://cmake.org/wp-content/uploads/2018/11/cmake_logo_slider.png" height="100" align="right"/> 
[![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/) [![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/MIT/) [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/Naereen/StrapDown.js/graphs/commit-activity)

### Implemented Algorithms
 - Caesar Cipher
 - Monoalphabetic Cipher
 - Vignere Cipher
 - Autokey Cipher
 - Rail Fence Cipher
 - Row Transposition Cipher
 - SDES Encryption
 - DES Encryption

### Building and Running (C)

``` bash
    cmake -Bbuild -H.
    cmake --bulid build --traget all
    ./build/Encryption_Algorithms
```

### Building and Running (Kotlin)

``` bash
    kotlinc Main.kt -include-runtime -d main.jar
    java -jar main.jar
```

### Expected Output

```

--------------------- CAESAR CIPHER ----------------------
PLAIN TEXT : ENTANGLEMENT
KEY        : 3
ENCRYPTION -> CIPHER TEXT : HQWDQJOHPHQW
DECRYPTION -> PLAIN TEXT  : ENTANGLEMENT

----------------- MONO ALPHABETIC CIPHER ---------------
PLAIN TEXT : ESTABLISHMENT
KEY        : QWERTYUIOPASDFGHJKLZXCVBNM
ENCRYPTION -> CIPHER TEXT : TLZQWSOLIDTFZ
DECRYPTION -> PLAIN TEXT  : ESTABLISHMENT

------------------- VIGNERE CIPHER -------------------
PLAIN TEXT : WEAREDISCOVEREDSAVEYOURSELF
KEY        : deceptive
ENCRYPTION -> CIPHER TEXT : ZICVTWQNGRZGVTWAVZHCQYGLMGJ
DECRYPTION -> PLAIN TEXT  : WEAREDISCOVEREDSAVEYOURSELF

------------------- AUTOKEY CIPHER -------------------
PLAIN TEXT : WEAREDISCOVEREDSAVEYOURSELF
KEY        : DECEPTIVEWEAREDISCOVEREDSAV
ENCRYPTION -> CIPHER TEXT : ZICVTWQNGKZEIIGASXSTSLVVWLA
DECRYPTION -> PLAIN TEXT  : WEAREDISCOVEREDSAVEYOURSELF

------------------- RAIL FENCE CIPHER -------------------
PLAIN TEXT : CRYPTOGRAPHY
ENCRYPTION -> CIPHER TEXT : CYTGAHRPORPY
DECRYPTION -> PLAIN TEXT  : CRYPTOGRAPHY

--------------- ROW TRANSPOSITION CIPHER ---------------
PLAIN TEXT : ATTACKPOSTPONEDUNTILTWOAM
KEY        : 4312567
ENCRYPTION -> CIPHER TEXT : TTNAAPTMTSUOAODWCOIXKNLYPETZ
DECRYPTION -> PLAIN TEXT  : ATTACKPOSTPONEDUNTILTWOAMXYZ

------------------- SDES ENCRYPTION -------------------
PLAIN BYTE : 0b01110010
KEY        : 0b1010000010
ENCRYPTION -> CIPHER BYTE : 0b01110111
DECRYPTION -> PLAIN TEXT  : 0b01110010

PLAIN TEXT : ANDROMEDA
KEY        : 0b1010000010
ENCRYPTION -> CIPHER TEXT : �_�G�P_
DECRYPTION -> PLAIN TEXT  : ANDROMEDA

------------------- DES ENCRYPTION -------------------

PLAIN TEXT : 12 34 56 AB CD 13 25 36 
KEY        : AA BB 09 18 27 36 CC DD 

    ================================ ENCRYPTION ROUNDS ================================
    [ 00 ] KEY : 00 00 19 4C D0 72 DE 8C     ENCRYPTED BLOCK : 18 CA 18 AD 5A 78 E3 94 
    [ 01 ] KEY : 00 00 45 68 58 1A BC CE     ENCRYPTED BLOCK : 5A 78 E3 94 4A 12 10 F6 
    [ 02 ] KEY : 00 00 06 ED A4 AC F5 B5     ENCRYPTED BLOCK : 4A 12 10 F6 B8 08 95 91 
    [ 03 ] KEY : 00 00 DA 2D 03 2B 6E E3     ENCRYPTED BLOCK : B8 08 95 91 23 67 79 C2 
    [ 04 ] KEY : 00 00 69 A6 29 FE C9 13     ENCRYPTED BLOCK : 23 67 79 C2 A1 5A 4B 87 
    [ 05 ] KEY : 00 00 C1 94 8E 87 47 5E     ENCRYPTED BLOCK : A1 5A 4B 87 2E 8F 9C 65 
    [ 06 ] KEY : 00 00 70 8A D2 DD B3 C0     ENCRYPTED BLOCK : 2E 8F 9C 65 A9 FC 20 A3 
    [ 07 ] KEY : 00 00 34 F8 22 F0 C6 6D     ENCRYPTED BLOCK : A9 FC 20 A3 30 8B EE 97 
    [ 08 ] KEY : 00 00 84 BB 44 73 DC CC     ENCRYPTED BLOCK : 30 8B EE 97 10 AF 9D 37 
    [ 09 ] KEY : 00 00 02 76 57 08 B5 BF     ENCRYPTED BLOCK : 10 AF 9D 37 6C A6 CB 20 
    [ 10 ] KEY : 00 00 6D 55 60 AF 7C A5     ENCRYPTED BLOCK : 6C A6 CB 20 FF 3C 48 5F 
    [ 11 ] KEY : 00 00 C2 C1 E9 6A 4B F3     ENCRYPTED BLOCK : FF 3C 48 5F 22 A5 96 3B 
    [ 12 ] KEY : 00 00 99 C3 13 97 C9 1F     ENCRYPTED BLOCK : 22 A5 96 3B 38 7C CD AA 
    [ 13 ] KEY : 00 00 25 1B 8B C7 17 D0     ENCRYPTED BLOCK : 38 7C CD AA BD 2D D2 AB 
    [ 14 ] KEY : 00 00 33 30 C5 D9 A3 6D     ENCRYPTED BLOCK : BD 2D D2 AB CF 26 B4 72 
    [ 15 ] KEY : 00 00 18 1C 5D 75 C6 6D     ENCRYPTED BLOCK : 19 BA 92 12 CF 26 B4 72 
    ====================================== DONE =======================================

ENCRYPTION -> CIPHER BLOCK : C0 B7 A8 D0 5F 3A 82 9C 

    ================================ DECRYPTION ROUNDS ================================
    [ 00 ] KEY : 00 00 19 4C D0 72 DE 8C     DECRYPTED BLOCK : CF 26 B4 72 BD 2D D2 AB 
    [ 01 ] KEY : 00 00 45 68 58 1A BC CE     DECRYPTED BLOCK : BD 2D D2 AB 38 7C CD AA 
    [ 02 ] KEY : 00 00 06 ED A4 AC F5 B5     DECRYPTED BLOCK : 38 7C CD AA 22 A5 96 3B 
    [ 03 ] KEY : 00 00 DA 2D 03 2B 6E E3     DECRYPTED BLOCK : 22 A5 96 3B FF 3C 48 5F 
    [ 04 ] KEY : 00 00 69 A6 29 FE C9 13     DECRYPTED BLOCK : FF 3C 48 5F 6C A6 CB 20 
    [ 05 ] KEY : 00 00 C1 94 8E 87 47 5E     DECRYPTED BLOCK : 6C A6 CB 20 10 AF 9D 37 
    [ 06 ] KEY : 00 00 70 8A D2 DD B3 C0     DECRYPTED BLOCK : 10 AF 9D 37 30 8B EE 97 
    [ 07 ] KEY : 00 00 34 F8 22 F0 C6 6D     DECRYPTED BLOCK : 30 8B EE 97 A9 FC 20 A3 
    [ 08 ] KEY : 00 00 84 BB 44 73 DC CC     DECRYPTED BLOCK : A9 FC 20 A3 2E 8F 9C 65 
    [ 09 ] KEY : 00 00 02 76 57 08 B5 BF     DECRYPTED BLOCK : 2E 8F 9C 65 A1 5A 4B 87 
    [ 10 ] KEY : 00 00 6D 55 60 AF 7C A5     DECRYPTED BLOCK : A1 5A 4B 87 23 67 79 C2 
    [ 11 ] KEY : 00 00 C2 C1 E9 6A 4B F3     DECRYPTED BLOCK : 23 67 79 C2 B8 08 95 91 
    [ 12 ] KEY : 00 00 99 C3 13 97 C9 1F     DECRYPTED BLOCK : B8 08 95 91 4A 12 10 F6 
    [ 13 ] KEY : 00 00 25 1B 8B C7 17 D0     DECRYPTED BLOCK : 4A 12 10 F6 5A 78 E3 94 
    [ 14 ] KEY : 00 00 33 30 C5 D9 A3 6D     DECRYPTED BLOCK : 5A 78 E3 94 18 CA 18 AD 
    [ 15 ] KEY : 00 00 18 1C 5D 75 C6 6D     DECRYPTED BLOCK : 14 A7 D6 78 18 CA 18 AD 
    ====================================== DONE =======================================

DECRYPTION -> PLAIN TEXT BLOCK : 12 34 56 AB CD 13 25 36 

```

## License
[![licensebuttons by-nc-sa](https://licensebuttons.net/l/by-nc-sa/3.0/88x31.png)](https://creativecommons.org/licenses/by-nc-sa/4.0)

This work is licensed under [MIT License](https://github.com/atick-faisal/Encryption-Algorithms/blob/master/LICENSE).
