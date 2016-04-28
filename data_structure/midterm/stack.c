#include <stdio.h>
#include <stdlib.h>

#define MAX_STACK_SIZE 10

int stack[MAX_STACK_SIZE];
int top = -1;

// typedef struct one{
//    int i;
//    int n;
//} one;


void stackFull(){

    fprintf(stderr, "Stack is full, cannot add element");
    exit(EXIT_FAILURE);
}


void push(int item){

    if(top>=MAX_STACK_SIZE - 1)
        stackFull();

    stack[++top] = item;
}

int pop(){

    if(top == -1)
        return -1;
    return stack[top--];
}

int main(void){
    
//    one *a = NULL;
//    printf("%lu\n", sizeof(*a));
//    printf("%lu\n", sizeof(a));
//    printf("%lu\n", sizeof(one));

    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
    push(10);

    pop();

    for(int i = 0; i < MAX_STACK_SIZE; i++)
        printf("%d  ", stack[i]);
    printf("\n");

    return 0;
}


