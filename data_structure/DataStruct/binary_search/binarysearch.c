#include <stdio.h>

int main(void) {
	int a[20] = { 1, 3, 4, 5, 6, 7, 8, 10, 13, 25, 33, 42, 43, 54, 57, 80, 92, 101};
	int left = 0, right = 19;
	int middle = (left + right) / 2;
	int guess;

	printf("���� �Է�");
	scanf("%d", &guess);

	while (left<=right){
		middle = (left + right) / 2;
		if (guess == a[middle]) {
			printf("%d\n", middle);
			break;
		}
		else if (guess > a[middle]) {
			left = middle + 1;
		}
		else {
			right = middle - 1;
		}
	}

	if (guess != a[middle]) {
		printf("����\n");
	}

	return 0;
}