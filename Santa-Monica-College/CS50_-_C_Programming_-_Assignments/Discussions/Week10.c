#include <stdio.h>
#include <string.h>

//String copy program

int main(void){
	char c[21] = "this should fit in b";
	char b[21] = "";
	strcpy(b,c);
	//copies string into a smaller array storage
	char a[9] = "";
	strncpy(a,b,8);	//any less than length - 1 leads to unpredictable errors
	printf("\n%s", b);
	printf("\n%s", a);
}