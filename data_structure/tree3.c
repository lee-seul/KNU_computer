#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct node* treePointer;
typedef struct node{
    int data;
    treePointer leftChild, rightChild;
}node;


node n5 = {80, NULL, NULL};
node n4 = {2, NULL, NULL};
node n3 = {40, NULL, &n5};
node n2 = {5, &n4, NULL};
node n1 = {30, &n2, &n3};


treePointer search(treePointer head, int data){
//    printf("%d\n", head);
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
    if(new->data > n->data){
        if(n->rightChild) insert(n->rightChild, new);
        else n->rightChild = new;
    }
   else if(new->data < n->data){
       if(n->leftChild) insert(n->leftChild, new);
       else n->leftChild = new;
   }

} 

void printTree(treePointer head){
    if(head==NULL) return;
    printTree(head->leftChild);
    printf("%d\n", head->data);
    printTree(head->rightChild);
}

int main(void){
    treePointer ptr = (node*)malloc(sizeof(node)); 
    treePointer n = NULL;
    treePointer new = (node*)malloc(sizeof(node)); 
    int value;
    

    new->data = 35;
    new->rightChild = NULL;
    new->leftChild = NULL;
    
    ptr = &n1; 
    printTree(ptr);
    
    insert(n, new);

    printTree(ptr);


    return 0;
}
