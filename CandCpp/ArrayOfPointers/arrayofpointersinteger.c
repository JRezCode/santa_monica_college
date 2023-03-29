#include <stdio.h>

int main(){

	//Array of pointers - no memory waste
	int nums[3] = {10,100,1000};
	int i, *ptr[3];
	for ( i = 0; i < 3; i++)
		ptr[i] = &nums[i];
	for (i = 0; i < 3; i++)
		printf("%d\n", *ptr[i]);
	return 0;
}
