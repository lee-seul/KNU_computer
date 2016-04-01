#include <stdio.h>
#define MAX_TERMS 100

typedef struct term {
	float coef;
	int expon;
};

typedef struct Polynomial {
	struct term temrs[MAX_TERMS];
	int num_terms;
};

int main(void) {
	struct Polynomial polyA, polyB, polyC;
	int i;

	polyA.temrs[0].coef = 2;
	polyA.temrs[0].expon = 1000;
	polyA.temrs[1].coef = 1;
	polyA.temrs[1].expon = 0;
	polyA.num_terms = 2;

	polyB.temrs[0].coef = 1;
	polyB.temrs[0].expon = 4;
	polyB.temrs[1].coef = 10;
	polyB.temrs[1].expon = 3;
	polyB.temrs[2].coef = 3;
	polyB.temrs[2].expon = 2;
	polyB.temrs[3].coef = 1;
	polyB.temrs[3].expon = 0;
	polyB.num_terms = 4;

	if (polyA.num_terms >= polyB.num_terms) {
		for (i = 0; i < polyB.num_terms; i++) {
			if (polyA.temrs[i].expon > polyB.temrs[i].expon) {
				polyC.temrs[i].expon = polyA.temrs[i].expon;
				polyC.temrs[i].coef = polyA.temrs[i].coef;
			}
			else if (polyA.temrs[i].expon == polyB.temrs[i].expon) {
				polyC.temrs[i].expon = polyA.temrs[i].expon + polyB.temrs[i].expon;
				polyC.temrs[i].coef = polyA.temrs[i].coef + polyB.temrs[i].coef;
			}
			else {
				polyC.temrs[i].expon = polyB.temrs[i].expon;
				polyC.temrs[i].coef = polyB.temrs[i].coef;
			}
		}
		for (; i < polyA.num_terms; i++) {

		}
	}
	
}