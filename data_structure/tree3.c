#include <stdio.h>
#include <stdlib.h>

typedef struct node* treePointer;
typedef struct node{
    int data;
    treePointer leftChild, rightChild;
}node;


node n7 = {25, NULL, NULL};
node n6 = {16, NULL, NULL};
node n4 = {1, NULL, NULL};
node n3 = {20, &n6, &n7};
node n2 = {4, &n4, NULL};
node n1 = {15, &n2, &n3};


treePointer search(treePointer head, int data){
    if(head==NULL)
        return NULL;
    if(head->data== data)
        return head;
    else if(head->data > data)
        search(head->leftChild, data);
    else
        search(head->rightChild, data);
}

void insert(treePointer n, treePointer new){
    printf("%d", new->data);
    if(!(n->leftChild))
        n->leftChild = new;
    else if (!(n->rightChild))
        n->rightChild = new;
    else
        printf("말단 노드가 아님\n");

} 

void printTree(treePointer head){
    if(head==NULL) return;
    printTree(head->leftChild);
    printf("%d\n", head->data);
    printTree(head->rightChild);
}

int main(void){
    treePointer ptr = NULL, n = NULL;
    treePointer new = malloc(sizeof(node*)); 
    int value;
    
    new->data = 100;
    new->rightChild = NULL;
    new->leftChild = NULL;
    
    ptr = &n1;
    
    
    printTree(ptr);
    
    printf("입력 : ");
    scanf("%d", &value);

    n = search(ptr, value);
    
    printf("%x %x\n", n , new);
    insert(n, new);

    printTree(ptr);


    return 0;
}
