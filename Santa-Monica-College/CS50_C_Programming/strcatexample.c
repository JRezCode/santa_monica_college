#include <stdio.h>
#include <string.h>

void main(void){
	char * str1 = "abc";
	char * str2 = "123";
	strcat(&str1,&str2);
	printf("%s",str1);
}
