#include <stdio.h>


int main(void){
		char argv[26];
		argv[0] = 'a';
		//for loop for first 26 characters
		for(int i = 1; i<=26; i++){
			*(argv+i)=*(argv)+i;
		}
		argv[26]='\0';
		printf("%s",&argv);		
}
