#include <stdio.h>
int main()
{
int x;
char sign;
char oddOrEven;

//Input number
printf("Enter a number");
scanf("%d",&x);

//test positive
if(x>=0) {
	sign='+';
}
else
	sign='-';

//test odd or even
if((x+1)%2==0) {
	oddOrEven='O';
}
else	
	oddOrEven='E';

printf("The number %d is %c %c", x, sign, oddOrEven);
}
