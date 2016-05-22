#include <stdio.h>
#include <stdlib.h>

#define MALLOC(p, s)\
    if(!((p) = malloc(s))){\
        fprintf(stderr, "Insufficient memory");\
        exit(EXIT_FAILURE);\
    }


typedef struct treeNode* treePointer
typedef struct treeNode{
    int data;
    treePointer left, right;
} treeNode;

treePointer search(treePointer root, int key){
    if(!root) return NULL;
    if(key==root->data) return root;
    if(key < root->data) return search(root->left, key);
    else return search(root->right, key);
}

void insert(treePointer *node, int k, iType theItem){
    treePointer ptr, temp = search(*node, k);
    if(temp || !(*node)){
        MALLOC(ptr, sizeof(*ptr));
        ptr->data.key = k;
    }
}

int main(void){
    

    return 0; 
}
