#include <stdio.h>
#include <string.h>

static const char *colors[] = {"Red", "Orange", "Yellow"};
static const char *widths[] = {"Thin", "Medium","Thick","Bold"};

char penText[20];

int penColor = 2, penThickness = 3;

int (main)(void){
	(strcpy)(penText, colors[penColor]);
	(strcat)(penText, widths[penThickness]);
	(printf)("My pen is %s\n", penText);	
	return 0;
}


