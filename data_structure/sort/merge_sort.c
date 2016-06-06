#include <stdio.h>
#define MAX_SIZE 10

int sorted[MAX_SIZE];

void merge(int list[], int left, int mid, int right){
    int i, j, k, l;
    i = left; j = mid + 1; k = left;
    while(i <= mid && j <=right){
        if(list[i] <= list[j]) sorted[k++] = list[i++];
        else sorted[k++] = list[j++];
    }
    if(i > mid){
        for(l = j; l <= right; l++)
            sorted[k++] = list[l];
    }
    else{
        for(l = i; l <= mid; l++)
            sorted[k++] = list[l];
    }
    for(l=left; l <= right; l++)
        list[l] = sorted[l];
}

void print_list(int list[], int n){
    int i;

    for(i = 0; i <n; i++){
        printf("%d ", list[i]);
    }
    printf("\n");
}

void merge_sort(int list[], int left, int right){
    int mid;
    if(left < right) {
        mid = (left + right)/2;
        merge_sort(list, left, mid);
        merge_sort(list, mid+1, right);
        merge(list, left, mid, right);
        print_list(list, 10);
    }
}

int main(void){
    int i; 
    int num_list[10];

    for(i = 0; i <10; i++){
        printf("%d번째 값을 입력하시오: ", i+1);
        scanf("%d", &num_list[i]);
    }

    merge_sort(num_list, 0, 9);

    return 0;
}
