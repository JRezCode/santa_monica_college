#include <stdio.h>
int main()
{

	int a = 1, b = 10;
	int x = a, n = b;
	//demonstrating integer math inside a for loop
	for (int i=n; i>0; i--)
	{
		x+=2;
	}
	printf("Value of %d + (2 * %d)is %d\n", a, b, x);
	
	
	//while loop example to demonstrate iteration
	int q = 1;
	int s = 0;
	while(q<=100)
	{
		s+=++q;
	}
	printf("The sum of first 100 integers is = %d", s);


}

