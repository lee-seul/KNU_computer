#include <stdio.h>
#include <string.h>
#include <stdlib.h>
 
typedef struct polyNode* polyPointer;
typedef struct polyNode {
    int coef;
    int expon;
    polyPointer link;
}polyNode;
 
void insert(polyPointer* head, polyPointer newNode) {
    if (*head == NULL)
        *head = newNode;
    else {
        polyPointer tail = *head;
        while (tail->link != NULL)
            tail = tail->link;
        tail->link = newNode;
    }
     
}
 
polyPointer createnew(int coef, int expon){
    polyPointer new = (polyNode*)malloc(sizeof(*new));
     
    new->link = NULL;
    new->coef = coef;
    new->expon = expon;
     
    return new;
}
 
void printList(polyPointer head){
    printf("입력 받은 다항식은: ");
    for (; head; head = head->link) {
        printf("%dx^%d", head->coef, head->expon);
        if (head->link != NULL)
            printf(" + ");
    }
    printf("\n");
     
}
 
void multiply(polyPointer head, int coef, int expon){
    for (; head; head = head->link) {
        head->coef = head->coef * coef;
        head->expon = head->expon + expon;
    }
}
 
int main(void) {
    polyPointer first = NULL, new = NULL;
    int num, i;
    int c, e;
     
    printf("다항식의 항의 개수를 쓰시오: ");
    scanf("%d", &num);
     
    for (i = 0; i < num; i++) {
        printf("%d번째 항의 계수와 차수를 쓰시오: ", i + 1);
        scanf("%d %d", &c, &e);
        new = createnew(c, e);
        insert(&first, new);
    }
    printList(first);
     
    multiply(first, 7, 3);
     
    printf("7x^3을 곱한 결과: ");
    printList(first);
     
    return 0;
}
