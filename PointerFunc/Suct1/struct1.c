#include <stdio.h>

struct score{
	double math;
	double english;
	double total;
};

struct student {
	int no;
	struct score s;
};

int main(void) {
	struct student stu;

	stu.no = 2222;
	stu.s.english = 100;
	stu.s.math = 100;
	stu.s.total = stu.s.math + stu.s.english;


	printf("%d, %lf\n", stu.no, stu.s.total);

	return 0;
}
