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
	strcpy(spain->nation, "스페인");
	spain->rank = 14;
	strcpy(spain->region, "유럽");

	america->link = spain;
	strcpy(america->nation, "미국");
	america->rank = 1;
	strcpy(america->region, "아메리카");

	india->link = america;
	strcpy(india->nation, "인도");
	india->rank = 10;
	strcpy(india->region, "아시아");

	japan->link = india;
	strcpy(japan->nation, "일본");
	spain->rank = 3;
	strcpy(japan->region, "아시아");

	china->link = japan;
	strcpy(china->nation, "중국");
	china->rank = 2;
	strcpy(china->region, "아시아");

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


	new = createnew("대한민국", 13, "아시아");
	insertFirst(&first, new);
	new = createnew("독일", 4, "유럽");
	insertMiddle(first->link->link->link, new);
	
	printList(first);

	

	return 0;
}