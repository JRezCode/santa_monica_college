#include <stdio.h>

main()
{
   int n = 0,x = 0,sum = 0;
   printf("Enter one digit at a time, type 0 when done");
   while(scanf("%d",&x))
      {
	 if(x==0)
	   break;
         sum+=x;
         ++n;
      }
   printf("The result is: %f", ((float)sum)/n);
}
