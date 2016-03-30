#include <stdio.h>

void swap(char* a, char* b) {
	char tmp;
	tmp = *a;
	*a = *b;
	*b = tmp;
}


void perm(char* list, int i, int n) {
	int j, temp;
	if (i == n) {
		for (j = 0; j <= n; j++) {
			printf("%c", list[j]);
			printf("             ");
		}
	}

	else {
		for (j = i; j <= n; j++) {
			swap(&list[i], &list[j]);
			perm(list, i + 1, n);
			swap(&list[i], &list[j]);
		}
	}
}


int main(void) {
	char list[7] = { 'a', 'b', 'c', 'd', 'f', 'g', 'h' };
	perm(list, 0, 6);

	return 0;

}