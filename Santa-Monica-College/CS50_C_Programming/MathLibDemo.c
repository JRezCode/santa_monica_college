#include<stdio.h>
#include<math.h>


int main()
{
	const double PI=3.14159;

	printf("calculation...\n");
	printf("sine of 90 degrees = %f\n", sin(PI/2.0));
	printf("sine of 180 = %f\n", sin(PI));
	printf("cosine of 90 = %f\n", cos(PI/2.0));
	printf("cosine of 180 = %f\n", cos(PI));

	return(0);
}
