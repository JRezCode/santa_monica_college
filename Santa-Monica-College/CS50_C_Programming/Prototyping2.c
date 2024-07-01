#include <stdio.h>

//Important function example with prototyping
//int atoi(char letters[]);


int main(void){
		char argv[26];
		argv[0] = 'a';
		//for loop for first 26 characters
		for(int i = 1; i<26; i++){
			*(argv+i)=*(argv)+i;
		}
		printf("%s",&argv);		
		int print;
		print = atoi(*argv);
		printf("%d",print);		
}

int atoi(char s[])
{
	double atof(char s[]);		//function declaration
	return (int) atof(s);		//function call and cast to proper type for return
}