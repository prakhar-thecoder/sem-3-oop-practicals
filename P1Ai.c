#include <stdio.h>

void main () {
    int n;
    printf("Input the number of elements to be stored in the array: ");
    scanf("%d", &n);
    
    int a[n];
    int dup[n];
    int dup_i = 0;
    int dup_count = 0;
    for (int i = 0; i < n; i++) {
        printf("element - %d: ", i);
        scanf("%d", &a[i]);
        for (int j = 0; j < i; j++) {
            if (a[j] == a[i]) {
                dup[dup_i] = a[i];
                dup_count++;
                dup_i++;
                break;
            }
        }
    }
    
    printf("Total number of duplicate elements found in the array is: %d", dup_count);
    printf("\nDuplicate elements: ");
    for (int i = 0; i < dup_count - 1; i++) {
        printf("%d, ", dup[i]);
    }
    printf("%d", dup[dup_count - 1]);
}