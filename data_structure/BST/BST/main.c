#include <stdio.h>
#include <stdlib.h>

typedef struct treeNode{
    int data;
    struct treeNode *left, *right;
} treeNode;

treeNode *search(treeNode *root, int key){
    if(!root) return NULL;
    if(key==root->data) return root;
    if(key < root->data) return search(root->left, key);
    else return search(root->right, key);
}

void insert(treeNode **node, int key){
    treeNode *p, *t;
    treeNode *n;
    
    t = *node;
    p = NULL;
    while(t != NULL){
        if(key == t->data) return;
        p = t;
        if(key < t->data) t = t->left;
        else t = t->right;
    }
    n = (treeNode*)malloc(sizeof(treeNode));
    
    if(n == NULL) return;
    n->data = key;
    n->left = n->right = NULL;
    
    if(p != NULL){
        if(key < p->data) p->left = n;
        else p->right = n;
    }
    else *node = n;
}

void delete_node(treeNode **root, int key){
    treeNode *p, *child, *succ, *succ_p, *t;
    
    p = NULL;
    t = *root;
    
    while((t != NULL) && (t->data != key)){
        p = t;
        t = (key < t->data) ? t->left: t->right;
    }
    if(t == NULL){
        printf("Key is not in the tree\n");
        return ;
    }
    
    if((t->left == NULL) && (t->right == NULL)){
        if(p != NULL){
            if(p->left == t) p->left = NULL;
            else p->right = NULL;
        }
        else *root = NULL;
    }
    
    else if((t->left == NULL) || (t->right == NULL)){
        child = (t->left != NULL) ? t->left : t->right;
        if(p != NULL) {
            if(p->left == t) p->left = child;
            else p->right = child;
        }
        else *root = child;
    }
    
    else {
        succ_p =t;
        succ = t->right;
        while(succ->left != NULL){
            succ_p = succ;
            succ = t->left;
        }
        if((succ_p->left = succ)) succ_p->left = succ->right;
        else succ_p->right = succ->right;
        
        t->data = succ->data;
        t = succ;
        
    }
    free(t);
}

void inorder(treeNode *root){
    if(root){
        inorder(root->left);
        printf("%d  ", root->data);
        inorder(root->right);
    }
}

int main(void){
    int i;
    treeNode *n1 = NULL;
    insert(&n1, 15);
    
    for(i = 0; i < 9; i++){
        insert(&n1, i+5);
    }
    printf("초기 모습: ");
    inorder(n1);
    printf("\n");
    
    insert(&n1, 20);
    printf("노드 20 삽입 후 모습: ");
    inorder(n1);
    printf("\n");
    
    delete_node(&n1, 12);
    printf("노드 12 삭제 후 모습 : ");
    inorder(n1);
    printf("\n");
    
    
    
    return 0; 
}
