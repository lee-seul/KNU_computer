#include <stdio.h>
#define MIN -1000000

int tree[16] = {MIN, 15, 4, 20, 1, MIN, 16, 25, MIN, MIN, MIN, MIN, MIN, MIN, MIN, MIN};

// 중위
void inorder(int root){
    if(tree[root]){
        inorder(root*2);
        if(tree[root]>0)
            printf("value: %d\n", tree[root]);
        inorder(root*2+1);
    }
}


// 전위
void preorder(int root){
    if(tree[root]){
        if(tree[root]>0)
            printf("value: %d\n", tree[root]);
        preorder(root*2);
        preorder(root*2+1);
    }
}


// 후위
void postorder(int root){
    if(tree[root]){
        postorder(root*2);
        postorder(root*2+1);
        if(tree[root]>0)
            printf("value: %d\n", tree[root]);
    }
}


int main(void){
    
    int root = 1;
    
    printf("중위 순회\n");
    inorder(root);

    root = 1;

    printf("전위 순회\n");
    preorder(root);
    
    root = 1;
    printf("후위 순회\n");
    postorder(root);

    return 0;
}
