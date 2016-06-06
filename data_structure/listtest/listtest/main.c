#include <stdio.h>
#include <stdlib.h>

#define MALLOC(p, s)\
if(!((p) = (listNode *)malloc(s))){\
fprintf(stderr, "Insufficient Memory");\
exit(EXIT_FAILURE);\
}

typedef struct listNode *listPointer;
typedef struct listNode {
    int data;
    listPointer link;
} listNode;

listPointer create2() {
    listPointer first, second;
    MALLOC(first, sizeof(*first));
    MALLOC(second, sizeof(*second));
    second->link = NULL;
    second->data = 20;
    first->data = 10;
    first->link = second;
    
    return first;
}

void insert(listPointer *first, listPointer x) {
    listPointer temp;
    int value;
    MALLOC(temp, sizeof(*temp));
    printf("data 입력: ");
    scanf("%d", &value);
    temp->data = value;
    if(*first) {
        temp->link = x->link;
        x->link = temp;
    }
    
    else {
        temp->link = NULL;
        *first = temp;
    }
}

listPointer search(listPointer first, int data) {
    while(!first){
        if(first->data == data)
            return first;
        else
            first = first->link;
        }
    return NULL;
}

void delete(listPointer *first, listPointer trail, listPointer x) {
    if(trail)
        trail->link = x->link;
    else
        *first = (*first)->link;
    free(x);
}

void printList(listPointer first) {
    printf("The list contains: ");
    for(; first; first = first->link)
        printf("%4d", first->data);
    printf("\n");
}

int main(void) {
    listPointer head;
    MALLOC(head, sizeof(*head));
    head = create2();
    printList(head);
    
    insert(&head, search(head, 20));
    printList(head);
    
    return 0;
}
