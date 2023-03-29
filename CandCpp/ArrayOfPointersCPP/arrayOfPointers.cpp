#include <stdio.h>
#include <iostream>

int main(){
	int initialValue = 18;
	int *ptValues[10];
	ptValues[0] = &initialValue;
	for (int i = 0; i < 10; i++)
		ptValues[i] = &initialValue;
	for (int i = 0; i < 10; i++)
		std::cout << *ptValues[i] <<std::endl;
	return 0;
}
