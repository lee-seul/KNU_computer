#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct ListNode {
	int age;
	int gender;
	char name[10];
	struct ListNode *link;
} ListNode;


void insert(ListNode** head, ListNode* newNode){
	if (*head == NULL)
		*head = newNode;
	else {
		ListNode *tail = *head;
		while (tail->link != NULL)
			tail = tail->link;
		tail->link = newNode;
	}

}

ListNode* createnew() {
	int age, gender;
	char name[10];
	ListNode *new = (ListNode*)malloc(sizeof(ListNode));

	printf("정보 입력: 나이 성별(M/F) 이름: ");
	scanf("%d", &age);
	scanf("%c", &gender);
	scanf("%s", name);

	new->age = age;
	new->gender = gender;
	strcpy(new->name, name);

	return new;

}


int main(void) {
	ListNode *first = NULL, newnode = NULL;

	return 0;
}