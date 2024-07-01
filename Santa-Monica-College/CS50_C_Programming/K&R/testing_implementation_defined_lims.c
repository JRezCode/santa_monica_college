#include <limits.h>
#include <float.h>
#include <stdio.h>

int main(void){

	//For Character and Integer Types (char, short, int, long)
	
	//for char and short with simple calculations
	int a = CHAR_MAX - CHAR_MIN, b = SHRT_MAX - SHRT_MIN; 
	printf("The ranges of the various types: \nchar: %d\nshort: %d", a, b);
	
	//int, long and long long require more calculation
	unsigned int c;
	unsigned long long l;
	c = INT_MAX - INT_MIN;
	//using the 1's complement to get the max value
	c=~0;
	c >>=1;
	printf("signed integer:   %4d,        %4d\n",-c-1,c);
	printf("unsigned char: %4u,           %4u\n",0,c*2+1);
	printf("Check against UCHAR_MAX:      %4u\n",UCHAR_MAX);

	l = INT_MAX - INT_MIN;
	printf("Integer: %d\n Integer(long): %d", c, l);
	
	//For Float and precisions floating points
	float f;
	double d;
	long double ld;
	
	
	//Repeat using also unsigned values
	unsigned int A,B,C;
	unsigned long L;
	unsigned long long LL;
	 
	
	
	putchar('\n');
	
}
