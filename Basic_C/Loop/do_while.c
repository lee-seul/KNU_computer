#include <stdio.h>

int main(void){
	int num = 10;

	do{
		printf("%d", num);
		num++;
	} while(num<10);

	printf("\n **while 문을 종료합니다.**\n");
	
	return 0;
}
