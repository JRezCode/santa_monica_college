#include <stdio.h>

void swap(int *x, int *y);

int main(){
	int a =3, b=2, c=1;
	swap(&a, &b);
	swap(&b, &c);
	swap(&a, &b);
	printf("a=%d b=%d c=%d\n", a,b,c);
}

void swap(int *x, int *y)
{
	int t;
	if(*x>*y) { t = *y; *y = *x; *x = t; }
}


