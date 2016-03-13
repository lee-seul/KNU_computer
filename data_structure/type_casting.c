#include <stdio.h>

int main(void){
	int *ip, i;
	typedef struct {
		int age;
		char gender;
	} person;

	person per, *pper;
	per.age = 50;
	per.gender = 'm';
	pper = &per;
	i = 10000;
	ip = &i;

	printf("i = %d, &ip = %d, ip = %d\n", i, &ip, ip);

	i = (int)&ip;
	printf("i = %d, ip = %d\n", i, ip);
	printf("i = %d\n", *((int *)i));
	printf("*ip = %d\n", *ip);

	pper = (person *)ip;
	pper = &per;
	ip = (int *)pper;

	printf("age = %d, gender = %c\n", ((person *)ip)->age, ((person *)ip)->gender);

	return 0;
}
