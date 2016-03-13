#include <stdio.h>

int A(int n, int m){
	if (m==0)
		return n+1;
	else if (n==0 && m > 0)
		return A(m-1, 1);
	else if (m>0 && n > 0)
		return A(m-1, A(m, n-1));

}

int main(void){
	A(4, 1);

	return 0;
}
