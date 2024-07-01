#include <stdio.h>
int main() {

	float min_in, max_in, sum, input;
	int num_count = -1;
	
	//do...while loop continues until user enters 0
    printf("To find average");
	do {
		scanf("%f",&input);
		
		//initial case handling
		if(num_count==-1 && input!=0) {
			min_in=input;
			max_in=input;
		}
		
		//change max
		if(input>max_in && input!=0) {
			max_in=input; 
		}
		
		//change min
		if(input<min_in && input!=0) {
			min_in=input;
		}

		sum+=input;
		num_count++;

	}  while(input!=0.0);

	//calc the avg and print to console
	float avg = sum / (num_count);
	printf("%d values entered \nmin: %.2f, max: %.2f \naverage: %.2f", (num_count
                -1), min_in, max_in, avg);
}
