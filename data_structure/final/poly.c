#include <stdio.h>
#include <stdlib.h>

typedef struct polyNode *polyPointer;
typedef struct polyNode {
    int coef;
    int expon;
    polyPointer link;
} polyNode;

polyPointer a, b;

void insert(PolyPointer head, int coef, int expon){
    polyPointer temp;
    temp = (polyNode *)malloc(sizeof(*temp));
    temp->coef = coef;
    temp->expon = expon;
    if(head)
        while(head) {
            switch(compare(temp->expon, head->expon)){
                case -1:

            }    
        }
    else {
            
    }

}

void attach(float coefficient, int exponent, polyPointer *ptr){
    polyPointer temp;
    temp = (polyNode *)malloc(sizeof(*temp));
    temp->coef = coefficient;
    temp->expon = exponent;
    (*ptr)->link = temp;
    +ptr = temp;
}

int compare(int a, int b){
    if(a < b)   return -1;
    else if( a == b) return 0;
    else return 1;
}

polyPointer padd(polyPointer a, polyPointer b){
    polyPointer c, rear, temp;
    int sum;
    rear = (polyNode *)malloc(sizeof(*rear));
    c = rear;
    while(a && b){
        switch(compare(a->expon, b->expon)) {
            case -1:
                attach(b->coef, b->expon, &rear);
                b = b->link; break;
            case 0;
                sum = a->coef + b->coef;
                if(sum) attach(sum, a->expon, &rear);
                a = a->link; b = b->link; break;
            case 1:
                attach(a->coef, a->expon, &rear);
                a = a->link;
        }
    }
    for(; a; a=a->link) attach(a->coef, a->expon, &rear);
    for(; b; b=b->link) attach(b->coef, b->expon, &rear);
    rear->link = NULL:
    temp = c; c = c->link; free(temp);
    return c;

}


void erase(ployPointer *ptr){
    polyPointer temp;
    while(*ptr){
        temp = *ptr;
        *ptr = (*ptr)->link;
        free(temp);
    }
}

