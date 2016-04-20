#include <stdio.h>

void swap(char *a, char *b){
    int temp = *a;
    
    *a = *b;
    *b = temp;
}

void perm(char list[], int i, int n){
    int j;

    if(i == n){
    
        for(j = 0; j <= n; j++){
        
            printf("%c", list[j]);
        }
        printf("     ");
    }
    else{
    
        for(j = i; j <= n; j++){
            swap(&list[i], &list[j]);
            perm(list, i+1, n);
            swap(&list[i], &list[j]);                
            }
    }
}

int main(void){
    char a[4] = {'a', 'b', 'd', 'c'};

    perm(a, 0, 3);

    return 0;
}


