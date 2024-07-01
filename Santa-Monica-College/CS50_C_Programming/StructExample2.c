#include <stdio.h>

//data struct containing multiple pieces of data

struct mystruct {
	int int_member;
	double double_member;
	char* string_member;
	};

int main(void){
	struct mystruct Data1 = {175,5.8,"jon"};
	//setup a pointer to Data1
	struct mystruct *ptr1;
	ptr1=&Data1;
	printf("Before changing the values were %s, %f, %d", (*ptr1).string_member, ptr1->double_member, ptr1->int_member);			
}

