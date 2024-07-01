#include <stdio.h>

//data struct containing multiple pieces of data
struct mystruct {
	double double_member;
	char* string_member;
	};

struct mystruct applyReduce(struct mystruct v1, struct mystruct v2);
void changeValue(struct mystruct* v1, double newvalue);

int main(void){
	struct mystruct Data1 = {2.50,"price"};
	struct mystruct Data2 = {.51,"discount"};
	struct mystruct* ptr1;
	ptr1=&Data1;
	double value = 2.49;

	//using pass by value for structs
	Data1 = applyReduce(Data1,Data2);
	printf("Price of %s is \n%.2f", Data1.string_member, Data1.double_member);		
	changeValue(ptr1, value);
	printf("\nPrice of %s is \n%.2f", Data1.string_member, Data1.double_member);		
	
	
}

//example of function passed struct by value
struct mystruct applyReduce(struct mystruct v1, struct mystruct v2)
{
	v1.double_member -= v2.double_member;
	return v1;
}

//example of function where struct by reference
void changeValue(struct mystruct* v1, double newvalue){
	v1->double_member = newvalue;
}