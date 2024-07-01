#include <stdio.h>

#define MAX 10

//A program to insert a value into an array at a given index/location
//the terms at or to the right are shifted right to do this.

void main(){

int arr[MAX],n,i,pos,val;
char in;

//initialize the array with n values
printf("Enter total numbers");
scanf("%d",&n);

for(i=0;i<n;i++)
{
printf("Next number?");
scanf("%d",&arr[i]);
}

printf("%d values stored", n);

printf("Insert another value:");
scanf("%d", &val);
printf("Enter position:");
scanf("%d", &pos);
//make room for values in array
for(i=n-1;i>=pos;i--)
{
arr[i+1]=arr[i];
}
//insert
arr[pos]=val;
//print the resulting array
for(i=0;i<n+1;i++)
{
printf(" %d,", arr[i]);
}

}
