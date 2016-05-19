//
//  main.c
//  test
//
//  Created by seul lee on 2016. 5. 19..
//  Copyright © 2016년 seul lee. All rights reserved.
//


#include <stdio.h>
#include <stdlib.h>

#define MAX_QUEUE_SIZE 100

typedef int element;
typedef struct {
    element data;
    struct TreeNode* left;
    struct TreeNode* right;
} TreeNode;

typedef struct {
    TreeNode queue[MAX_QUEUE_SIZE];
    int front;
    int rear;
} QueueType;

void init(QueueType *q){
    q->front = q->rear = 0;
}

void error(char *message){
    fprintf(stderr,"%s\n",message);
    exit(1);
}

int is_empty(QueueType *q){
    return q->front == q->rear;
}

int is_full(QueueType *q){
    return (q->rear+1) % MAX_QUEUE_SIZE == q->front;
}

void enqueue(QueueType *q, TreeNode *item){
    if (is_full(q)) {
        error("q is full");
    }
    q->rear = (q->rear+1) % MAX_QUEUE_SIZE;
    q->queue[q->rear] = *item;
}

TreeNode* dequeue(QueueType *q){
    if (is_empty(q)) {
        error("q is full");
    }
    q->front = (q->front+1) % MAX_QUEUE_SIZE;
    return &q->queue[q->front];
}

TreeNode* peek(QueueType *q){
    if (is_empty(q)) {
        error("q is empty");
    }
    return &q->queue[q->front];
}

void level_order(TreeNode *root){
    QueueType q;
    init(&q);
    TreeNode *tmp;
    enqueue(&q,root);
    while (!is_empty(&q)) {
        tmp = dequeue(&q);
        printf("%d ",tmp->data);
        
        if(tmp->left != NULL) enqueue(&q, (TreeNode*) tmp->left);
        if(tmp->right != NULL) enqueue(&q, (TreeNode*) tmp->right);
    }
}

int main(){
    TreeNode n1 = {11, NULL, NULL};
    TreeNode n2 = {10, NULL, NULL};
    TreeNode n3 = {8, NULL, NULL};
    TreeNode n4 = {9, NULL, NULL};
    TreeNode n5 = {7, (struct TreeNode*)&n1, NULL};
    TreeNode n6 = {6, (struct TreeNode*)&n2, NULL};
    TreeNode n7 = {5, NULL, NULL};
    TreeNode n8 = {4, (struct TreeNode*)&n3, (struct TreeNode*)&n4};
    TreeNode n9 = {3, (struct TreeNode*)&n6, (struct TreeNode*)&n5};
    TreeNode n10 = {2, (struct TreeNode*)&n8, (struct TreeNode*)&n7};
    TreeNode n11 = {1, (struct TreeNode*)&n10, (struct TreeNode*)&n9};
    
    TreeNode *root = &n11;
    level_order(root);
    
    return 0;
}