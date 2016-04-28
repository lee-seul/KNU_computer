#include <stdio.h>
#include <stdlib.h>
#include < string.h>


#define MALLOC(p, s)\
    if(!((p) = (ListNode *)malloc(s))) {\
        fprintf(stderr, "Insufficient Memory"); \
        exit(EXIT_FAILURE); \
    }

typedef struct ListNode *ListPointer;
typedef struct ListNode{
    int age;
    int gender;
    char name[10];
    ListPointer link;
}


void create(ListPointer* first){

    ListPointer new = NULL;
    MALLOC(new, sizeof(*new));

    printf("age:  gender:  name:");
    scanf("%d %d %s", &new->age, &new->gender, new->name);

    if (*first == NULL)
        *first = new;
    else{
        new-> link = *first;
        *first = new;
    }
}


int main(void){

    ListPointer head = NULL;

    return 0;
}
