#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct listNode *listPointer;
typedef struct listNode{
	char nation[20];
	int rank;
	char region[20];
	listPointer link;
} listNode;

#define MALLOC(p,s) \
if(!((p) = (listNode *)malloc(s))) {\
fprintf(stderr, "Insufficient Memory"); \
exit(EXIT_FAILURE); \
}


listPointer create() {
	listPointer china, japan, india, america, spain;
	MALLOC(china, sizeof(*china));
	MALLOC(japan, sizeof(*japan));
	MALLOC(india, sizeof(*india));
	MALLOC(america, sizeof(*america));
	MALLOC(spain, sizeof(*spain));

	spain->link = NULL;
	strcpy(spain->nation, "������");
	spain->rank = 14;
	strcpy(spain->region, "����");

	america->link = spain;
	strcpy(america->nation, "�̱�");
	america->rank = 1;
	strcpy(america->region, "�Ƹ޸�ī");

	india->link = america;
	strcpy(india->nation, "�ε�");
	india->rank = 10;
	strcpy(india->region, "�ƽþ�");

	japan->link = india;
	strcpy(japan->nation, "�Ϻ�");
	spain->rank = 3;
	strcpy(japan->region, "�ƽþ�");

	china->link = japan;
	strcpy(china->nation, "�߱�");
	china->rank = 2;
	strcpy(china->region, "�ƽþ�");

	return china;
}

void insert(listPointer* first, listPointer new) {
	if (*first == NULL)
		*first = new;
	else {
		listPointer tail = *first;
		while (tail->link != NULL)
			tail = tail->link;
		tail->link = new;
	}

}

void insertMiddle(listPointer x, listPointer new) {
	new->link = x->link;
	x->link = new;
}

void insertFirst(listPointer* first, listPointer new){
	if (*first == NULL)
		*first = new;
	else {
		new->link = *first;
		*first = new;
	}
}

void printList(listPointer first) {
	printf("The list contain: ");
	for (; first; first = first->link)
		printf("%s  ", first->nation);
	printf("\n");
}

listPointer createnew(char* nation, int rank, char* region) {
	listPointer new;
	MALLOC(new, sizeof(*new));

	new->link = NULL;
	strcpy(new->nation, nation);
	new->rank = rank;
	strcpy(new->region, region);

	return new;
}

int main(void) {
	listPointer first = NULL, new = NULL;
	
	first = create();

	printList(first);


	new = createnew("���ѹα�", 13, "�ƽþ�");
	insertFirst(&first, new);
	new = createnew("����", 4, "����");
	insertMiddle(first->link->link->link, new);
	
	printList(first);

	

	return 0;
}