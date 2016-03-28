#include <stdio.h>

struct student {
	char no[10];
	char name[20];
	double math;
	double english;
	double total;
};


int main(void) {
	int i = 0;
	struct student stu[3] = {
		{"20111", "name1", 80, 80, 0}, 
		{"20132", "name2", 95, 84, 0},
		{"20113", "name3", 100, 90, 0}
	};

	for (i = 0; i < 3; i++) {
		stu[i].total = stu[i].english + stu[i].math;
		printf("%s, %s\n", stu[i].no, stu[i].name);
		printf("%lf \n", stu[i].total);
		printf("\n");
	}

	return 0;
}