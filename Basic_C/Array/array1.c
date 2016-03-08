#include <stdio.h>

int main(void){
	int student[5];
	int i, value = 90;
	
	for(i=0; i<5; i++){
		if(i<3){
			student[i] = value;
			value -= 10;
		}
		printf("%d 번째 학생의 점수: %d\n", i+1, student[i]);

	}
	
	return 0;
}
