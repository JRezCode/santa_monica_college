#include <iostream>
#include <string>
int main(){

	std::string names[3] = {"Joe","Jon", "Jacob"};
	std::string *ptNames[3];
	std::string **ptPtNames[3];
	int i, x;
	for (i = 0; i <3; i++)
		std::cout << names[i] << std::endl;
	//Array of pointers
	for (i = 0; i <3; i++)
		ptNames[i] = &names[i];
	for (i = 0; i <3; i++)
		std::cout << *ptNames[i] << std::endl;
	//Array of pointers to pointers
	for (i = 0; i <3; i++)
		ptPtNames[i] = &ptNames[i];
	for (i = 0; i <3; i++)
		std::cout << **ptPtNames[i] << std::endl;
	//Use it to flip order around
	for (i = 0, x = 2; i < 3; i++, x--)
		ptPtNames[i] = &ptNames[x];
	for (i = 0; i <3; i++)
		std::cout << **ptPtNames[i] << std::endl;

	return 0;
}
