#include <stdio.h>

/*
 * ID: 1654919
 * Student: Reznik, Jonathan
 * Assignment: HW4 part 2
 * 
 * Hi Dr. D I'm sorry but I'm giving you two separate files, since it 
 * got a bit confusing with number of lines in main function.  I think
 * I may have gone a bit overboard with pointers here, hope you like.
 * 
 * Bye :)
 */


//constants, function prototyping, and variable declarations
const static int COUNT = 20;
void aboveAverage(int * nums, float average, int *p);
int numbers[20];
int count = 0;

int main(void){

	//loop for user input
	for (int i = 0; i<COUNT; i++){
		scanf("%d", &numbers[i]);
	}
	
	//calculates average in main
	int total;
	for (int i = 0; i<COUNT; i++){
		total += numbers[i];
	}

	float average = (float) total / COUNT;
	
	//calls function with pointers, and prints each of above average score!!
	printf("The above average scores were...");
	for (int i = 0; i<COUNT; i++){
		aboveAverage (&numbers[i], average, &count);
	}
	
	//outputs the final count of
	printf("\n%d of the %d entries were above the average of %f", count, COUNT, average); 
}

//the void function does 2 things: compares score against average and secondly
//tracks above average using a pointer to global var for this count.
void aboveAverage(int *nums, float average, int *p){
	if ( *nums>average){
		printf("%d, ", *nums);
		*p = *p + 1;
	}
}
