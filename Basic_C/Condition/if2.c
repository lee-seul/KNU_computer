#include <stdio.h>

int main(void){
	int num = 0;

	printf("5의 배수: ");

	while(num<=100){
		if(num%5==0)
			printf("%3d ", num);
		num++;
	}
	printf("\n");
	
	return 0;
}
