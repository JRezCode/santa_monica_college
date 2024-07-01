#include <stdio.h>

main(){
	double x,y, funct(int a, int b);	
	int a = 5, b=5;
	x=4.1;
	y=4.5;
	
	printf("Output of %d + %d = %lf", a, b, funct(a,b));
	
}

double funct(int a,int b){
	//note that (x+y) needs to be in parentheses or it will return 10 instead of 11
	//as is the integer cast will truncate whatever decimal is there, acting as a floor.
	return (double) (a + b);
}
