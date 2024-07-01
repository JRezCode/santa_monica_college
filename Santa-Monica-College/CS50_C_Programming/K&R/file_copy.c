#include <stdio.h>

/*2nd version*/
int main(void)
{
	printf("Value of \"EOF\" is = %d\n",EOF);
	int c=(getchar() !=EOF);
	printf("The EOF is value is:  %d",c);
	
}
