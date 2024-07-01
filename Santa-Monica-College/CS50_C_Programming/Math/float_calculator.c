#include <stdio.h>
int main()
{
	//establish the variables
	float min_in;
	float max_in;
	float sum;
	float input;
		
	//continues until user enters 0
	int num_count = 0;
	do
	{
		scanf("%f",&input);
		num_count++;
		if(num_count==1 && input!=0)
		{
			min_in=input;
			max_in=input;
		}
		if(input>max_in && input!=0)
		{
			max_in=input; 
		}
		if(input<min_in && input!=0)
		{
			min_in=input;
		}
		sum+=input;
	}  while(input!=0);
	float avg = sum / (num_count-1);
	printf("%d values entered \nmin: %.2f, max: %.2f \naverage: %.2f", (num_count-1), min_in, max_in, avg);
}
