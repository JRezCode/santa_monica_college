#include <stdio.h>

int main(){
	
	char *animals[] = { "Cow", "Dog", "Cat" };
	char **Data[3];

	Data[0] = &animals[0];
	Data[1] = &animals[1];
	Data[2] = &animals[2];
	
	for(int i = 0; i < 3; i++)
		printf("%s\n", *Data[i]);
	
	return 0;
}
