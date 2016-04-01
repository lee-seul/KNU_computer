#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void swap(int* x, int* y) {
	int temp;
	temp = *x;
	*x = *y;
	*y = temp;
}

void sort(int list[], int n) {
	int i, j, min;

	for (i = 0; i < n - 1; i++) {
		min = i;
		for (j = i + 1; j < n; j++) {
			if (list[j] < list[min])
				min = j;
		}
		swap(&list[i], &list[min]);
	}

}

void main(void) {
	int i, n;
	int list[101];
	printf("enter the number");
	scanf("%d", &n);
	if (n < 1 || n>101) {
		fprintf(stderr, "Improper value\n");
		exit(EXIT_FAILURE);
	}

	for (i = 0; i < n; i++) {
		list[i] = rand() % 1000;
		printf("%d ", list[i]);
	}

	sort(list, n);
	printf("dd\n");
	for (i = 0; i < n; i++) {
		printf("%d ", list[i]);
	}
	printf("\n");
}