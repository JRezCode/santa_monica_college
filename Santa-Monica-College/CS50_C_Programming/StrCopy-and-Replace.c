#include <stdio.h> 
#include <string.h> 

int main()  { 
	char s1[30] = "string 1";
   char s2[30] = "copied 1"; 
	char s3[4] = "XXXX";
   strcpy(s1,s2);
   strncpy(s1,s3,4);  
   printf("String s1 is: %s",s1); 
   // s1 gets “string “ from s2 but remaining chars stay// 
   //it’ s a good idea to clear s1 to get clean results
   getchar(); 
   return 0;
}