#include <stdio.h>

// while문 이용
/*
int searchnum(int list[], int num, int left, int right){
    int middle = 0;

    while(left<=right){
        middle = (left+right)/2;
        if(list[middle]>num)
            right = middle - 1;
        else{
            if(list[middle]==num)
                return middle;
            else
                left = middle + 1;
        }
    }
    return -1;
}
*/


// 재귀함수 이용
int searchnum(int list[], int num, int left, int right){
    int middle;
    
    if(left<=right){
        middle = (left + right)/2;
        if(num < list[middle])
            return searchnum(list, num, left, middle -1);
        else if(num > list[middle])
            return searchnum(list, num, middle + 1, right);
        else
            return middle;
    }
    return -1;
}


int main(void){
    int a[] = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11};
    int index;

    index = searchnum(a, 3, 0, 9);
    printf("%d\n", a[index]);

    index = searchnum(a, 4, 0, 9);
    printf("%d\n", a[index]);


    return 0;
}
