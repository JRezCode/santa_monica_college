#include <stdio.h>

int main()
{
	int x;

	printf("Enter number");
	scanf("%d",&x);

	printf("\nTesting iterative approach yields = %d", iterativeF(x));
	printf("\nTesting recursive approach yields = %d", recursiveF(x));
}

int iterativeF(int n)
{
	int result = 1;
	if(n==0)
		return 1;
	else
		for(int j=n;j>0;--j)
			result*=j;
	return result;
}



int recursiveF(int n)
{
	if(n==0)
		return 1;
	return n*recursiveF(n-1);
}
