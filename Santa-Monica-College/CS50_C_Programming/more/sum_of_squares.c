#include <stdio.h>

	int squaresOf(int n);

main()
{
	int input=0;
	scanf("%d", &input);
	printf("The sum of squares is, %d", squaresOf(input));
}

int formula(int x)
{
	if(x==0)
		return 4;
	else if(x>0)
		return (2*x+formula(x-1));	
	else
		return 0;
}

int squaresOf(int n)

{
	int value = 0;
	for(int i = n;i>=1;--i)
	value+=(i*i);
	return (int)value;
}
