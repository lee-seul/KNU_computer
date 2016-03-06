#include <stdio.h>

int main(void){
	int num, i = 1;
	
	printf("구구단 몇 단을 실행할까요?");
	scanf("%d", &num);

	printf("%d단을 실행합니다.\n", num);
	while(i<10){
		printf("%d * % d = %d\n", num, i, num*i);
		i++;
	}

	return 0;
}
