#include <stdio.h>

//Can't understand why assignment returns the value that is assigned...
int main(){
	//test to show the value of assignment return value
	int a;
	printf("%d",a=0);

	//test to show the rvalue and lvalue of assignment statement
	int b,c=2;
	printf("%d", a = b = c);
}

