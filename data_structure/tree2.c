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

// 중위
void inorder(treePointer ptr){
    if(ptr){
        inorder(ptr->leftChild);
        printf("%d\n", ptr->data);
        inorder(ptr->rightChild);
    }
}

// 전위
void preorder(treePointer ptr){
    if(ptr){
        printf("%d\n", ptr->data);
        preorder(ptr->leftChild);
        preorder(ptr->rightChild);
    }
}

// 후위
void postorder(treePointer ptr){
    if(ptr){
        postorder(ptr->leftChild);
        postorder(ptr->rightChild);
        printf("%d\n", ptr->data);
    }
} 

int main(void){
    treePointer p = NULL;
    
    p = &n1;

    printf("중위 순회\n");
    inorder(p);
    
    printf("전위 순회\n");
    preorder(p);

    printf("후위 순회\n");
    postorder(p);

    return 0;
}
