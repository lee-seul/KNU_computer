#include <stdio.h>

typedef struct term {
	int col;
	int row;
	int value;
};

int main(void) {
	int array[8][10] = { 0 };
	int i, j, index = 1;
	struct term a[11], b[11];
	int brray[8][10] = { 0 };
	for (i = 0; i < 8; i++) {
		array[i][i] = i + 1;
	}

	array[0][9] = 9;
	array[7][0] = 10;

	for (i = 0; i < 8; i++) {
		for (j = 0; j < 10; j++) {
			if (array[i][j] != 0) {
				a[index].col = j;
				a[index].row = i;
				a[index].value = array[i][j];
				index++;
			}
		}
	}
	a[0].row = i;
	a[0].col = j;
	a[0].value = index;

	b[0].col = a[0].row;
	b[0].row = a[0].col;
	b[0].value = a[0].value;

	index = 1;
	for (i = 0; i < b[0].row; i++) {
		for (j = 1; j <= b[0].value; j++) {
			if (a[j].col == i) {
				b[index].col = a[j].row;
				b[index].row = a[j].col;
				b[index].value = a[j].value;
				index++;
			}
		}

	}
	for (i = 1; i < b[0].value; i++) {
		brray[b[i].col][b[i].row] = b[i].value;
	}

	for (i = 0; i < 8; i++) {
		for (j = 0; j < 10; j++) {
			printf("%d ", brray[i][j]);
		}
		printf("\n");
	}
	printf("\n");
	printf("\n");
	

	for (i = 0; i < 11; i++)
		printf("%d %d %d\n",a[i].row, a[i].col, a[i].value);

	for (i = 0; i < 11; i++)
		printf("%d %d %d\n", b[i].row, b[i].col, b[i].value);

	return 0;
}