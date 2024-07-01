#include <stdio.h>
struct Notebook{

	    char * name;

	        int num_of_pages;

		    int id_num;

} myNotebook;

int main(void){
	struct Notebook* input = myNotebook;
	char ;
	int pgs;
	int id;
	gets(in);
	scanf("%d %d", &pgs, &id);
	input->name = in;
	myNotebook.num_of_pages=pgs;
	myNotebook.id_num=id;
	printf("%s %d %d", myNotebook.name, myNotebook.num_of_pages, myNotebook.id_num);
}

int foo (char * y, int x){
	while(*y!='\0'){
		printf("debug");
		if (test1(y)==1)
			x++;
		y++;
		}
	return x;
}

int test1 (char * t){
	return 1;
}
