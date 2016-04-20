#include <stdio.h>

// 반복문
int horner(int num[], int x, int c){
    
    int result = 0, i;

    for(i = 0; i <= c; i++) result = (result+num[i])*x;

    return result/x;

}


int main(void){
    int a[20];
    int c, x, n;

    printf("차수 입력: ");
    scanf("%d", &c);
    
    n = c;
    for (int i = 0; i <= c; i++){
    
        printf("%d차수의 계수입력: ", n--);
        scanf("%d", &a[i]);
    }
    
    printf("x값 입력: ");
    scanf("%d", &x);

    printf("결과: %d\n", horner(a, x, c));  


    return 0;
}
