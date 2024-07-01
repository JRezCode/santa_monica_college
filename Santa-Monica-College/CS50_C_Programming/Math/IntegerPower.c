#include <stdio.h>

int powerFunction(int a, int b) {

	if(b==0)
		return 1;
	else
		return a*powerFunction(a,b-1);
}

int main(){
	int powerFunction(int, int);
	int base = 5;
	int power= 3;
	int result = powerFunction(base,power);

	printf("Power of %d to the %d is %d", base, power, result);

	return 0;
}
