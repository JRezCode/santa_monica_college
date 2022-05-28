#include <stdio.h>
#include <string.h>

/*
 * Name: Jonathan Reznik
 * Student ID: 1654919
 * Assignment 5, CS50
 * Description: A fun use of pointer arithmetic to check strings for character
 * 
 */

int numOfTimes(char *str, char ch);
void gets(char*);

int main(void) {
	
	char c;	
	char sentence[50];
	int result;
	
	//take input
	gets(sentence);	
	scanf("%c", &c);

	//Call function and print to output
	printf("Is %c in '%s'?", c, sentence);
	result = numOfTimes(sentence, c);
	printf("\nNumber of times it is: %d", result);
	}


//Function numOfTimes accepts str pointer and char, returns an int
int numOfTimes(char *str, char ch){
	int count = 0;		//initiate a counter

	//iterate over the string using pointer arithmetic 
	while (*str != '\0') {
      if (*str == ch) {
         count++;
      }
		 str++;
   }
   printf("\ndone");
   return count;
}
