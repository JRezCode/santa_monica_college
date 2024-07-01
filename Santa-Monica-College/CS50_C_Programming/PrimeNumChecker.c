#include <stdio.h>

int isPrime(int n);

int v;

int main(void)
{
	//Scanner isn't working properly
	scanf("%d",&v);
	//v=7;
	if(isPrime(v)==1)
		printf("%d is prime", v);
	else if(isPrime(v)==0)
		printf("%d is not prime", v);
}

int isPrime(int n)
{

	int p;

	if(n<=1)

		return 0;

	for(int i=n-1;i>=2;i--){

		if (n%i==0)

			return 0;
	}
	return 1;

}
