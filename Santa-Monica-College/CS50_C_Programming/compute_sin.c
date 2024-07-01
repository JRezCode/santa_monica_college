#include <stdio.h>
#include <math.h>

int main(void)
{
	int angle_degree;
	double angle_radian, pi, value;	//declaring variables of the same type in one line
	printf("\nCompute a table of the sine function\n\n");		//use of escape chars
	pi =  4.0*atan(1.0);
	printf("Value of PI = %f \n\n", pi);
	printf("angle	sine\n");
	angle_degree = 0;
	while (angle_degree <= 360)
		{
			angle_radian = pi*angle_degree/180.0;
			value = sin(angle_radian);
			printf ("%3d	%f  \n ", angle_degree, value);
			angle_degree = angle_degree + 10;
		}
return 0;
}

