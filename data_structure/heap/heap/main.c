#include <stdio.h>
#include <stdlib.h>

#define MAX_ELEMENTS 200
#define HEAP_FULL(n) (n == MAX_ELEMENTS - 1)
#define HEAP_EMPTY(n) (!n)

typedef struct element {
    int key;
} element;

element heap[MAX_ELEMENTS];
int n = 0;

void push(element item, int *n){
    int i;
    if(HEAP_FULL(*n)){
        fprintf(stderr, "The heap is full. \n");
        exit(EXIT_FAILURE);
    }
    
    i = ++(*n);
    while ((i != 1) && (item.key > heap[i/2].key)) {
        heap[i] = heap[i/2];
        i /=2;
    }
    
    heap[i] = item;
}

element pop(int *n) {
    int parent, child;
    element item, temp;
    if(HEAP_EMPTY(*n)) {
        fprintf(stderr, "The heap is empyt\n");
        exit(EXIT_FAILURE);
    }
    item = heap[1];
    temp = heap[(*n)--];
    parent = 1;
    child = 2;
    while(child <= *n) {
        if ((child < *n) && (heap[child].key < heap[child+1].key))
            child ++;
        if(temp.key >= heap[child].key) break;
        heap[parent] = heap[child];
        parent = child;
        child *= 2;
    }
    heap[parent] = temp;
    return item;
}

void print(int *n) {
    int i = 1;
    for (; i <= *n; i++) {
        if(!(heap[i].key)) break;
        printf("%d  ",heap[i].key);
    }
    printf("\n");
}

int main(void){
    
    element input_item;
    int i;
    
    for(i = 1; i < 11; i++){
        input_item.key = i;
        push(input_item, &n);
    }
    
    printf("초기 heap 상태 : ");
    print(&n);
    
    input_item.key = 20;
    
    push(input_item, &n);
    printf("루트노드 보다 큰 값 삽입 후 : ");
    print(&n);
    
    pop(&n);
    printf("노드 삭제 후 : ");
    print(&n);
    
    return 0;
    
}

