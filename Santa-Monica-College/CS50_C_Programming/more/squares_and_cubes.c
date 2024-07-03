#include <stdio.h>

int main()
{
	int x;

	printf("Enter number");
	scanf("%d",&x);

	printf("The list of the first %d squares is given, ", x);
	printsquaresfn(x);
	printf("\nThe list of the first %d cubes is given, ", x);
	printcubesfn(x);
}

void printsquaresfn(int i){
	int n = 0;
	while(i>n){
		printf("%d ,", (n*n));
		++n;
	}	
}

void printcubesfn(int i){
	int n = 0;
	while(i>n){	printf("%d ,", (n*n*n));
		++n;}
}
