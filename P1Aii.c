#include <stdio.h>

void main () {
    int n;
    printf("Input the number of elements to be stored in the array: ");
    scanf("%d", &n);
    
    int a[n];
    int i = 0;
    int count = 0;
    int temp;
    int freq[n];
    int freq_i = 0;
    int freq_count = 0;
    
    printf("Input %d elements in the array:\n", n);
    
    while (count < n) {
        printf("element - %d: ", i);
        scanf("%d", &temp);
        int j;
        for (j = 0; j < i; j++) {
            if (temp == a[j]) {
                freq[j]++;
                break;
            }
        }
        if (i - j == 0) {
            a[i] = temp;
            i++;
            freq[freq_i] = 1;
            freq_i++;
            freq_count++;
        }
        count++;
    }
    
    printf("The frequency of all elements in an array:\n");
    
    for (int i = 0; i < freq_count; i++) {
        printf("%d occurs %d time\n", a[i], freq[i]);
    }
}
