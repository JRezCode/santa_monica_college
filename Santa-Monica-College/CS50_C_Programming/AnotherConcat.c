#include <stdio.h>
#include <string.h>
/*strcat*/
char *(strcat)(char *restrict s1, const char *restrict s2)
//restrict is a keyword for the compiler to better optimize the access to these pointer variables

{
	char *s = s1;
}