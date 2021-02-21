#ifndef ENCRYPTION_ALGORITHMS_SDES_FEISTEL_H
#define ENCRYPTION_ALGORITHMS_SDES_FEISTEL_H

int expand_permutation(int x, const int* ep);
int permutation_p4(int x, const int* p4);
int get_s_box_value(int x, const int s_box[4][4]);
int apply_s_boxes(int x);
int apply_feistel(int x, int key);

#endif //ENCRYPTION_ALGORITHMS_SDES_FEISTEL_H
