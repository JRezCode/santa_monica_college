#include <stdio.h>
#include <curses.h>
#include <stdlib.h>
#include <termios.h>

#define MAX 10

//Performing a linear search is searching through an
//array from first to last element or first occurrence
//of the search term/value.
//

void main()
{
int arr[MAX],n,i,num,val;
system("clear");
//ask for total values
printf("Enter total number of values to store: ");
scanf("%d",&n);

//initialize array with values
for(i=1;i<=n;i++)
{
printf("Next number?");
scanf("%d",&arr[i]);
}

//ask for a search value
printf("Completed storage.  What number to search?");
scanf("%d",&val);

//perform a linear search
for(i=1;i<n;i++)
{
if(arr[i]==val)
{
printf("Number found, %d",arr[i]);
return;
}
}
printf("Number not found.");
//initscr();
//getch();
}
