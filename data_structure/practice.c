#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct ListNode{
    int age;
    char gender[8];
    char name[10];
    struct ListNode *link;
} ListNode;

ListNode create(ListNode** head, int age, char* gender, char* name){
    ListNode newnode;

    newnode.link = NULL;
    newnode.age = age;
    strcpy(newnode.name, name);
    strcpy(newnode.gender, gender);

    return newnode;

}

void insert(ListNode **head, ListNode newNode){
    if(*head)
        *haed = newNode;
    else
        ListNode *tail = *head;
        while((*tail)->link!=NULL)
            *tail = (*tail)->link;
        (*tail)->link = newNode;
        newNode.link = *head;
}

void printList(ListNode *haed){
    printf("값 출력\n");
    for (; *head; *head= (*head)->link)){
        printf("이름: %s, 나이: %d, 성별: %s\n", (*head)->name, (*head)->age, (*head)->gender);
    }
}


int main(void){
    ListNode *first = NULL, *new = NULL;
    char n[10], g[8];
    int a;

    for (int i; i < 4; i++){
        printf("값을 입력하시오 나이, 성별, 이름");
        scanf("%d %s %s", &age, gender, name);
        new = create(&first, age, gender, name);
        insert(&first, new); 
    }

    printList(*first);

    return 0;
}


