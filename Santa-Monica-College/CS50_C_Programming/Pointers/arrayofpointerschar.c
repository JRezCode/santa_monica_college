#include <stdio.h>

int main(){

	//Array of pointers - no memory waste
	char letters[] = {'j', 'i', 'r'};
	char *ptr[3];
	for (int i = 0; i < 3; i++){
		ptr[i] = &letters[i];
		printf("%c\n", *ptr[i]);
	}
	return 0;
}
