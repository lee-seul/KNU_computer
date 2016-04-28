#include <stdio.h>
#include <stdlib.h>

#define MAX_QUEUE_SIZE 10

int queue[MAX_QUEUE_SIZE];
int rear = -1;
int front = -1;


void addq(int item){

    if(rear == MAX_QUEUE_SIZE - 1)
        fprintf(stderr, "error");
        exit(EXIT_FAILURE);
    queue[++rear] = item;
}

int deleteq(){

    if(front == rear)
        fprintf(stderr, "error");
        exit(EXIT_FAILURE);
    return queue[++front];
}

int main(void){

    addq(10);
    addq(12);
    addq(13);
    addq(14);
    addq(10);

    printf("%d\n",deleteq());

    for(int i = 0; i < MAX_QUEUE_SIZE; i++)
        printf("%d\n", queue[i]); 

    return 0;
}


