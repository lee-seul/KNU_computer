#include <stdio.h>

int main(void){
	int num = 0;
	while(num<5){
		printf("반복 내용: %d \n", num);
		num++;
	}
	printf("반목문을 종료한 후: %d \n", num);

	return 0;
}
