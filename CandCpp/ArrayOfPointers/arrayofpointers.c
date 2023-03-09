#include <stdio.h>

int main(){

	//Array of pointers - no memory waste
	char *names[] = {"joe", "joel", "jon"};
	for (int i = 0; i < 3; i++)
		printf("%s\n", names[i]);
	return 0;
}
