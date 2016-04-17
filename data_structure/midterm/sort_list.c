#include <stdio.h>

void swap(int *a, int *b){
    int temp = *a;

    *a = *b;
    *b = temp;
}

void sort(int list[], int n){
    int min;

    for(int i = 0; i < n; i++){
        min = i;
        for(int j = i+1; j < n; j++){
            if(list[min]>list[j]){
                min=j;    
            }
        }
        swap(&list[i], &list[min]);
    }
}

int main(void){
    int a[] = {3, 1, 11, 13, 15, 42, 33, 27, 31};
    int i;
    sort(a, 9);
    
    for(i = 0; i < 9; i++){
        printf("%d ", a[i]); 
    }
    printf("\n");

    return 0;
}
