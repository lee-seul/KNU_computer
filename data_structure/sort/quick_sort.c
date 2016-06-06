#include <stdio.h>
#define SWAP(x, y, t) ((t) = (x), (x) = (y), (y) = (t))

void print_list(int a[], int n){
    int i;
    for (i = 0; i <n; i++){
        printf("%d ", a[i]);
    }
    printf("\n");
}

void quickSort(int a[], int left, int right){
    int pivot, i, j, temp;
    if(left < right) {
        i = left; j = right + 1;
        pivot = a[left];
        do{
            do i++; while(a[i] < pivot);
            do j--; while(a[j] > pivot);
            if(i < j) SWAP(a[i], a[j], temp);
        } while(i < j);
        SWAP(a[left], a[j], temp);
        print_list(a, 10);
        quickSort(a, left, j-1);
        quickSort(a, j + 1, right);
    }
}


int main(void){
    int i;
    int num_list[10];

    for(i = 0; i <10; i++){
        printf("%d번째 값을 입력하시오: ", i+1);
        scanf("%d", &num_list[i]);
    }
    
    quickSort(num_list, 0, 9);

    return 0;
}
