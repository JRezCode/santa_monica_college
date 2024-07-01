#include <stdio.h>

int main(){
	const int SIZE = 100000;
	int var[SIZE];
	for (int i = 0; i<SIZE; i++){
		var[i] = i;
	}	
	printf("%d\n", binsearch(2300,var,SIZE));
}

//Explanation to Problem 3.1 in Kernighan and Ritchie
	/* The above was modified to remove 1 of the tests from the loop
	 * Source: https://clc-wiki.net/wiki/K&R2_solutions
	 *  
	 * Below is a print of the original structure for the if/else-if/else
	 * as it was presented in the book.	
	 *
	 * if (x>v[mid])	 
	 * 	low=mid+1;
	 * else if(x<v[mid])
	 * 	high=mid-1;
	 * else
	 * 	return mid; */

int binsearch(int x, int v[], int n){
	int low, high, mid;

	low = 0;
	high = n-1;
	while(low < high) {
		mid = (low + high)/2;
		if (x <= v[mid])
			high = mid;
		else
			low = mid + 1;
	}
		
	if (x == v[low])
		return low;
	else
		return -1;
}
