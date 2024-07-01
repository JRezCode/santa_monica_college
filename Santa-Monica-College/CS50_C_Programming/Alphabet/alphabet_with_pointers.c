#include <stdio.h>

//A program to demonstrate several concepts related to arrays, pointers and
//also the character/string types.  Recall that since arrays are very primitive
//and they are interchangeable with pointers entirely they are used together.


int strlena(char s[]);
int strlenp(char *s);

int main(){

	int SIZE = 26;
	char letters[SIZE];
	char *ptr = letters;
	printf("The letters of the alphabet...");

	while(ptr<(letters+SIZE)){
		if(ptr==letters)
			*ptr = 'A';	//initialize sequence:  letters[0]='A';
		else
			*ptr=*(ptr-1)+1;//dereference previous and add one
		ptr=ptr+1;		//next element
	}

	*ptr='\0';			//terminating byte (string)
	ptr = letters;			//now reset ptr
	printf("%s", ptr);		//print the string of characters
					//
	printf("\nThe length of the alphabet...%d letters", strlenp(ptr));
	
}

int strlena(char s[]){
	int n = 0;	//local variable
	while(s[n] !=0) n++;
	return n;
}

int strlenp(char *s){
	char *p = s;
	while (*p++)
	;
	return (p - s - 1);
}

