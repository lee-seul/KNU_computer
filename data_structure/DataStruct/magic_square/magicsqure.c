#include <stdio.h>
#define MAX_SIZE 15

int main(void) {
	int static squre[MAX_SIZE][MAX_SIZE];
	int i, j, row, column;
	int count;
	int size;
	
	printf("size: ");
	scanf("%d", &size);

	if (size<1 || size >MAX_SIZE + 1) {
		fprintf(stderr, "error\n");
		exit(1);
	}

	if (!(size % 2)) {
		fprintf(stderr, "error\n");
		exit(1);
	}

	for (i = 0; i < size; i++)
		for (j = 0; j < size; j++)
			squre[i][j] = 0;
	squre[0][(size - 1) / 2] = 1;

	j = 0;
	j = (size - 1) / 2;
	for (count = 2; count <= size * size; count++) {
		row = (i - 1 < 0) ? (size - 1) : (i - 1);
		column = (j - 1 < 0) ? (size - 1) : (j - 1);
		if (squre[row][column])
			i = (++i) % size;
		else {
			i = row;
			j = (j - 1 < 0) ? (size - 1) : --j;
		}
		squre[i][j] = count;
	}
	printf("size %d\n\n", size);
	for (i = 0; i < size; i++) {
		for (j = 0; j < size; j++) {
			printf("%5d", squre[i][j]);
		}
		printf("\n");
	}
	return 0;
}