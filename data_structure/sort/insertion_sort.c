#include <stdio.h>

void insert(int e, int a[], int i){
    a[0] = e;
    while(e < a[i]){
        a[i+1] = a[i];
        i--;
    }
    a[i+1] = e;
}

void insertionSort(int a[], int n){
    int j, temp, i;
    for(j = 2; j <= n; j++) {
        temp = a[j];
        insert(temp, a, j-1);
        if(j!=n){
            for(i = 1; i < 11; i++){
                printf("%d ", a[i]); 
            }
            printf("\n");
        }
    }
}

int main(void) {
    int i;
    int num_list[11];    


    for(i = 0; i < 10; i++){
        printf("%d번째 값을 입력하시오: ", i+1);
        scanf("%d", &num_list[i+1]);
    }
    
    insertionSort(num_list, 11);

    return 0;
}
