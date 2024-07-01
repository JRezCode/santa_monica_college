#include <stdio.h>

int check_for_triple(int array[], int size);
void check_for_triple_withP(int * arrayPtr, char * result,int size);

int main()
{
	int arr[9] = {1,5,3,6,7,7,7,4,2} ;

	int * arrayPtr;
	arrayPtr = &arr;

	char * result;
	*result = 'n';

	check_for_triple_withP(arrayPtr,result, 9);
	printf("The result: %d", check_for_triple(arr,9));
	printf("The result: %c", *result);

}

int check_for_triple ( int array[], int n ) {
	int i = 0;
	while(i<(n-2)){
		if(array[i]==array[i+1] && array[i]==array[i+2])
			return 0;
		i++;
	}
	return 1;
}
	
void check_for_triple_withP ( int * p, char * ans, int n ) {
	int i = 0;
	while(i<(n-2)){
		if(*(p+i)==*(p+i+1) && *(p+i)==*(p+i+2))
			*ans='y';
		i++;
	}
}
	
